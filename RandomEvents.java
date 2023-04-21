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

    /**
     * severeStorm -> Determines the chance of experiencing a severe thunderstorm. The probability is
     *                  based on the average precipitation of the current location and current month.
     * @return -> True if the randomly generated probability is less than the probability of a storm occurring.
     */
    public boolean severeStorm(double rain, int month){

    }

    /**
     * severeBlizzard -> Determines whether or not the group encounters a severe blizzard. Only used
     *                  when the temperature is cold or very cold.
     * @return -> True if the randomly generated probability is less than the probability of a blizzard
     *              False otherwise.
     */
    public boolean severeBlizzard(){
        setEventProbability();
        return eventProbability <= blizzard;
    }

    /**
     * heavyFog -> Determines whether or not the group encounters heavy fog. Only used after Fort Hall.
     * @return -> True if the randomly generated probability if less than the probability of heavy fog
     *              False otherwise
     */
    public boolean heavyFog(){
        setEventProbability();
        return eventProbability <= foggy;
    }

    /**
     * hailStorm -> Determines whether or not the group experiences the effects of a hail storm
     * @return -> True if the randomly generated probability is less than the likelihood of a hail storm
     *              False otherwise
     */
    public boolean hailStorm(){
        setEventProbability();
        return eventProbability <= hail;
    }

    /**
     * injuredOxenPrairie -> Used when traveling on the prairie. Determines if an oxen is injured
     * @return -> True if the randomly generated probability is less than that of getting injured
     *              on the prairie; False otherwise.
     */
    public boolean injuredOxenPrairie(){
        setEventProbability();
        return eventProbability <= prairieInjury;
    }

    /**
     * injuredOxenMountain -> Used when traveling through the mountains. Determines if an ox gets an injury.
     * @return -> True if the randomly generated probability is less than that of getting injured
     *              in the mountains; False otherwise.
     */
    public boolean injuredOxenMountain(){
        setEventProbability();
        return eventProbability <= mountainInjury;
    }

    /**
     * injuredPersonPrairie -> Used when traveling on the prairie. Determines if a party member gets injured.
     * @return -> True if the randomly probability is less than the likelihood of getting an injury
     *              on the prairie; False otherwise.
     */
    public boolean injuredPersonPrairie(){
        setEventProbability();
        return eventProbability <= prairieInjury;
    }

    /**
     * injuredPersonMountains -> Used when traveling through the mountains. Determines if a person
     *                      sustains an injury while traveling.
     * @return -> True if the randomly generated probability is less than the probability of getting
     *              injured in the mountains; False otherwise.
     */
    public boolean injuredPersonMountain(){
        setEventProbability();
        return eventProbability <= mountainInjury;
    }

    /**
     * lostTrail -> Determines whether or not the group loses the trail on their journey.
     * @return -> True if the randomly generated probability is less than the likeliness of losing
     *              the trail; False otherwise;
     */
    public boolean lostTrail(){
        setEventProbability();
        return eventProbability <= lostTrail;
    }

    /**
     * roughTrail -> Used when traveling through the mountains. Determines whether or not the group
     *              travels along a rough trail.
     * @return -> True if the randomly generated probability if less than the probability of
     *              experiencing rough terrain; False otherwise.
     */
    public boolean roughTrail(){
        setEventProbability();
        return eventProbability <= roughTrail;
    }

    /**
     * impossibleTrail -> Used in mountainous regions. Determines whether or not the group find an
     *                  impossible trail to travel.
     * @return -> True if the randomly generated probability is less than the likelihood of finding
     *              an impossible trail; False otherwise.
     */
    public boolean impossibleTrail(){
        setEventProbability();
        return eventProbability <= impossibleTrail;
    }

    /**
     * foundFruit -> Used during months May-September. Determines whether or not the group finds wild
     *              fruit along the trail during their travels.
     * @return -> True if the randomly generated probability if less than the probability of finding
     *              wild fruit; False otherwise.
     */
    public boolean foundFruit(){
        setEventProbability();
        return eventProbability <= foundWildFruit;
    }

    /**
     * wagonFire -> Determines whether or not the groups wagon catches fire during the day.
     * @return -> True if the randomly generated probability if less than that of the catching fire.
     *              False otherwise.
     */
    public boolean wagonFire(){
        setEventProbability();
        return eventProbability <= fire;
    }

    /**
     * lostPerson -> Determines whether or not a party member goes missing on the journey.
     * @return -> True if the randomly generated probability if less than the probability of a
     *              party member going missing; False otherwise.
     */
    public boolean lostPerson(){
        setEventProbability();
        return eventProbability <= lostMember;
    }

    /**
     * lostOxen -> Determines whether or not one of the oxen wanders off.
     * @return -> True if the randomly generated probability if less than the probability of an oxen
     *              wandering off; False otherwise;
     */
    public boolean lostOxen(){
        setEventProbability();
        return  eventProbability <= missingOx;
    }

    /**
     * foundWagon -> Determines whether or not the group finds an abandon wagon along the trail.
     * @return -> True if the randomly generated probability if less than the probability of finding
     *              an abandoned wagon; False otherwise.
     */
    public boolean foundWagon(){
        setEventProbability();
        return eventProbability <= abandonedWagon;
    }

    /**
     * robbedAtNight -> Determines whether or not a thief comes in the middle of the night an robs
     *                  the wagon.
     * @return -> True if the randomly generated probability if less than the probability of a thief
     *             robbing the wagon; False otherwise.
     */
    public boolean robbedAtNight(){
        setEventProbability();
        return eventProbability <= thief;
    }

    /**
     * badWater -> Used when accumulated rainfall is less than 0.1 inch. Determines whether or not
     *              the water is bad to consume.
     * @return -> True if the randomly generated probability if less than the probability of consuming
     *              bad water; False otherwise.
     */
    public boolean badWater(){
        setEventProbability();
        return eventProbability <= badWater;
    }

    /**
     * littleWater -> Used when accumulated rainfall is below 0.1 inch. Determines whether or not the
     *                  group has very little water access.
     * @return -> True if the randomly generated probability if less than the probability of experiencing
     *              very little water; False otherwise.
     */
    public boolean littleWater(){
        setEventProbability();
        return eventProbability <= veryLittleWater;
    }

    /**
     * badGrass -> Used when accumulated rainfall is less than 0.1 inch. Determines whether or not the
     *              grass is suitable for the oxen.
     * @return -> True if the randomly generated probability if less than the probability of inadequate
     *              grass; False otherwise.
     */
    public boolean badGrass(){
        setEventProbability();
        return eventProbability <= inadequateGrass;
    }

    /**
     * illness -> Determines the likelihood of a party member contracting a disease. The probability
     *              of contracting a disease fluctuates based on the overall health of the group.
     *              The higher the health the more likely it is to contract a disease.
     * @param health -> An integer that represents the overall health of the group.
     * @return -> True if the randomly generated probability is less than the probability of contracting an illness..
     */
    public boolean illness(int health){
        double illnessProbability = 0.0;
        setEventProbability();
        if(health <= 34){
            illnessProbability = 8.0;
        }
        else if(health <= 65){
            illnessProbability = 16.0;
        }
        else if(health <= 104){
            illnessProbability = 24.0;
        }
        else if(health <= 139){
            illnessProbability = 32.0;
        }
        else{
            illnessProbability = 40.0;
        }
        return eventProbability <= illnessProbability;
    }
}
