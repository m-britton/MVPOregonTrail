/**
*Name:
*
*
*
*
*
*/



public class Shop {

public boolean buying = true;

    public double food_Price = 0.00;
    public double clothing_Price = 0.00;
    public double weapons_Price = 0.00;
    public double oxen_Price = 0.00;
    public double spareWagonWheel_Price = 0.00;
    public double spareWagonAxel_Price = 0.00;
    public double spareWagonTongues_Price = 0.00;
    public double medicalSupplyBox_Price = 0.00;
    public double sewingKit_Price = 0.00;
    public double fireStartingKit_Price = 0.00;
    public double kidsToys_Price = 0.00;
    public double familyKeepsakes_Price = 0.00;
    public double seedPackeges_Price = 0.00;
    public double shovels_Price = 0.00;
    public double cookingItems_Price = 0.00;

    public String otherinput;
    public String output = "";



    public double total_Price = food_Price + clothing_Price + weapons_Price +
            oxen_Price + spareWagonWheel_Price + spareWagonAxel_Price + spareWagonTongues_Price +
            + medicalSupplyBox_Price + sewingKit_Price + fireStartingKit_Price + kidsToys_Price +
            familyKeepsakes_Price + seedPackeges_Price + shovels_Price + cookingItems_Price;



    public String storeLayout() {


        String title = "Matt's General Store" + "\n" +
                "Independence, Missouri" + "\n" +
                "March 1, 1848" + "\n" +
                "                           ";

        String food = "1. Food: $" + food_Price;
        String clothing = "2. Clothing: $" + clothing_Price;
        String weapons = "3. Weapons: $"+  weapons_Price;
        String oxen = "4. Oxen: $" + oxen_Price;
        String spareWagonWheel = "5. Spare Wagon Wheel: $" + spareWagonWheel_Price;
        String spareWagonAxel = "6. Spare Wagon Axel: $" + spareWagonAxel_Price;
        String spareWagonTongues = "7. Spare Wagon Tongues: $" + spareWagonTongues_Price;
        String medicalSupplyBox = "8. Medical Supply Box: $" + medicalSupplyBox_Price;
        String sewingKit = "9. Sewing Kit: $" + sewingKit_Price;
        String fireStartingKit = "10. Fire Starting Kit: $" + fireStartingKit_Price;
        String kidsToys = "10. Fire Starting Kit: $" + fireStartingKit_Price;
        String familyKeepsakes = "11. Family Keepsakes: $" + familyKeepsakes_Price;
        String seedPackeges = "12. Seed packeges: $" + seedPackeges_Price;
        String shovels = "13. Shovels: $" + shovels_Price;
        String cookingItems = "14. Cooking items: $" + cookingItems_Price;

        String prompt = "What would you like to buy?";


        output = title + "\n" + food + "\n" + clothing + "\n" + weapons + "\n" + oxen + "\n" +
                spareWagonWheel + "\n" + spareWagonAxel + "\n" + spareWagonTongues + "\n" +
                medicalSupplyBox +"\n" + sewingKit + "\n" + fireStartingKit+ "\n" + kidsToys
                + "\n" + familyKeepsakes + "\n" + seedPackeges + "\n" + shovels + "\n"
                + cookingItems + "\n" + prompt;

        return output;
    }



