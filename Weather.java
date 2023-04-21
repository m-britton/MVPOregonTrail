package com.example.mp2oregontrailmvp;

import java.util.Random;

public class Weather {

    private int zone1Temp = 0;
    private int zone2Temp = 0;
    private int zone3Temp = 0;
    private int zone4Temp = 0;
    private int zone5Temp = 0;
    private int zone6Temp = 0;
    private int realTemp = 0;
    private int randomAdd = 0;

    private double zone1Rain = 0.0;
    private double zone2Rain = 0.0;
    private double zone3Rain = 0.0;
    private double zone4Rain = 0.0;
    private double zone5Rain = 0.0;
    private double zone6Rain = 0.0;
    private double realRain = 0.0;
    private double totalRain = 0.0;
    private double totalSnow = 0.0;
    private double repeatProbability;
    private double rainHeaviness;
    private double rainProbability;


    /**
     * Default constructor for the weather class
     */
    public Weather(){}

    /**
     * setRandomAdd -> Sets a randomly generated amount between -20 and 20that is added to the
     *              temperature to create a new different each day.
     */
    public void setRandomAdd(){
        Random num = new Random();
        randomAdd = -20 + num.nextInt(20 + 1);
    }

    /**
     * setZone1Temp -> Determines the initial temperature for the region and time of year based on
     *              data of average temperatures in Kansas City, MO. Once the initial temperature is found
     *              a random value between -20 and 20 is added to the temperature to create different
     * @param month -> An integer used to specify what month it is, so the temperature relates accordingly.
     */
    public void setZone1Temp(int month){
        switch(month){
            case 1: zone1Temp = 29; break;
            case 2: zone1Temp = 35; break;
            case 3: zone1Temp = 46; break;
            case 4: zone1Temp = 56; break;
            case 5: zone1Temp = 66; break;
            case 6: zone1Temp = 76; break;
            case 7: zone1Temp = 80; break;
            case 8: zone1Temp = 78; break;
            case 9: zone1Temp = 70; break;
            case 10:zone1Temp = 58; break;
            case 11:zone1Temp = 45; break;
            case 12:zone1Temp = 34; break;
        }
        setRandomAdd();
        realTemp = zone1Temp + randomAdd;
    }

    /**
     * setZone1Rain -> Determines the average monthly rainfall for a specific zone of the trail.
     *                  The data is based on Kansas City, MO.
     * @param month -> An integer used to specify what month it is, so the data correlates with the journey
     */
    public void setZone1Rain(int month){
        switch(month){
            case 1: zone1Rain = 1.1; break;
            case 2: zone1Rain = 1.4; break;
            case 3: zone1Rain = 2.3; break;
            case 4: zone1Rain = 3.7; break;
            case 5: zone1Rain = 5.1; break;
            case 6: zone1Rain = 5.2; break;
            case 7: zone1Rain = 4.4; break;
            case 8: zone1Rain = 3.9; break;
            case 9: zone1Rain = 4.6; break;
            case 10:zone1Rain = 3.2; break;
            case 11:zone1Rain = 2.1; break;
            case 12:zone1Rain = 1.5; break;
        }
        realRain = zone1Rain;
    }

    /**
     * setZone2Temp -> Determines the initial temperature for the region and time of year based on
     *              data of average temperatures in North Platte, NE. Once the initial temperature is found
     *              a random value between -20 and 20 is added to the temperature to create different
     * @param month -> An integer used to specify what month it is, so the temperature relates accordingly.
     */
    public void setZone2Temp(int month){
        switch(month){
            case 1: zone2Temp = 26; break;
            case 2: zone2Temp = 29; break;
            case 3: zone2Temp = 39; break;
            case 4: zone2Temp = 48; break;
            case 5: zone2Temp = 58; break;
            case 6: zone2Temp = 69; break;
            case 7: zone2Temp = 75; break;
            case 8: zone2Temp = 73; break;
            case 9: zone2Temp = 63; break;
            case 10:zone2Temp = 50; break;
            case 11:zone2Temp = 37; break;
            case 12:zone2Temp = 30; break;
        }
        setRandomAdd();
        realTemp = zone2Temp + randomAdd;
    }

