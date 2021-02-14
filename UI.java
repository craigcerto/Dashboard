/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.ui;
import java.awt.Color;
import javax.swing.DefaultListModel;       // Using layouts
// Using AWT event classes and listener interfaces
/**
 *
 * @author craigcerto
 */
public class UI extends javax.swing.JFrame{

    /**
     * Creates new form MainUI
     */
    public UI() {
        initComponents();
        
        
        weather = new Weather("333562", "-76.937", "71.5843");
        gym = new Gym();
        weather.update("cw");
        weather.update("fc");
        weather.update("sm");
        weather.loadForecast();
        weather.loadCurrentWeather();
        weather.loadSunMoonInfo();
        gym.getSpots();
        
        this.populateGymStatus();
        this.colorButtons();
        this.populateCurrentWeather();
        this.populateForecast();
        
    }
    
    private void colorButtons() {
        if (gym.circleStatus10.equals("Closed") || gym.circleStatus10.equals("Full")) {
            TodayButton10.setBackground(Color.red);
        } else if (gym.circleStatus10.equals("Open")) {
            TodayButton10.setBackground(Color.green);
        } else {
            TodayButton10.setBackground(Color.yellow);
        }
        
        if (gym.circleStatus1130.equals("Closed") || gym.circleStatus1130.equals("Full")) {
            TodayButton1130.setBackground(Color.red);
        } else if (gym.circleStatus1130.equals("Open")) {
            TodayButton1130.setBackground(Color.green);
        } else {
            TodayButton1130.setBackground(Color.yellow);
        }
        
        if (gym.circleStatus1.equals("Closed") || gym.circleStatus1.equals("Full")) {
            TodayButton1.setBackground(Color.red);
        } else if (gym.circleStatus1.equals("Open")) {
            TodayButton1.setBackground(Color.green);
        } else {
            TodayButton1.setBackground(Color.yellow);
        }
        
        if (gym.circleStatus230.equals("Closed") || gym.circleStatus230.equals("Full")) {
            TodayButton230.setBackground(Color.red);
        } else if (gym.circleStatus230.equals("Open")) {
            TodayButton230.setBackground(Color.green);
        } else {
            TodayButton230.setBackground(Color.yellow);
        }
        
        if (gym.circleStatus4.equals("Closed") || gym.circleStatus4.equals("Full")) {
            TodayButton4.setBackground(Color.red);
        } else if (gym.circleStatus4.equals("Open")) {
            TodayButton4.setBackground(Color.green);
        } else {
            TodayButton4.setBackground(Color.yellow);
        }
        
        if (gym.circleStatus530.equals("Closed") || gym.circleStatus530.equals("Full")) {
            TodayButton530.setBackground(Color.red);
        } else if (gym.circleStatus530.equals("Open")) {
            TodayButton530.setBackground(Color.green);
        } else {
            TodayButton530.setBackground(Color.yellow);
        }
        
        if (gym.circleStatus7.equals("Closed") || gym.circleStatus7.equals("Full")) {
            TodayButton7.setBackground(Color.red);
        } else if (gym.circleStatus7.equals("Open")) {
            TodayButton7.setBackground(Color.green);
        } else {
            TodayButton7.setBackground(Color.yellow);
        }
        
        if (gym.circleStatus830.equals("Closed") || gym.circleStatus830.equals("Full")) {
            TodayButton830.setBackground(Color.red);
        } else if (gym.circleStatus830.equals("Open")) {
            TodayButton830.setBackground(Color.green);
        } else {
            TodayButton830.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus10.equals("Closed") || gym.twCircleStatus10.equals("Full")) {
            TomorrowButton10.setBackground(Color.red);
        } else if (gym.twCircleStatus10.equals("Open")) {
            TomorrowButton10.setBackground(Color.green);
        } else {
            TomorrowButton10.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus1130.equals("Closed") || gym.twCircleStatus1130.equals("Full")) {
            TomorrowButton1130.setBackground(Color.red);
        } else if (gym.twCircleStatus1130.equals("Open")) {
            TomorrowButton1130.setBackground(Color.green);
        } else {
            TomorrowButton1130.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus1.equals("Closed") || gym.twCircleStatus1.equals("Full")) {
            TomorrowButton1.setBackground(Color.red);
        } else if (gym.twCircleStatus1.equals("Open")) {
            TomorrowButton1.setBackground(Color.green);
        } else {
            TomorrowButton1.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus230.equals("Closed") || gym.twCircleStatus230.equals("Full")) {
            TomorrowButton230.setBackground(Color.red);
        } else if (gym.twCircleStatus230.equals("Open")) {
            TomorrowButton230.setBackground(Color.green);
        } else {
            TomorrowButton230.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus4.equals("Closed") || gym.twCircleStatus4.equals("Full")) {
            TomorrowButton4.setBackground(Color.red);
        } else if (gym.twCircleStatus4.equals("Open")) {
            TomorrowButton4.setBackground(Color.green);
        } else {
            TomorrowButton4.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus530.equals("Closed") || gym.twCircleStatus530.equals("Full")) {
            TomorrowButton530.setBackground(Color.red);
        } else if (gym.twCircleStatus530.equals("Open")) {
            TomorrowButton530.setBackground(Color.green);
        } else {
            TomorrowButton530.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus7.equals("Closed") || gym.twCircleStatus7.equals("Full")) {
            TomorrowButton7.setBackground(Color.red);
        } else if (gym.twCircleStatus7.equals("Open")) {
            TomorrowButton7.setBackground(Color.green);
        } else {
            TomorrowButton7.setBackground(Color.yellow);
        }
        
        if (gym.twCircleStatus830.equals("Closed") || gym.twCircleStatus830.equals("Full")) {
            TomorrowButton830.setBackground(Color.red);
        } else if (gym.twCircleStatus830.equals("Open")) {
            TomorrowButton830.setBackground(Color.green);
        } else {
            TomorrowButton830.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus10.equals("Closed") || gym.ritchieStatus10.equals("Full")) {
            RitchieButton10.setBackground(Color.red);
        } else if (gym.ritchieStatus10.equals("Open")) {
            RitchieButton10.setBackground(Color.green);
        } else {
            RitchieButton10.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus1115.equals("Closed") || gym.ritchieStatus1115.equals("Full")) {
            RitchieButton1115.setBackground(Color.red);
        } else if (gym.ritchieStatus1115.equals("Open")) {
            RitchieButton1115.setBackground(Color.green);
        } else {
            RitchieButton1115.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus1230.equals("Closed") || gym.ritchieStatus1230.equals("Full")) {
            RitchieButton1230.setBackground(Color.red);
        } else if (gym.ritchieStatus1230.equals("Open")) {
            RitchieButton1230.setBackground(Color.green);
        } else {
            RitchieButton1230.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus145.equals("Closed") || gym.ritchieStatus145.equals("Full")) {
            RitchieButton145.setBackground(Color.red);
        } else if (gym.ritchieStatus145.equals("Open")) {
            RitchieButton145.setBackground(Color.green);
        } else {
            RitchieButton145.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus3.equals("Closed") || gym.ritchieStatus3.equals("Full")) {
            RitchieButton3.setBackground(Color.red);
        } else if (gym.ritchieStatus3.equals("Open")) {
            RitchieButton3.setBackground(Color.green);
        } else {
            RitchieButton3.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus415.equals("Closed") || gym.ritchieStatus415.equals("Full")) {
            RitchieButton415.setBackground(Color.red);
        } else if (gym.ritchieStatus415.equals("Open")) {
            RitchieButton415.setBackground(Color.green);
        } else {
            RitchieButton415.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus530.equals("Closed") || gym.ritchieStatus530.equals("Full")) {
            RitchieButton530.setBackground(Color.red);
        } else if (gym.ritchieStatus530.equals("Open")) {
            RitchieButton530.setBackground(Color.green);
        } else {
            RitchieButton530.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus645.equals("Closed") || gym.ritchieStatus645.equals("Full")) {
            RitchieButton645.setBackground(Color.red);
        } else if (gym.ritchieStatus645.equals("Open")) {
            RitchieButton645.setBackground(Color.green);
        } else {
            RitchieButton645.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus8.equals("Closed") || gym.ritchieStatus8.equals("Full")) {
            RitchieButton8.setBackground(Color.red);
        } else if (gym.ritchieStatus8.equals("Open")) {
            RitchieButton8.setBackground(Color.green);
        } else {
            RitchieButton8.setBackground(Color.yellow);
        }
        
        if (gym.ritchieStatus915.equals("Closed") || gym.ritchieStatus915.equals("Full")) {
            RitchieButton915.setBackground(Color.red);
        } else if (gym.ritchieStatus915.equals("Open")) {
            RitchieButton915.setBackground(Color.green);
        } else {
            RitchieButton915.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus10.equals("Closed") || gym.twRitchieStatus10.equals("Full")) {
            TRitchieButton10.setBackground(Color.red);
        } else if (gym.twRitchieStatus10.equals("Open")) {
            TRitchieButton10.setBackground(Color.green);
        } else {
            TRitchieButton10.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus1115.equals("Closed") || gym.twRitchieStatus1115.equals("Full")) {
            TRitchieButton1115.setBackground(Color.red);
        } else if (gym.twRitchieStatus1115.equals("Open")) {
            TRitchieButton1115.setBackground(Color.green);
        } else {
            TRitchieButton1115.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus1230.equals("Closed") || gym.twRitchieStatus1230.equals("Full")) {
            TRitchieButton1230.setBackground(Color.red);
        } else if (gym.twRitchieStatus1230.equals("Open")) {
            TRitchieButton1230.setBackground(Color.green);
        } else {
            TRitchieButton1230.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus145.equals("Closed") || gym.twRitchieStatus145.equals("Full")) {
            TRitchieButton145.setBackground(Color.red);
        } else if (gym.twRitchieStatus145.equals("Open")) {
            TRitchieButton145.setBackground(Color.green);
        } else {
            TRitchieButton145.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus3.equals("Closed") || gym.twRitchieStatus3.equals("Full")) {
            TRitchieButton3.setBackground(Color.red);
        } else if (gym.twRitchieStatus3.equals("Open")) {
            TRitchieButton3.setBackground(Color.green);
        } else {
            TRitchieButton3.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus415.equals("Closed") || gym.twRitchieStatus415.equals("Full")) {
            TRitchieButton415.setBackground(Color.red);
        } else if (gym.twRitchieStatus415.equals("Open")) {
            TRitchieButton415.setBackground(Color.green);
        } else {
            TRitchieButton415.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus530.equals("Closed") || gym.twRitchieStatus530.equals("Full")) {
            TRitchieButton530.setBackground(Color.red);
        } else if (gym.twRitchieStatus530.equals("Open")) {
            TRitchieButton530.setBackground(Color.green);
        } else {
            TRitchieButton530.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus645.equals("Closed") || gym.twRitchieStatus645.equals("Full")) {
            TRitchieButton645.setBackground(Color.red);
        } else if (gym.twRitchieStatus645.equals("Open")) {
            TRitchieButton645.setBackground(Color.green);
        } else {
            TRitchieButton645.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus8.equals("Closed") || gym.twRitchieStatus8.equals("Full")) {
            TRitchieButton8.setBackground(Color.red);
        } else if (gym.twRitchieStatus8.equals("Open")) {
            TRitchieButton8.setBackground(Color.green);
        } else {
            TRitchieButton8.setBackground(Color.yellow);
        }
        
        if (gym.twRitchieStatus915.equals("Closed") || gym.twRitchieStatus915.equals("Full")) {
            TRitchieButton915.setBackground(Color.red);
        } else if (gym.twRitchieStatus915.equals("Open")) {
            TRitchieButton915.setBackground(Color.green);
        } else {
            TRitchieButton915.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus10 == null) {
            SPHLabel10.setText("Closed");
            SPHSlots10.setText("00/00");
            SPHButton10.setBackground(Color.red);
        } else if (gym.sphStatus10.equals("Closed") || gym.sphStatus10.equals("Full")) {
            SPHButton10.setBackground(Color.red);
        } else if (gym.sphStatus10.equals("Open")) {
            SPHButton10.setBackground(Color.green);
        } else {
            SPHButton10.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus1130 == null) {
            SPHLabel1130.setText("Closed");
            SPHSlots1130.setText("00/00");
            SPHButton1130.setBackground(Color.red);
        } else if (gym.sphStatus1130.equals("Closed") || gym.sphStatus1130.equals("Full")) {
            SPHButton1130.setBackground(Color.red);
        } else if (gym.sphStatus1130.equals("Open")) {
            SPHButton1130.setBackground(Color.green);
        } else {
            SPHButton1130.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus1 == null) {
            SPHLabel1.setText("Closed");
            SPHSlots1.setText("00/00");
            SPHButton1.setBackground(Color.red);
        } else if (gym.sphStatus1.equals("Closed") || gym.sphStatus1.equals("Full")) {
            SPHButton1.setBackground(Color.red);
        } else if (gym.sphStatus1.equals("Open")) {
            SPHButton1.setBackground(Color.green);
        } else {
            SPHButton1.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus230 == null) {
            SPHLabel230.setText("Closed");
            SPHSlots230.setText("00/00");
            SPHButton230.setBackground(Color.red);
        }else if (gym.sphStatus230.equals("Closed") || gym.sphStatus230.equals("Full")) {
            SPHButton230.setBackground(Color.red);
        } else if (gym.sphStatus230.equals("Open")) {
            SPHButton230.setBackground(Color.green);
        } else {
            SPHButton230.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus4 == null) {
            SPHLabel4.setText("Closed");
            SPHSlots4.setText("00/00");
            SPHButton4.setBackground(Color.red);
        } else if (gym.sphStatus4.equals("Closed") || gym.sphStatus4.equals("Full")) {
            SPHButton4.setBackground(Color.red);
        } else if (gym.sphStatus4.equals("Open")) {
            SPHButton4.setBackground(Color.green);
        } else {
            SPHButton4.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus530 == null) {
            SPHLabel530.setText("Closed");
            SPHSlots530.setText("00/00");
            SPHButton530.setBackground(Color.red);
        } else if (gym.sphStatus530.equals("Closed") || gym.sphStatus530.equals("Full")) {
            SPHButton530.setBackground(Color.red);
        } else if (gym.sphStatus530.equals("Open")) {
            SPHButton530.setBackground(Color.green);
        } else {
            SPHButton530.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus7 == null) {
            SPHLabel7.setText("Closed");
            SPHSlots7.setText("00/00");
            SPHButton7.setBackground(Color.red);
        } else if (gym.sphStatus7.equals("Closed") || gym.sphStatus7.equals("Full")) {
            SPHButton7.setBackground(Color.red);
        } else if (gym.sphStatus7.equals("Open")) {
            SPHButton7.setBackground(Color.green);
        } else {
            SPHButton7.setBackground(Color.yellow);
        }
        
        if (gym.sphStatus830 == null) {
            SPHLabel830.setText("Closed");
            SPHSlots830.setText("00/00");
            SPHButton830.setBackground(Color.red);
        } else if (gym.sphStatus830.equals("Closed") || gym.sphStatus830.equals("Full")) {
            SPHButton830.setBackground(Color.red);
        } else if (gym.sphStatus830.equals("Open")) {
            SPHButton830.setBackground(Color.green);
        } else {
            SPHButton830.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus10 == null) {
            TSPHStatus10.setText("Closed");
            TSPHSlots10.setText("00/00");
            TSPHButton10.setBackground(Color.red);
        } else if (gym.twSphStatus10.equals("Closed") || gym.twSphStatus10.equals("Full")) {
            TSPHButton10.setBackground(Color.red);
        } else if (gym.twSphStatus10.equals("Open")) {
            TSPHButton10.setBackground(Color.green);
        } else {
            TSPHButton10.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus1130 == null) {
            TSPHStatus1130.setText("Closed");
            TSPHSlots1130.setText("00/00");
            TSPHButton1130.setBackground(Color.red);
        } else if (gym.twSphStatus1130.equals("Closed") || gym.twSphStatus1130.equals("Full")) {
            TSPHButton1130.setBackground(Color.red);
        } else if (gym.twSphStatus1130.equals("Open")) {
            TSPHButton1130.setBackground(Color.green);
        } else {
            TSPHButton1130.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus1 == null) {
            TSPHStatus1.setText("Closed");
            TSPHSlots1.setText("00/00");
            TSPHButton1.setBackground(Color.red);
        } else if (gym.twSphStatus1.equals("Closed") || gym.twSphStatus1.equals("Full")) {
            TSPHButton1.setBackground(Color.red);
        } else if (gym.twSphStatus1.equals("Open")) {
            TSPHButton1.setBackground(Color.green);
        } else {
            TSPHButton1.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus230 == null) {
            TSPHStatus230.setText("Closed");
            TSPHSlots230.setText("00/00");
            TSPHButton230.setBackground(Color.red);
        } else if (gym.twSphStatus230.equals("Closed") || gym.twSphStatus230.equals("Full")) {
            TSPHButton230.setBackground(Color.red);
        } else if (gym.twSphStatus230.equals("Open")) {
            TSPHButton230.setBackground(Color.green);
        } else {
            TSPHButton230.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus4 == null) {
            TSPHStatus4.setText("Closed");
            TSPHSlots4.setText("00/00");
            TSPHButton4.setBackground(Color.red);
        } else if (gym.twSphStatus4.equals("Closed") || gym.twSphStatus4.equals("Full")) {
            TSPHButton4.setBackground(Color.red);
        } else if (gym.twSphStatus4.equals("Open")) {
            TSPHButton4.setBackground(Color.green);
        } else {
            TSPHButton4.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus530 == null) {
            TSPHStatus530.setText("Closed");
            TSPHSlots530.setText("00/00");
            TSPHButton530.setBackground(Color.red);
        } else if (gym.twSphStatus530.equals("Closed") || gym.twSphStatus530.equals("Full")) {
            TSPHButton530.setBackground(Color.red);
        } else if (gym.twSphStatus530.equals("Open")) {
            TSPHButton530.setBackground(Color.green);
        } else {
            TSPHButton530.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus7 == null) {
            TSPHStatus7.setText("Closed");
            TSPHSlots7.setText("00/00");
            TSPHButton7.setBackground(Color.red);
        } else if (gym.twSphStatus7.equals("Closed") || gym.twSphStatus7.equals("Full")) {
            TSPHButton7.setBackground(Color.red);
        } else if (gym.twSphStatus7.equals("Open")) {
            TSPHButton7.setBackground(Color.green);
        } else {
            TSPHButton7.setBackground(Color.yellow);
        }
        
        if (gym.twSphStatus830 == null) {
            TSPHStatus830.setText("Closed");
            TSPHSlots830.setText("00/00");
            TSPHButton830.setBackground(Color.red);
        } else if (gym.twSphStatus830.equals("Closed") || gym.twSphStatus830.equals("Full")) {
            TSPHButton830.setBackground(Color.red);
        } else if (gym.twSphStatus830.equals("Open")) {
            TSPHButton830.setBackground(Color.green);
        } else {
            TSPHButton830.setBackground(Color.yellow);
        }
       
    }
    
