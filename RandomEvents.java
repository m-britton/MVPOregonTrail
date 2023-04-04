/**
 * Name: RandomEvents
 * Date: 4/1/23
 * Author: McKinley Britton
 * Description: The RandomEvents class determines whether something random will happen to a group
 *              traveling along the Oregon Trail. These events can be good or bad, and can effect a
 *              range of things from health, weather, food, clothing, and more. Each event has it's
 *              own likelihood, and it is the same for each day traveling along the trail.
 */

package com.example.mvpfororegontrail;

import java.util.Random;

public class RandomEvents {
    // Constant variables that show the likelihood of an event occurring
    private final double snakeBite = 0.7;
    private final double indiansFindFood = 5.0;
    private final double wrongWay = 1.0;

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

}