    /**
     * setZone2Rain -> Determines the average monthly rainfall for a specific zone of the trail.
     *                  The data is based on North Platte, NE.
     * @param month -> An integer used to specify what month it is, so the data correlates with the journey
     */
    public void setZone2Rain(int month){
        switch(month){
            case 1: zone2Rain = 0.42; break;
            case 2: zone2Rain = 0.56; break;
            case 3: zone2Rain = 1.2; break;
            case 4: zone2Rain = 2.2; break;
            case 5: zone2Rain = 3.5; break;
            case 6: zone2Rain = 3.2; break;
            case 7: zone2Rain = 3.1; break;
            case 8: zone2Rain = 2.3; break;
            case 9: zone2Rain = 1.4; break;
            case 10:zone2Rain = 1.5; break;
            case 11:zone2Rain = 0.62; break;
            case 12:zone2Rain = 0.48; break;
        }
        realRain = zone2Rain;
    }

    /**
     * setZone3Temp -> Determines the initial temperature for the region and time of year based on
     *             data of average temperatures in Casper, WY. Once the initial temperature is found
     *              a random value between -20 and 20 is added to the temperature to create different
     * @param month -> An integer used to specify what month it is, so the temperature relates accordingly.
     */
    public void setZone3Temp(int month){
        switch(month){
            case 1: zone3Temp = 26; break;
            case 2: zone3Temp = 28; break;
            case 3: zone3Temp = 36; break;
            case 4: zone3Temp = 43; break;
            case 5: zone3Temp = 53; break;
            case 6: zone3Temp = 63; break;
            case 7: zone3Temp = 71; break;
            case 8: zone3Temp = 70; break;
            case 9: zone3Temp = 60; break;
            case 10:zone3Temp = 46; break;
            case 11:zone3Temp = 35; break;
            case 12:zone3Temp = 27; break;
        }
        setRandomAdd();
        realTemp = zone3Temp + randomAdd;
    }

    /**
     * setZone3Rain -> Determines the average monthly rainfall for a specific zone of the trail.
     *                  The data is based on Casper, WY.
     * @param month -> An integer used to specify what month it is, so the data correlates with the journey
     */
    public void setZone3Rain(int month){
        switch(month){
            case 1: zone3Rain = 0.55; break;
            case 2: zone3Rain = 0.60; break;
            case 3: zone3Rain = 0.92; break;
            case 4: zone3Rain = 1.5; break;
            case 5: zone3Rain = 2.1; break;
            case 6: zone3Rain = 1.4; break;
            case 7: zone3Rain = 1.2; break;
            case 8: zone3Rain = 0.75; break;
            case 9: zone3Rain = 0.93; break;
            case 10:zone3Rain = 1.1; break;
            case 11:zone3Rain = 0.71; break;
            case 12:zone3Rain = 0.65; break;
        }
        realRain = zone3Rain;
    }

    /**
     * setZone4Temp -> Determines the initial temperature for the region and time of year based on
     *             data of average temperatures in Lander, WY. Once the initial temperature is found
     *             a random value between -20 and 20 is added to the temperature to create different
     * @param month -> An integer used to specify what month it is, so the temperature relates accordingly.
     */
    public void setZone4Temp(int month){
        switch(month){
            case 1: zone4Temp = 20; break;
            case 2: zone4Temp = 25; break;
            case 3: zone4Temp = 36; break;
            case 4: zone4Temp = 45; break;
            case 5: zone4Temp = 54; break;
            case 6: zone4Temp = 64; break;
            case 7: zone4Temp = 72; break;
            case 8: zone4Temp = 70; break;
            case 9: zone4Temp = 60; break;
            case 10:zone4Temp = 46; break;
            case 11:zone4Temp = 31; break;
            case 12:zone4Temp = 21; break;
        }
        setRandomAdd();
        realTemp = zone4Temp + randomAdd;
    }

    /**
     * setZone4Rain -> Determines the average monthly rainfall for a specific zone of the trail.
     *                  The data is based on Lander, WY.
     * @param month -> An integer used to specify what month it is, so the data correlates with the journey
     */
    public void setZone4Rain(int month){
        switch(month){
            case 1: zone4Rain = 0.5; break;
            case 2: zone4Rain = 0.65; break;
            case 3: zone4Rain = 1.2; break;
            case 4: zone4Rain = 2.1; break;
            case 5: zone4Rain = 2.6; break;
            case 6: zone4Rain = 1.25; break;
            case 7: zone4Rain = 0.7; break;
            case 8: zone4Rain = 0.52; break;
            case 9: zone4Rain = 1.03; break;
            case 10:zone4Rain = 1.24; break;
            case 11:zone4Rain = 0.81; break;
            case 12:zone4Rain = 0.6; break;
        }
        realRain = zone4Rain;
    }

