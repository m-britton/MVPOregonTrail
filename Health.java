/**
 * Name: Health
 * Date:/ 4/1/23
 * Author: McKinley Britton
 * Description: The Health class takes care of the overall health of a group traveling along the
 *              Oregon Trail. The health is determined by many factors: food, pace, weather, random
 *              events. Health is tracked as a double variable because health is based on a number,
 *              and maxes out at 140. If the group reaches a health of 140, they are days from death.
 *              Thus, the healthier the group is the lower the value of the health variable.
 */

package com.example.mvpfororegontrail;

public class Health {

    // Fields

    public double health = 0.0;

    // Constructors

    /**
     * Default constructor that creates a new Health object containing the overall health of the
     *   group traveling along the Oregon Trail
     */
    public Health(){}

    // Getters and Setters

    /**
     * setHealth: sets the overall health of the group depending on what happens
     * @param health -> the new value that health will take on
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * getHealth -> Accesses the value of the health variable
     * @return -> the overall health of the group traveling to Oregon
     */
    public double getHealth() {
        return health;
    }

    // Other Methods

    /**
     * addHealth -> adds a specific amount of health to the overall health of the group
     * @param health -> the amount that is added to the overall health of the group
     */
    public void addHealth(int health ){
        this.health += health;
    }

    /**
     * startOfDayHealth -> The overall health decreases by ten percent to simulate natural recovery
     * @return -> The health of the group after recovering from rest overnight
     */
    public double startOfDayHealth(){
        health *= 0.9;

        return health;
    }

    /**
     * healthFromFood -> The amount of food in the wagon effects the overall health of the group,
     *                   the less food the group has the worse their health gets. (More health added)
     * @param rations -> A string stating how the amount of food rations for the group along the way
     * @return -> The health variable with the updated value based on the amount of food
     */
    public double healthFromFood(String rations){
        if(rations.equalsIgnoreCase("filling")){
            health += 0;
        }
        else if(rations.equalsIgnoreCase("meager")){
            health += 2;
        }
        else if(rations.equalsIgnoreCase("bare bones")){
            health += 4;
        }
        else{
            health += 6;
        }

        return health;
    }

    /**
     * healthFromPace -> Different paces effect the overall health of the group, the faster the pace
     *                  the more the health variable increases.
     * @param pace -> A string that describes the pace at which the group is moving during the day.
     * @return -> The health variable with it's updated value, based on how fast the group moves.
     */
    public double healthFromPace(String pace){
        pace = pace.toLowerCase();
        if(pace == "resting"){
            health += 0;
        }
        else if(pace == "steady"){
            health += 2;
        }
        else if(pace == "strenuous"){
            health += 4;
        }
        else{
            health += 6;
        }

        return health;
    }
    
    
    //////////////////////////////////////////////
    
    public double healthFromPace(int pace){
        //pace = pace.toLowerCase();
        if(pace == 1){
            health += 0;
        }
        else if(pace == 2){
            health += 2;
        }
        else if(pace == 3){
            health += 4;
        }
        //else 

        return health;
    }
    
   ///////////////////////////////////////////////

    /**
     * generalHealth -> Describes the overall health of the group. The higher the health variable is
     *                  the worse their health is.
     * @return -> A string telling the user how healthy their group is at the end of the day.
     *             Ranges form Good Health to very poor health.
     */
    public String generalHealth(){
        String displayHealth;
        if(health <= 34.0){
            displayHealth = "Good Health";
        }
        else if(health <= 65.0){
            displayHealth = "Fair Health";
        }
        else if(health <= 104.0){
            displayHealth = "Poor Health";
        }
        else if(health <= 139.0){
            displayHealth = "Very Poor Health";
        }
        else{
            displayHealth = "Death is days away";
        }

        return displayHealth;
    }
}