    public double calcBoughtItem(String categoryRequest, int inputNumber){

        double number = 0;
        buying = true;

        if (categoryRequest.equals("Food") || categoryRequest.equals("1")){

            food_Price = food_Price + (.10 * inputNumber);

            //Must add .10 coffee, .02 flour, .05 bacon

            number = food_Price;

        } else if(categoryRequest.equals("Clothing") || categoryRequest.equals("2")){

            clothing_Price = clothing_Price + (.2 * inputNumber);

            number = clothing_Price;

        } else if(categoryRequest.equals("Weapons") || categoryRequest.equals("3")){

            weapons_Price = weapons_Price + (20 * inputNumber);

            //Must add $20 rifle, $10 shotgun, $5 shots/bullets.

            number = weapons_Price;

        } else if(categoryRequest.equals("Oxen") || categoryRequest.equals("4")){

            oxen_Price = oxen_Price + (50 * inputNumber);

            number = oxen_Price;

        } else if(categoryRequest.equals("Spare Wagon Wheel") || categoryRequest.equals("5")){

            spareWagonWheel_Price = spareWagonWheel_Price + (8 * inputNumber);

            number = spareWagonWheel_Price;

        } else if(categoryRequest.equals("Spare Wagon Axel") || categoryRequest.equals("6")){

            spareWagonAxel_Price = spareWagonAxel_Price + (3 * inputNumber);

            number = spareWagonAxel_Price;

        }else if (categoryRequest.equals("Spare Wagon Tongues") || categoryRequest.equals("7")){

            spareWagonTongues_Price = spareWagonTongues_Price + (3 * inputNumber);

            number = spareWagonTongues_Price;

        }else if (categoryRequest.equals("Medical Supply Box") || categoryRequest.equals("8")){

            medicalSupplyBox_Price = medicalSupplyBox_Price + (1.50 * inputNumber);

            number = medicalSupplyBox_Price;

        }else if (categoryRequest.equals("Sewing Kit") || categoryRequest.equals("9")){

            sewingKit_Price = sewingKit_Price + (0.50 * inputNumber);

            number = sewingKit_Price;

        }else if (categoryRequest.equals("Fire Starting Kit") || categoryRequest.equals("10")){

            fireStartingKit_Price = fireStartingKit_Price + (0.25 * inputNumber);

            number = fireStartingKit_Price;

        }else if (categoryRequest.equals("Kids Toys") || categoryRequest.equals("11")){

            kidsToys_Price = kidsToys_Price + (0.05 * inputNumber);

            number = kidsToys_Price;

        }else if (categoryRequest.equals("Family Keepsakes") || categoryRequest.equals("12")){

            familyKeepsakes_Price = 0;

            number = familyKeepsakes_Price;

        }else if (categoryRequest.equals("Seed packeges") || categoryRequest.equals("13")){

            seedPackeges_Price = seedPackeges_Price + (0.01 * inputNumber);

            number = seedPackeges_Price;

        }else if (categoryRequest.equals("Shovels") || categoryRequest.equals("14")){

            shovels_Price = shovels_Price + (2.50 * inputNumber);

            number = shovels_Price;

        }else if (categoryRequest.equals("Cooking items") || categoryRequest.equals("15")){

            cookingItems_Price = cookingItems_Price + (1.50 * inputNumber);

            //$1 Coffee Mill, $1.50 frying pan, 0.25 cents pan

            number = cookingItems_Price;

        }

        storeLayout();
        return number;

    }


    public String buyItem(String userInput) {

        buying = false;
        otherinput = userInput;

        String input = "Nothing";

        if (userInput.equals("Food") || userInput.equals("1")) {

            input = "You are buying food. Food is: .10 coffee, .02 flour, .05 bacon per pd. " +
                    " How much do you want to buy: ";


        } else if (userInput.equals("Clothing") || userInput.equals("2")) {

            input = "You are buying clothes. Clothes are 20 cents. " +
                    "How much do you want to buy:";

        } else if (userInput.equals("Weapons") || userInput.equals("3")) {

            input = "You are buying Weapons. Rifle: $20, Shotgun: $10, Shots: $5. " +
                    "What weapons do you want to buy and how many: ";
        }else if (userInput.equals("Oxen") || userInput.equals("4")) {

            input = "You are buying Oxen. Oxen: $50. " +
                    "How many do you want to buy: ";

        } else if (userInput.equals("Spare Wagon Wheel") || userInput.equals("5")) {

            input = "You are buying a Spare Wagon Wheel. Spare wagon wheel: $8 each. " +
                    "How many do you want to buy: ";

        } else if (userInput.equals("Spare Wagon Axel") || userInput.equals("6")) {

            input = "You are buying a Spare Wagon Axel. Spare wagon axel: $3 each. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Spare Wagon Tongues") || userInput.equals("7")) {

            input = "You are buying a Spare Wagon Tongues. Spare wagon tongues: $3 each. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Medical Supply Box") || userInput.equals("8")) {

            input = "You are buying a Medical Supply Box. Medical supply box: $1.50 each. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Sewing Kit") || userInput.equals("9")) {

            input = "You are buying a Sewing Kit. Medical supply box: 0.50 cents each. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Fire Starting Kit") || userInput.equals("10")) {

            input = "You are buying a Fire Starting Kit. Fire starting kit: 0.25 cents each. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Kids Toys") || userInput.equals("11")) {

            input = "You are buying Kids Toys. Kids toys: 0.05 cents each. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Family Keepsakes") || userInput.equals("12")) {

            input = "You are buying Family Keepsakes. JK they are FREEEEE";

        } else if (userInput.equals("Seed packeges") || userInput.equals("13")) {

            input = "You are buying Seed Packeges. Seed packeges: 0.01 cents per packet. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Shovels") || userInput.equals("14")) {

            input = "You are buying Shovels. Shovels: $2.50 each. " +
                    "How any do you want to buy: ";

        } else if (userInput.equals("Cooking items") || userInput.equals("15")) {

            input = "You are buying Cooking items. Cooking items: $1 Coffee Mill, $1.50 frying pan, 0.25 cents pan. " +
                    "How any do you want to buy: ";

        } else {

            input = "This doesn't exist";
        }

        return input;

    }



}