    private void populateGymStatus() {
        Today10Status.setText(gym.circleStatus10);
        Today1130Status.setText(gym.circleStatus1130);
        Today1Status.setText(gym.circleStatus1);
        Today230Status.setText(gym.circleStatus230);
        Today4Status.setText(gym.circleStatus4);
        Today530Status.setText(gym.circleStatus530);
        Today7Status.setText(gym.circleStatus7);
        Today830Status.setText(gym.circleStatus830);
        TodaySlots10.setText(gym.spots10);
        TodaySlots1130.setText(gym.spots1130);
        TodaySlots1.setText(gym.spots1);
        TodaySlots230.setText(gym.spots230);
        TodaySlots4.setText(gym.spots4);
        TodaySlots530.setText(gym.spots530);
        TodaySlots7.setText(gym.spots7);
        TodaySlots830.setText(gym.spots830);
        
        SPHLabel10.setText(gym.sphStatus10);
        SPHLabel1130.setText(gym.sphStatus1130);
        SPHLabel1.setText(gym.sphStatus1);
        SPHLabel230.setText(gym.sphStatus230);
        SPHLabel4.setText(gym.sphStatus4);
        SPHLabel530.setText(gym.sphStatus530);
        SPHLabel7.setText(gym.sphStatus7);
        SPHLabel830.setText(gym.sphStatus830);
        SPHSlots10.setText(gym.sphSpots10);
        SPHSlots1130.setText(gym.sphSpots1130);
        SPHSlots1.setText(gym.sphSpots1);
        SPHSlots230.setText(gym.sphSpots230);
        SPHSlots4.setText(gym.sphSpots4);
        SPHSlots530.setText(gym.sphSpots530);
        SPHSlots7.setText(gym.sphSpots7);
        SPHSlots830.setText(gym.sphSpots830);
        
        RitchieStatus10.setText(gym.ritchieStatus10);
        RitchieStatus1115.setText(gym.ritchieStatus1115);
        RitchieStatus1230.setText(gym.ritchieStatus1230);
        RitchieStatus145.setText(gym.ritchieStatus145);
        RitchieStatus3.setText(gym.ritchieStatus3);
        RitchieStatus415.setText(gym.ritchieStatus415);
        RitchieStatus530.setText(gym.ritchieStatus530);
        RitchieStatus645.setText(gym.ritchieStatus645);
        RitchieStatus8.setText(gym.ritchieStatus8);
        RitchieStatus915.setText(gym.ritchieStatus915);
        RitchieSlots10.setText(gym.ritchieSpots10);
        RitchieSlots1115.setText(gym.ritchieSpots1115);
        RitchieSlots1230.setText(gym.ritchieSpots1230);
        RitchieSlots145.setText(gym.ritchieSpots145);
        RitchieSlots3.setText(gym.ritchieSpots3);
        RitchieSlots415.setText(gym.ritchieSpots415);
        RitchieSlots530.setText(gym.ritchieSpots530);
        RitchieSlots645.setText(gym.ritchieSpots645);
        RitchieSlots8.setText(gym.ritchieSpots8);
        RitchieSlots915.setText(gym.ritchieSpots915);
        
        Tomorrow10Status.setText(gym.twCircleStatus10);
        Tomorrow1130Status.setText(gym.twCircleStatus1130);
        Tomorrow1Status.setText(gym.twCircleStatus1);
        Tomorrow230Status.setText(gym.twCircleStatus230);
        Tomorrow4Status.setText(gym.twCircleStatus4);
        Tomorrow530Status.setText(gym.twCircleStatus530);
        Tomorrow7Status.setText(gym.twCircleStatus7);
        Tomorrow830Status.setText(gym.twCircleStatus830);
        TomorrowSlots10.setText(gym.twSpots10);
        TomorrowSlots1130.setText(gym.twSpots1130);
        TomorrowSlots1.setText(gym.twSpots1);
        TomorrowSlots230.setText(gym.twSpots230);
        TomorrowSlots4.setText(gym.twSpots4);
        TomorrowSlots530.setText(gym.twSpots530);
        TomorrowSlots7.setText(gym.twSpots7);
        TomorrowSlots830.setText(gym.twSpots830);
        
        TRitchieStatus10.setText(gym.twRitchieStatus10);
        TRitchieStatus1115.setText(gym.twRitchieStatus1115);
        TRitchieStatus1230.setText(gym.twRitchieStatus1230);
        TRitchieStatus145.setText(gym.twRitchieStatus145);
        TRitchieStatus3.setText(gym.twRitchieStatus3);
        TRitchieStatus415.setText(gym.twRitchieStatus415);
        TRitchieStatus530.setText(gym.twRitchieStatus530);
        TRitchieStatus645.setText(gym.twRitchieStatus645);
        TRitchieStatus8.setText(gym.twRitchieStatus8);
        TRitchieStatus915.setText(gym.twRitchieStatus915);
        TRitchieSlots10.setText(gym.twRitchieSpots10);
        TRitchieSlots1115.setText(gym.twRitchieSpots1115);
        TRitchieSlots1230.setText(gym.twRitchieSpots1230);
        TRitchieSlots145.setText(gym.twRitchieSpots145);
        TRitchieSlots3.setText(gym.twRitchieSpots3);
        TRitchieSlots415.setText(gym.twRitchieSpots415);
        TRitchieSlots530.setText(gym.twRitchieSpots530);
        TRitchieSlots645.setText(gym.twRitchieSpots645);
        TRitchieSlots8.setText(gym.twRitchieSpots8);
        TRitchieSlots915.setText(gym.twRitchieSpots915);
        
        TSPHStatus10.setText(gym.twSphStatus10);
        TSPHStatus1130.setText(gym.twSphStatus1130);
        TSPHStatus1.setText(gym.twSphStatus1);
        TSPHStatus230.setText(gym.twSphStatus230);
        TSPHStatus4.setText(gym.twSphStatus4);
        TSPHStatus530.setText(gym.twSphStatus530);
        TSPHStatus7.setText(gym.twSphStatus7);
        TSPHStatus830.setText(gym.twSphStatus830);
        TSPHSlots10.setText(gym.twSphSpots10);
        TSPHSlots1130.setText(gym.twSphSpots1130);
        TSPHSlots1.setText(gym.twSphSpots1);
        TSPHSlots230.setText(gym.twSphSpots230);
        TSPHSlots4.setText(gym.twSphSpots4);
        TSPHSlots530.setText(gym.twSphSpots530);
        TSPHSlots7.setText(gym.twSphSpots7);
        TSPHSlots830.setText(gym.twSphSpots830);
    }
    
    private void populateCurrentWeather() {
        Temperature.setText(weather.temperature);
        RealFeel.setText(weather.realFeel);
        Pressure.setText(weather.pressure);
        DewPoint.setText(weather.dewPoint);
        Description.setText(weather.weatherText);
        Humidity.setText(weather.humidity);
        WindDirection.setText(weather.windDirection);
        WindSpeed.setText(weather.windSpeed);
        CloudCover.setText(weather.cloudCover);
        PastHrPrep.setText(weather.pastHrPrecip);
        Sunrise.setText(weather.sunrise);
        Sunset.setText(weather.sunset);
        SolarNoon.setText(weather.solarNoon);
        DayLength.setText(weather.dayLength);
        SunDistance.setText(weather.sunDistance.substring(0, 5));
        MoonDistance.setText(weather.moonDistance.substring(0, 5));
    }
    
    private void populateForecast() {
        try {
            High.setText(weather.dayOne.get("realMaxTemp"));
            Low.setText(weather.dayOne.get("realMinTemp"));
            AirQuality.setText(weather.dayOne.get("airQuality"));
            UV.setText(weather.dayOne.get("uvIndex"));
            Grass.setText(weather.dayOne.get("grass"));
            Tree.setText(weather.dayOne.get("tree"));
            Mold.setText(weather.dayOne.get("mold"));
            Ragweed.setText(weather.dayOne.get("ragweed"));
            Rise.setText(weather.dayOne.get("sunRise"));
            Set.setText(weather.dayOne.get("sunSet"));
            MoonPhas.setText(weather.dayOne.get("moonPhase"));
            HrsOfSun.setText(weather.dayOne.get("HoursOfSun"));
            AirQuality.setText(weather.dayOne.get("airQuality"));
            Grass.setText(weather.dayOne.get("grass"));
            Mold.setText(weather.dayOne.get("mold"));
            Ragweed.setText(weather.dayOne.get("ragweed"));
            DaySummary.setText(weather.dayOne.get("dayLongPhrase"));
            DayThunder.setText(weather.dayOne.get("dayThunder"));
            DayRain.setText(weather.dayOne.get("dayRain"));
            DaySnow.setText(weather.dayOne.get("daySnow"));
            DaySpeed.setText(weather.dayOne.get("daySpeed"));
            DayDirection.setText(weather.dayOne.get("dayDirection"));
            //NightSummary.setText(weather.dayOne.get("nightLongPhrase"));
            NightRain.setText(weather.dayOne.get("nightRain"));
            NightThunder.setText(weather.dayOne.get("nightThunder"));
            NightSnow.setText(weather.dayOne.get("nightSnow"));
            NightSpeed.setText(weather.dayOne.get("nightSpeed"));
            NightDirection.setText(weather.dayOne.get("nightDirection"));
            
        } catch (Exception e) {
            
        }
        
        try {
            High2.setText(weather.dayTwo.get("realMaxTemp"));
            Low2.setText(weather.dayTwo.get("realMinTemp"));
            AirQuality2.setText(weather.dayTwo.get("airQuality"));
            UV2.setText(weather.dayTwo.get("uvIndex"));
            Grass2.setText(weather.dayTwo.get("grass"));
            Tree2.setText(weather.dayTwo.get("tree"));
            Mold2.setText(weather.dayTwo.get("mold"));
            Ragweed2.setText(weather.dayTwo.get("ragweed"));
            Rise2.setText(weather.dayTwo.get("sunRise"));
            Set2.setText(weather.dayTwo.get("sunSet"));
            MoonPhas2.setText(weather.dayTwo.get("moonPhase"));
            HrsOfSun2.setText(weather.dayTwo.get("HoursOfSun"));
            AirQuality2.setText(weather.dayTwo.get("airQuality"));
            Grass2.setText(weather.dayTwo.get("grass"));
            Mold2.setText(weather.dayTwo.get("mold"));
            Ragweed2.setText(weather.dayTwo.get("ragweed"));
            DaySummary2.setText(weather.dayTwo.get("dayLongPhrase"));
            DayThunder2.setText(weather.dayTwo.get("dayThunder"));
            DayRain2.setText(weather.dayTwo.get("dayRain"));
            DaySnow2.setText(weather.dayTwo.get("daySnow"));
            DaySpeed2.setText(weather.dayTwo.get("daySpeed"));
            DayDirection2.setText(weather.dayTwo.get("dayDirection"));
            NightSummary2.setText(weather.dayTwo.get("nightLongPhrase"));
            NightRain2.setText(weather.dayTwo.get("nightRain"));
            NightThunder2.setText(weather.dayTwo.get("nightThunder"));
            NightSnow2.setText(weather.dayTwo.get("nightSnow"));
            NightSpeed2.setText(weather.dayTwo.get("nightSpeed"));
            NightDirection2.setText(weather.dayTwo.get("nightDirection"));
            
        } catch (Exception e) {
            
        }
        
        try {
            High3.setText(weather.dayThree.get("realMaxTemp"));
            Low3.setText(weather.dayThree.get("realMinTemp"));
            AirQuality3.setText(weather.dayThree.get("airQuality"));
            UV3.setText(weather.dayThree.get("uvIndex"));
            Grass3.setText(weather.dayThree.get("grass"));
            Tree3.setText(weather.dayThree.get("tree"));
            Mold3.setText(weather.dayThree.get("mold"));
            Ragweed3.setText(weather.dayThree.get("ragweed"));
            Rise3.setText(weather.dayThree.get("sunRise"));
            Set3.setText(weather.dayThree.get("sunSet"));
            MoonPhas3.setText(weather.dayThree.get("moonPhase"));
            HrsOfSun3.setText(weather.dayThree.get("HoursOfSun"));
            AirQuality3.setText(weather.dayThree.get("airQuality"));
            Grass3.setText(weather.dayThree.get("grass"));
            Mold3.setText(weather.dayThree.get("mold"));
            Ragweed3.setText(weather.dayThree.get("ragweed"));
            DaySummary3.setText(weather.dayThree.get("dayLongPhrase"));
            DayThunder3.setText(weather.dayThree.get("dayThunder"));
            DayRain3.setText(weather.dayThree.get("dayRain"));
            DaySnow3.setText(weather.dayThree.get("daySnow"));
            DaySpeed3.setText(weather.dayThree.get("daySpeed"));
            DayDirection3.setText(weather.dayThree.get("dayDirection"));
            NightSummary3.setText(weather.dayThree.get("nightLongPhrase"));
            NightRain3.setText(weather.dayThree.get("nightRain"));
            NightThunder3.setText(weather.dayThree.get("nightThunder"));
            NightSnow3.setText(weather.dayThree.get("nightSnow"));
            NightSpeed3.setText(weather.dayThree.get("nightSpeed"));
            NightDirection3.setText(weather.dayThree.get("nightDirection"));
            
        } catch (Exception e) {
            
        }
        
        try {
            High4.setText(weather.dayFour.get("realMaxTemp"));
            Low4.setText(weather.dayFour.get("realMinTemp"));
            AirQuality4.setText(weather.dayFour.get("airQuality"));
            UV4.setText(weather.dayFour.get("uvIndex"));
            Grass4.setText(weather.dayFour.get("grass"));
            Tree4.setText(weather.dayFour.get("tree"));
            Mold4.setText(weather.dayFour.get("mold"));
            Ragweed4.setText(weather.dayFour.get("ragweed"));
            Rise4.setText(weather.dayFour.get("sunRise"));
            Set4.setText(weather.dayFour.get("sunSet"));
            MoonPhas4.setText(weather.dayFour.get("moonPhase"));
            HrsOfSun4.setText(weather.dayFour.get("HoursOfSun"));
            AirQuality4.setText(weather.dayFour.get("airQuality"));
            Grass4.setText(weather.dayFour.get("grass"));
            Mold4.setText(weather.dayFour.get("mold"));
            Ragweed4.setText(weather.dayFour.get("ragweed"));
            DaySummary4.setText(weather.dayFour.get("dayLongPhrase"));
            DayThunder4.setText(weather.dayFour.get("dayThunder"));
            DayRain4.setText(weather.dayFour.get("dayRain"));
            DaySnow4.setText(weather.dayFour.get("daySnow"));
            DaySpeed4.setText(weather.dayFour.get("daySpeed"));
            DayDirection4.setText(weather.dayFour.get("dayDirection"));
            NightSummary4.setText(weather.dayFour.get("nightLongPhrase"));
            NightRain4.setText(weather.dayFour.get("nightRain"));
            NightThunder4.setText(weather.dayFour.get("nightThunder"));
            NightSnow4.setText(weather.dayFour.get("nightSnow"));
            NightSpeed4.setText(weather.dayFour.get("nightSpeed"));
            NightDirection4.setText(weather.dayFour.get("nightDirection"));
            
        } catch (Exception e) {
            
        }
        
        try {
            High5.setText(weather.dayFive.get("realMaxTemp"));
            Low5.setText(weather.dayFive.get("realMinTemp"));
            AirQuality5.setText(weather.dayFive.get("airQuality"));
            UV5.setText(weather.dayFive.get("uvIndex"));
            Grass5.setText(weather.dayFive.get("grass"));
            Tree5.setText(weather.dayFive.get("tree"));
            Mold5.setText(weather.dayFive.get("mold"));
            Ragweed5.setText(weather.dayFive.get("ragweed"));
            Rise5.setText(weather.dayFive.get("sunRise"));
            Set5.setText(weather.dayFive.get("sunSet"));
            MoonPhas5.setText(weather.dayFive.get("moonPhase"));
            HrsOfSun5.setText(weather.dayFive.get("HoursOfSun"));
            AirQuality5.setText(weather.dayFive.get("airQuality"));
            Grass5.setText(weather.dayFive.get("grass"));
            Mold5.setText(weather.dayFive.get("mold"));
            Ragweed5.setText(weather.dayFive.get("ragweed"));
            DaySummary5.setText(weather.dayFive.get("dayLongPhrase"));
            DayThunder5.setText(weather.dayFive.get("dayThunder"));
            DayRain5.setText(weather.dayFive.get("dayRain"));
            DaySnow5.setText(weather.dayFive.get("daySnow"));
            DaySpeed5.setText(weather.dayFive.get("daySpeed"));
            DayDirection5.setText(weather.dayFive.get("dayDirection"));
            NightSummary5.setText(weather.dayFive.get("nightLongPhrase"));
            NightRain5.setText(weather.dayFive.get("nightRain"));
            NightThunder5.setText(weather.dayFive.get("nightThunder"));
            NightSnow5.setText(weather.dayFive.get("nightSnow"));
            NightSpeed5.setText(weather.dayFive.get("nightSpeed"));
            NightDirection5.setText(weather.dayFive.get("nightDirection"));
            
        } catch (Exception e) {
            
        }
    }
    
