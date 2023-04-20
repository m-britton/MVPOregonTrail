package com.example.mvporegontrailfinaliteration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RandomEvents re = new RandomEvents();
    Health overallHealth = new Health();
    //Wagon wagon = new Wagon();
    Location location = new Location(0, 1, 1, 200, 100, 300);
    Shop shop = new Shop();
    Wagon wagon = new Wagon(shop.food_Price/.1, shop.clothing_Price/.2,shop.weapons_Price/20,shop.oxen_Price/50,shop.spareWagonWheel_Price/8,shop.spareWagonAxel_Price/3, shop.spareWagonTongues_Price/3, shop.medicalSupplyBox_Price/1.5, shop.sewingKit_Price/.50, shop.fireStartingKit_Price/.25, shop.kidsToys_Price/.05, 1, shop.seedPackeges_Price/.01, shop.shovels_Price/2.5, shop.cookingItems_Price/1.5);

    public boolean wagonMade = true;

    String rations = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // A list of all the buttons and text boxes used for the GUI
        final TextView display = findViewById(R.id.Display);
        final Button nextDay = findViewById(R.id.button);
        final TextView date = findViewById(R.id.Date);
        final TextView foodBox = findViewById(R.id.foodRemaining);
        final TextView healthBox = findViewById(R.id.healthBox);
        final TextView reBox = findViewById((R.id.REbox));
        final Button enter = findViewById(R.id.enter);
        final EditText User_InputBox = findViewById(R.id.UserInput);
        final TextView shopDisplay = findViewById(R.id.shopDisplay);


        // Display the layout of the store for the user to see what they can buy
        shopDisplay.setText(shop.storeLayout());

        // Actions that occur when the Enter button is clicked
        enter.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {

                // Get the users input from the text box and convert to a string
                String input = User_InputBox.getText().toString();

                // If the user decides to buy items then the item bought and the price owed for the item are updated
                if(shop.buying)
                {
                    String boughtItem = shop.buyItem(input);
                    shopDisplay.setText(boughtItem);
                }
                else
                {
                    shop.calcBoughtItem(shop.otherinput, Integer.parseInt(input));
                    shopDisplay.setText(shop.output);
                }
            }

        });
        
        // Actions occur when the Next Day button is clicked
        nextDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //resets display in case no location is reached
                if(wagonMade) {
                    wagon = new Wagon(shop.food_Price / .1, shop.clothing_Price / .2, shop.weapons_Price / 20, shop.oxen_Price / 50, shop.spareWagonWheel_Price / 8, shop.spareWagonAxel_Price / 3, shop.spareWagonTongues_Price / 3, shop.medicalSupplyBox_Price / 1.5, shop.sewingKit_Price / .50, shop.fireStartingKit_Price / .25, shop.kidsToys_Price / .05, 1, shop.seedPackeges_Price / .01, shop.shovels_Price / 2.5, shop.cookingItems_Price / 1.5);
                    wagonMade = false;
                }
                
                // Remove the shop display and the welcome message form the screen for the next days occurring
                display.setText("");
                shopDisplay.setText("");
                
                /* Location based classes that happen everytime a button is clicked.
                    Every button click adds 1 day and changes months if appropriate.
                    checks if the player has reached a river, town, or landmark.
                    Decreases distance of player form river, town, and landmarks.
                */
                location.incrementDay();
                location.setDistanceToLandmark(location.getDistanceToLandmark() - 20); //  location.setDistanceToLandmark(location.getDistanceToLandmark() - (20 * pace))
                location.setDistanceToRiver(location.getDistanceToRiver() - 20);
                location.setDistanceToTown(location.getDistanceToTown() - 20);
                location.atLandmark();


                //Displays a message if the person is at a town. If true resets distance to next landmark.
                if (location.getAtTown()) {
                    display.setText("You are at town " + location.whatTown());
                    location.setDistanceToTown(200);
                    location.setAtTown(false);
                }
                if (location.getAtRiver()) {
                    display.setText("You are at a river");
                    location.setDistanceToRiver(100);
                    location.setAtRiver(false);
                }
                if (location.getAtLandmark()) {
                    display.setText("You are at " + location.whatLandmark());
                    location.setDistanceToLandmark(300);
                    location.setAtLandmark(false);
                }



                // restore 10 percent of the total health for resting over night
                overallHealth.startOfDayHealth();

                /* Find whether or not a random event occurs each day.
                    If a random event takes place a prompt appears for the user to see what happened
                    If someone gets bit by a snake the overall health goes up by 10
                    If Indians help you find food the amount of food goes up 8 pounds
                    If you take the wrong trail you have to back track using vital supplies
                    Otherwise they message "It was a normal day" apears
                 */
                if (re.snakeBite()) {
                    overallHealth.addHealth(10);
                    reBox.setText("You got bit by a snake");
                } 
                else if (re.indiansHelpFindFood()) {
//                    Wagon.setFood(Wagon.getFood() + 8);
                    reBox.setText("Indians helped you find food");
                } 
                else if (re.wrongTrail()) {

                    reBox.setText("OH-NO you took the wrong trail");
                } 
                else {
                    reBox.setText("It was a normal day!");
                }

                //Depending on how many pounds of food is remaining the ration qualification changes
                if (wagon.getFood() >= 1500) {
                    rations = "Filling";
                } else if (wagon.getFood() >= 1000) {
                    rations = "Meager";
                } else if (wagon.getFood() >= 5000) {
                    rations = "Bare Bones";
                } else {
                    rations = "Out of food";
                }

                // Using the rations found above determine how the health is effected
                overallHealth.healthFromFood(rations);

                wagon.setFood(wagon.getFood() - 20);

                // display to the user the overall health of the entire group
                healthBox.setText(overallHealth.generalHealth());
                foodBox.setText(Double.toString(wagon.getFood()));
                date.setText(location.whatMonth() + " " + location.getDay());
            }
        });

    }
}
