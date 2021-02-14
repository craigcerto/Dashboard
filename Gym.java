/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ui;
import java.lang.*;
import java.util.ArrayList;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.Keys;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
//import java.util.concurrent.TimeUnit;

/**
 *
 * @author craigcerto
 */
public class Gym {
    
    public String circleStatus10;
    public String circleStatus1130;
    public String circleStatus1;
    public String circleStatus230;
    public String circleStatus4;
    public String circleStatus530;
    public String circleStatus7;
    public String circleStatus830;
    
    public String ritchieStatus10;
    public String ritchieStatus1115;
    public String ritchieStatus1230;
    public String ritchieStatus145;
    public String ritchieStatus3;
    public String ritchieStatus415;
    public String ritchieStatus530;
    public String ritchieStatus645;
    public String ritchieStatus8;
    public String ritchieStatus915;
    
    public String sphStatus10;
    public String sphStatus1130;
    public String sphStatus1;
    public String sphStatus230;
    public String sphStatus4;
    public String sphStatus530;
    public String sphStatus7;
    public String sphStatus830;
    
    public String spots10;
    public String spots1130;
    public String spots1;
    public String spots230;
    public String spots4;
    public String spots530;
    public String spots7;
    public String spots830;
    
    public String ritchieSpots10;
    public String ritchieSpots1115;
    public String ritchieSpots1230;
    public String ritchieSpots145;
    public String ritchieSpots3;
    public String ritchieSpots415;
    public String ritchieSpots530;
    public String ritchieSpots645;
    public String ritchieSpots8;
    public String ritchieSpots915;
    
    public String sphSpots10;
    public String sphSpots1130;
    public String sphSpots1;
    public String sphSpots230;
    public String sphSpots4;
    public String sphSpots530;
    public String sphSpots7;
    public String sphSpots830;
    
    public String twCircleStatus10;
    public String twCircleStatus1130;
    public String twCircleStatus1;
    public String twCircleStatus230;
    public String twCircleStatus4;
    public String twCircleStatus530;
    public String twCircleStatus7;
    public String twCircleStatus830;
    
    public String twRitchieStatus10;
    public String twRitchieStatus1115;
    public String twRitchieStatus1230;
    public String twRitchieStatus145;
    public String twRitchieStatus3;
    public String twRitchieStatus415;
    public String twRitchieStatus530;
    public String twRitchieStatus645;
    public String twRitchieStatus8;
    public String twRitchieStatus915;
    
    public String twSphStatus10;
    public String twSphStatus1130;
    public String twSphStatus1;
    public String twSphStatus230;
    public String twSphStatus4;
    public String twSphStatus530;
    public String twSphStatus7;
    public String twSphStatus830;
    
    public String twSpots10;
    public String twSpots1130;
    public String twSpots1;
    public String twSpots230;
    public String twSpots4;
    public String twSpots530;
    public String twSpots7;
    public String twSpots830;
    
    public String twRitchieSpots10;
    public String twRitchieSpots1115;
    public String twRitchieSpots1230;
    public String twRitchieSpots145;
    public String twRitchieSpots3;
    public String twRitchieSpots415;
    public String twRitchieSpots530;
    public String twRitchieSpots645;
    public String twRitchieSpots8;
    public String twRitchieSpots915;
    
    public String twSphSpots10;
    public String twSphSpots1130;
    public String twSphSpots1;
    public String twSphSpots230;
    public String twSphSpots4;
    public String twSphSpots530;
    public String twSphSpots7;
    public String twSphSpots830;
    
    public ArrayList timeslots;
    
    public Gym() {
        timeslots = new ArrayList<>();
    }
    