    /**
     * setZone5Temp -> Determines the initial temperature for the region and time of year based on
     *             data of average temperatures in Boise, ID. Once the initial temperature is found
     *              a random value between -20 and 20 is added to the temperature to create different
     * @param month -> An integer used to specify what month it is, so the temperature relates accordingly.
     */
    public void setZone5Temp(int month){
        switch(month){
            case 1: zone5Temp = 32; break;
            case 2: zone5Temp = 46; break;
            case 3: zone5Temp = 45; break;
            case 4: zone5Temp = 50; break;
            case 5: zone5Temp = 59; break;
            case 6: zone5Temp = 68; break;
            case 7: zone5Temp = 77; break;
            case 8: zone5Temp = 75; break;
            case 9: zone5Temp = 66; break;
            case 10:zone5Temp = 53; break;
            case 11:zone5Temp = 40; break;
            case 12:zone5Temp = 33; break;
        }
        setRandomAdd();
        realTemp = zone5Temp + randomAdd;
    }

    /**
     * setZone5Rain -> Determines the average monthly rainfall for a specific zone of the trail.
     *                  The data is based on Boise, ID.
     * @param month -> An integer used to specify what month it is, so the data correlates with the journey
     */
    public void setZone5Rain(int month){
        switch(month){
            case 1: zone5Rain = 1.4; break;
            case 2: zone5Rain = 1.1; break;
            case 3: zone5Rain = 1.3; break;
            case 4: zone5Rain = 1.2; break;
            case 5: zone5Rain = 1.32; break;
            case 6: zone5Rain = 0.84; break;
            case 7: zone5Rain = 0.25; break;
            case 8: zone5Rain = 0.27; break;
            case 9: zone5Rain = 0.55; break;
            case 10:zone5Rain = 0.82; break;
            case 11:zone5Rain = 1.31; break;
            case 12:zone5Rain = 1.43; break;
        }
        realRain = zone5Rain;
    }

    /**
     * setZone6Temp -> Determines the initial temperature for the region and time of year based on
     *              data of average temperatures in Portland, OR. Once the initial temperature is found
     *              a random value between -20 and 20 is added to the temperature to create different
     * @param month -> An integer used to specify what month it is, so the temperature relates accordingly.
     */
    public void setZone6Temp(int month){
        switch(month){
            case 1: zone6Temp = 41; break;
            case 2: zone6Temp = 44; break;
            case 3: zone6Temp = 48; break;
            case 4: zone6Temp = 52; break;
            case 5: zone6Temp = 58; break;
            case 6: zone6Temp = 64; break;
            case 7: zone6Temp = 69; break;
            case 8: zone6Temp = 70; break;
            case 9: zone6Temp = 65; break;
            case 10:zone6Temp = 55; break;
            case 11:zone6Temp = 47; break;
            case 12:zone6Temp = 40; break;
        }
        setRandomAdd();
        realTemp = zone6Temp + randomAdd;
    }

    /**
     * setZone6Rain -> Determines the average monthly rainfall for a specific zone of the trail.
     *                  The data is based on Portland, OR.
     * @param month -> An integer used to specify what month it is, so the data correlates with the journey
     */
    public void setZone6Rain(int month){
        switch(month){
            case 1: zone6Rain = 5.4; break;
            case 2: zone6Rain = 3.8; break;
            case 3: zone6Rain = 3.7; break;
            case 4: zone6Rain = 2.6; break;
            case 5: zone6Rain = 2.2; break;
            case 6: zone6Rain = 1.6; break;
            case 7: zone6Rain = 0.5; break;
            case 8: zone6Rain = 0.8; break;
            case 9:zone6Rain = 1.62; break;
            case 10:zone6Rain = 3.2; break;
            case 11:zone6Rain = 5.3; break;
            case 12:zone6Rain = 5.5; break;
        }
        realRain = zone6Rain;
    }

    /**
     * getTemperature -> Using the temperatures from the different zones the daily temperature is found.
     * @param zone -> An integer used to determine which zone the group is in and the temperature of the zone
     * @param month -> An integer used to determine what of data to use.
     * @return -> The temperature that the group will experience for the day
     */
    public double getTemperature(int zone, int month){
        if(zone <= 1){
            setZone1Temp(month);
        }
        else if(zone <= 2){
            setZone2Temp(month);
        }
        else if(zone <= 3){
            setZone3Temp(month);
        }
        else if(zone <= 4){
            setZone4Temp(month);
        }
        else if(zone <= 5){
             setZone5Temp(month);
        }
        else{
            setZone6Temp(month);
        }
        return realTemp;
    }

