package my.ui;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;

public class Weather {

    // Location of Weather instance
    private String location;
    private String latitude;
    private String longitude;
    private String date;
    private String cwFile;
    private String cwUrl;
    private String smFile;
    private String smUrl;
    private String fcUrl;
    private String fcFile;
    public String tideUrl;
    private String tideFile;

    // Current Weather Variables
    public String temperature, weatherText, realFeel, pressure, humidity, dewPoint,
            windDirection, windSpeed, cloudCover, pastHrPrecip;

    // Daily celestial body info variables
    public String sunrise, sunset, solarNoon, dayLength, sunAltitude, sunDistance,
            sunAzimuth, moonAltitude, moonDistance, moonAzimuth, moonAngle;
    
    // Forecast variables
    public ArrayList days;
    public Map <String, String> dayOne, dayTwo, dayThree, dayFour, dayFive;
    public String headlineText;
    
    
    // Constructor (Updates variables by default)
    public Weather(String location, String latitude, String longitude) {
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        ZoneId zonedId = ZoneId.of("America/Montreal");
        LocalDate today = LocalDate.now(zonedId);
        int dayOfYear = today.getDayOfYear();
        LocalDate endToday = LocalDate.ofYearDay(today.getYear(), (dayOfYear + 4));
        date = today.format(DateTimeFormatter.ISO_LOCAL_DATE);
        
        
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int endDay = endToday.getDayOfMonth();
        int endMonth = today.getMonthValue();
        int year = today.getYear();
        int endYear = endToday.getYear();
        
        String monthString = "" + month;
        String dayString = "" + day;
        String endDayString = "" + endDay;
        String endMonthString = "" + endMonth;
        String yearString = "" + year;
        String endYearString = "" + endYear;
        
        if (10 - month > 0) {
            monthString = "0" + monthString;
        }
        if (10 - endMonth > 0) {
            endMonthString = "0" + endMonthString;
        }
        if (10 - day > 0) {
            dayString = "0" + dayString;
        }
        if (10 - endDay > 0) {
            endDayString = "0" + endDayString;
        }
        
        String startDate = yearString + monthString + dayString;
        String endDate = endYearString + endMonthString + endDayString;
        
        tideFile = "/Users/craigcerto/NetBeansProjects/UI/files/" + this.date + "_TIDE.json";
        tideUrl = "https://tidesandcurrents.noaa.gov/api/datagetter?product=predictions"
                + "&application=NOS.COOPS.TAC.WL&begin_date=" + startDate + "&end_date=" + endDate 
                + "&datum=MLLW&station=8459681&time_zone=lst_ldt&units=english&interval=hilo&format=json";
        cwFile = "/Users/craigcerto/NetBeansProjects/UI/files/" + this.date + "_CW.json";
        cwUrl = "http://dataservice.accuweather.com/currentconditions/v1/"
                + this.location + "?apikey=%09uk320PVhbjASeATzKfFpbs5BGplH8obc&details=true";
        smFile = "/Users/craigcerto/NetBeansProjects/UI/files/" + this.date + "_SM.json";
        smUrl = "https://api.ipgeolocation.io/astronomy?apiKey=01f4d2275aed49e4894ee2242c03b237&lat="
                + this.latitude + "&long=" + this.longitude;
        fcUrl = "http://dataservice.accuweather.com/forecasts/v1/daily/5day/"
                + this.location + "?apikey=%09uk320PVhbjASeATzKfFpbs5BGplH8obc&details=true";
        fcFile = "/Users/craigcerto/NetBeansProjects/UI/files/" + this.date + "_FC.json";
        days = new ArrayList<>();
        dayOne = new HashMap <> ();
        dayTwo = new HashMap <> ();
        dayThree = new HashMap <> ();
        dayFour = new HashMap <> ();
        dayFive = new HashMap <> ();
        days.add(dayOne);
        days.add(dayTwo);
        days.add(dayThree);
        days.add(dayFour);
        days.add(dayFive);
        
        System.out.println(tideUrl);
    }
    
