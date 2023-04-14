/**
 * Name: RandomEvents
 * Date: 4/1/23
 * Author: McKinley Britton
 * Description: The RandomEvents class determines whether something random will happen to a group
 *              traveling along the Oregon Trail. These events can be good or bad, and can effect a
 *              range of things from health, weather, food, clothing, and more. Each event has it's
 *              own likelihood, and it is the same for each day traveling along the trail.
 */

package com.example.mp2oregontrailmvp;
import androidx.annotation.Nullable;

import java.util.Random;

public class RandomEvents {

    // Constant variables that show the likelihood of an event occurring
    private final double snakeBite = 0.7;
    private final double indiansFindFood = 5.0;
    private final double wrongWay = 1.0;
    private final double lostTrail = 2.0;
    private final double roughTrail = 2.5;
    private final double impossibleTrail = 2.5;
    private final double foundWildFruit = 4.0;
    private final double fire = 2.0;
    private final double lostMember = 1.0;
    private final double missingOx = 1.0;
    private final double abandonedWagon = 2.0;
    private final double blizzard = 15.0;
    private final double foggy = 6.0;
    private final double hail = 6.0;
    private final double prairieInjury = 2.0;
    private final double mountainInjury = 3.5;
    private final double thief = 2.0;
    private final double badWater = 10.0;
    private final double veryLittleWater = 20.0;
    private final double inadequateGrass = 20.0;
    // The probability of an event happening
    public double eventProbability = 0.0;


    // constructors

    /**
     * Constructor that finds the probability of something happening
     */
    public RandomEvents(){ setEventProbability();}

    // getters and setters

    /**
     * setEventProbability -> Sets the value of the eventProbability variable
     */
    public void setEventProbability(){
        Random num = new Random();
        eventProbability = Math.random() * 100;
    }

    /**
     * getEventProbability -> Accesses the probability/likelihood of an event happening
     * @return -> The probability of an event
     */
    public double getEventProbability(){ return eventProbability;}


    //other methods

    /**
     * snakeBite -> Determines whether or not someone in the group gets bit by a snake each day
     * @return -> True if likelihood of getting a snake bite is greater than randomly generated
     *            probability for the event; False otherwise
     */
    public boolean snakeBite(){
        setEventProbability();
        return eventProbability <= snakeBite;
    }

    /**
     * indiansHelpFindFood -> Determines whether or not the group gets help finding food from Indians
     * @return -> True if likelihood of Indians helping find food is greater than randomly generated
     *             probability for the event; False otherwise
     */
    public boolean indiansHelpFindFood(){
        setEventProbability();
        return eventProbability <= indiansFindFood;
    }

    /**
     * wrongTrail -> Determines whether or not the group went down the wrong trail
     * @return -> True if likelihood of traveling the wrong trail is greater than randomly generated
     *           probability for the event; False otherwise
     */
    public boolean wrongTrail(){
        setEventProbability();
        return eventProbability <= wrongWay;
    }

//    public boolean severeStorm(){
//
//    }

    public boolean severeBlizzard(){
        setEventProbability();
        return eventProbability <= blizzard;
    }

    public boolean heavyFog(){
        setEventProbability();
        return eventProbability <= foggy;
    }

    public boolean hailStorm(){
        setEventProbability();
        return eventProbability <= hail;
    }

    public boolean injuredOxenPrairie(){
        setEventProbability();
        return eventProbability <= prairieInjury;
    }

    public boolean injuredOxenMountain(){
        setEventProbability();
        return eventProbability <= mountainInjury;
    }

    public boolean injuredPersonPrairie(){
        setEventProbability();
        return eventProbability <= prairieInjury;
    }

    public boolean injuredPersonMountain(){
        setEventProbability();
        return eventProbability <= mountainInjury;
    }

    public boolean lostTrail(){
        setEventProbability();
        return eventProbability <= lostTrail;
    }

    public boolean roughTrail(){
        setEventProbability();
        return eventProbability <= roughTrail;
    }

    public boolean impossibleTrail(){
        setEventProbability();
        return eventProbability <= impossibleTrail;
    }

    public boolean foundFruit(){
        setEventProbability();
        return eventProbability <= foundWildFruit;
    }

    public boolean wagonFire(){
        setEventProbability();
        return eventProbability <= fire;
    }

    public boolean lostPerson(){
        setEventProbability();
        return eventProbability <= lostMember;
    }

    public boolean lostOxen(){
        setEventProbability();
        return  eventProbability <= missingOx;
    }

    public boolean foundWagon(){
        setEventProbability();
        return eventProbability <= abandonedWagon;
    }

    public boolean robbedAtNight(){
        setEventProbability();
        return eventProbability <= thief;
    }

    public boolean badWater(){
        setEventProbability();
        return eventProbability <= badWater;
    }

    public boolean littleWater(){
        setEventProbability();
        return eventProbability <= veryLittleWater;
    }

    public boolean badGrass(){
        setEventProbability();
        return eventProbability <= inadequateGrass;
    }

//    public boolean illness(){
//        setEventProbability();
//    }
}
