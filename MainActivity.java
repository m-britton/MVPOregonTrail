package com.example.mvpfororegontrail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RandomEvents re = new RandomEvents();
    Health overallHealth = new Health();
    Wagon wagon = new Wagon();
    Location location = new Location(0, 1, 1, 200, 100, 300);
    Shop rmv = new Shop();

    String rations = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView display = findViewById(R.id.Display);
        final Button nextDay = findViewById(R.id.button);
        final TextView date = findViewById(R.id.Date);
        final TextView foodBox = findViewById(R.id.foodRemaining);
        final TextView healthBox = findViewById(R.id.healthBox);
        final TextView reBox = findViewById((R.id.REbox));
        final Button enter = findViewById(R.id.enter);
        



        nextDay.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                /* Location based classes that happen everytime a button is clicked.
                    Every button click adds 1 day and changes months if appropriate.
                    checks if the player has reached a river, town, or landmark.
                    Decreases distance of player form river, town, and landmarks.
                */
                location.incrementDay();
                location.setDistanceToLandmark(location.getDistanceToLandmark() - 20);
                location.setDistanceToRiver(location.getDistanceToRiver() - 20);
                location.setDistanceToTown(location.getDistanceToTown() - 20);


                location.atLandmark();


                //Displays a message if the person is at a town
                if(location.getAtTown())
                {
                    display.setText("You are at town " + location.whatTown());
                }
                if(location.getAtRiver())
                {
                    display.setText("You are at a river");
                }
                if(location.getAtLandmark())
                {
                    display.setText("You are at " + location.whatLandmark());
                }


                // restore 10 percent of the total health for resting over night
                overallHealth.startOfDayHealth();

                /* Find whether or not a random event occurs each day.
                    If someone gets bit by a snake the overall health goes up by 10
                    If Indians help you find food the amount of food goes up 8 pounds
                    If you take the wrong trail you have to back track using vital supplies
                    If a random event takes place a prompt appears for the user to see what happened
                 */
                if(re.snakeBite()){
                    overallHealth.addHealth(10);
                    reBox.setText("You got bit by a snake");
                }
                else if(re.indiansHelpFindFood()){
//                    Wagon.setFood(Wagon.getFood() + 8);
                    reBox.setText("Indians helped you find food");
                }
                else if(re.wrongTrail()) {

                    reBox.setText("OH-NO you took the wrong trail");
                }
                else {
                    reBox.setText("It was a normal day!");
                }

                //Depending on how many pounds of food is remaining the ration qualification changes
                if(wagon.getFood() >= 1500){
                    rations = "Filling";
                }
                else if(wagon.getFood() >= 1000){
                    rations = "Meager";
                }
                else if(wagon.getFood() >= 5000){
                    rations = "Bare Bones";
                }
                else{
                    rations = "Out of food";
                }

                // Using the rations found above determine how the health is effected
                overallHealth.healthFromFood(rations);

                wagon.setFood(wagon.getFood() - 20);

                // display to the user the overall health of the entire group
                healthBox.setText(overallHealth.generalHealth());
                foodBox.setText("oibujbvuio");
                date.setText(location.whatMonth() + " " + location.getDay());
            }
        });

    }
}