    public boolean loadForecast() {
        
         // Read JSON from file
        StringBuilder builder = new StringBuilder("");

        try {
            // Update/Create file if it doesn't exist
            
            File file = new File(fcFile);
            if (!file.exists()) {
                System.out.println("Updating FC info before load");
                this.update("fc");
            }

            // Read from file into builder
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                builder.append(data);
            }
            myReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error reading FC JSON");
            return false;
        }
        
        // Update variables using JSON
        String json = builder.toString();
        
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);
            // Update headline
            JsonNode headline = jsonNode.get("Headline");
            headlineText = headline.get("Text").asText();
            ArrayNode forecasts = (ArrayNode) jsonNode.get("DailyForecasts");
            if (forecasts.isArray()) {
                int count = 0;
                for (JsonNode node : forecasts) {               
                    Map map = (Map) days.get(count);
                    
                    // EpochDate
                    map.put("epochDate", node.get("EpochDate").asText());
                    
                    // Sun -> EpochRise, EpochSet
                    JsonNode sun = node.get("Sun");
                    map.put("sunRise", this.epochToEst(sun.get("EpochRise").asText()));
                    map.put("sunSet", this.epochToEst(sun.get("EpochSet").asText()));

                    // Moon -> Phase
                    JsonNode moon = node.get("Moon");
                    map.put("moonPhase", moon.get("Phase").asText());

                    // Temperature -> (Minimum -> Value), (Maximum -> Value)
                    JsonNode temp = node.get("Temperature");
                    JsonNode min = temp.get("Minimum");
                    JsonNode max = temp.get("Maximum");
                    map.put("minTemp", min.get("Value").asText());
                    map.put("maxTemp", max.get("Value").asText());
                    
                    // RealFeelTemperature -> (Minimum -> Value), (Maximum -> Value)
                    JsonNode realTemp = node.get("RealFeelTemperature");
                    JsonNode realMin = temp.get("Minimum");
                    JsonNode realMax = temp.get("Maximum");
                    map.put("realMinTemp", min.get("Value").asText());
                    map.put("realMaxTemp", max.get("Value").asText());
                    
                    // HoursOfSun
                    map.put("HoursOfSun", node.get("HoursOfSun").asText());
                    
                    // AirAndPollen
                    ArrayNode airAndPollen = (ArrayNode) node.get("AirAndPollen");
                    
                    // - AirQuality: Category
                    JsonNode airQual = airAndPollen.get(0);
                    map.put("airQuality", airQual.get("Category").asText());
 
                    // - Grass: Category
                    JsonNode grass = airAndPollen.get(1);
                    map.put("grass", grass.get("Category").asText());
                    
                    // - Mold: Category
                    JsonNode mold = airAndPollen.get(2);
                    map.put("mold", mold.get("Category").asText());
                    
                    // - Ragweed: Category
                    JsonNode ragweed = airAndPollen.get(3);
                    map.put("ragweed", ragweed.get("Category").asText());
                    
                    // - Tree: Category
                    JsonNode tree = airAndPollen.get(4);
                    map.put("tree", tree.get("Category").asText());
                    
                    // - UVIndex: Value
                    JsonNode uv = airAndPollen.get(5);
                    map.put("uvIndex", uv.get("Value").asText());
                    
                    // Day -> 
                    JsonNode day = node.get("Day");
                    
                    // LongPhrase
                    map.put("dayLongPhrase", day.get("LongPhrase").asText());
                   
                    // ThunderstormProbability
                    map.put("dayThunder", day.get("ThunderstormProbability").asText());
                    
                    // RainProbability
                    map.put("dayRain", day.get("RainProbability").asText());
                    
                    // SnowProbability
                    map.put("daySnow", day.get("SnowProbability").asText());
                    
                    // Wind -> (Speed -> Value), (Direction -> English)
                    JsonNode dayWind = day.get("Wind");
                    JsonNode daySpeed = dayWind.get("Speed");
                    JsonNode dayDirection = dayWind.get("Direction");
                    map.put("daySpeed", daySpeed.get("Value").asText());
                    map.put("dayDirection", dayDirection.get("English").asText());
                    
                    // Night ->
                    JsonNode night = node.get("Night");
                    
                     // LongPhrase
                    map.put("nightLongPhrase", night.get("LongPhrase").asText());
                   
                    // ThunderstormProbability
                    map.put("nightThunder", night.get("ThunderstormProbability").asText());
                    
                    // RainProbability
                    map.put("nightRain", night.get("RainProbability").asText());
                    
                    // SnowProbability
                    map.put("nightSnow", night.get("SnowProbability").asText());
                    
                    // Wind -> (Speed -> Value), (Direction -> English)
                    JsonNode nightWind = night.get("Wind");
                    JsonNode nightSpeed = nightWind.get("Speed");
                    JsonNode nightDirection = nightWind.get("Direction");
                    map.put("nightSpeed", nightSpeed.get("Value").asText());
                    map.put("nightDirection", nightDirection.get("English").asText());
                    
                    count++;
                }
                
            }
            else {
                System.out.println("Array error");
                return false;
            }
            
            return true;
        }
        catch (Exception e) {
            System.out.println("FC Error");
            return false;
        } 
    }

    // Loads Sun and Moon info from JSON
    public boolean loadSunMoonInfo() {

        // Read JSON from file
        StringBuilder builder = new StringBuilder("");

        try {
            // Update/Create file if it doesn't exist
            File file = new File(smFile);
            if (!file.exists()) {
                System.out.println("Updating SM info before load");
                this.update("sm");
            }

            // Read from file into builder
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                builder.append(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading SM JSON");
            return false;
        }

        // Update variables using JSON
        String json = builder.toString();
        try {
            // Create object mapper and root node
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);

            // Update sunrise
            sunrise = jsonNode.get("sunrise").asText();

            // Update sunset
            sunset = jsonNode.get("sunset").asText();

            // Update Solar Noon
            solarNoon = jsonNode.get("solar_noon").asText();

            // Update Day Length
            dayLength = jsonNode.get("day_length").asText();

            // Update Sun Altitude
            sunAltitude = jsonNode.get("sun_altitude").asText();

            // Update Sun Distance
            sunDistance = jsonNode.get("sun_distance").asText();

            // Update Sun Azimuth
            sunAzimuth = jsonNode.get("sun_azimuth").asText();

            // Update Moon Altitude
            moonAltitude = jsonNode.get("moon_altitude").asText();

            // Update Moon Distance
            moonDistance = jsonNode.get("moon_distance").asText();

            // Update Moon Azimuth
            moonAzimuth = jsonNode.get("moon_azimuth").asText();

            // Update Moon Parallactic Angle
            moonAngle = jsonNode.get("moon_parallactic_angle").asText();

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Loads current weather from JSON
    public boolean loadCurrentWeather() {

        // Read JSON from file
        StringBuilder builder = new StringBuilder("");

        try {
            // Update/Create file if it doesn't exist
            File file = new File(cwFile);
            if (!file.exists()) {
                System.out.println("Updating CW before load");
                this.update("cw");
            }

            // Read from file into builder
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                builder.append(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading CW JSON");
            return false;
        }

        // Update variables using JSON
        String json = builder.toString();
        try {
            // Create object mapper and root node
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(json);

            // Add needed data points to a String list
            String obsTime = jsonNode.get("LocalObservationDateTime").asText();

            // Update Temperature
            JsonNode tempNode = jsonNode.get("Temperature");
            JsonNode imperialNode = tempNode.get("Imperial");
            temperature = imperialNode.get("Value").asText();

            weatherText = jsonNode.get("WeatherText").asText();

            // Update Real Feel
            JsonNode realFeelNode = jsonNode.get("RealFeelTemperature");
            imperialNode = realFeelNode.get("Imperial");
            realFeel = imperialNode.get("Value").asText();

            // Update Pressure
            JsonNode pressureNode = jsonNode.get("Pressure");
            imperialNode = pressureNode.get("Imperial");
            pressure = imperialNode.get("Value").asText();

            // Update Humidity
            humidity = jsonNode.get("RelativeHumidity").asText();

            // Update Dew Point
            JsonNode dewNode = jsonNode.get("DewPoint");
            imperialNode = dewNode.get("Imperial");
            dewPoint = imperialNode.get("Value").asText();

            // Update Wind
            JsonNode windNode = jsonNode.get("Wind");
            JsonNode directionNode = windNode.get("Direction");
            JsonNode speedNode = windNode.get("Speed");
            windDirection = directionNode.get("English").asText();
            imperialNode = speedNode.get("Imperial");
            windSpeed = imperialNode.get("Value").asText();

            // Update Cloud Cover
            cloudCover = jsonNode.get("CloudCover").asText();

            // Update Past Hour Precipitation
            JsonNode pastNode = jsonNode.get("Precip1hr");
            imperialNode = pastNode.get("Imperial");
            pastHrPrecip = imperialNode.get("Value").asText();

            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    // Update respective section
    // cw = Current Weather
    // sm = Sun/Moon Info
    // fc = Forecast
    public boolean update(String section) {
        String url;
        String updateFile;
        
        if (section.equals("cw")) {
            url = cwUrl;
            updateFile = cwFile;
        }
        else if (section.equals("sm")){
            url = smUrl;
            updateFile = smFile;
        }
        else if (section.equals("tide")) {
            url = tideUrl;
            updateFile = tideFile;
        }
        else {
            url = fcUrl;
            updateFile = fcFile;
        }
        
        String GET_URL = url;
        String USER_AGENT = "Mozilla/5.0";

        // GET forecast info and download to file
        try {
            URL obj = new URL(GET_URL);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {

                // Read from JSON file and append to response
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                String json = response.toString();
                System.out.println(json);
                
                // Current Weather needs to be trimmed
                if (section.equals("cw")) {
                    json = json.replaceFirst("\\[", "");
                    json = json.substring(0, json.length() - 1);
                }
                
                // Cache contents into daily JSON file
                try {
                    File file = new File(updateFile);
                    file.createNewFile();
                    try {
                        FileWriter myWriter = new FileWriter(updateFile);
                        myWriter.write(json);
                        myWriter.close();
                    } catch (IOException e) {
                        System.out.println("File Write Error");
                        return false;
                    }
                } catch (IOException e) {
                    System.out.println("Create File Error");
                    return false;
                }
                return true;

            } else {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    }

    // Prints Current Weather
    public void printCurrentWeather() {
        String[] conditions = {temperature, weatherText, realFeel, pressure, humidity, dewPoint,
            windDirection, windSpeed, cloudCover, pastHrPrecip};
        for (String c : conditions) {
            System.out.println(c);
        }
    }

    // Prints Sun and Moon data
    public void printSunMoonInfo() {
        String[] conditions = {sunrise, sunset, solarNoon, dayLength, sunAltitude, sunDistance,
            sunAzimuth, moonAltitude, moonDistance, moonAzimuth, moonAngle};
        for (String c : conditions) {
            System.out.println(c);
        }
    }
    
    // Epoch to EST
    public String epochToEst(String epoch) {
        Date date = new Date(Integer.parseInt(epoch));
        DateFormat format = new SimpleDateFormat("HH:mm:ss");
        format.setTimeZone(TimeZone.getTimeZone("EST"));
        return format.format(date);
    }

    // Main method
    public static void main(String[] args) throws JsonProcessingException {
        Weather weather = new Weather("2099297", "41.1617", "71.5843");
        weather.loadCurrentWeather();
        weather.loadSunMoonInfo();
        weather.loadForecast();
        
        weather.update("sw");
        weather.update("fc");
        weather.update("tide");
        
        weather.printSunMoonInfo();
    }

}