    /**
     * getRainfall -> Using the rainfall from the different zones the average daily rainfall is found.
     * @param zone -> An integer used to determine which zone the group is in and the temperature of the zone
     * @param month -> An integer used to determine what of data to use.
     */
    public void getRainfall(int zone, int month){
        if(zone <= 1){
            setZone1Rain(month);
        }
        else if(zone <= 2){
            setZone2Rain(month);
        }
        else if(zone <= 3){
            setZone3Rain(month);
        }
        else if(zone <= 4){
            setZone4Rain(month);
        }
        else if(zone <= 5){
            setZone5Rain(month);
        }
        else {
            setZone6Rain(month);
        }
    }

    /**
     * getTotalRain -> Gets the total rainfall and surface water for the day.
     * @return -> The total amount of rain or surface water.
     */
    public double getTotalRain(){return totalRain;}

    /**
     * chanceOfRain -> Determines if there is going to be rainy weather for the day. The probability
     *                  of it raining is based on the total average rainfall for the month. The higher
     *                  the average the more likely it i sto rain.
     * @param zone -> Integer used to show the zone that the group is traveling through at the time.
     * @param month -> Integer used to show what month of the year it is to determine the correlating rainfall.
     * @return -> True if the randomly generated probability is lass than the probability of it raining.
     *              False otherwise.
     */
    public boolean chanceOfRain(int zone, int month){
        getRainfall(zone, month);
        double chanceOfRain;
        double itsRaining = Math.random() * 100;
        if(realRain <= 1){
            chanceOfRain = 10.0;
        }
        else if(realRain <= 2){
            chanceOfRain = 20.0;
        }
        else if(realRain <= 3){
            chanceOfRain = 30.0;
        }
        else if(realRain <= 4){
            chanceOfRain = 45.0;
        }
        else if(realRain <= 5){
            chanceOfRain = 60.0;
        }
        else{
            chanceOfRain = 75.0;
        }
        return itsRaining <= chanceOfRain;
    }

    /**
     * repeatWeather -> There is a 50/50 chance that the weather experienced today will repeat itself tomorrow
     * @return -> True if the weather is repeated, false otherwise
     */
    public boolean repeatWeather(){
        repeatProbability = Math.random();
        return repeatProbability <= 0.5;
    }

    /**
     * displayTemperature -> A string describing the temperature for the day is created based on the
     *                      numerical temperature generated for the day.
     * @param temp -> A double that represents the temperature of the day.
     * @return -> A string to be displayed to the user saying how hot the day is.
     */
    public String displayTemperature(double temp){
        String tempDescription;
        if(temp >= 90){
            tempDescription = "Very Hot";
        }
        else if(temp >=70){
            tempDescription = "Hot";
        }
        else if(temp >= 50){
            tempDescription = "Warm";
        }
        else if(temp >= 30){
            tempDescription = "Cool";
        }
        else if(temp >= 10){
            tempDescription = "Cold";
        }
        else{
            tempDescription = "Very Cold";
        }
        return tempDescription;
    }

    /**
     * heavyPrecipitation -> sets the probability for how heavy it will rain for the day
     */
    public void heavyPrecipitation(boolean raining){
        if(raining) {
            rainHeaviness = Math.random();
        }
        else{
            rainHeaviness = -1.0;
        }
    }

    /**
     * totalRainfall -> Tracks the total amount of rainfall. The heaviness of the rain determines how
     *              much rain to add to the total. The temperature is used to determine whether the
     *              precipitation is rain or snow.
     * @param zone -> Integer used to show the zone that the group is traveling through at the time.
     * @param month -> Integer used to show what month of the year it is to determine the correlating rainfall.
     */
    public void totalRainfall(int zone, int month){
        heavyPrecipitation(chanceOfRain(zone, month));
        if(rainHeaviness != -1.0) {
            if (rainHeaviness <= .30) {
                if (realTemp <= 30) {
                    totalSnow += 8;
                } else {
                    totalRain += 0.8;
                }
            }
            else {
                if (realTemp <= 30) {
                    totalSnow += 2;
                } else {
                    totalRain += 0.2;
                }
            }
        }
        else {
            if (realTemp <= 30) {
                totalSnow += 0;
            } else {
                totalRain += 0.0;
            }
        }
    }

    /**
     * resetRain -> Each day 10% of the accumulated rain evaporates and is subtracted form the total
     */
    public void resetRain(){
        totalRain *= 0.9;
    }

    /**
     * resetSnow -> If there is snow on the ground 3% of the total accumulated snow melts if the
     *              temperature is very cold, cold, or cool. If the temperature is warm, hot, or very hot
     *              5 inches of snow melts and 0.5 inches of water is added to the rainfall total.
     */
    public void resetSnow(){
        if(realTemp <= 50){
            totalSnow *= .97;
        }
        else{
            totalSnow -= 5;
            totalRain += 0.5;
        }
    }
}

