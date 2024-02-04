//Ryan Wei
//CS1400
//Assignment #2
//09/13/2023

import java.util.Scanner;

//calculates shortbread recipe
public class TaskA {
    public static void main(String[] args) {
        //set amounts according to recipe
        final double SHORTBREAD = 24; 

        final double BUTTER_GRAMS = 125;
        final double SUGAR_GRAMS = 55;
        final double FLOUR_GRAMS = 180;

        final double BUTTER_OZ = 4;
        final double SUGAR_OZ = 2;
        final double FLOUR_OZ = 6;
        
        //initialized variables and objects needed for later
        Scanner kb = new Scanner(System.in);
        double amount;
        double ratio;

        double butterGramsTotal;
        double sugarGramsTotal;
        double flourGramsTotal;

        double butterOzTotal;
        double sugarOzTotal;
        double flourOzTotal;
        
        //prompt user for amount of shortbread being made
        System.out.println("How many shortbread are you making? ");
        amount = kb.nextDouble();
        kb.nextLine();

        //recipe calculations
        ratio = amount/SHORTBREAD;

        butterGramsTotal = BUTTER_GRAMS * ratio;
        sugarGramsTotal = SUGAR_GRAMS * ratio;
        flourGramsTotal = FLOUR_GRAMS * ratio;

        butterOzTotal = BUTTER_OZ * ratio;
        sugarOzTotal = SUGAR_OZ * ratio;
        flourOzTotal = FLOUR_OZ * ratio;

        //results given to user
        System.out.println("To make " + amount + " shortbread(s), you will need: \n\t" + 
        butterGramsTotal + "g/" + butterOzTotal + "oz of butter \n" + 
        "\t" + sugarGramsTotal + "g/" + sugarOzTotal + "oz of sugar \n" + 
        "\t" + flourGramsTotal + "g/" + flourOzTotal + "oz of flour ");
        
        kb.close(); //prevents resource leak
    }
}