    /* WRITTEN BY NETBEANS UI BUILDER */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        DisplayPanel = new javax.swing.JPanel();
        Main_Weather = new javax.swing.JPanel();
        LabelPanel1 = new javax.swing.JPanel();
        TemperatureLabel = new javax.swing.JLabel();
        RealFeelLabel = new javax.swing.JLabel();
        PressureLabel = new javax.swing.JLabel();
        DewPointLabel = new javax.swing.JLabel();
        DataPanel1 = new javax.swing.JPanel();
        Temperature = new javax.swing.JLabel();
        RealFeel = new javax.swing.JLabel();
        Pressure = new javax.swing.JLabel();
        DewPoint = new javax.swing.JLabel();
        LabelPanel2 = new javax.swing.JPanel();
        DescriptionLabel = new javax.swing.JLabel();
        HumidityLabel = new javax.swing.JLabel();
        WindDirectionLabel = new javax.swing.JLabel();
        WindSpeedLabel = new javax.swing.JLabel();
        DataPanel2 = new javax.swing.JPanel();
        Description = new javax.swing.JLabel();
        Humidity = new javax.swing.JLabel();
        WindDirection = new javax.swing.JLabel();
        WindSpeed = new javax.swing.JLabel();
        LabelPanel3 = new javax.swing.JPanel();
        CloudCoverLabel = new javax.swing.JLabel();
        PastHrPrepLabel = new javax.swing.JLabel();
        SunriseLabel = new javax.swing.JLabel();
        SunsetLabel = new javax.swing.JLabel();
        DataPanel3 = new javax.swing.JPanel();
        CloudCover = new javax.swing.JLabel();
        PastHrPrep = new javax.swing.JLabel();
        Sunrise = new javax.swing.JLabel();
        Sunset = new javax.swing.JLabel();
        LabelPanel4 = new javax.swing.JPanel();
        SolarNoonLabel = new javax.swing.JLabel();
        DayLengthLabel = new javax.swing.JLabel();
        SunDistanceLabel = new javax.swing.JLabel();
        MoonDistanceLabel = new javax.swing.JLabel();
        DataPanel4 = new javax.swing.JPanel();
        SolarNoon = new javax.swing.JLabel();
        DayLength = new javax.swing.JLabel();
        SunDistance = new javax.swing.JLabel();
        MoonDistance = new javax.swing.JLabel();
        Forecast = new javax.swing.JTabbedPane();
        Day1 = new javax.swing.JPanel();
        MainPanel = new javax.swing.JPanel();
        AirQualityLabel = new javax.swing.JLabel();
        UVLabel = new javax.swing.JLabel();
        TreeLabel = new javax.swing.JLabel();
        GrassLabel = new javax.swing.JLabel();
        MoldLabel = new javax.swing.JLabel();
        RagweedLabel = new javax.swing.JLabel();
        High = new javax.swing.JLabel();
        Low = new javax.swing.JLabel();
        AirQuality = new javax.swing.JLabel();
        UV = new javax.swing.JLabel();
        Tree = new javax.swing.JLabel();
        Grass = new javax.swing.JLabel();
        Mold = new javax.swing.JLabel();
        Ragweed = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        HighLabel = new javax.swing.JLabel();
        LowLabel = new javax.swing.JLabel();
        DayPanel = new javax.swing.JPanel();
        DayLabelPanel = new javax.swing.JPanel();
        RiseLabel = new javax.swing.JLabel();
        HrsOfSunLabel = new javax.swing.JLabel();
        DayDirectionLabel = new javax.swing.JLabel();
        DaySpeedLabel = new javax.swing.JLabel();
        DayLabel = new javax.swing.JPanel();
        Rise = new javax.swing.JLabel();
        HrsOfSun = new javax.swing.JLabel();
        DayDirection = new javax.swing.JLabel();
        DaySpeed = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DayRainLabel = new javax.swing.JLabel();
        DayThunderLabel = new javax.swing.JLabel();
        DaySnowLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DayRain = new javax.swing.JLabel();
        DayThunder = new javax.swing.JLabel();
        DaySnow = new javax.swing.JLabel();
        DaySummary = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Set = new javax.swing.JLabel();
        NightDirection = new javax.swing.JLabel();
        NightSpeed = new javax.swing.JLabel();
        MoonPhas = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        NightRainLabel = new javax.swing.JLabel();
        NightThunderLabel = new javax.swing.JLabel();
        NightSnowLabel = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        NightRain = new javax.swing.JLabel();
        NightThunder = new javax.swing.JLabel();
        NightSnow = new javax.swing.JLabel();
        NightSummary = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        SetLabel = new javax.swing.JLabel();
        NightSpeedLabel = new javax.swing.JLabel();
        NightDirectionLabel = new javax.swing.JLabel();
        MoonPhaseLabel = new javax.swing.JLabel();
        Day2 = new javax.swing.JPanel();
        MainPanel2 = new javax.swing.JPanel();
        AirQualityLabel2 = new javax.swing.JLabel();
        UVLabel2 = new javax.swing.JLabel();
        TreeLabel2 = new javax.swing.JLabel();
        GrassLabel2 = new javax.swing.JLabel();
        MoldLabel2 = new javax.swing.JLabel();
        RagweedLabel2 = new javax.swing.JLabel();
        High2 = new javax.swing.JLabel();
        Low2 = new javax.swing.JLabel();
        AirQuality2 = new javax.swing.JLabel();
        UV2 = new javax.swing.JLabel();
        Tree2 = new javax.swing.JLabel();
        Grass2 = new javax.swing.JLabel();
        Mold2 = new javax.swing.JLabel();
        Ragweed2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        HighLabel2 = new javax.swing.JLabel();
        LowLabel2 = new javax.swing.JLabel();
        DayPanel2 = new javax.swing.JPanel();
        DayLabelPanel2 = new javax.swing.JPanel();
        RiseLabel2 = new javax.swing.JLabel();
        HrsOfSunLabel2 = new javax.swing.JLabel();
        DayDirectionLabel2 = new javax.swing.JLabel();
        DaySpeedLabel2 = new javax.swing.JLabel();
        DayLabel2 = new javax.swing.JPanel();
        Rise2 = new javax.swing.JLabel();
        HrsOfSun2 = new javax.swing.JLabel();
        DayDirection2 = new javax.swing.JLabel();
        DaySpeed2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        DayRainLabel2 = new javax.swing.JLabel();
        DayThunderLabel2 = new javax.swing.JLabel();
        DaySnowLabel2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        DayRain2 = new javax.swing.JLabel();
        DayThunder2 = new javax.swing.JLabel();
        DaySnow2 = new javax.swing.JLabel();
        DaySummary2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        Set2 = new javax.swing.JLabel();
        NightDirection2 = new javax.swing.JLabel();
        NightSpeed2 = new javax.swing.JLabel();
        MoonPhas2 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        NightRainLabel2 = new javax.swing.JLabel();
        NightThunderLabel2 = new javax.swing.JLabel();
        NightSnowLabel2 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        NightRain2 = new javax.swing.JLabel();
        NightThunder2 = new javax.swing.JLabel();
        NightSnow2 = new javax.swing.JLabel();
        NightSummary2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        SetLabel2 = new javax.swing.JLabel();
        NightSpeedLabel2 = new javax.swing.JLabel();
        NightDirectionLabel2 = new javax.swing.JLabel();
        MoonPhaseLabel2 = new javax.swing.JLabel();
        Day3 = new javax.swing.JPanel();
        MainPanel3 = new javax.swing.JPanel();
        AirQualityLabel3 = new javax.swing.JLabel();
        UVLabel3 = new javax.swing.JLabel();
        TreeLabel3 = new javax.swing.JLabel();
        GrassLabel3 = new javax.swing.JLabel();
        MoldLabel3 = new javax.swing.JLabel();
        RagweedLabel3 = new javax.swing.JLabel();
        High3 = new javax.swing.JLabel();
        Low3 = new javax.swing.JLabel();
        AirQuality3 = new javax.swing.JLabel();
        UV3 = new javax.swing.JLabel();
        Tree3 = new javax.swing.JLabel();
        Grass3 = new javax.swing.JLabel();
        Mold3 = new javax.swing.JLabel();
        Ragweed3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        HighLabel3 = new javax.swing.JLabel();
        LowLabel3 = new javax.swing.JLabel();
        DayPanel3 = new javax.swing.JPanel();
        DayLabelPanel3 = new javax.swing.JPanel();
        RiseLabel3 = new javax.swing.JLabel();
        HrsOfSunLabel3 = new javax.swing.JLabel();
        DayDirectionLabel3 = new javax.swing.JLabel();
        DaySpeedLabel3 = new javax.swing.JLabel();
        DayLabel3 = new javax.swing.JPanel();
        Rise3 = new javax.swing.JLabel();
        HrsOfSun3 = new javax.swing.JLabel();
        DayDirection3 = new javax.swing.JLabel();
        DaySpeed3 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        DayRainLabel3 = new javax.swing.JLabel();
        DayThunderLabel3 = new javax.swing.JLabel();
        DaySnowLabel3 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        DayRain3 = new javax.swing.JLabel();
        DayThunder3 = new javax.swing.JLabel();
        DaySnow3 = new javax.swing.JLabel();
        DaySummary3 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        Set3 = new javax.swing.JLabel();
        NightDirection3 = new javax.swing.JLabel();
        NightSpeed3 = new javax.swing.JLabel();
        MoonPhas3 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        NightRainLabel3 = new javax.swing.JLabel();
        NightThunderLabel3 = new javax.swing.JLabel();
        NightSnowLabel3 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        NightRain3 = new javax.swing.JLabel();
        NightThunder3 = new javax.swing.JLabel();
        NightSnow3 = new javax.swing.JLabel();
        NightSummary3 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        SetLabel3 = new javax.swing.JLabel();
        NightSpeedLabel3 = new javax.swing.JLabel();
        NightDirectionLabel3 = new javax.swing.JLabel();
        MoonPhaseLabel3 = new javax.swing.JLabel();
        Day4 = new javax.swing.JPanel();
        MainPanel4 = new javax.swing.JPanel();
        AirQualityLabel4 = new javax.swing.JLabel();
        UVLabel4 = new javax.swing.JLabel();
        TreeLabel4 = new javax.swing.JLabel();
        GrassLabel4 = new javax.swing.JLabel();
        MoldLabel4 = new javax.swing.JLabel();
        RagweedLabel4 = new javax.swing.JLabel();
        High4 = new javax.swing.JLabel();
        Low4 = new javax.swing.JLabel();
        AirQuality4 = new javax.swing.JLabel();
        UV4 = new javax.swing.JLabel();
        Tree4 = new javax.swing.JLabel();
        Grass4 = new javax.swing.JLabel();
        Mold4 = new javax.swing.JLabel();
        Ragweed4 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        HighLabel4 = new javax.swing.JLabel();
        LowLabel4 = new javax.swing.JLabel();
        DayPanel4 = new javax.swing.JPanel();
        DayLabelPanel4 = new javax.swing.JPanel();
        RiseLabel4 = new javax.swing.JLabel();
        HrsOfSunLabel4 = new javax.swing.JLabel();
        DayDirectionLabel4 = new javax.swing.JLabel();
        DaySpeedLabel4 = new javax.swing.JLabel();
        DayLabel4 = new javax.swing.JPanel();
        Rise4 = new javax.swing.JLabel();
        HrsOfSun4 = new javax.swing.JLabel();
        DayDirection4 = new javax.swing.JLabel();
        DaySpeed4 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        DayRainLabel4 = new javax.swing.JLabel();
        DayThunderLabel4 = new javax.swing.JLabel();
        DaySnowLabel4 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        DayRain4 = new javax.swing.JLabel();
        DayThunder4 = new javax.swing.JLabel();
        DaySnow4 = new javax.swing.JLabel();
        DaySummary4 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        Set4 = new javax.swing.JLabel();
        NightDirection4 = new javax.swing.JLabel();
        NightSpeed4 = new javax.swing.JLabel();
        MoonPhas4 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        NightRainLabel4 = new javax.swing.JLabel();
        NightThunderLabel4 = new javax.swing.JLabel();
        NightSnowLabel4 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        NightRain4 = new javax.swing.JLabel();
        NightThunder4 = new javax.swing.JLabel();
        NightSnow4 = new javax.swing.JLabel();
        NightSummary4 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        SetLabel4 = new javax.swing.JLabel();
        NightSpeedLabel4 = new javax.swing.JLabel();
        NightDirectionLabel4 = new javax.swing.JLabel();
        MoonPhaseLabel4 = new javax.swing.JLabel();
        Day5 = new javax.swing.JPanel();
        MainPanel5 = new javax.swing.JPanel();
        AirQualityLabel5 = new javax.swing.JLabel();
        UVLabel5 = new javax.swing.JLabel();
        TreeLabel5 = new javax.swing.JLabel();
        GrassLabel5 = new javax.swing.JLabel();
        MoldLabel5 = new javax.swing.JLabel();
        RagweedLabel5 = new javax.swing.JLabel();
        High5 = new javax.swing.JLabel();
        Low5 = new javax.swing.JLabel();
        AirQuality5 = new javax.swing.JLabel();
        UV5 = new javax.swing.JLabel();
        Tree5 = new javax.swing.JLabel();
        Grass5 = new javax.swing.JLabel();
        Mold5 = new javax.swing.JLabel();
        Ragweed5 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        HighLabel5 = new javax.swing.JLabel();
        LowLabel5 = new javax.swing.JLabel();
        DayPanel5 = new javax.swing.JPanel();
        DayLabelPanel5 = new javax.swing.JPanel();
        RiseLabel5 = new javax.swing.JLabel();
        HrsOfSunLabel5 = new javax.swing.JLabel();
        DayDirectionLabel5 = new javax.swing.JLabel();
        DaySpeedLabel5 = new javax.swing.JLabel();
        DayLabel5 = new javax.swing.JPanel();
        Rise5 = new javax.swing.JLabel();
        HrsOfSun5 = new javax.swing.JLabel();
        DayDirection5 = new javax.swing.JLabel();
        DaySpeed5 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        DayRainLabel5 = new javax.swing.JLabel();
        DayThunderLabel5 = new javax.swing.JLabel();
        DaySnowLabel5 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        DayRain5 = new javax.swing.JLabel();
        DayThunder5 = new javax.swing.JLabel();
        DaySnow5 = new javax.swing.JLabel();
        DaySummary5 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        Set5 = new javax.swing.JLabel();
        NightDirection5 = new javax.swing.JLabel();
        NightSpeed5 = new javax.swing.JLabel();
        MoonPhas5 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        NightRainLabel5 = new javax.swing.JLabel();
        NightThunderLabel5 = new javax.swing.JLabel();
        NightSnowLabel5 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        NightRain5 = new javax.swing.JLabel();
        NightThunder5 = new javax.swing.JLabel();
        NightSnow5 = new javax.swing.JLabel();
        NightSummary5 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        SetLabel5 = new javax.swing.JLabel();
        NightSpeedLabel5 = new javax.swing.JLabel();
        NightDirectionLabel5 = new javax.swing.JLabel();
        MoonPhaseLabel5 = new javax.swing.JLabel();
        Gym_Signup = new javax.swing.JPanel();
        TodayTimes = new javax.swing.JPanel();
        Today10 = new javax.swing.JLabel();
        Today1130 = new javax.swing.JLabel();
        Today1 = new javax.swing.JLabel();
        Today230 = new javax.swing.JLabel();
        Today4 = new javax.swing.JLabel();
        Today530 = new javax.swing.JLabel();
        Today532 = new javax.swing.JLabel();
        Today533 = new javax.swing.JLabel();
        TodayLabel = new javax.swing.JPanel();
        TodayStatusLabel = new javax.swing.JPanel();
        Today10Status = new javax.swing.JLabel();
        Today1130Status = new javax.swing.JLabel();
        Today1Status = new javax.swing.JLabel();
        Today230Status = new javax.swing.JLabel();
        Today4Status = new javax.swing.JLabel();
        Today530Status = new javax.swing.JLabel();
        Today7Status = new javax.swing.JLabel();
        Today830Status = new javax.swing.JLabel();
        TodaySlots = new javax.swing.JPanel();
        TodaySlots10 = new javax.swing.JLabel();
        TodaySlots1130 = new javax.swing.JLabel();
        TodaySlots1 = new javax.swing.JLabel();
        TodaySlots230 = new javax.swing.JLabel();
        TodaySlots4 = new javax.swing.JLabel();
        TodaySlots530 = new javax.swing.JLabel();
        TodaySlots7 = new javax.swing.JLabel();
        TodaySlots830 = new javax.swing.JLabel();
        TomorrowSlots = new javax.swing.JPanel();
        TomorrowSlots10 = new javax.swing.JLabel();
        TomorrowSlots1130 = new javax.swing.JLabel();
        TomorrowSlots1 = new javax.swing.JLabel();
        TomorrowSlots230 = new javax.swing.JLabel();
        TomorrowSlots4 = new javax.swing.JLabel();
        TomorrowSlots530 = new javax.swing.JLabel();
        TomorrowSlots7 = new javax.swing.JLabel();
        TomorrowSlots830 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        TodayButtonPanel = new javax.swing.JPanel();
        TodayButton10 = new javax.swing.JButton();
        TodayButton1130 = new javax.swing.JButton();
        TodayButton1 = new javax.swing.JButton();
        TodayButton230 = new javax.swing.JButton();
        TodayButton4 = new javax.swing.JButton();
        TodayButton530 = new javax.swing.JButton();
        TomorrowStatus = new javax.swing.JPanel();
        Tomorrow10Status = new javax.swing.JLabel();
        Tomorrow1130Status = new javax.swing.JLabel();
        Tomorrow1Status = new javax.swing.JLabel();
        Tomorrow230Status = new javax.swing.JLabel();
        Tomorrow530Status = new javax.swing.JLabel();
        Tomorrow4Status = new javax.swing.JLabel();
        Tomorrow7Status = new javax.swing.JLabel();
        Tomorrow830Status = new javax.swing.JLabel();
        TodayButton7 = new javax.swing.JButton();
        TodayButton830 = new javax.swing.JButton();
        TomorrowButtonPanel = new javax.swing.JPanel();
        TomorrowButton10 = new javax.swing.JButton();
        TomorrowButton1130 = new javax.swing.JButton();
        TomorrowButton1 = new javax.swing.JButton();
        TomorrowButton230 = new javax.swing.JButton();
        TomorrowButton4 = new javax.swing.JButton();
        TomorrowButton530 = new javax.swing.JButton();
        TomorrowButton7 = new javax.swing.JButton();
        TomorrowButton830 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        RitchieStatusLabel = new javax.swing.JPanel();
        RitchieStatus10 = new javax.swing.JLabel();
        RitchieStatus1115 = new javax.swing.JLabel();
        RitchieStatus1230 = new javax.swing.JLabel();
        RitchieStatus145 = new javax.swing.JLabel();
        RitchieStatus3 = new javax.swing.JLabel();
        RitchieStatus415 = new javax.swing.JLabel();
        RitchieStatus530 = new javax.swing.JLabel();
        RitchieStatus645 = new javax.swing.JLabel();
        RitchieStatus8 = new javax.swing.JLabel();
        RitchieStatus915 = new javax.swing.JLabel();
        TodayTimes1 = new javax.swing.JPanel();
        Today11 = new javax.swing.JLabel();
        Today1131 = new javax.swing.JLabel();
        Today2 = new javax.swing.JLabel();
        Today231 = new javax.swing.JLabel();
        Today5 = new javax.swing.JLabel();
        Today531 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TodayButtonPanel1 = new javax.swing.JPanel();
        RitchieButton10 = new javax.swing.JButton();
        RitchieButton1115 = new javax.swing.JButton();
        RitchieButton1230 = new javax.swing.JButton();
        RitchieButton145 = new javax.swing.JButton();
        RitchieButton3 = new javax.swing.JButton();
        RitchieButton415 = new javax.swing.JButton();
        RitchieButton530 = new javax.swing.JButton();
        TomorrowStatus1 = new javax.swing.JPanel();
        TRitchieStatus10 = new javax.swing.JLabel();
        TRitchieStatus1115 = new javax.swing.JLabel();
        TRitchieStatus1230 = new javax.swing.JLabel();
        TRitchieStatus145 = new javax.swing.JLabel();
        TRitchieStatus415 = new javax.swing.JLabel();
        TRitchieStatus3 = new javax.swing.JLabel();
        TRitchieStatus530 = new javax.swing.JLabel();
        TRitchieStatus645 = new javax.swing.JLabel();
        TRitchieStatus8 = new javax.swing.JLabel();
        TRitchieStatus915 = new javax.swing.JLabel();
        RitchieButton645 = new javax.swing.JButton();
        RitchieButton8 = new javax.swing.JButton();
        RitchieButton915 = new javax.swing.JButton();
        TomorrowSlots2 = new javax.swing.JPanel();
        TRitchieSlots10 = new javax.swing.JLabel();
        TRitchieSlots1115 = new javax.swing.JLabel();
        TRitchieSlots1230 = new javax.swing.JLabel();
        TRitchieSlots145 = new javax.swing.JLabel();
        TRitchieSlots3 = new javax.swing.JLabel();
        TRitchieSlots415 = new javax.swing.JLabel();
        TRitchieSlots530 = new javax.swing.JLabel();
        TRitchieSlots645 = new javax.swing.JLabel();
        TRitchieSlots8 = new javax.swing.JLabel();
        TRitchieSlots915 = new javax.swing.JLabel();
        TomorrowButtonPanel1 = new javax.swing.JPanel();
        TRitchieButton10 = new javax.swing.JButton();
        TRitchieButton1115 = new javax.swing.JButton();
        TRitchieButton1230 = new javax.swing.JButton();
        TRitchieButton145 = new javax.swing.JButton();
        TRitchieButton3 = new javax.swing.JButton();
        TRitchieButton415 = new javax.swing.JButton();
        TRitchieButton530 = new javax.swing.JButton();
        TRitchieButton645 = new javax.swing.JButton();
        TRitchieButton8 = new javax.swing.JButton();
        TRitchieButton915 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TodaySlots2 = new javax.swing.JPanel();
        RitchieSlots10 = new javax.swing.JLabel();
        RitchieSlots1115 = new javax.swing.JLabel();
        RitchieSlots1230 = new javax.swing.JLabel();
        RitchieSlots145 = new javax.swing.JLabel();
        RitchieSlots3 = new javax.swing.JLabel();
        RitchieSlots415 = new javax.swing.JLabel();
        RitchieSlots530 = new javax.swing.JLabel();
        RitchieSlots645 = new javax.swing.JLabel();
        RitchieSlots8 = new javax.swing.JLabel();
        RitchieSlots915 = new javax.swing.JLabel();
        SPHSlots = new javax.swing.JPanel();
        SPHSlots10 = new javax.swing.JLabel();
        SPHSlots1130 = new javax.swing.JLabel();
        SPHSlots1 = new javax.swing.JLabel();
        SPHSlots230 = new javax.swing.JLabel();
        SPHSlots4 = new javax.swing.JLabel();
        SPHSlots530 = new javax.swing.JLabel();
        SPHSlots7 = new javax.swing.JLabel();
        SPHSlots830 = new javax.swing.JLabel();
        TomorrowButtonPanel2 = new javax.swing.JPanel();
        TSPHButton10 = new javax.swing.JButton();
        TSPHButton1130 = new javax.swing.JButton();
        TSPHButton1 = new javax.swing.JButton();
        TSPHButton230 = new javax.swing.JButton();
        TSPHButton4 = new javax.swing.JButton();
        TSPHButton530 = new javax.swing.JButton();
        TSPHButton7 = new javax.swing.JButton();
        TSPHButton830 = new javax.swing.JButton();
        TomorrowSlots3 = new javax.swing.JPanel();
        TSPHSlots10 = new javax.swing.JLabel();
        TSPHSlots1130 = new javax.swing.JLabel();
        TSPHSlots1 = new javax.swing.JLabel();
        TSPHSlots230 = new javax.swing.JLabel();
        TSPHSlots4 = new javax.swing.JLabel();
        TSPHSlots530 = new javax.swing.JLabel();
        TSPHSlots7 = new javax.swing.JLabel();
        TSPHSlots830 = new javax.swing.JLabel();
        TodayButtonPanel2 = new javax.swing.JPanel();
        SPHButton10 = new javax.swing.JButton();
        SPHButton1130 = new javax.swing.JButton();
        SPHButton1 = new javax.swing.JButton();
        SPHButton230 = new javax.swing.JButton();
        SPHButton4 = new javax.swing.JButton();
        SPHButton530 = new javax.swing.JButton();
        SPHButton7 = new javax.swing.JButton();
        SPHButton830 = new javax.swing.JButton();
        TodayTimes2 = new javax.swing.JPanel();
        SPH10 = new javax.swing.JLabel();
        SPH1130 = new javax.swing.JLabel();
        SPH1 = new javax.swing.JLabel();
        SPH230 = new javax.swing.JLabel();
        SPH4 = new javax.swing.JLabel();
        SPH530 = new javax.swing.JLabel();
        SPH531 = new javax.swing.JLabel();
        SPH532 = new javax.swing.JLabel();
        RitchieStatusLabel1 = new javax.swing.JPanel();
        SPHLabel10 = new javax.swing.JLabel();
        SPHLabel1130 = new javax.swing.JLabel();
        SPHLabel1 = new javax.swing.JLabel();
        SPHLabel230 = new javax.swing.JLabel();
        SPHLabel4 = new javax.swing.JLabel();
        SPHLabel530 = new javax.swing.JLabel();
        SPHLabel7 = new javax.swing.JLabel();
        SPHLabel830 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TomorrowStatus2 = new javax.swing.JPanel();
        TSPHStatus10 = new javax.swing.JLabel();
        TSPHStatus1130 = new javax.swing.JLabel();
        TSPHStatus1 = new javax.swing.JLabel();
        TSPHStatus230 = new javax.swing.JLabel();
        TSPHStatus530 = new javax.swing.JLabel();
        TSPHStatus4 = new javax.swing.JLabel();
        TSPHStatus830 = new javax.swing.JLabel();
        TSPHStatus7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );

        getContentPane().add(ButtonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 727));

        Main_Weather.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Weather"));
        Main_Weather.setToolTipText("Weather");

        TemperatureLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TemperatureLabel.setText("Temperature:");

        RealFeelLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RealFeelLabel.setText("Real Feel:");

        PressureLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        PressureLabel.setText("Pressure:");

        DewPointLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DewPointLabel.setText("Dew Point:");

        javax.swing.GroupLayout LabelPanel1Layout = new javax.swing.GroupLayout(LabelPanel1);
        LabelPanel1.setLayout(LabelPanel1Layout);
        LabelPanel1Layout.setHorizontalGroup(
            LabelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LabelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DewPointLabel)
                    .addComponent(TemperatureLabel)
                    .addGroup(LabelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(RealFeelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PressureLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
        );
        LabelPanel1Layout.setVerticalGroup(
            LabelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TemperatureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RealFeelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PressureLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DewPointLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Temperature.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        RealFeel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        Pressure.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        DewPoint.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        javax.swing.GroupLayout DataPanel1Layout = new javax.swing.GroupLayout(DataPanel1);
        DataPanel1.setLayout(DataPanel1Layout);
        DataPanel1Layout.setHorizontalGroup(
            DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RealFeel)
            .addComponent(Pressure)
            .addComponent(DewPoint)
            .addComponent(Temperature)
        );
        DataPanel1Layout.setVerticalGroup(
            DataPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel1Layout.createSequentialGroup()
                .addComponent(Temperature)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RealFeel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pressure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DewPoint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DescriptionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DescriptionLabel.setText("Description:");

        HumidityLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HumidityLabel.setText("Humidity:");

        WindDirectionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        WindDirectionLabel.setText("Wind Direction:");

        WindSpeedLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        WindSpeedLabel.setText("Wind Speed:");

        javax.swing.GroupLayout LabelPanel2Layout = new javax.swing.GroupLayout(LabelPanel2);
        LabelPanel2.setLayout(LabelPanel2Layout);
        LabelPanel2Layout.setHorizontalGroup(
            LabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LabelPanel2Layout.createSequentialGroup()
                        .addComponent(WindDirectionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LabelPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(LabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HumidityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DescriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WindSpeedLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        LabelPanel2Layout.setVerticalGroup(
            LabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel2Layout.createSequentialGroup()
                .addComponent(DescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HumidityLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WindDirectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WindSpeedLabel)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        Description.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        Humidity.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        WindDirection.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        WindSpeed.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        javax.swing.GroupLayout DataPanel2Layout = new javax.swing.GroupLayout(DataPanel2);
        DataPanel2.setLayout(DataPanel2Layout);
        DataPanel2Layout.setHorizontalGroup(
            DataPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel2Layout.createSequentialGroup()
                .addGroup(DataPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Description)
                    .addComponent(Humidity)
                    .addComponent(WindDirection)
                    .addComponent(WindSpeed))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        DataPanel2Layout.setVerticalGroup(
            DataPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel2Layout.createSequentialGroup()
                .addComponent(Description)
                .addGap(12, 12, 12)
                .addComponent(Humidity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WindDirection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WindSpeed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CloudCoverLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        CloudCoverLabel.setText("Cloud Cover:");

        PastHrPrepLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        PastHrPrepLabel.setText("Past Hr Prep:");

        SunriseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SunriseLabel.setText("Sunrise:");

        SunsetLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SunsetLabel.setText("Sunset:");

        javax.swing.GroupLayout LabelPanel3Layout = new javax.swing.GroupLayout(LabelPanel3);
        LabelPanel3.setLayout(LabelPanel3Layout);
        LabelPanel3Layout.setHorizontalGroup(
            LabelPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LabelPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloudCoverLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PastHrPrepLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SunriseLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SunsetLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        LabelPanel3Layout.setVerticalGroup(
            LabelPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel3Layout.createSequentialGroup()
                .addComponent(CloudCoverLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PastHrPrepLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SunriseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SunsetLabel))
        );

        CloudCover.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        PastHrPrep.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        Sunrise.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        Sunset.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        javax.swing.GroupLayout DataPanel3Layout = new javax.swing.GroupLayout(DataPanel3);
        DataPanel3.setLayout(DataPanel3Layout);
        DataPanel3Layout.setHorizontalGroup(
            DataPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel3Layout.createSequentialGroup()
                .addGroup(DataPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CloudCover)
                    .addComponent(PastHrPrep)
                    .addComponent(Sunrise)
                    .addComponent(Sunset))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        DataPanel3Layout.setVerticalGroup(
            DataPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloudCover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PastHrPrep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sunrise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sunset)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        SolarNoonLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SolarNoonLabel.setText("Solar Noon:");

        DayLengthLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayLengthLabel.setText("Day Length:");

        SunDistanceLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SunDistanceLabel.setText("Sun Distance:");

        MoonDistanceLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonDistanceLabel.setText("Moon Distance:");

        javax.swing.GroupLayout LabelPanel4Layout = new javax.swing.GroupLayout(LabelPanel4);
        LabelPanel4.setLayout(LabelPanel4Layout);
        LabelPanel4Layout.setHorizontalGroup(
            LabelPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel4Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(LabelPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DayLengthLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SolarNoonLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SunDistanceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoonDistanceLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        LabelPanel4Layout.setVerticalGroup(
            LabelPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LabelPanel4Layout.createSequentialGroup()
                .addComponent(SolarNoonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(DayLengthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SunDistanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonDistanceLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SolarNoon.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        DayLength.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        SunDistance.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        MoonDistance.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        javax.swing.GroupLayout DataPanel4Layout = new javax.swing.GroupLayout(DataPanel4);
        DataPanel4.setLayout(DataPanel4Layout);
        DataPanel4Layout.setHorizontalGroup(
            DataPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DataPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SolarNoon)
                    .addComponent(DayLength)
                    .addComponent(SunDistance)
                    .addComponent(MoonDistance))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DataPanel4Layout.setVerticalGroup(
            DataPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DataPanel4Layout.createSequentialGroup()
                .addComponent(SolarNoon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SunDistance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonDistance)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Main_WeatherLayout = new javax.swing.GroupLayout(Main_Weather);
        Main_Weather.setLayout(Main_WeatherLayout);
        Main_WeatherLayout.setHorizontalGroup(
            Main_WeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Main_WeatherLayout.createSequentialGroup()
                .addComponent(LabelPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(LabelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LabelPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DataPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(LabelPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DataPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Main_WeatherLayout.setVerticalGroup(
            Main_WeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Main_WeatherLayout.createSequentialGroup()
                .addComponent(DataPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Main_WeatherLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Main_WeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DataPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Main_WeatherLayout.createSequentialGroup()
                        .addGroup(Main_WeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Main_WeatherLayout.createSequentialGroup()
                                .addGroup(Main_WeatherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LabelPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DataPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(LabelPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DataPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        Forecast.setBorder(javax.swing.BorderFactory.createTitledBorder("Forecast"));

        Day1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        AirQualityLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQualityLabel.setText("Air Quality");

        UVLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UVLabel.setText("UV:");

        TreeLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TreeLabel.setText("Tree:");

        GrassLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        GrassLabel.setText("Grass:");

        MoldLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoldLabel.setText("Mold:");

        RagweedLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RagweedLabel.setText("Ragweed:");

        High.setText("text1");

        Low.setText("text2");

        AirQuality.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQuality.setText("text");

        UV.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UV.setText("text");

        Tree.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tree.setText("text");

        Grass.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Grass.setText("text");

        Mold.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Mold.setText("text");

        Ragweed.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Ragweed.setText("text");

        HighLabel.setText("High:");

        LowLabel.setText("Low:");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HighLabel)
                    .addComponent(LowLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HighLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LowLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(High)
                        .addGap(150, 150, 150)
                        .addComponent(AirQualityLabel))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(Low)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AirQuality)))
                .addGap(32, 32, 32)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UVLabel)
                    .addComponent(UV))
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TreeLabel)
                    .addComponent(Tree))
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GrassLabel)
                    .addComponent(Grass))
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mold)
                    .addComponent(MoldLabel))
                .addGap(35, 35, 35)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RagweedLabel)
                    .addComponent(Ragweed)))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQualityLabel)
                            .addComponent(UVLabel)
                            .addComponent(TreeLabel)
                            .addComponent(GrassLabel)
                            .addComponent(MoldLabel)
                            .addComponent(RagweedLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(High)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQuality)
                            .addComponent(UV)
                            .addComponent(Tree)
                            .addComponent(Grass)
                            .addComponent(Mold)
                            .addComponent(Ragweed))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Low)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        RiseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RiseLabel.setText("Sunrise:");

        HrsOfSunLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSunLabel.setText("Hrs of Sun:");

        DayDirectionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirectionLabel.setText("Direction:");

        DaySpeedLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeedLabel.setText("Speed:");

        javax.swing.GroupLayout DayLabelPanelLayout = new javax.swing.GroupLayout(DayLabelPanel);
        DayLabelPanel.setLayout(DayLabelPanelLayout);
        DayLabelPanelLayout.setHorizontalGroup(
            DayLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayLabelPanelLayout.createSequentialGroup()
                        .addComponent(HrsOfSunLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DayLabelPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DayLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RiseLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DayDirectionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DaySpeedLabel, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        DayLabelPanelLayout.setVerticalGroup(
            DayLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RiseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSunLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeedLabel)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Rise.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Rise.setText("testing");

        HrsOfSun.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSun.setText("jLabel3");

        DayDirection.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirection.setText("jLabel4");

        DaySpeed.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeed.setText("jLabel5");

        javax.swing.GroupLayout DayLabelLayout = new javax.swing.GroupLayout(DayLabel);
        DayLabel.setLayout(DayLabelLayout);
        DayLabelLayout.setHorizontalGroup(
            DayLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HrsOfSun)
                    .addComponent(Rise)
                    .addComponent(DayDirection)
                    .addComponent(DaySpeed))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DayLabelLayout.setVerticalGroup(
            DayLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rise)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRainLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRainLabel.setText("Rain:");

        DayThunderLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunderLabel.setText("Thunder:");

        DaySnowLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnowLabel.setText("Snow:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DaySnowLabel)
                    .addComponent(DayRainLabel)
                    .addComponent(DayThunderLabel))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnowLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRain.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRain.setText("jLabel6");

        DayThunder.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunder.setText("jLabel7");

        DaySnow.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnow.setText("jLabel8");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DayRain)
                    .addComponent(DayThunder)
                    .addComponent(DaySnow)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRain, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnow)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DaySummary.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        DaySummary.setText("Summary");

        javax.swing.GroupLayout DayPanelLayout = new javax.swing.GroupLayout(DayPanel);
        DayPanel.setLayout(DayPanelLayout);
        DayPanelLayout.setHorizontalGroup(
            DayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(DaySummary))
                    .addGroup(DayPanelLayout.createSequentialGroup()
                        .addComponent(DayLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        DayPanelLayout.setVerticalGroup(
            DayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySummary)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Night", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        Set.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Set.setText("jLabel2");

        NightDirection.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirection.setText("jLabel4");

        NightSpeed.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeed.setText("jLabel5");

        MoonPhas.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhas.setText("jLabel3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Set)
                    .addComponent(NightDirection)
                    .addComponent(NightSpeed)
                    .addComponent(MoonPhas))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Set)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhas)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NightRainLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRainLabel.setText("Rain:");

        NightThunderLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunderLabel.setText("Thunder:");

        NightSnowLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnowLabel.setText("Snow:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRainLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightThunderLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSnowLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NightRainLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunderLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnowLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NightRain.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRain.setText("jLabel6");

        NightThunder.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunder.setText("jLabel7");

        NightSnow.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnow.setText("jLabel8");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRain)
                    .addComponent(NightThunder)
                    .addComponent(NightSnow)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NightRain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnow))
        );

        NightSummary.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        NightSummary.setText("Summary");

        SetLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SetLabel.setText("Sunset:");

        NightSpeedLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeedLabel.setText("Speed:");

        NightDirectionLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirectionLabel.setText("Direction:");

        MoonPhaseLabel.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhaseLabel.setText("Moon Phase:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightDirectionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSpeedLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SetLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoonPhaseLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhaseLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(NightSummary))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(NightSummary)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Day1Layout = new javax.swing.GroupLayout(Day1);
        Day1.setLayout(Day1Layout);
        Day1Layout.setHorizontalGroup(
            Day1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Day1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Day1Layout.createSequentialGroup()
                        .addComponent(DayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Day1Layout.setVerticalGroup(
            Day1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day1Layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Day1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        Forecast.addTab("Today", Day1);

        Day2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        AirQualityLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQualityLabel2.setText("Air Quality");

        UVLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UVLabel2.setText("UV:");

        TreeLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TreeLabel2.setText("Tree:");

        GrassLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        GrassLabel2.setText("Grass:");

        MoldLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoldLabel2.setText("Mold:");

        RagweedLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RagweedLabel2.setText("Ragweed:");

        High2.setText("text1");

        Low2.setText("text2");

        AirQuality2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQuality2.setText("text");

        UV2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UV2.setText("text");

        Tree2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tree2.setText("text");

        Grass2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Grass2.setText("text");

        Mold2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Mold2.setText("text");

        Ragweed2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Ragweed2.setText("text");

        HighLabel2.setText("High:");

        LowLabel2.setText("Low:");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HighLabel2)
                    .addComponent(LowLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HighLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LowLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanel2Layout = new javax.swing.GroupLayout(MainPanel2);
        MainPanel2.setLayout(MainPanel2Layout);
        MainPanel2Layout.setHorizontalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addComponent(High2)
                        .addGap(150, 150, 150)
                        .addComponent(AirQualityLabel2))
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addComponent(Low2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AirQuality2)))
                .addGap(32, 32, 32)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UVLabel2)
                    .addComponent(UV2))
                .addGap(35, 35, 35)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TreeLabel2)
                    .addComponent(Tree2))
                .addGap(35, 35, 35)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GrassLabel2)
                    .addComponent(Grass2))
                .addGap(35, 35, 35)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mold2)
                    .addComponent(MoldLabel2))
                .addGap(35, 35, 35)
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RagweedLabel2)
                    .addComponent(Ragweed2)))
        );
        MainPanel2Layout.setVerticalGroup(
            MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQualityLabel2)
                            .addComponent(UVLabel2)
                            .addComponent(TreeLabel2)
                            .addComponent(GrassLabel2)
                            .addComponent(MoldLabel2)
                            .addComponent(RagweedLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(High2)))
                .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addGroup(MainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQuality2)
                            .addComponent(UV2)
                            .addComponent(Tree2)
                            .addComponent(Grass2)
                            .addComponent(Mold2)
                            .addComponent(Ragweed2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Low2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(MainPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DayPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        RiseLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RiseLabel2.setText("Sunrise:");

        HrsOfSunLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSunLabel2.setText("Hrs of Sun:");

        DayDirectionLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirectionLabel2.setText("Direction:");

        DaySpeedLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeedLabel2.setText("Speed:");

        javax.swing.GroupLayout DayLabelPanel2Layout = new javax.swing.GroupLayout(DayLabelPanel2);
        DayLabelPanel2.setLayout(DayLabelPanel2Layout);
        DayLabelPanel2Layout.setHorizontalGroup(
            DayLabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayLabelPanel2Layout.createSequentialGroup()
                        .addComponent(HrsOfSunLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DayLabelPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DayLabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RiseLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DayDirectionLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DaySpeedLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        DayLabelPanel2Layout.setVerticalGroup(
            DayLabelPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RiseLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSunLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirectionLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeedLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Rise2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Rise2.setText("testing");

        HrsOfSun2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSun2.setText("jLabel3");

        DayDirection2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirection2.setText("jLabel4");

        DaySpeed2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeed2.setText("jLabel5");

        javax.swing.GroupLayout DayLabel2Layout = new javax.swing.GroupLayout(DayLabel2);
        DayLabel2.setLayout(DayLabel2Layout);
        DayLabel2Layout.setHorizontalGroup(
            DayLabel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HrsOfSun2)
                    .addComponent(Rise2)
                    .addComponent(DayDirection2)
                    .addComponent(DaySpeed2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DayLabel2Layout.setVerticalGroup(
            DayLabel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rise2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSun2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirection2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeed2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRainLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRainLabel2.setText("Rain:");

        DayThunderLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunderLabel2.setText("Thunder:");

        DaySnowLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnowLabel2.setText("Snow:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DaySnowLabel2)
                    .addComponent(DayRainLabel2)
                    .addComponent(DayThunderLabel2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRainLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunderLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnowLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRain2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRain2.setText("jLabel6");

        DayThunder2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunder2.setText("jLabel7");

        DaySnow2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnow2.setText("jLabel8");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DayRain2)
                    .addComponent(DayThunder2)
                    .addComponent(DaySnow2)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRain2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunder2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnow2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DaySummary2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySummary2.setText("Summary");

        javax.swing.GroupLayout DayPanel2Layout = new javax.swing.GroupLayout(DayPanel2);
        DayPanel2.setLayout(DayPanel2Layout);
        DayPanel2Layout.setHorizontalGroup(
            DayPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(DaySummary2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DayPanel2Layout.createSequentialGroup()
                        .addComponent(DayLabelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DayLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 50, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        DayPanel2Layout.setVerticalGroup(
            DayPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabelPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySummary2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Night", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        Set2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Set2.setText("jLabel2");

        NightDirection2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirection2.setText("jLabel4");

        NightSpeed2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeed2.setText("jLabel5");

        MoonPhas2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhas2.setText("jLabel3");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Set2)
                    .addComponent(NightDirection2)
                    .addComponent(NightSpeed2)
                    .addComponent(MoonPhas2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Set2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeed2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirection2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhas2)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NightRainLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRainLabel2.setText("Rain:");

        NightThunderLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunderLabel2.setText("Thunder:");

        NightSnowLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnowLabel2.setText("Snow:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRainLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightThunderLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSnowLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NightRainLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunderLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnowLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NightRain2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRain2.setText("jLabel6");

        NightThunder2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunder2.setText("jLabel7");

        NightSnow2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnow2.setText("jLabel8");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRain2)
                    .addComponent(NightThunder2)
                    .addComponent(NightSnow2)))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NightRain2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunder2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnow2))
        );

        NightSummary2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSummary2.setText("Summary");

        SetLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SetLabel2.setText("Sunset:");

        NightSpeedLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeedLabel2.setText("Speed:");

        NightDirectionLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirectionLabel2.setText("Direction:");

        MoonPhaseLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhaseLabel2.setText("Moon Phase:");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightDirectionLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSpeedLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SetLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoonPhaseLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeedLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirectionLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhaseLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(NightSummary2))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(NightSummary2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Day2Layout = new javax.swing.GroupLayout(Day2);
        Day2.setLayout(Day2Layout);
        Day2Layout.setHorizontalGroup(
            Day2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Day2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Day2Layout.createSequentialGroup()
                        .addComponent(DayPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Day2Layout.setVerticalGroup(
            Day2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day2Layout.createSequentialGroup()
                .addComponent(MainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Day2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DayPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        Forecast.addTab("Tomorrow", Day2);

        Day3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        AirQualityLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQualityLabel3.setText("Air Quality");

        UVLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UVLabel3.setText("UV:");

        TreeLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TreeLabel3.setText("Tree:");

        GrassLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        GrassLabel3.setText("Grass:");

        MoldLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoldLabel3.setText("Mold:");

        RagweedLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RagweedLabel3.setText("Ragweed:");

        High3.setText("text1");

        Low3.setText("text2");

        AirQuality3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQuality3.setText("text");

        UV3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UV3.setText("text");

        Tree3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tree3.setText("text");

        Grass3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Grass3.setText("text");

        Mold3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Mold3.setText("text");

        Ragweed3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Ragweed3.setText("text");

        HighLabel3.setText("High:");

        LowLabel3.setText("Low:");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HighLabel3)
                    .addComponent(LowLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HighLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LowLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanel3Layout = new javax.swing.GroupLayout(MainPanel3);
        MainPanel3.setLayout(MainPanel3Layout);
        MainPanel3Layout.setHorizontalGroup(
            MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanel3Layout.createSequentialGroup()
                        .addComponent(High3)
                        .addGap(150, 150, 150)
                        .addComponent(AirQualityLabel3))
                    .addGroup(MainPanel3Layout.createSequentialGroup()
                        .addComponent(Low3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AirQuality3)))
                .addGap(32, 32, 32)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UVLabel3)
                    .addComponent(UV3))
                .addGap(35, 35, 35)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TreeLabel3)
                    .addComponent(Tree3))
                .addGap(35, 35, 35)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GrassLabel3)
                    .addComponent(Grass3))
                .addGap(35, 35, 35)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mold3)
                    .addComponent(MoldLabel3))
                .addGap(35, 35, 35)
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RagweedLabel3)
                    .addComponent(Ragweed3)))
        );
        MainPanel3Layout.setVerticalGroup(
            MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel3Layout.createSequentialGroup()
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQualityLabel3)
                            .addComponent(UVLabel3)
                            .addComponent(TreeLabel3)
                            .addComponent(GrassLabel3)
                            .addComponent(MoldLabel3)
                            .addComponent(RagweedLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(High3)))
                .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel3Layout.createSequentialGroup()
                        .addGroup(MainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQuality3)
                            .addComponent(UV3)
                            .addComponent(Tree3)
                            .addComponent(Grass3)
                            .addComponent(Mold3)
                            .addComponent(Ragweed3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Low3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(MainPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DayPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        RiseLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RiseLabel3.setText("Sunrise:");

        HrsOfSunLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSunLabel3.setText("Hrs of Sun:");

        DayDirectionLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirectionLabel3.setText("Direction:");

        DaySpeedLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeedLabel3.setText("Speed:");

        javax.swing.GroupLayout DayLabelPanel3Layout = new javax.swing.GroupLayout(DayLabelPanel3);
        DayLabelPanel3.setLayout(DayLabelPanel3Layout);
        DayLabelPanel3Layout.setHorizontalGroup(
            DayLabelPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabelPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayLabelPanel3Layout.createSequentialGroup()
                        .addComponent(HrsOfSunLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DayLabelPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DayLabelPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RiseLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DayDirectionLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DaySpeedLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        DayLabelPanel3Layout.setVerticalGroup(
            DayLabelPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RiseLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSunLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirectionLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeedLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Rise3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Rise3.setText("testing");

        HrsOfSun3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSun3.setText("jLabel3");

        DayDirection3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirection3.setText("jLabel4");

        DaySpeed3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeed3.setText("jLabel5");

        javax.swing.GroupLayout DayLabel3Layout = new javax.swing.GroupLayout(DayLabel3);
        DayLabel3.setLayout(DayLabel3Layout);
        DayLabel3Layout.setHorizontalGroup(
            DayLabel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HrsOfSun3)
                    .addComponent(Rise3)
                    .addComponent(DayDirection3)
                    .addComponent(DaySpeed3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DayLabel3Layout.setVerticalGroup(
            DayLabel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rise3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSun3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirection3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeed3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRainLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRainLabel3.setText("Rain:");

        DayThunderLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunderLabel3.setText("Thunder:");

        DaySnowLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnowLabel3.setText("Snow:");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DaySnowLabel3)
                    .addComponent(DayRainLabel3)
                    .addComponent(DayThunderLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRainLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunderLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnowLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRain3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRain3.setText("jLabel6");

        DayThunder3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunder3.setText("jLabel7");

        DaySnow3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnow3.setText("jLabel8");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DayRain3)
                    .addComponent(DayThunder3)
                    .addComponent(DaySnow3)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRain3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunder3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnow3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DaySummary3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySummary3.setText("Summary");

        javax.swing.GroupLayout DayPanel3Layout = new javax.swing.GroupLayout(DayPanel3);
        DayPanel3.setLayout(DayPanel3Layout);
        DayPanel3Layout.setHorizontalGroup(
            DayPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(DaySummary3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DayPanel3Layout.createSequentialGroup()
                        .addComponent(DayLabelPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DayLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 50, Short.MAX_VALUE)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        DayPanel3Layout.setVerticalGroup(
            DayPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabelPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySummary3)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Night", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        Set3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Set3.setText("jLabel2");

        NightDirection3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirection3.setText("jLabel4");

        NightSpeed3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeed3.setText("jLabel5");

        MoonPhas3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhas3.setText("jLabel3");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Set3)
                    .addComponent(NightDirection3)
                    .addComponent(NightSpeed3)
                    .addComponent(MoonPhas3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Set3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeed3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirection3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhas3)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NightRainLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRainLabel3.setText("Rain:");

        NightThunderLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunderLabel3.setText("Thunder:");

        NightSnowLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnowLabel3.setText("Snow:");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRainLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightThunderLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSnowLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NightRainLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunderLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnowLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NightRain3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRain3.setText("jLabel6");

        NightThunder3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunder3.setText("jLabel7");

        NightSnow3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnow3.setText("jLabel8");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRain3)
                    .addComponent(NightThunder3)
                    .addComponent(NightSnow3)))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NightRain3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunder3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnow3))
        );

        NightSummary3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSummary3.setText("Summary");

        SetLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SetLabel3.setText("Sunset:");

        NightSpeedLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeedLabel3.setText("Speed:");

        NightDirectionLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirectionLabel3.setText("Direction:");

        MoonPhaseLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhaseLabel3.setText("Moon Phase:");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightDirectionLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSpeedLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SetLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoonPhaseLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeedLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirectionLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhaseLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(NightSummary3))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(NightSummary3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Day3Layout = new javax.swing.GroupLayout(Day3);
        Day3.setLayout(Day3Layout);
        Day3Layout.setHorizontalGroup(
            Day3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Day3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Day3Layout.createSequentialGroup()
                        .addComponent(DayPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Day3Layout.setVerticalGroup(
            Day3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day3Layout.createSequentialGroup()
                .addComponent(MainPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Day3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DayPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        Forecast.addTab("Day3", Day3);

        Day4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        AirQualityLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQualityLabel4.setText("Air Quality");

        UVLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UVLabel4.setText("UV:");

        TreeLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TreeLabel4.setText("Tree:");

        GrassLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        GrassLabel4.setText("Grass:");

        MoldLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoldLabel4.setText("Mold:");

        RagweedLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RagweedLabel4.setText("Ragweed:");

        High4.setText("text1");

        Low4.setText("text2");

        AirQuality4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQuality4.setText("text");

        UV4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UV4.setText("text");

        Tree4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tree4.setText("text");

        Grass4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Grass4.setText("text");

        Mold4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Mold4.setText("text");

        Ragweed4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Ragweed4.setText("text");

        HighLabel4.setText("High:");

        LowLabel4.setText("Low:");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HighLabel4)
                    .addComponent(LowLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HighLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LowLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanel4Layout = new javax.swing.GroupLayout(MainPanel4);
        MainPanel4.setLayout(MainPanel4Layout);
        MainPanel4Layout.setHorizontalGroup(
            MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanel4Layout.createSequentialGroup()
                        .addComponent(High4)
                        .addGap(150, 150, 150)
                        .addComponent(AirQualityLabel4))
                    .addGroup(MainPanel4Layout.createSequentialGroup()
                        .addComponent(Low4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AirQuality4)))
                .addGap(32, 32, 32)
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UVLabel4)
                    .addComponent(UV4))
                .addGap(35, 35, 35)
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TreeLabel4)
                    .addComponent(Tree4))
                .addGap(35, 35, 35)
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GrassLabel4)
                    .addComponent(Grass4))
                .addGap(35, 35, 35)
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mold4)
                    .addComponent(MoldLabel4))
                .addGap(35, 35, 35)
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RagweedLabel4)
                    .addComponent(Ragweed4)))
        );
        MainPanel4Layout.setVerticalGroup(
            MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel4Layout.createSequentialGroup()
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQualityLabel4)
                            .addComponent(UVLabel4)
                            .addComponent(TreeLabel4)
                            .addComponent(GrassLabel4)
                            .addComponent(MoldLabel4)
                            .addComponent(RagweedLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(High4)))
                .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel4Layout.createSequentialGroup()
                        .addGroup(MainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQuality4)
                            .addComponent(UV4)
                            .addComponent(Tree4)
                            .addComponent(Grass4)
                            .addComponent(Mold4)
                            .addComponent(Ragweed4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Low4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(MainPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DayPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        RiseLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RiseLabel4.setText("Sunrise:");

        HrsOfSunLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSunLabel4.setText("Hrs of Sun:");

        DayDirectionLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirectionLabel4.setText("Direction:");

        DaySpeedLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeedLabel4.setText("Speed:");

        javax.swing.GroupLayout DayLabelPanel4Layout = new javax.swing.GroupLayout(DayLabelPanel4);
        DayLabelPanel4.setLayout(DayLabelPanel4Layout);
        DayLabelPanel4Layout.setHorizontalGroup(
            DayLabelPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabelPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayLabelPanel4Layout.createSequentialGroup()
                        .addComponent(HrsOfSunLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DayLabelPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DayLabelPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RiseLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DayDirectionLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DaySpeedLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        DayLabelPanel4Layout.setVerticalGroup(
            DayLabelPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RiseLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSunLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirectionLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeedLabel4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Rise4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Rise4.setText("testing");

        HrsOfSun4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSun4.setText("jLabel3");

        DayDirection4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirection4.setText("jLabel4");

        DaySpeed4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeed4.setText("jLabel5");

        javax.swing.GroupLayout DayLabel4Layout = new javax.swing.GroupLayout(DayLabel4);
        DayLabel4.setLayout(DayLabel4Layout);
        DayLabel4Layout.setHorizontalGroup(
            DayLabel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HrsOfSun4)
                    .addComponent(Rise4)
                    .addComponent(DayDirection4)
                    .addComponent(DaySpeed4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DayLabel4Layout.setVerticalGroup(
            DayLabel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rise4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSun4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirection4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeed4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRainLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRainLabel4.setText("Rain:");

        DayThunderLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunderLabel4.setText("Thunder:");

        DaySnowLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnowLabel4.setText("Snow:");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DaySnowLabel4)
                    .addComponent(DayRainLabel4)
                    .addComponent(DayThunderLabel4))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRainLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunderLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnowLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRain4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRain4.setText("jLabel6");

        DayThunder4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunder4.setText("jLabel7");

        DaySnow4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnow4.setText("jLabel8");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DayRain4)
                    .addComponent(DayThunder4)
                    .addComponent(DaySnow4)))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRain4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunder4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnow4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DaySummary4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySummary4.setText("Summary");

        javax.swing.GroupLayout DayPanel4Layout = new javax.swing.GroupLayout(DayPanel4);
        DayPanel4.setLayout(DayPanel4Layout);
        DayPanel4Layout.setHorizontalGroup(
            DayPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(DaySummary4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DayPanel4Layout.createSequentialGroup()
                        .addComponent(DayLabelPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DayLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 50, Short.MAX_VALUE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        DayPanel4Layout.setVerticalGroup(
            DayPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabelPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySummary4)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Night", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        Set4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Set4.setText("jLabel2");

        NightDirection4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirection4.setText("jLabel4");

        NightSpeed4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeed4.setText("jLabel5");

        MoonPhas4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhas4.setText("jLabel3");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Set4)
                    .addComponent(NightDirection4)
                    .addComponent(NightSpeed4)
                    .addComponent(MoonPhas4))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Set4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeed4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirection4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhas4)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NightRainLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRainLabel4.setText("Rain:");

        NightThunderLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunderLabel4.setText("Thunder:");

        NightSnowLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnowLabel4.setText("Snow:");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRainLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightThunderLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSnowLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NightRainLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunderLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnowLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NightRain4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRain4.setText("jLabel6");

        NightThunder4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunder4.setText("jLabel7");

        NightSnow4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnow4.setText("jLabel8");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRain4)
                    .addComponent(NightThunder4)
                    .addComponent(NightSnow4)))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NightRain4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunder4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnow4))
        );

        NightSummary4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSummary4.setText("Summary");

        SetLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SetLabel4.setText("Sunset:");

        NightSpeedLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeedLabel4.setText("Speed:");

        NightDirectionLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirectionLabel4.setText("Direction:");

        MoonPhaseLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhaseLabel4.setText("Moon Phase:");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightDirectionLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSpeedLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SetLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoonPhaseLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeedLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirectionLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhaseLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(NightSummary4))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(NightSummary4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Day4Layout = new javax.swing.GroupLayout(Day4);
        Day4.setLayout(Day4Layout);
        Day4Layout.setHorizontalGroup(
            Day4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Day4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Day4Layout.createSequentialGroup()
                        .addComponent(DayPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Day4Layout.setVerticalGroup(
            Day4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day4Layout.createSequentialGroup()
                .addComponent(MainPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Day4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DayPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        Forecast.addTab("Day4", Day4);

        Day5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N

        AirQualityLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQualityLabel5.setText("Air Quality");

        UVLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UVLabel5.setText("UV:");

        TreeLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TreeLabel5.setText("Tree:");

        GrassLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        GrassLabel5.setText("Grass:");

        MoldLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoldLabel5.setText("Mold:");

        RagweedLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RagweedLabel5.setText("Ragweed:");

        High5.setText("text1");

        Low5.setText("text2");

        AirQuality5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        AirQuality5.setText("text");

        UV5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        UV5.setText("text");

        Tree5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tree5.setText("text");

        Grass5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Grass5.setText("text");

        Mold5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Mold5.setText("text");

        Ragweed5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Ragweed5.setText("text");

        HighLabel5.setText("High:");

        LowLabel5.setText("Low:");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HighLabel5)
                    .addComponent(LowLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HighLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LowLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanel5Layout = new javax.swing.GroupLayout(MainPanel5);
        MainPanel5.setLayout(MainPanel5Layout);
        MainPanel5Layout.setHorizontalGroup(
            MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanel5Layout.createSequentialGroup()
                        .addComponent(High5)
                        .addGap(150, 150, 150)
                        .addComponent(AirQualityLabel5))
                    .addGroup(MainPanel5Layout.createSequentialGroup()
                        .addComponent(Low5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AirQuality5)))
                .addGap(32, 32, 32)
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UVLabel5)
                    .addComponent(UV5))
                .addGap(35, 35, 35)
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TreeLabel5)
                    .addComponent(Tree5))
                .addGap(35, 35, 35)
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GrassLabel5)
                    .addComponent(Grass5))
                .addGap(35, 35, 35)
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mold5)
                    .addComponent(MoldLabel5))
                .addGap(35, 35, 35)
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RagweedLabel5)
                    .addComponent(Ragweed5)))
        );
        MainPanel5Layout.setVerticalGroup(
            MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanel5Layout.createSequentialGroup()
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel5Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQualityLabel5)
                            .addComponent(UVLabel5)
                            .addComponent(TreeLabel5)
                            .addComponent(GrassLabel5)
                            .addComponent(MoldLabel5)
                            .addComponent(RagweedLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(High5)))
                .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanel5Layout.createSequentialGroup()
                        .addGroup(MainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AirQuality5)
                            .addComponent(UV5)
                            .addComponent(Tree5)
                            .addComponent(Grass5)
                            .addComponent(Mold5)
                            .addComponent(Ragweed5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MainPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Low5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(MainPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DayPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Day", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        RiseLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RiseLabel5.setText("Sunrise:");

        HrsOfSunLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSunLabel5.setText("Hrs of Sun:");

        DayDirectionLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirectionLabel5.setText("Direction:");

        DaySpeedLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeedLabel5.setText("Speed:");

        javax.swing.GroupLayout DayLabelPanel5Layout = new javax.swing.GroupLayout(DayLabelPanel5);
        DayLabelPanel5.setLayout(DayLabelPanel5Layout);
        DayLabelPanel5Layout.setHorizontalGroup(
            DayLabelPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabelPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayLabelPanel5Layout.createSequentialGroup()
                        .addComponent(HrsOfSunLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DayLabelPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(DayLabelPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RiseLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DayDirectionLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DaySpeedLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        DayLabelPanel5Layout.setVerticalGroup(
            DayLabelPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabelPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RiseLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSunLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirectionLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeedLabel5)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        Rise5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Rise5.setText("testing");

        HrsOfSun5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        HrsOfSun5.setText("jLabel3");

        DayDirection5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayDirection5.setText("jLabel4");

        DaySpeed5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySpeed5.setText("jLabel5");

        javax.swing.GroupLayout DayLabel5Layout = new javax.swing.GroupLayout(DayLabel5);
        DayLabel5.setLayout(DayLabel5Layout);
        DayLabel5Layout.setHorizontalGroup(
            DayLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HrsOfSun5)
                    .addComponent(Rise5)
                    .addComponent(DayDirection5)
                    .addComponent(DaySpeed5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DayLabel5Layout.setVerticalGroup(
            DayLabel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayLabel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rise5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(HrsOfSun5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayDirection5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySpeed5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRainLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRainLabel5.setText("Rain:");

        DayThunderLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunderLabel5.setText("Thunder:");

        DaySnowLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnowLabel5.setText("Snow:");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DaySnowLabel5)
                    .addComponent(DayRainLabel5)
                    .addComponent(DayThunderLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRainLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunderLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnowLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DayRain5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayRain5.setText("jLabel6");

        DayThunder5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DayThunder5.setText("jLabel7");

        DaySnow5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySnow5.setText("jLabel8");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DayRain5)
                    .addComponent(DayThunder5)
                    .addComponent(DaySnow5)))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DayRain5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DayThunder5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySnow5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DaySummary5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        DaySummary5.setText("Summary");

        javax.swing.GroupLayout DayPanel5Layout = new javax.swing.GroupLayout(DayPanel5);
        DayPanel5.setLayout(DayPanel5Layout);
        DayPanel5Layout.setHorizontalGroup(
            DayPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DayPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(DaySummary5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DayPanel5Layout.createSequentialGroup()
                        .addComponent(DayLabelPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DayLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 50, Short.MAX_VALUE)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        DayPanel5Layout.setVerticalGroup(
            DayPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DayPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DayPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabelPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DaySummary5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Night", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 11))); // NOI18N

        Set5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Set5.setText("jLabel2");

        NightDirection5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirection5.setText("jLabel4");

        NightSpeed5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeed5.setText("jLabel5");

        MoonPhas5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhas5.setText("jLabel3");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Set5)
                    .addComponent(NightDirection5)
                    .addComponent(NightSpeed5)
                    .addComponent(MoonPhas5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Set5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeed5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirection5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhas5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        NightRainLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRainLabel5.setText("Rain:");

        NightThunderLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunderLabel5.setText("Thunder:");

        NightSnowLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnowLabel5.setText("Snow:");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRainLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightThunderLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSnowLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NightRainLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunderLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnowLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NightRain5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightRain5.setText("jLabel6");

        NightThunder5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightThunder5.setText("jLabel7");

        NightSnow5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSnow5.setText("jLabel8");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightRain5)
                    .addComponent(NightThunder5)
                    .addComponent(NightSnow5)))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NightRain5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightThunder5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSnow5))
        );

        NightSummary5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSummary5.setText("Summary");

        SetLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SetLabel5.setText("Sunset:");

        NightSpeedLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightSpeedLabel5.setText("Speed:");

        NightDirectionLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        NightDirectionLabel5.setText("Direction:");

        MoonPhaseLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        MoonPhaseLabel5.setText("Moon Phase:");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NightDirectionLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NightSpeedLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SetLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MoonPhaseLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SetLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightSpeedLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NightDirectionLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MoonPhaseLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(NightSummary5))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(NightSummary5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Day5Layout = new javax.swing.GroupLayout(Day5);
        Day5.setLayout(Day5Layout);
        Day5Layout.setHorizontalGroup(
            Day5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(Day5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Day5Layout.createSequentialGroup()
                        .addComponent(DayPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        Day5Layout.setVerticalGroup(
            Day5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Day5Layout.createSequentialGroup()
                .addComponent(MainPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Day5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DayPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        Forecast.addTab("Day5", Day5);

        Gym_Signup.setBorder(javax.swing.BorderFactory.createTitledBorder("Gym Status"));

        Today10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today10.setText("10:00:");

        Today1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today1130.setText("11:30:");

        Today1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today1.setText("01:00:");

        Today230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today230.setText("02:30:");

        Today4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today4.setText("04:00:");

        Today530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today530.setText("05:30:");

        Today532.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today532.setText("07:00:");

        Today533.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today533.setText("08:30:");

        javax.swing.GroupLayout TodayTimesLayout = new javax.swing.GroupLayout(TodayTimes);
        TodayTimes.setLayout(TodayTimesLayout);
        TodayTimesLayout.setHorizontalGroup(
            TodayTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayTimesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TodayTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Today10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today1130, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today230, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today530, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today532, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today533, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        TodayTimesLayout.setVerticalGroup(
            TodayTimesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayTimesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Today10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today1130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today530)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today532)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today533)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TodayLabelLayout = new javax.swing.GroupLayout(TodayLabel);
        TodayLabel.setLayout(TodayLabelLayout);
        TodayLabelLayout.setHorizontalGroup(
            TodayLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 93, Short.MAX_VALUE)
        );
        TodayLabelLayout.setVerticalGroup(
            TodayLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        Today10Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today10Status.setText("jLabel9");

        Today1130Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today1130Status.setText("jLabel9");

        Today1Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today1Status.setText("jLabel9");

        Today230Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today230Status.setText("jLabel9");

        Today4Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today4Status.setText("jLabel9");

        Today530Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today530Status.setText("jLabel9");

        Today7Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today7Status.setText("jLabel9");

        Today830Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today830Status.setText("jLabel9");

        javax.swing.GroupLayout TodayStatusLabelLayout = new javax.swing.GroupLayout(TodayStatusLabel);
        TodayStatusLabel.setLayout(TodayStatusLabelLayout);
        TodayStatusLabelLayout.setHorizontalGroup(
            TodayStatusLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayStatusLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TodayStatusLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Today10Status)
                    .addComponent(Today1130Status)
                    .addComponent(Today1Status)
                    .addComponent(Today230Status)
                    .addComponent(Today4Status)
                    .addComponent(Today530Status)
                    .addComponent(Today7Status)
                    .addComponent(Today830Status)))
        );
        TodayStatusLabelLayout.setVerticalGroup(
            TodayStatusLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayStatusLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Today10Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today1130Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today1Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today230Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today4Status)
                .addGap(12, 12, 12)
                .addComponent(Today530Status)
                .addGap(12, 12, 12)
                .addComponent(Today7Status)
                .addGap(12, 12, 12)
                .addComponent(Today830Status))
        );

        TodaySlots10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots10.setText("jLabel9");

        TodaySlots1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots1130.setText("jLabel9");

        TodaySlots1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots1.setText("jLabel9");

        TodaySlots230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots230.setText("jLabel9");

        TodaySlots4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots4.setText("jLabel9");

        TodaySlots530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots530.setText("jLabel9");

        TodaySlots7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots7.setText("jLabel9");

        TodaySlots830.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TodaySlots830.setText("jLabel9");

        javax.swing.GroupLayout TodaySlotsLayout = new javax.swing.GroupLayout(TodaySlots);
        TodaySlots.setLayout(TodaySlotsLayout);
        TodaySlotsLayout.setHorizontalGroup(
            TodaySlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodaySlotsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TodaySlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TodaySlots10)
                    .addComponent(TodaySlots1130)
                    .addComponent(TodaySlots1)
                    .addComponent(TodaySlots230)
                    .addComponent(TodaySlots4)
                    .addComponent(TodaySlots530)
                    .addComponent(TodaySlots7)
                    .addComponent(TodaySlots830))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TodaySlotsLayout.setVerticalGroup(
            TodaySlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodaySlotsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TodaySlots10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TodaySlots1130)
                .addGap(12, 12, 12)
                .addComponent(TodaySlots1)
                .addGap(12, 12, 12)
                .addComponent(TodaySlots230)
                .addGap(12, 12, 12)
                .addComponent(TodaySlots4)
                .addGap(12, 12, 12)
                .addComponent(TodaySlots530)
                .addGap(12, 12, 12)
                .addComponent(TodaySlots7)
                .addGap(12, 12, 12)
                .addComponent(TodaySlots830)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TomorrowSlots10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots10.setText("jLabel9");

        TomorrowSlots1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots1130.setText("jLabel9");

        TomorrowSlots1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots1.setText("jLabel9");

        TomorrowSlots230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots230.setText("jLabel9");

        TomorrowSlots4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots4.setText("jLabel9");

        TomorrowSlots530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots530.setText("jLabel9");

        TomorrowSlots7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots7.setText("jLabel9");

        TomorrowSlots830.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TomorrowSlots830.setText("jLabel9");

        javax.swing.GroupLayout TomorrowSlotsLayout = new javax.swing.GroupLayout(TomorrowSlots);
        TomorrowSlots.setLayout(TomorrowSlotsLayout);
        TomorrowSlotsLayout.setHorizontalGroup(
            TomorrowSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowSlotsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TomorrowSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TomorrowSlots10)
                    .addComponent(TomorrowSlots1130)
                    .addComponent(TomorrowSlots1)
                    .addComponent(TomorrowSlots230)
                    .addComponent(TomorrowSlots4)
                    .addComponent(TomorrowSlots530)
                    .addComponent(TomorrowSlots7)
                    .addComponent(TomorrowSlots830))
                .addGap(14, 14, 14))
        );
        TomorrowSlotsLayout.setVerticalGroup(
            TomorrowSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowSlotsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TomorrowSlots10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TomorrowSlots1130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TomorrowSlots1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TomorrowSlots230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TomorrowSlots4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TomorrowSlots530, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TomorrowSlots7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TomorrowSlots830, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel39.setText("Tomorrow");

        TodayButton10.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton10.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton10.setName(""); // NOI18N
        TodayButton10.setRequestFocusEnabled(false);
        TodayButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton10ActionPerformed(evt);
            }
        });

        TodayButton1130.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton1130.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton1130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton1130ActionPerformed(evt);
            }
        });

        TodayButton1.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton1.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton1ActionPerformed(evt);
            }
        });

        TodayButton230.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton230.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton230ActionPerformed(evt);
            }
        });

        TodayButton4.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton4.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton4ActionPerformed(evt);
            }
        });

        TodayButton530.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton530.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton530ActionPerformed(evt);
            }
        });

        Tomorrow10Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow10Status.setText("jLabel9");

        Tomorrow1130Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow1130Status.setText("jLabel9");

        Tomorrow1Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow1Status.setText("jLabel9");

        Tomorrow230Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow230Status.setText("jLabel9");

        Tomorrow530Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow530Status.setText("jLabel9");

        Tomorrow4Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow4Status.setText("jLabel9");

        Tomorrow7Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow7Status.setText("jLabel9");

        Tomorrow830Status.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Tomorrow830Status.setText("jLabel9");

        javax.swing.GroupLayout TomorrowStatusLayout = new javax.swing.GroupLayout(TomorrowStatus);
        TomorrowStatus.setLayout(TomorrowStatusLayout);
        TomorrowStatusLayout.setHorizontalGroup(
            TomorrowStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowStatusLayout.createSequentialGroup()
                .addGroup(TomorrowStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tomorrow1130Status)
                    .addComponent(Tomorrow1Status)
                    .addComponent(Tomorrow230Status)
                    .addComponent(Tomorrow4Status)
                    .addComponent(Tomorrow530Status)
                    .addComponent(Tomorrow10Status, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tomorrow7Status)
                    .addComponent(Tomorrow830Status))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        TomorrowStatusLayout.setVerticalGroup(
            TomorrowStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowStatusLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tomorrow10Status, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tomorrow1130Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tomorrow1Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tomorrow230Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tomorrow4Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tomorrow530Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tomorrow7Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tomorrow830Status))
        );

        TodayButton7.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton7.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton7ActionPerformed(evt);
            }
        });

        TodayButton830.setBackground(new java.awt.Color(51, 153, 255));
        TodayButton830.setForeground(new java.awt.Color(51, 204, 255));
        TodayButton830.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayButton830ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TodayButtonPanelLayout = new javax.swing.GroupLayout(TodayButtonPanel);
        TodayButtonPanel.setLayout(TodayButtonPanelLayout);
        TodayButtonPanelLayout.setHorizontalGroup(
            TodayButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayButtonPanelLayout.createSequentialGroup()
                .addGroup(TodayButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TodayButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(TomorrowStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TodayButtonPanelLayout.setVerticalGroup(
            TodayButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TodayButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TodayButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TodayButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TodayButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TodayButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TodayButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TodayButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TodayButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(TodayButtonPanelLayout.createSequentialGroup()
                .addComponent(TomorrowStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TodayButton10.getAccessibleContext().setAccessibleName("TodayButton10");

        TomorrowButton10.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton10.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton10.setRequestFocusEnabled(false);
        TomorrowButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TomorrowButton10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TomorrowButton10MousePressed(evt);
            }
        });
        TomorrowButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton10ActionPerformed(evt);
            }
        });

        TomorrowButton1130.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton1130.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton1130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton1130ActionPerformed(evt);
            }
        });

        TomorrowButton1.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton1.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton1ActionPerformed(evt);
            }
        });

        TomorrowButton230.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton230.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton230ActionPerformed(evt);
            }
        });

        TomorrowButton4.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton4.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton4ActionPerformed(evt);
            }
        });

        TomorrowButton530.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton530.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton530ActionPerformed(evt);
            }
        });

        TomorrowButton7.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton7.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton7ActionPerformed(evt);
            }
        });

        TomorrowButton830.setBackground(new java.awt.Color(51, 153, 255));
        TomorrowButton830.setForeground(new java.awt.Color(51, 204, 255));
        TomorrowButton830.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TomorrowButton830ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TomorrowButtonPanelLayout = new javax.swing.GroupLayout(TomorrowButtonPanel);
        TomorrowButtonPanel.setLayout(TomorrowButtonPanelLayout);
        TomorrowButtonPanelLayout.setHorizontalGroup(
            TomorrowButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TomorrowButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TomorrowButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TomorrowButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TomorrowButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TomorrowButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TomorrowButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TomorrowButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TomorrowButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TomorrowButtonPanelLayout.setVerticalGroup(
            TomorrowButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TomorrowButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TomorrowButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TomorrowButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TomorrowButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TomorrowButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TomorrowButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TomorrowButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TomorrowButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Today");

        RitchieStatus10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus10.setText("jLabel9");

        RitchieStatus1115.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus1115.setText("jLabel9");

        RitchieStatus1230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus1230.setText("jLabel9");

        RitchieStatus145.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus145.setText("jLabel9");

        RitchieStatus3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus3.setText("jLabel9");

        RitchieStatus415.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus415.setText("jLabel9");

        RitchieStatus530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus530.setText("jLabel9");

        RitchieStatus645.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus645.setText("jLabel9");

        RitchieStatus8.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus8.setText("jLabel9");

        RitchieStatus915.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieStatus915.setText("jLabel9");

        javax.swing.GroupLayout RitchieStatusLabelLayout = new javax.swing.GroupLayout(RitchieStatusLabel);
        RitchieStatusLabel.setLayout(RitchieStatusLabelLayout);
        RitchieStatusLabelLayout.setHorizontalGroup(
            RitchieStatusLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RitchieStatusLabelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RitchieStatusLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RitchieStatus10)
                    .addComponent(RitchieStatus1115)
                    .addComponent(RitchieStatus1230)
                    .addComponent(RitchieStatus145)
                    .addComponent(RitchieStatus3)
                    .addComponent(RitchieStatus415)
                    .addComponent(RitchieStatus530)
                    .addComponent(RitchieStatus645)
                    .addComponent(RitchieStatus8)
                    .addComponent(RitchieStatus915)))
        );
        RitchieStatusLabelLayout.setVerticalGroup(
            RitchieStatusLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RitchieStatusLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RitchieStatus10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieStatus1115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieStatus1230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieStatus145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieStatus3)
                .addGap(12, 12, 12)
                .addComponent(RitchieStatus415)
                .addGap(12, 12, 12)
                .addComponent(RitchieStatus530)
                .addGap(12, 12, 12)
                .addComponent(RitchieStatus645)
                .addGap(12, 12, 12)
                .addComponent(RitchieStatus8)
                .addGap(12, 12, 12)
                .addComponent(RitchieStatus915)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Today11.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today11.setText("10:00:");

        Today1131.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today1131.setText("11:15:");

        Today2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today2.setText("12:30:");

        Today231.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today231.setText("01:45:");

        Today5.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today5.setText("03:00:");

        Today531.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        Today531.setText("04:15:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel4.setText("05:30:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel7.setText("06:45:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel8.setText("08:00:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel9.setText("09:15:");

        javax.swing.GroupLayout TodayTimes1Layout = new javax.swing.GroupLayout(TodayTimes1);
        TodayTimes1.setLayout(TodayTimes1Layout);
        TodayTimes1Layout.setHorizontalGroup(
            TodayTimes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayTimes1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TodayTimes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Today11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today1131, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today231, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Today531, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        TodayTimes1Layout.setVerticalGroup(
            TodayTimes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayTimes1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Today11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today1131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today231)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Today531)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        RitchieButton10.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton10.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton10.setName(""); // NOI18N
        RitchieButton10.setRequestFocusEnabled(false);
        RitchieButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton10ActionPerformed(evt);
            }
        });

        RitchieButton1115.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton1115.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton1115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton1115ActionPerformed(evt);
            }
        });

        RitchieButton1230.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton1230.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton1230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton1230ActionPerformed(evt);
            }
        });

        RitchieButton145.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton145.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton145ActionPerformed(evt);
            }
        });

        RitchieButton3.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton3.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton3ActionPerformed(evt);
            }
        });

        RitchieButton415.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton415.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton415.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton415ActionPerformed(evt);
            }
        });

        RitchieButton530.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton530.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton530ActionPerformed(evt);
            }
        });

        TRitchieStatus10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus10.setText("jLabel9");

        TRitchieStatus1115.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus1115.setText("jLabel9");

        TRitchieStatus1230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus1230.setText("jLabel9");

        TRitchieStatus145.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus145.setText("jLabel9");

        TRitchieStatus415.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus415.setText("jLabel9");

        TRitchieStatus3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus3.setText("jLabel9");

        TRitchieStatus530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus530.setText("jLabel9");

        TRitchieStatus645.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus645.setText("jLabel9");

        TRitchieStatus8.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus8.setText("jLabel9");

        TRitchieStatus915.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieStatus915.setText("jLabel9");

        javax.swing.GroupLayout TomorrowStatus1Layout = new javax.swing.GroupLayout(TomorrowStatus1);
        TomorrowStatus1.setLayout(TomorrowStatus1Layout);
        TomorrowStatus1Layout.setHorizontalGroup(
            TomorrowStatus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowStatus1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TomorrowStatus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TRitchieStatus1115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus1230, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus415, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus530, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus645, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TRitchieStatus915, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        TomorrowStatus1Layout.setVerticalGroup(
            TomorrowStatus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowStatus1Layout.createSequentialGroup()
                .addComponent(TRitchieStatus10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus1115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TRitchieStatus1230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus415)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus530)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus645)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieStatus915)
                .addContainerGap())
        );

        RitchieButton645.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton645.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton645.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton645ActionPerformed(evt);
            }
        });

        RitchieButton8.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton8.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton8ActionPerformed(evt);
            }
        });

        RitchieButton915.setBackground(new java.awt.Color(51, 153, 255));
        RitchieButton915.setForeground(new java.awt.Color(51, 204, 255));
        RitchieButton915.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RitchieButton915ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TodayButtonPanel1Layout = new javax.swing.GroupLayout(TodayButtonPanel1);
        TodayButtonPanel1.setLayout(TodayButtonPanel1Layout);
        TodayButtonPanel1Layout.setHorizontalGroup(
            TodayButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayButtonPanel1Layout.createSequentialGroup()
                .addGroup(TodayButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RitchieButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton1115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton1230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton415, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton645, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieButton915, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(TomorrowStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TodayButtonPanel1Layout.setVerticalGroup(
            TodayButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TodayButtonPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TodayButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TomorrowStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(TodayButtonPanel1Layout.createSequentialGroup()
                        .addComponent(RitchieButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton1115, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton1230, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton415, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton645, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RitchieButton915, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        TRitchieSlots10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots10.setText("jLabel9");

        TRitchieSlots1115.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots1115.setText("jLabel9");

        TRitchieSlots1230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots1230.setText("jLabel9");

        TRitchieSlots145.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots145.setText("jLabel9");

        TRitchieSlots3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots3.setText("jLabel9");

        TRitchieSlots415.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots415.setText("jLabel9");

        TRitchieSlots530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots530.setText("jLabel9");

        TRitchieSlots645.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots645.setText("jLabel9");

        TRitchieSlots8.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots8.setText("jLabel9");

        TRitchieSlots915.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TRitchieSlots915.setText("jLabel9");

        javax.swing.GroupLayout TomorrowSlots2Layout = new javax.swing.GroupLayout(TomorrowSlots2);
        TomorrowSlots2.setLayout(TomorrowSlots2Layout);
        TomorrowSlots2Layout.setHorizontalGroup(
            TomorrowSlots2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowSlots2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TomorrowSlots2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TRitchieSlots10)
                    .addComponent(TRitchieSlots1115)
                    .addComponent(TRitchieSlots1230)
                    .addComponent(TRitchieSlots145)
                    .addComponent(TRitchieSlots3)
                    .addComponent(TRitchieSlots415)
                    .addComponent(TRitchieSlots530)
                    .addComponent(TRitchieSlots645)
                    .addComponent(TRitchieSlots8)
                    .addComponent(TRitchieSlots915))
                .addGap(14, 14, 14))
        );
        TomorrowSlots2Layout.setVerticalGroup(
            TomorrowSlots2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowSlots2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TRitchieSlots10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots1115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots1230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots415)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots530)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots645)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRitchieSlots915)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TRitchieButton10.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton10.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton10.setRequestFocusEnabled(false);
        TRitchieButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TRitchieButton10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TRitchieButton10MousePressed(evt);
            }
        });
        TRitchieButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton10ActionPerformed(evt);
            }
        });

        TRitchieButton1115.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton1115.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton1115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton1115ActionPerformed(evt);
            }
        });

        TRitchieButton1230.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton1230.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton1230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton1230ActionPerformed(evt);
            }
        });

        TRitchieButton145.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton145.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton145ActionPerformed(evt);
            }
        });

        TRitchieButton3.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton3.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton3ActionPerformed(evt);
            }
        });

        TRitchieButton415.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton415.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton415.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton415ActionPerformed(evt);
            }
        });

        TRitchieButton530.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton530.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton530ActionPerformed(evt);
            }
        });

        TRitchieButton645.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton645.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton645.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton645ActionPerformed(evt);
            }
        });

        TRitchieButton8.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton8.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton8ActionPerformed(evt);
            }
        });

        TRitchieButton915.setBackground(new java.awt.Color(51, 153, 255));
        TRitchieButton915.setForeground(new java.awt.Color(51, 204, 255));
        TRitchieButton915.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRitchieButton915ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TomorrowButtonPanel1Layout = new javax.swing.GroupLayout(TomorrowButtonPanel1);
        TomorrowButtonPanel1.setLayout(TomorrowButtonPanel1Layout);
        TomorrowButtonPanel1Layout.setHorizontalGroup(
            TomorrowButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TRitchieButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton1115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton1230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton415, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton645, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TRitchieButton915, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TomorrowButtonPanel1Layout.setVerticalGroup(
            TomorrowButtonPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowButtonPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TRitchieButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton1115, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton1230, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton415, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton645, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TRitchieButton915, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setText("Eppley");

        jLabel3.setText("Ritchie");

        RitchieSlots10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots10.setText("jLabel9");

        RitchieSlots1115.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots1115.setText("jLabel9");

        RitchieSlots1230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots1230.setText("jLabel9");

        RitchieSlots145.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots145.setText("jLabel9");

        RitchieSlots3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots3.setText("jLabel9");

        RitchieSlots415.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots415.setText("jLabel9");

        RitchieSlots530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots530.setText("jLabel9");

        RitchieSlots645.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots645.setText("jLabel9");

        RitchieSlots8.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots8.setText("jLabel9");

        RitchieSlots915.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        RitchieSlots915.setText("jLabel9");

        javax.swing.GroupLayout TodaySlots2Layout = new javax.swing.GroupLayout(TodaySlots2);
        TodaySlots2.setLayout(TodaySlots2Layout);
        TodaySlots2Layout.setHorizontalGroup(
            TodaySlots2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodaySlots2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TodaySlots2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RitchieSlots10)
                    .addComponent(RitchieSlots1115)
                    .addComponent(RitchieSlots1230)
                    .addComponent(RitchieSlots145)
                    .addComponent(RitchieSlots3)
                    .addComponent(RitchieSlots415)
                    .addComponent(RitchieSlots530)
                    .addComponent(RitchieSlots645)
                    .addComponent(RitchieSlots8)
                    .addComponent(RitchieSlots915))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TodaySlots2Layout.setVerticalGroup(
            TodaySlots2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodaySlots2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RitchieSlots10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots1115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots1230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots415)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots530)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots645)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RitchieSlots915)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SPHSlots10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots10.setText("jLabel9");

        SPHSlots1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots1130.setText("jLabel9");

        SPHSlots1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots1.setText("jLabel9");

        SPHSlots230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots230.setText("jLabel9");

        SPHSlots4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots4.setText("jLabel9");

        SPHSlots530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots530.setText("jLabel9");

        SPHSlots7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots7.setText("jLabel9");

        SPHSlots830.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHSlots830.setText("jLabel9");

        javax.swing.GroupLayout SPHSlotsLayout = new javax.swing.GroupLayout(SPHSlots);
        SPHSlots.setLayout(SPHSlotsLayout);
        SPHSlotsLayout.setHorizontalGroup(
            SPHSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPHSlotsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SPHSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPHSlots10)
                    .addComponent(SPHSlots1130)
                    .addComponent(SPHSlots1)
                    .addComponent(SPHSlots230)
                    .addComponent(SPHSlots4)
                    .addComponent(SPHSlots530)
                    .addComponent(SPHSlots7)
                    .addComponent(SPHSlots830))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SPHSlotsLayout.setVerticalGroup(
            SPHSlotsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SPHSlotsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPHSlots10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHSlots1130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHSlots1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHSlots230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHSlots4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHSlots530)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHSlots7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHSlots830)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TSPHButton10.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton10.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton10.setRequestFocusEnabled(false);
        TSPHButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TSPHButton10MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TSPHButton10MousePressed(evt);
            }
        });
        TSPHButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton10ActionPerformed(evt);
            }
        });

        TSPHButton1130.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton1130.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton1130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton1130ActionPerformed(evt);
            }
        });

        TSPHButton1.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton1.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton1ActionPerformed(evt);
            }
        });

        TSPHButton230.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton230.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton230ActionPerformed(evt);
            }
        });

        TSPHButton4.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton4.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton4ActionPerformed(evt);
            }
        });

        TSPHButton530.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton530.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton530ActionPerformed(evt);
            }
        });

        TSPHButton7.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton7.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton7ActionPerformed(evt);
            }
        });

        TSPHButton830.setBackground(new java.awt.Color(51, 153, 255));
        TSPHButton830.setForeground(new java.awt.Color(51, 204, 255));
        TSPHButton830.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TSPHButton830ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TomorrowButtonPanel2Layout = new javax.swing.GroupLayout(TomorrowButtonPanel2);
        TomorrowButtonPanel2.setLayout(TomorrowButtonPanel2Layout);
        TomorrowButtonPanel2Layout.setHorizontalGroup(
            TomorrowButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TSPHButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TSPHButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TSPHButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TSPHButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TSPHButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TSPHButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TSPHButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(TSPHButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        TomorrowButtonPanel2Layout.setVerticalGroup(
            TomorrowButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowButtonPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TSPHButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TSPHButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TSPHButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TSPHButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TSPHButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TSPHButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TSPHButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TSPHButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        TSPHSlots10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots10.setText("jLabel9");

        TSPHSlots1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots1130.setText("jLabel9");

        TSPHSlots1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots1.setText("jLabel9");

        TSPHSlots230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots230.setText("jLabel9");

        TSPHSlots4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots4.setText("jLabel9");

        TSPHSlots530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots530.setText("jLabel9");

        TSPHSlots7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots7.setText("jLabel9");

        TSPHSlots830.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHSlots830.setText("jLabel9");

        javax.swing.GroupLayout TomorrowSlots3Layout = new javax.swing.GroupLayout(TomorrowSlots3);
        TomorrowSlots3.setLayout(TomorrowSlots3Layout);
        TomorrowSlots3Layout.setHorizontalGroup(
            TomorrowSlots3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowSlots3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TomorrowSlots3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TSPHSlots10)
                    .addComponent(TSPHSlots1130)
                    .addComponent(TSPHSlots1)
                    .addComponent(TSPHSlots230)
                    .addComponent(TSPHSlots4)
                    .addComponent(TSPHSlots530)
                    .addComponent(TSPHSlots7)
                    .addComponent(TSPHSlots830))
                .addGap(14, 14, 14))
        );
        TomorrowSlots3Layout.setVerticalGroup(
            TomorrowSlots3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowSlots3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TSPHSlots10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHSlots1130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHSlots1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHSlots230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHSlots4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHSlots530)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHSlots7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHSlots830)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SPHButton10.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton10.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton10.setName(""); // NOI18N
        SPHButton10.setRequestFocusEnabled(false);
        SPHButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton10ActionPerformed(evt);
            }
        });

        SPHButton1130.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton1130.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton1130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton1130ActionPerformed(evt);
            }
        });

        SPHButton1.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton1.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton1ActionPerformed(evt);
            }
        });

        SPHButton230.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton230.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton230.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton230ActionPerformed(evt);
            }
        });

        SPHButton4.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton4.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton4ActionPerformed(evt);
            }
        });

        SPHButton530.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton530.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton530.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton530ActionPerformed(evt);
            }
        });

        SPHButton7.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton7.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton7ActionPerformed(evt);
            }
        });

        SPHButton830.setBackground(new java.awt.Color(51, 153, 255));
        SPHButton830.setForeground(new java.awt.Color(51, 204, 255));
        SPHButton830.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPHButton830ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TodayButtonPanel2Layout = new javax.swing.GroupLayout(TodayButtonPanel2);
        TodayButtonPanel2.setLayout(TodayButtonPanel2Layout);
        TodayButtonPanel2Layout.setHorizontalGroup(
            TodayButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayButtonPanel2Layout.createSequentialGroup()
                .addGroup(TodayButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPHButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPHButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPHButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPHButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPHButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPHButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPHButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPHButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TodayButtonPanel2Layout.setVerticalGroup(
            TodayButtonPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TodayButtonPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SPHButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPHButton1130, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPHButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPHButton230, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPHButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPHButton530, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPHButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SPHButton830, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        SPH10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH10.setText("10:00:");

        SPH1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH1130.setText("11:30:");

        SPH1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH1.setText("01:00:");

        SPH230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH230.setText("02:30:");

        SPH4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH4.setText("04:00:");

        SPH530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH530.setText("05:30:");

        SPH531.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH531.setText("07:00:");

        SPH532.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPH532.setText("08:30:");

        javax.swing.GroupLayout TodayTimes2Layout = new javax.swing.GroupLayout(TodayTimes2);
        TodayTimes2.setLayout(TodayTimes2Layout);
        TodayTimes2Layout.setHorizontalGroup(
            TodayTimes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayTimes2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TodayTimes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPH10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPH1130, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPH1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPH230, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPH4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPH530, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPH531, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPH532, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        TodayTimes2Layout.setVerticalGroup(
            TodayTimes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TodayTimes2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPH10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPH1130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPH1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPH230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPH4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPH530)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPH531)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPH532)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SPHLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel10.setText("jLabel9");

        SPHLabel1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel1130.setText("jLabel9");

        SPHLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel1.setText("jLabel9");

        SPHLabel230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel230.setText("jLabel9");

        SPHLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel4.setText("jLabel9");

        SPHLabel530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel530.setText("jLabel9");

        SPHLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel7.setText("jLabel9");

        SPHLabel830.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        SPHLabel830.setText("jLabel9");

        javax.swing.GroupLayout RitchieStatusLabel1Layout = new javax.swing.GroupLayout(RitchieStatusLabel1);
        RitchieStatusLabel1.setLayout(RitchieStatusLabel1Layout);
        RitchieStatusLabel1Layout.setHorizontalGroup(
            RitchieStatusLabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RitchieStatusLabel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RitchieStatusLabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPHLabel10)
                    .addComponent(SPHLabel1130)
                    .addComponent(SPHLabel1)
                    .addComponent(SPHLabel230)
                    .addComponent(SPHLabel4)
                    .addComponent(SPHLabel530)
                    .addComponent(SPHLabel7)
                    .addComponent(SPHLabel830)))
        );
        RitchieStatusLabel1Layout.setVerticalGroup(
            RitchieStatusLabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RitchieStatusLabel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPHLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHLabel1130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHLabel230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SPHLabel4)
                .addGap(12, 12, 12)
                .addComponent(SPHLabel530)
                .addGap(12, 12, 12)
                .addComponent(SPHLabel7)
                .addGap(12, 12, 12)
                .addComponent(SPHLabel830)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel6.setText("SPH");

        TSPHStatus10.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus10.setText("jLabel9");

        TSPHStatus1130.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus1130.setText("jLabel9");

        TSPHStatus1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus1.setText("jLabel9");

        TSPHStatus230.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus230.setText("jLabel9");

        TSPHStatus530.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus530.setText("jLabel9");

        TSPHStatus4.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus4.setText("jLabel9");

        TSPHStatus830.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus830.setText("jLabel9");

        TSPHStatus7.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        TSPHStatus7.setText("jLabel9");

        javax.swing.GroupLayout TomorrowStatus2Layout = new javax.swing.GroupLayout(TomorrowStatus2);
        TomorrowStatus2.setLayout(TomorrowStatus2Layout);
        TomorrowStatus2Layout.setHorizontalGroup(
            TomorrowStatus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowStatus2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TomorrowStatus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TSPHStatus1130, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TSPHStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TSPHStatus230, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TSPHStatus4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TSPHStatus530, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TSPHStatus10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TSPHStatus830, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TSPHStatus7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
        TomorrowStatus2Layout.setVerticalGroup(
            TomorrowStatus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TomorrowStatus2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TSPHStatus10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TSPHStatus1130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHStatus1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHStatus230)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHStatus4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHStatus530, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHStatus7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TSPHStatus830)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout Gym_SignupLayout = new javax.swing.GroupLayout(Gym_Signup);
        Gym_Signup.setLayout(Gym_SignupLayout);
        Gym_SignupLayout.setHorizontalGroup(
            Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gym_SignupLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                        .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Gym_SignupLayout.createSequentialGroup()
                                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                                        .addComponent(TodayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                                        .addComponent(TodayTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TodayStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TodaySlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TodayButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel39))
                                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                                        .addComponent(TomorrowSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TomorrowButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Gym_SignupLayout.createSequentialGroup()
                                .addComponent(TodayTimes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RitchieStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TodaySlots2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TodayButtonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TomorrowSlots2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TomorrowButtonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gym_SignupLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(205, 205, 205))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Gym_SignupLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(200, 200, 200))
            .addGroup(Gym_SignupLayout.createSequentialGroup()
                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TodayTimes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RitchieStatusLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SPHSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(TodayButtonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TomorrowStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TomorrowSlots3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TomorrowButtonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Gym_SignupLayout.setVerticalGroup(
            Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Gym_SignupLayout.createSequentialGroup()
                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TodayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Gym_SignupLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TodaySlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TomorrowSlots, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TomorrowButtonPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TodayTimes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RitchieStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodaySlots2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TomorrowSlots2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TomorrowButtonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TodayButtonPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(Gym_SignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RitchieStatusLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TodayTimes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SPHSlots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TodayButtonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TomorrowStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TomorrowButtonPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TomorrowSlots3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Reminders:\n");
        jScrollPane1.setViewportView(jTextArea1);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Events"));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Main_Weather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Forecast, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DisplayPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(Gym_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gym_Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DisplayPanelLayout.createSequentialGroup()
                        .addComponent(Main_Weather, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Forecast, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        Main_Weather.getAccessibleContext().setAccessibleName("");

        getContentPane().add(DisplayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 0, 1210, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void TodayButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton10ActionPerformed
        if (gym.circleStatus10.equals("Open")) {
            gym.reserveSpot("10", 1);
            TodayButton10.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TodayButton10ActionPerformed

    private void TodayButton1130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton1130ActionPerformed
        if (gym.circleStatus1130.equals("Open")) {
            gym.reserveSpot("1130", 1);
            TodayButton1130.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TodayButton1130ActionPerformed

    private void TodayButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton1ActionPerformed
        if (gym.circleStatus1.equals("Open")) {
            gym.reserveSpot("1", 1);
            TodayButton1.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TodayButton1ActionPerformed

    private void TodayButton230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton230ActionPerformed
        if (gym.circleStatus230.equals("Open")) {
            gym.reserveSpot("230", 1);
            TodayButton230.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TodayButton230ActionPerformed

    private void TodayButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton4ActionPerformed
        if (gym.circleStatus4.equals("Open")) {
            gym.reserveSpot("4", 1);
            TodayButton4.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TodayButton4ActionPerformed

    private void TodayButton530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton530ActionPerformed
        if (gym.circleStatus530.equals("Open")) {
            gym.reserveSpot("530", 1);
            TodayButton530.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TodayButton530ActionPerformed

    private void TomorrowButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton10ActionPerformed
        if (gym.twCircleStatus10.equals("Open")) {
            gym.reserveSpot("10", 2);
            TomorrowButton10.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TomorrowButton10ActionPerformed

    private void TomorrowButton1130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton1130ActionPerformed
        if (gym.twCircleStatus1130.equals("Open")) {
            gym.reserveSpot("1130", 2);
            TomorrowButton1130.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TomorrowButton1130ActionPerformed

    private void TomorrowButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton1ActionPerformed
        if (gym.twCircleStatus1.equals("Open")) {
            gym.reserveSpot("1", 2);
            TomorrowButton1.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TomorrowButton1ActionPerformed

    private void TomorrowButton230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton230ActionPerformed
        if (gym.twCircleStatus230.equals("Open")) {
            gym.reserveSpot("230", 2);
            TomorrowButton230.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TomorrowButton230ActionPerformed

    private void TomorrowButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton4ActionPerformed
        if (gym.twCircleStatus4.equals("Open")) {
            gym.reserveSpot("4", 2);
            TomorrowButton4.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TomorrowButton4ActionPerformed

    private void TomorrowButton530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton530ActionPerformed
        if (gym.twCircleStatus530.equals("Open")) {
            gym.reserveSpot("530", 2);
            TomorrowButton530.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TomorrowButton530ActionPerformed

    private void TomorrowButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TomorrowButton10MouseClicked
        
    }//GEN-LAST:event_TomorrowButton10MouseClicked

    private void TomorrowButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TomorrowButton10MousePressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_TomorrowButton10MousePressed

    private void RitchieButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton10ActionPerformed
        if (gym.ritchieStatus10.equals("Open")) {
            gym.reserveSpot("10", 3);
            RitchieButton10.setBackground(Color.blue);
        }
    }//GEN-LAST:event_RitchieButton10ActionPerformed

    private void RitchieButton1115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton1115ActionPerformed
        if (gym.ritchieStatus1115.equals("Open")) {
            gym.reserveSpot("1115", 3);
            RitchieButton1115.setBackground(Color.blue);
        }
    }//GEN-LAST:event_RitchieButton1115ActionPerformed

    private void RitchieButton1230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton1230ActionPerformed
        if (gym.ritchieStatus1230.equals("Open")) {
            gym.reserveSpot("1230", 3);
            RitchieButton1230.setBackground(Color.blue);
        }
    }//GEN-LAST:event_RitchieButton1230ActionPerformed

    private void RitchieButton145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton145ActionPerformed
        if (gym.ritchieStatus145.equals("Open")) {
            gym.reserveSpot("145", 3);
            RitchieButton145.setBackground(Color.blue);
        }
    }//GEN-LAST:event_RitchieButton145ActionPerformed

    private void RitchieButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton3ActionPerformed
        if (gym.ritchieStatus3.equals("Open")) {
            gym.reserveSpot("3", 3);
            RitchieButton3.setBackground(Color.blue);
        }
    }//GEN-LAST:event_RitchieButton3ActionPerformed

    private void RitchieButton415ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton415ActionPerformed
        if (gym.ritchieStatus415.equals("Open")) {
            gym.reserveSpot("415", 3);
            RitchieButton415.setBackground(Color.blue);
        }
    }//GEN-LAST:event_RitchieButton415ActionPerformed

    private void TRitchieButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRitchieButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TRitchieButton10MouseClicked

    private void TRitchieButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TRitchieButton10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRitchieButton10MousePressed

    private void TRitchieButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton10ActionPerformed
        if (gym.twRitchieStatus10.equals("Open")) {
            gym.reserveSpot("10", 4);
            TRitchieButton10.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TRitchieButton10ActionPerformed

    private void TRitchieButton1115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton1115ActionPerformed
        if (gym.twRitchieStatus1115.equals("Open")) {
            gym.reserveSpot("1115", 4);
            TRitchieButton1115.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TRitchieButton1115ActionPerformed

    private void TRitchieButton1230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton1230ActionPerformed
        if (gym.twRitchieStatus1230.equals("Open")) {
            gym.reserveSpot("1230", 4);
            TRitchieButton1230.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TRitchieButton1230ActionPerformed

    private void TRitchieButton145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton145ActionPerformed
        if (gym.twRitchieStatus145.equals("Open")) {
            gym.reserveSpot("145", 4);
            TRitchieButton145.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TRitchieButton145ActionPerformed

    private void TRitchieButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton3ActionPerformed
        if (gym.twRitchieStatus3.equals("Open")) {
            gym.reserveSpot("3", 4);
            TRitchieButton3.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TRitchieButton3ActionPerformed

    private void TRitchieButton415ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton415ActionPerformed
        if (gym.twRitchieStatus415.equals("Open")) {
            gym.reserveSpot("415", 4);
            TRitchieButton415.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TRitchieButton415ActionPerformed

    private void RitchieButton530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton530ActionPerformed
        if (gym.ritchieStatus530.equals("Open")) {
            gym.reserveSpot("530", 3);
            RitchieButton530.setBackground(Color.blue);
        }
    }//GEN-LAST:event_RitchieButton530ActionPerformed

    private void TRitchieButton530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton530ActionPerformed
        if (gym.twRitchieStatus530.equals("Open")) {
            gym.reserveSpot("530", 4);
            TRitchieButton530.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TRitchieButton530ActionPerformed

    private void TSPHButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSPHButton10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton10MouseClicked

    private void TSPHButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TSPHButton10MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton10MousePressed

    private void TSPHButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton10ActionPerformed

    private void TSPHButton1130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton1130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton1130ActionPerformed

    private void TSPHButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton1ActionPerformed

    private void TSPHButton230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton230ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton230ActionPerformed

    private void TSPHButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton4ActionPerformed

    private void TSPHButton530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton530ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton530ActionPerformed

    private void SPHButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton10ActionPerformed

    private void SPHButton1130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton1130ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton1130ActionPerformed

    private void SPHButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton1ActionPerformed

    private void SPHButton230ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton230ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton230ActionPerformed

    private void SPHButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton4ActionPerformed

    private void SPHButton530ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton530ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton530ActionPerformed

    private void TodayButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TodayButton7ActionPerformed

    private void TodayButton830ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayButton830ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TodayButton830ActionPerformed

    private void TomorrowButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TomorrowButton7ActionPerformed

    private void TomorrowButton830ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TomorrowButton830ActionPerformed
        if (gym.twCircleStatus830.equals("Open")) {
            gym.reserveSpot("830", 2);
            TomorrowButton830.setBackground(Color.blue);
        }
    }//GEN-LAST:event_TomorrowButton830ActionPerformed

    private void RitchieButton645ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton645ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RitchieButton645ActionPerformed

    private void RitchieButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RitchieButton8ActionPerformed

    private void RitchieButton915ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RitchieButton915ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RitchieButton915ActionPerformed

    private void TRitchieButton645ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton645ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRitchieButton645ActionPerformed

    private void TRitchieButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRitchieButton8ActionPerformed

    private void TRitchieButton915ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRitchieButton915ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRitchieButton915ActionPerformed

    private void SPHButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton7ActionPerformed

    private void SPHButton830ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPHButton830ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SPHButton830ActionPerformed

    private void TSPHButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton7ActionPerformed

    private void TSPHButton830ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TSPHButton830ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TSPHButton830ActionPerformed

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AirQuality;
    private javax.swing.JLabel AirQuality2;
    private javax.swing.JLabel AirQuality3;
    private javax.swing.JLabel AirQuality4;
    private javax.swing.JLabel AirQuality5;
    private javax.swing.JLabel AirQualityLabel;
    private javax.swing.JLabel AirQualityLabel2;
    private javax.swing.JLabel AirQualityLabel3;
    private javax.swing.JLabel AirQualityLabel4;
    private javax.swing.JLabel AirQualityLabel5;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel CloudCover;
    private javax.swing.JLabel CloudCoverLabel;
    private javax.swing.JPanel DataPanel1;
    private javax.swing.JPanel DataPanel2;
    private javax.swing.JPanel DataPanel3;
    private javax.swing.JPanel DataPanel4;
    private javax.swing.JPanel Day1;
    private javax.swing.JPanel Day2;
    private javax.swing.JPanel Day3;
    private javax.swing.JPanel Day4;
    private javax.swing.JPanel Day5;
    private javax.swing.JLabel DayDirection;
    private javax.swing.JLabel DayDirection2;
    private javax.swing.JLabel DayDirection3;
    private javax.swing.JLabel DayDirection4;
    private javax.swing.JLabel DayDirection5;
    private javax.swing.JLabel DayDirectionLabel;
    private javax.swing.JLabel DayDirectionLabel2;
    private javax.swing.JLabel DayDirectionLabel3;
    private javax.swing.JLabel DayDirectionLabel4;
    private javax.swing.JLabel DayDirectionLabel5;
    private javax.swing.JPanel DayLabel;
    private javax.swing.JPanel DayLabel2;
    private javax.swing.JPanel DayLabel3;
    private javax.swing.JPanel DayLabel4;
    private javax.swing.JPanel DayLabel5;
    private javax.swing.JPanel DayLabelPanel;
    private javax.swing.JPanel DayLabelPanel2;
    private javax.swing.JPanel DayLabelPanel3;
    private javax.swing.JPanel DayLabelPanel4;
    private javax.swing.JPanel DayLabelPanel5;
    private javax.swing.JLabel DayLength;
    private javax.swing.JLabel DayLengthLabel;
    private javax.swing.JPanel DayPanel;
    private javax.swing.JPanel DayPanel2;
    private javax.swing.JPanel DayPanel3;
    private javax.swing.JPanel DayPanel4;
    private javax.swing.JPanel DayPanel5;
    private javax.swing.JLabel DayRain;
    private javax.swing.JLabel DayRain2;
    private javax.swing.JLabel DayRain3;
    private javax.swing.JLabel DayRain4;
    private javax.swing.JLabel DayRain5;
    private javax.swing.JLabel DayRainLabel;
    private javax.swing.JLabel DayRainLabel2;
    private javax.swing.JLabel DayRainLabel3;
    private javax.swing.JLabel DayRainLabel4;
    private javax.swing.JLabel DayRainLabel5;
    private javax.swing.JLabel DaySnow;
    private javax.swing.JLabel DaySnow2;
    private javax.swing.JLabel DaySnow3;
    private javax.swing.JLabel DaySnow4;
    private javax.swing.JLabel DaySnow5;
    private javax.swing.JLabel DaySnowLabel;
    private javax.swing.JLabel DaySnowLabel2;
    private javax.swing.JLabel DaySnowLabel3;
    private javax.swing.JLabel DaySnowLabel4;
    private javax.swing.JLabel DaySnowLabel5;
    private javax.swing.JLabel DaySpeed;
    private javax.swing.JLabel DaySpeed2;
    private javax.swing.JLabel DaySpeed3;
    private javax.swing.JLabel DaySpeed4;
    private javax.swing.JLabel DaySpeed5;
    private javax.swing.JLabel DaySpeedLabel;
    private javax.swing.JLabel DaySpeedLabel2;
    private javax.swing.JLabel DaySpeedLabel3;
    private javax.swing.JLabel DaySpeedLabel4;
    private javax.swing.JLabel DaySpeedLabel5;
    private javax.swing.JLabel DaySummary;
    private javax.swing.JLabel DaySummary2;
    private javax.swing.JLabel DaySummary3;
    private javax.swing.JLabel DaySummary4;
    private javax.swing.JLabel DaySummary5;
    private javax.swing.JLabel DayThunder;
    private javax.swing.JLabel DayThunder2;
    private javax.swing.JLabel DayThunder3;
    private javax.swing.JLabel DayThunder4;
    private javax.swing.JLabel DayThunder5;
    private javax.swing.JLabel DayThunderLabel;
    private javax.swing.JLabel DayThunderLabel2;
    private javax.swing.JLabel DayThunderLabel3;
    private javax.swing.JLabel DayThunderLabel4;
    private javax.swing.JLabel DayThunderLabel5;
    private javax.swing.JLabel Description;
    private javax.swing.JLabel DescriptionLabel;
    private javax.swing.JLabel DewPoint;
    private javax.swing.JLabel DewPointLabel;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JTabbedPane Forecast;
    private javax.swing.JLabel Grass;
    private javax.swing.JLabel Grass2;
    private javax.swing.JLabel Grass3;
    private javax.swing.JLabel Grass4;
    private javax.swing.JLabel Grass5;
    private javax.swing.JLabel GrassLabel;
    private javax.swing.JLabel GrassLabel2;
    private javax.swing.JLabel GrassLabel3;
    private javax.swing.JLabel GrassLabel4;
    private javax.swing.JLabel GrassLabel5;
    private javax.swing.JPanel Gym_Signup;
    private javax.swing.JLabel High;
    private javax.swing.JLabel High2;
    private javax.swing.JLabel High3;
    private javax.swing.JLabel High4;
    private javax.swing.JLabel High5;
    private javax.swing.JLabel HighLabel;
    private javax.swing.JLabel HighLabel2;
    private javax.swing.JLabel HighLabel3;
    private javax.swing.JLabel HighLabel4;
    private javax.swing.JLabel HighLabel5;
    private javax.swing.JLabel HrsOfSun;
    private javax.swing.JLabel HrsOfSun2;
    private javax.swing.JLabel HrsOfSun3;
    private javax.swing.JLabel HrsOfSun4;
    private javax.swing.JLabel HrsOfSun5;
    private javax.swing.JLabel HrsOfSunLabel;
    private javax.swing.JLabel HrsOfSunLabel2;
    private javax.swing.JLabel HrsOfSunLabel3;
    private javax.swing.JLabel HrsOfSunLabel4;
    private javax.swing.JLabel HrsOfSunLabel5;
    private javax.swing.JLabel Humidity;
    private javax.swing.JLabel HumidityLabel;
    private javax.swing.JPanel LabelPanel1;
    private javax.swing.JPanel LabelPanel2;
    private javax.swing.JPanel LabelPanel3;
    private javax.swing.JPanel LabelPanel4;
    private javax.swing.JLabel Low;
    private javax.swing.JLabel Low2;
    private javax.swing.JLabel Low3;
    private javax.swing.JLabel Low4;
    private javax.swing.JLabel Low5;
    private javax.swing.JLabel LowLabel;
    private javax.swing.JLabel LowLabel2;
    private javax.swing.JLabel LowLabel3;
    private javax.swing.JLabel LowLabel4;
    private javax.swing.JLabel LowLabel5;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel MainPanel2;
    private javax.swing.JPanel MainPanel3;
    private javax.swing.JPanel MainPanel4;
    private javax.swing.JPanel MainPanel5;
    private javax.swing.JPanel Main_Weather;
    private javax.swing.JLabel Mold;
    private javax.swing.JLabel Mold2;
    private javax.swing.JLabel Mold3;
    private javax.swing.JLabel Mold4;
    private javax.swing.JLabel Mold5;
    private javax.swing.JLabel MoldLabel;
    private javax.swing.JLabel MoldLabel2;
    private javax.swing.JLabel MoldLabel3;
    private javax.swing.JLabel MoldLabel4;
    private javax.swing.JLabel MoldLabel5;
    private javax.swing.JLabel MoonDistance;
    private javax.swing.JLabel MoonDistanceLabel;
    private javax.swing.JLabel MoonPhas;
    private javax.swing.JLabel MoonPhas2;
    private javax.swing.JLabel MoonPhas3;
    private javax.swing.JLabel MoonPhas4;
    private javax.swing.JLabel MoonPhas5;
    private javax.swing.JLabel MoonPhaseLabel;
    private javax.swing.JLabel MoonPhaseLabel2;
    private javax.swing.JLabel MoonPhaseLabel3;
    private javax.swing.JLabel MoonPhaseLabel4;
    private javax.swing.JLabel MoonPhaseLabel5;
    private javax.swing.JLabel NightDirection;
    private javax.swing.JLabel NightDirection2;
    private javax.swing.JLabel NightDirection3;
    private javax.swing.JLabel NightDirection4;
    private javax.swing.JLabel NightDirection5;
    private javax.swing.JLabel NightDirectionLabel;
    private javax.swing.JLabel NightDirectionLabel2;
    private javax.swing.JLabel NightDirectionLabel3;
    private javax.swing.JLabel NightDirectionLabel4;
    private javax.swing.JLabel NightDirectionLabel5;
    private javax.swing.JLabel NightRain;
    private javax.swing.JLabel NightRain2;
    private javax.swing.JLabel NightRain3;
    private javax.swing.JLabel NightRain4;
    private javax.swing.JLabel NightRain5;
    private javax.swing.JLabel NightRainLabel;
    private javax.swing.JLabel NightRainLabel2;
    private javax.swing.JLabel NightRainLabel3;
    private javax.swing.JLabel NightRainLabel4;
    private javax.swing.JLabel NightRainLabel5;
    private javax.swing.JLabel NightSnow;
    private javax.swing.JLabel NightSnow2;
    private javax.swing.JLabel NightSnow3;
    private javax.swing.JLabel NightSnow4;
    private javax.swing.JLabel NightSnow5;
    private javax.swing.JLabel NightSnowLabel;
    private javax.swing.JLabel NightSnowLabel2;
    private javax.swing.JLabel NightSnowLabel3;
    private javax.swing.JLabel NightSnowLabel4;
    private javax.swing.JLabel NightSnowLabel5;
    private javax.swing.JLabel NightSpeed;
    private javax.swing.JLabel NightSpeed2;
    private javax.swing.JLabel NightSpeed3;
    private javax.swing.JLabel NightSpeed4;
    private javax.swing.JLabel NightSpeed5;
    private javax.swing.JLabel NightSpeedLabel;
    private javax.swing.JLabel NightSpeedLabel2;
    private javax.swing.JLabel NightSpeedLabel3;
    private javax.swing.JLabel NightSpeedLabel4;
    private javax.swing.JLabel NightSpeedLabel5;
    private javax.swing.JLabel NightSummary;
    private javax.swing.JLabel NightSummary2;
    private javax.swing.JLabel NightSummary3;
    private javax.swing.JLabel NightSummary4;
    private javax.swing.JLabel NightSummary5;
    private javax.swing.JLabel NightThunder;
    private javax.swing.JLabel NightThunder2;
    private javax.swing.JLabel NightThunder3;
    private javax.swing.JLabel NightThunder4;
    private javax.swing.JLabel NightThunder5;
    private javax.swing.JLabel NightThunderLabel;
    private javax.swing.JLabel NightThunderLabel2;
    private javax.swing.JLabel NightThunderLabel3;
    private javax.swing.JLabel NightThunderLabel4;
    private javax.swing.JLabel NightThunderLabel5;
    private javax.swing.JLabel PastHrPrep;
    private javax.swing.JLabel PastHrPrepLabel;
    private javax.swing.JLabel Pressure;
    private javax.swing.JLabel PressureLabel;
    private javax.swing.JLabel Ragweed;
    private javax.swing.JLabel Ragweed2;
    private javax.swing.JLabel Ragweed3;
    private javax.swing.JLabel Ragweed4;
    private javax.swing.JLabel Ragweed5;
    private javax.swing.JLabel RagweedLabel;
    private javax.swing.JLabel RagweedLabel2;
    private javax.swing.JLabel RagweedLabel3;
    private javax.swing.JLabel RagweedLabel4;
    private javax.swing.JLabel RagweedLabel5;
    private javax.swing.JLabel RealFeel;
    private javax.swing.JLabel RealFeelLabel;
    private javax.swing.JLabel Rise;
    private javax.swing.JLabel Rise2;
    private javax.swing.JLabel Rise3;
    private javax.swing.JLabel Rise4;
    private javax.swing.JLabel Rise5;
    private javax.swing.JLabel RiseLabel;
    private javax.swing.JLabel RiseLabel2;
    private javax.swing.JLabel RiseLabel3;
    private javax.swing.JLabel RiseLabel4;
    private javax.swing.JLabel RiseLabel5;
    private javax.swing.JButton RitchieButton10;
    private javax.swing.JButton RitchieButton1115;
    private javax.swing.JButton RitchieButton1230;
    private javax.swing.JButton RitchieButton145;
    private javax.swing.JButton RitchieButton3;
    private javax.swing.JButton RitchieButton415;
    private javax.swing.JButton RitchieButton530;
    private javax.swing.JButton RitchieButton645;
    private javax.swing.JButton RitchieButton8;
    private javax.swing.JButton RitchieButton915;
    private javax.swing.JLabel RitchieSlots10;
    private javax.swing.JLabel RitchieSlots1115;
    private javax.swing.JLabel RitchieSlots1230;
    private javax.swing.JLabel RitchieSlots145;
    private javax.swing.JLabel RitchieSlots3;
    private javax.swing.JLabel RitchieSlots415;
    private javax.swing.JLabel RitchieSlots530;
    private javax.swing.JLabel RitchieSlots645;
    private javax.swing.JLabel RitchieSlots8;
    private javax.swing.JLabel RitchieSlots915;
    private javax.swing.JLabel RitchieStatus10;
    private javax.swing.JLabel RitchieStatus1115;
    private javax.swing.JLabel RitchieStatus1230;
    private javax.swing.JLabel RitchieStatus145;
    private javax.swing.JLabel RitchieStatus3;
    private javax.swing.JLabel RitchieStatus415;
    private javax.swing.JLabel RitchieStatus530;
    private javax.swing.JLabel RitchieStatus645;
    private javax.swing.JLabel RitchieStatus8;
    private javax.swing.JLabel RitchieStatus915;
    private javax.swing.JPanel RitchieStatusLabel;
    private javax.swing.JPanel RitchieStatusLabel1;
    private javax.swing.JLabel SPH1;
    private javax.swing.JLabel SPH10;
    private javax.swing.JLabel SPH1130;
    private javax.swing.JLabel SPH230;
    private javax.swing.JLabel SPH4;
    private javax.swing.JLabel SPH530;
    private javax.swing.JLabel SPH531;
    private javax.swing.JLabel SPH532;
    private javax.swing.JButton SPHButton1;
    private javax.swing.JButton SPHButton10;
    private javax.swing.JButton SPHButton1130;
    private javax.swing.JButton SPHButton230;
    private javax.swing.JButton SPHButton4;
    private javax.swing.JButton SPHButton530;
    private javax.swing.JButton SPHButton7;
    private javax.swing.JButton SPHButton830;
    private javax.swing.JLabel SPHLabel1;
    private javax.swing.JLabel SPHLabel10;
    private javax.swing.JLabel SPHLabel1130;
    private javax.swing.JLabel SPHLabel230;
    private javax.swing.JLabel SPHLabel4;
    private javax.swing.JLabel SPHLabel530;
    private javax.swing.JLabel SPHLabel7;
    private javax.swing.JLabel SPHLabel830;
    private javax.swing.JPanel SPHSlots;
    private javax.swing.JLabel SPHSlots1;
    private javax.swing.JLabel SPHSlots10;
    private javax.swing.JLabel SPHSlots1130;
    private javax.swing.JLabel SPHSlots230;
    private javax.swing.JLabel SPHSlots4;
    private javax.swing.JLabel SPHSlots530;
    private javax.swing.JLabel SPHSlots7;
    private javax.swing.JLabel SPHSlots830;
    private javax.swing.JLabel Set;
    private javax.swing.JLabel Set2;
    private javax.swing.JLabel Set3;
    private javax.swing.JLabel Set4;
    private javax.swing.JLabel Set5;
    private javax.swing.JLabel SetLabel;
    private javax.swing.JLabel SetLabel2;
    private javax.swing.JLabel SetLabel3;
    private javax.swing.JLabel SetLabel4;
    private javax.swing.JLabel SetLabel5;
    private javax.swing.JLabel SolarNoon;
    private javax.swing.JLabel SolarNoonLabel;
    private javax.swing.JLabel SunDistance;
    private javax.swing.JLabel SunDistanceLabel;
    private javax.swing.JLabel Sunrise;
    private javax.swing.JLabel SunriseLabel;
    private javax.swing.JLabel Sunset;
    private javax.swing.JLabel SunsetLabel;
    private javax.swing.JButton TRitchieButton10;
    private javax.swing.JButton TRitchieButton1115;
    private javax.swing.JButton TRitchieButton1230;
    private javax.swing.JButton TRitchieButton145;
    private javax.swing.JButton TRitchieButton3;
    private javax.swing.JButton TRitchieButton415;
    private javax.swing.JButton TRitchieButton530;
    private javax.swing.JButton TRitchieButton645;
    private javax.swing.JButton TRitchieButton8;
    private javax.swing.JButton TRitchieButton915;
    private javax.swing.JLabel TRitchieSlots10;
    private javax.swing.JLabel TRitchieSlots1115;
    private javax.swing.JLabel TRitchieSlots1230;
    private javax.swing.JLabel TRitchieSlots145;
    private javax.swing.JLabel TRitchieSlots3;
    private javax.swing.JLabel TRitchieSlots415;
    private javax.swing.JLabel TRitchieSlots530;
    private javax.swing.JLabel TRitchieSlots645;
    private javax.swing.JLabel TRitchieSlots8;
    private javax.swing.JLabel TRitchieSlots915;
    private javax.swing.JLabel TRitchieStatus10;
    private javax.swing.JLabel TRitchieStatus1115;
    private javax.swing.JLabel TRitchieStatus1230;
    private javax.swing.JLabel TRitchieStatus145;
    private javax.swing.JLabel TRitchieStatus3;
    private javax.swing.JLabel TRitchieStatus415;
    private javax.swing.JLabel TRitchieStatus530;
    private javax.swing.JLabel TRitchieStatus645;
    private javax.swing.JLabel TRitchieStatus8;
    private javax.swing.JLabel TRitchieStatus915;
    private javax.swing.JButton TSPHButton1;
    private javax.swing.JButton TSPHButton10;
    private javax.swing.JButton TSPHButton1130;
    private javax.swing.JButton TSPHButton230;
    private javax.swing.JButton TSPHButton4;
    private javax.swing.JButton TSPHButton530;
    private javax.swing.JButton TSPHButton7;
    private javax.swing.JButton TSPHButton830;
    private javax.swing.JLabel TSPHSlots1;
    private javax.swing.JLabel TSPHSlots10;
    private javax.swing.JLabel TSPHSlots1130;
    private javax.swing.JLabel TSPHSlots230;
    private javax.swing.JLabel TSPHSlots4;
    private javax.swing.JLabel TSPHSlots530;
    private javax.swing.JLabel TSPHSlots7;
    private javax.swing.JLabel TSPHSlots830;
    private javax.swing.JLabel TSPHStatus1;
    private javax.swing.JLabel TSPHStatus10;
    private javax.swing.JLabel TSPHStatus1130;
    private javax.swing.JLabel TSPHStatus230;
    private javax.swing.JLabel TSPHStatus4;
    private javax.swing.JLabel TSPHStatus530;
    private javax.swing.JLabel TSPHStatus7;
    private javax.swing.JLabel TSPHStatus830;
    private javax.swing.JLabel Temperature;
    private javax.swing.JLabel TemperatureLabel;
    private javax.swing.JLabel Today1;
    private javax.swing.JLabel Today10;
    private javax.swing.JLabel Today10Status;
    private javax.swing.JLabel Today11;
    private javax.swing.JLabel Today1130;
    private javax.swing.JLabel Today1130Status;
    private javax.swing.JLabel Today1131;
    private javax.swing.JLabel Today1Status;
    private javax.swing.JLabel Today2;
    private javax.swing.JLabel Today230;
    private javax.swing.JLabel Today230Status;
    private javax.swing.JLabel Today231;
    private javax.swing.JLabel Today4;
    private javax.swing.JLabel Today4Status;
    private javax.swing.JLabel Today5;
    private javax.swing.JLabel Today530;
    private javax.swing.JLabel Today530Status;
    private javax.swing.JLabel Today531;
    private javax.swing.JLabel Today532;
    private javax.swing.JLabel Today533;
    private javax.swing.JLabel Today7Status;
    private javax.swing.JLabel Today830Status;
    private javax.swing.JButton TodayButton1;
    private javax.swing.JButton TodayButton10;
    private javax.swing.JButton TodayButton1130;
    private javax.swing.JButton TodayButton230;
    private javax.swing.JButton TodayButton4;
    private javax.swing.JButton TodayButton530;
    private javax.swing.JButton TodayButton7;
    private javax.swing.JButton TodayButton830;
    private javax.swing.JPanel TodayButtonPanel;
    private javax.swing.JPanel TodayButtonPanel1;
    private javax.swing.JPanel TodayButtonPanel2;
    private javax.swing.JPanel TodayLabel;
    private javax.swing.JPanel TodaySlots;
    private javax.swing.JLabel TodaySlots1;
    private javax.swing.JLabel TodaySlots10;
    private javax.swing.JLabel TodaySlots1130;
    private javax.swing.JPanel TodaySlots2;
    private javax.swing.JLabel TodaySlots230;
    private javax.swing.JLabel TodaySlots4;
    private javax.swing.JLabel TodaySlots530;
    private javax.swing.JLabel TodaySlots7;
    private javax.swing.JLabel TodaySlots830;
    private javax.swing.JPanel TodayStatusLabel;
    private javax.swing.JPanel TodayTimes;
    private javax.swing.JPanel TodayTimes1;
    private javax.swing.JPanel TodayTimes2;
    private javax.swing.JLabel Tomorrow10Status;
    private javax.swing.JLabel Tomorrow1130Status;
    private javax.swing.JLabel Tomorrow1Status;
    private javax.swing.JLabel Tomorrow230Status;
    private javax.swing.JLabel Tomorrow4Status;
    private javax.swing.JLabel Tomorrow530Status;
    private javax.swing.JLabel Tomorrow7Status;
    private javax.swing.JLabel Tomorrow830Status;
    private javax.swing.JButton TomorrowButton1;
    private javax.swing.JButton TomorrowButton10;
    private javax.swing.JButton TomorrowButton1130;
    private javax.swing.JButton TomorrowButton230;
    private javax.swing.JButton TomorrowButton4;
    private javax.swing.JButton TomorrowButton530;
    private javax.swing.JButton TomorrowButton7;
    private javax.swing.JButton TomorrowButton830;
    private javax.swing.JPanel TomorrowButtonPanel;
    private javax.swing.JPanel TomorrowButtonPanel1;
    private javax.swing.JPanel TomorrowButtonPanel2;
    private javax.swing.JPanel TomorrowSlots;
    private javax.swing.JLabel TomorrowSlots1;
    private javax.swing.JLabel TomorrowSlots10;
    private javax.swing.JLabel TomorrowSlots1130;
    private javax.swing.JPanel TomorrowSlots2;
    private javax.swing.JLabel TomorrowSlots230;
    private javax.swing.JPanel TomorrowSlots3;
    private javax.swing.JLabel TomorrowSlots4;
    private javax.swing.JLabel TomorrowSlots530;
    private javax.swing.JLabel TomorrowSlots7;
    private javax.swing.JLabel TomorrowSlots830;
    private javax.swing.JPanel TomorrowStatus;
    private javax.swing.JPanel TomorrowStatus1;
    private javax.swing.JPanel TomorrowStatus2;
    private javax.swing.JLabel Tree;
    private javax.swing.JLabel Tree2;
    private javax.swing.JLabel Tree3;
    private javax.swing.JLabel Tree4;
    private javax.swing.JLabel Tree5;
    private javax.swing.JLabel TreeLabel;
    private javax.swing.JLabel TreeLabel2;
    private javax.swing.JLabel TreeLabel3;
    private javax.swing.JLabel TreeLabel4;
    private javax.swing.JLabel TreeLabel5;
    private javax.swing.JLabel UV;
    private javax.swing.JLabel UV2;
    private javax.swing.JLabel UV3;
    private javax.swing.JLabel UV4;
    private javax.swing.JLabel UV5;
    private javax.swing.JLabel UVLabel;
    private javax.swing.JLabel UVLabel2;
    private javax.swing.JLabel UVLabel3;
    private javax.swing.JLabel UVLabel4;
    private javax.swing.JLabel UVLabel5;
    private javax.swing.JLabel WindDirection;
    private javax.swing.JLabel WindDirectionLabel;
    private javax.swing.JLabel WindSpeed;
    private javax.swing.JLabel WindSpeedLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
  
    private Weather weather;
    private Gym gym;
}