    public boolean reserveSpot(String time, int day) {
        System.setProperty("webdriver.chrome.driver", "files/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("user-data-dir=/Users/craigcerto/Library/Application");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver =  new ChromeDriver(options); 
        driver.get("https://www.imleagues.com/spa/account/ssoredirect?schoolId=4395e0c781af4905a4088a9561509399");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='username']"))).sendKeys("ccerto");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']"))).sendKeys("PASSWORD");
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']"))).sendKeys(Keys.RETURN);
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'mainView')]")));
        driver.navigate().to("https://www.imleagues.com/spa/fitness/4395e0c781af4905a4088a9561509399/home");
        
        if(day == 1) {
            String tableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tableXpath)));
            List<WebElement> rows = driver.findElements(By.xpath(tableXpath));
            
            ArrayList<WebElement> rowElements = new ArrayList<>();
        
            WebElement row = rows.get(0);
            List<WebElement> elements = row.findElements(By.className("row"));
        
            for (WebElement element : elements) {
                if(element.getText().contains("Individual Workout: Weight Room (ERC)")) {
                    rowElements.add(element);
                }
            }
            
            if (null != time) switch (time) {
                case "10":
                    rowElements.get(0).click();
                    break;
                case "1130":
                    rowElements.get(1).click();
                    break;
                case "1":
                    rowElements.get(2).click();
                    break;
                case "230":
                    rowElements.get(3).click();
                    break;
                case "4":
                    rowElements.get(4).click();
                    break;
                case "530":
                    rowElements.get(5).click();
                    break;
                case "7":
                    rowElements.get(6).click();
                    break;
                case "830":
                    rowElements.get(7).click();
                    break;
                default:
                    break;
            }
        } 
        else if (day == 2) {
            String twTableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
            new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div")));
            new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[1]/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/button[2]"))).click();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(twTableXpath)));
            List<WebElement> rows = driver.findElements(By.xpath(twTableXpath));
           
        
            WebElement row = rows.get(0);
            List<WebElement> elements = row.findElements(By.className("row"));
        
            ArrayList<WebElement> rowElements = new ArrayList<>();
            for (WebElement element : elements) {
                if(element.getText().contains("Individual Workout: Weight Room (ERC)")) {
                    rowElements.add(element);
                }
            }
            
            if (time == "10") {
                rowElements.get(0).click();
            }
            else if (time == "1130") {
                rowElements.get(1).click();
            }
            else if (time == "1") {
                rowElements.get(2).click();
            }
            else if (time == "230") {
                rowElements.get(3).click();
            }
            else if (time == "4") {
                rowElements.get(4).click();
            }
            else if (time == "530") {
                rowElements.get(5).click();
            } 
            else if (time == "7") {
                rowElements.get(6).click();
            } 
            else if (time == "830") {
                rowElements.get(7).click();
            } 
        } else if (day == 3) {
            String tableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tableXpath)));
            List<WebElement> rows = driver.findElements(By.xpath(tableXpath));
            
            ArrayList<WebElement> rowElements = new ArrayList<>();
        
            WebElement row = rows.get(0);
            List<WebElement> elements = row.findElements(By.className("row"));
        
            for (WebElement element : elements) {
                if(element.getText().contains("Individual Workout: Weight Room (Ritchie)")) {
                    rowElements.add(element);
                }
            }
            
            if (time == "10") {
                rowElements.get(0).click();
            }
            else if (time == "1115") {
                rowElements.get(1).click();
            }
            else if (time == "1230") {
                rowElements.get(2).click();
            }
            else if (time == "145") {
                rowElements.get(3).click();
            }
            else if (time == "3") {
                rowElements.get(4).click();
            }
            else if (time == "415") {
                rowElements.get(5).click();
            }
            else if (time == "530") {
                rowElements.get(6).click();
            }
            else if (time == "645") {
                rowElements.get(7).click();
            }
            else if (time == "8") {
                rowElements.get(8).click();
            }
            else if (time == "915") {
                rowElements.get(9).click();
            }
        } else if (day == 4) {
            String twTableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
            new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div")));
            new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[1]/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/button[2]"))).click();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(twTableXpath)));
            List<WebElement> rows = driver.findElements(By.xpath(twTableXpath));
           
        
            WebElement row = rows.get(0);
            List<WebElement> elements = row.findElements(By.className("row"));
        
            ArrayList<WebElement> rowElements = new ArrayList<>();
            for (WebElement element : elements) {
                if(element.getText().contains("Individual Workout: Weight Room (Ritchie)")) {
                    rowElements.add(element);
                }
            }
            
            if (time == "10") {
                rowElements.get(0).click();
            }
            else if (time == "1115") {
                rowElements.get(1).click();
            }
            else if (time == "1230") {
                rowElements.get(2).click();
            }
            else if (time == "145") {
                rowElements.get(3).click();
            }
            else if (time == "3") {
                rowElements.get(4).click();
            }
            else if (time == "415") {
                rowElements.get(5).click();
            }
            else if (time == "530") {
                rowElements.get(6).click();
            } 
            else if (time == "645") {
                rowElements.get(7).click();
            } 
            else if (time == "8") {
                rowElements.get(8).click();
            } 
            else if (time == "915") {
                rowElements.get(9).click();
            } 
        } else if(day == 5) {
            String tableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tableXpath)));
            List<WebElement> rows = driver.findElements(By.xpath(tableXpath));
            
            ArrayList<WebElement> rowElements = new ArrayList<>();
        
            WebElement row = rows.get(0);
            List<WebElement> elements = row.findElements(By.className("row"));
        
            for (WebElement element : elements) {
                if(element.getText().contains("Individual Workout: SPH Weight Room")) {
                    rowElements.add(element);
                }
            }
            
            if (null != time) switch (time) {
                case "10":
                    rowElements.get(0).click();
                    break;
                case "1130":
                    rowElements.get(1).click();
                    break;
                case "1":
                    rowElements.get(2).click();
                    break;
                case "230":
                    rowElements.get(3).click();
                    break;
                case "4":
                    rowElements.get(4).click();
                    break;
                case "530":
                    rowElements.get(5).click();
                    break;
                case "7":
                    rowElements.get(6).click();
                    break;
                case "830":
                    rowElements.get(7).click();
                    break;
                default:
                    break;
            }
        } 
        else if (day == 6) {
            String twTableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
            new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div")));
            new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[1]/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/button[2]"))).click();
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(twTableXpath)));
            List<WebElement> rows = driver.findElements(By.xpath(twTableXpath));
           
        
            WebElement row = rows.get(0);
            List<WebElement> elements = row.findElements(By.className("row"));
        
            ArrayList<WebElement> rowElements = new ArrayList<>();
            for (WebElement element : elements) {
                if(element.getText().contains("Individual Workout: SPH Weight Room")) {
                    rowElements.add(element);
                }
            }
            
            if (time == "10") {
                rowElements.get(0).click();
            }
            else if (time == "1130") {
                rowElements.get(1).click();
            }
            else if (time == "1") {
                rowElements.get(2).click();
            }
            else if (time == "230") {
                rowElements.get(3).click();
            }
            else if (time == "4") {
                rowElements.get(4).click();
            }
            else if (time == "530") {
                rowElements.get(5).click();
            } 
            else if (time == "7") {
                rowElements.get(6).click();
            } 
            else if (time == "830") {
                rowElements.get(7).click();
            } 
            
        }
        
        String signupButtonPath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[4]/div/div/div[2]/div/a";
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(signupButtonPath))).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/div[2]/div/div/div/input"))).sendKeys("115893177");
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div/div[2]/div[3]/div/div/button"))).click();
        
        return true;
    }
    
    public void getSpots() {
        System.setProperty("webdriver.chrome.driver", "files/chromedriver");
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("user-data-dir=/Users/craigcerto/Library/Application");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.addArguments("--disable-notifications");
        //options.addArguments("--headless");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        WebDriver driver =  new ChromeDriver(options); 
        driver.get("https://www.imleagues.com/spa/fitness/4395e0c781af4905a4088a9561509399/home");
        
        String tableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tableXpath)));
       
        List<WebElement> rows = driver.findElements(By.xpath(tableXpath));
        String rowtext = rows.get(0).getText();
        String lines[] = rowtext.split("\\r?\\n");
        ArrayList statuses = new ArrayList<>();
        ArrayList spots = new ArrayList<>();
        ArrayList ritchieStatuses = new ArrayList<>();
        ArrayList ritchieSpots = new ArrayList<>();
        ArrayList sphStatuses = new ArrayList<>();
        ArrayList sphSpots = new ArrayList<>();
        
        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            if (line.equals("Individual Workout: Weight Room (ERC)")) {
                statuses.add(lines[i-2]);
                spots.add(lines[i-1]);
            } else if (line.equals("Individual Workout: Weight Room (Ritchie)")) {
                ritchieStatuses.add(lines[i-2]);
                ritchieSpots.add(lines[i-1]);
            } else if (line.equals("Individual Workout: SPH Weight Room")) {
                sphStatuses.add(lines[i-2]);
                sphSpots.add(lines[i-1]);
            }
        }
        
        circleStatus10 = (String) statuses.get(0);
        spots10 = (String) spots.get(0);
        circleStatus1130 = (String) statuses.get(1);
        spots1130 = (String) spots.get(1);
        circleStatus1 = (String) statuses.get(2);
        spots1 = (String) spots.get(2);
        circleStatus230 = (String) statuses.get(3);
        spots230 = (String) spots.get(3);
        circleStatus4 = (String) statuses.get(4);
        spots4 = (String) spots.get(4);
        circleStatus530 = (String) statuses.get(5);
        spots530 = (String) spots.get(5);
        circleStatus7 = (String) statuses.get(6);
        spots7 = (String) spots.get(6);
        circleStatus830 = (String) statuses.get(7);
        spots830 = (String) spots.get(7);
        
        ritchieStatus10 = (String) ritchieStatuses.get(0);
        ritchieSpots10 = (String) ritchieSpots.get(0);
        ritchieStatus1115 = (String) ritchieStatuses.get(1);
        ritchieSpots1115 = (String) ritchieSpots.get(1);
        ritchieStatus1230 = (String) ritchieStatuses.get(2);
        ritchieSpots1230 = (String) ritchieSpots.get(2);
        ritchieStatus145 = (String) ritchieStatuses.get(3);
        ritchieSpots145 = (String) ritchieSpots.get(3);
        ritchieStatus3 = (String) ritchieStatuses.get(4);
        ritchieSpots3 = (String) ritchieSpots.get(4);
        ritchieStatus415 = (String) ritchieStatuses.get(5);
        ritchieSpots415 = (String) ritchieSpots.get(5);
        ritchieStatus530 = (String) ritchieStatuses.get(6);
        ritchieSpots530 = (String) ritchieSpots.get(6);
        ritchieStatus645 = (String) ritchieStatuses.get(7);
        ritchieSpots645 = (String) ritchieSpots.get(7);
        ritchieStatus8 = (String) ritchieStatuses.get(8);
        ritchieSpots8 = (String) ritchieSpots.get(8);
        ritchieStatus915 = (String) ritchieStatuses.get(9);
        ritchieSpots915 = (String) ritchieSpots.get(9);
        
        if (!sphStatuses.isEmpty()) {
            sphStatus10 = (String) sphStatuses.get(0);
            sphSpots10 = (String) sphSpots.get(0);
            sphStatus1130 = (String) sphStatuses.get(1);
            sphSpots1130 = (String) sphSpots.get(1);
            sphStatus1 = (String) sphStatuses.get(2);
            sphSpots1 = (String) sphSpots.get(2);
            sphStatus230 = (String) sphStatuses.get(3);
            sphSpots230 = (String) sphSpots.get(3);
            sphStatus4 = (String) sphStatuses.get(4);
            sphSpots4 = (String) sphSpots.get(4);
            sphStatus530 = (String) sphStatuses.get(5);
            sphSpots530 = (String) sphSpots.get(5);
            sphStatus7 = (String) sphStatuses.get(6);
            sphSpots7 = (String) sphSpots.get(6);
            sphStatus830 = (String) sphStatuses.get(7);
            sphSpots830 = (String) sphSpots.get(7);
        }
      
        String twTableXpath = "//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[2]/div[2]/div";
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"imlBodyMain\"]/div/div[1]/div[2]/div[1]/div/div[5]/week-calendar/div[1]/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/button[2]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(twTableXpath)));
        
        List<WebElement> rows2 = driver.findElements(By.xpath(twTableXpath));
        String row2text = rows2.get(0).getText();
        String lines2[] = row2text.split("\\r?\\n");
        ArrayList ritchieStatuses2 = new ArrayList<>();
        ArrayList ritchieSpots2 = new ArrayList<>();
        ArrayList statuses2 = new ArrayList<>();
        ArrayList spots2 = new ArrayList<>();
        ArrayList sphStatuses2 = new ArrayList<>();
        ArrayList sphSpots2 = new ArrayList<>();
        for (int i = 0; i < lines2.length; i++) {
            String line = lines2[i];
            if (line.equals("Individual Workout: Weight Room (ERC)")) {
                statuses2.add(lines2[i-2]);
                spots2.add(lines2[i-1]);
            } else if (line.equals("Individual Workout: Weight Room (Ritchie)")) {
                ritchieStatuses2.add(lines2[i-2]);
                ritchieSpots2.add(lines2[i-1]);
            } else if (line.equals("Individual Workout: SPH Weight Room")) {
                sphStatuses2.add(lines2[i-2]);
                sphSpots2.add(lines2[i-1]);
            }
        }
        
        twCircleStatus10 = (String) statuses2.get(0);
        twSpots10 = (String) spots2.get(0);
        twCircleStatus1130 = (String) statuses2.get(1);
        twSpots1130 = (String) spots2.get(1);
        twCircleStatus1 = (String) statuses2.get(2);
        twSpots1 = (String) spots2.get(2);
        twCircleStatus230 = (String) statuses2.get(3);
        twSpots230 = (String) spots2.get(3);
        twCircleStatus4 = (String) statuses2.get(4);
        twSpots4 = (String) spots2.get(4);
        twCircleStatus530 = (String) statuses2.get(5);
        twSpots530 = (String) spots2.get(5);
        twCircleStatus7 = (String) statuses2.get(6);
        twSpots7 = (String) spots2.get(6);
        twCircleStatus830 = (String) statuses2.get(7);
        twSpots830 = (String) spots2.get(7);
        
        twRitchieStatus10 = (String) ritchieStatuses2.get(0);
        twRitchieSpots10 = (String) ritchieSpots2.get(0);
        twRitchieStatus1115 = (String) ritchieStatuses2.get(1);
        twRitchieSpots1115 = (String) ritchieSpots2.get(1);
        twRitchieStatus1230 = (String) ritchieStatuses2.get(2);
        twRitchieSpots1230 = (String) ritchieSpots2.get(2);
        twRitchieStatus145 = (String) ritchieStatuses2.get(3);
        twRitchieSpots145 = (String) ritchieSpots2.get(3);
        twRitchieStatus3 = (String) ritchieStatuses2.get(4);
        twRitchieSpots3 = (String) ritchieSpots2.get(4);
        twRitchieStatus415 = (String) ritchieStatuses2.get(5);
        twRitchieSpots415 = (String) ritchieSpots2.get(5);
        twRitchieStatus530 = (String) ritchieStatuses2.get(6);
        twRitchieSpots530 = (String) ritchieSpots2.get(6);
        twRitchieStatus645 = (String) ritchieStatuses2.get(7);
        twRitchieSpots645 = (String) ritchieSpots2.get(7);
        twRitchieStatus8 = (String) ritchieStatuses2.get(8);
        twRitchieSpots8 = (String) ritchieSpots2.get(8);
        twRitchieStatus915 = (String) ritchieStatuses2.get(9);
        twRitchieSpots915 = (String) ritchieSpots2.get(9);
        
        if (!sphStatuses2.isEmpty()) {
            twSphStatus10 = (String) sphStatuses2.get(0);
            twSphSpots10 = (String) sphSpots2.get(0);
            twSphStatus1130 = (String) sphStatuses2.get(1);
            twSphSpots1130 = (String) sphSpots2.get(1);
            twSphStatus1 = (String) sphStatuses2.get(2);
            twSphSpots1 = (String) sphSpots2.get(2);
            twSphStatus230 = (String) sphStatuses2.get(3);
            twSphSpots230 = (String) sphSpots2.get(3);
            twSphStatus4 = (String) sphStatuses2.get(4);
            twSphSpots4 = (String) sphSpots2.get(4);
            twSphStatus530 = (String) sphStatuses2.get(5);
            twSphSpots530 = (String) sphSpots2.get(5);
            twSphStatus7 = (String) sphStatuses2.get(6);
            twSphSpots7 = (String) sphSpots2.get(6);
            twSphStatus830 = (String) sphStatuses2.get(7);
            twSphSpots830 = (String) sphSpots2.get(7);
        }
        
    }
    
    
}


