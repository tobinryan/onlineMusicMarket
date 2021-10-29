package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        //region Variable Declaration

        double percussionTotal = 0.0;
        double stringTotal = 0;
        double brassTotal = 0;
        double woodwindTotal = 0;
        double miscTotal = 0;
        //creating variables to track the price of each section

        //endregion

        //region Output and Menu

        System.out.println("Welcome to Lyric's Music Store!");
        System.out.println("Navigate through the menu by selecting an option's number.");
        System.out.println("We have a variety of instruments and products, which of the following " +
                          "would you like to view?");

        menuMethod(percussionTotal, stringTotal, brassTotal, woodwindTotal, miscTotal);
        //calling the menu method

        //endregion

    }

    public static void menuMethod(double percussionTotal, double stringTotal, double brassTotal, double woodwindTotal,
                                  double miscTotal)
    {

        //region Scanner

        Scanner input = new Scanner(System.in);
        //creating a new scanner

        System.out.println("1. Percussion  2. String  3. Brass  4. Woodwinds  5. Miscellaneous 6. Checkout");

        int menu = input.nextInt();

        //endregion

        if (menu == 1)
        {

            System.out.println("Here are the percussion instruments: ");
            System.out.println("1. Drums ($120.50) 2. Tambourine ($35.00) 3. Piano ($19,999.00) " +
                    "4. Xylophone ($10.99) 5. Triangle ($3.59) 6. Return");

            double[] percussionPrices = {125.50, 35.00, 19999.00, 10.99, 3.59, 0.00};
            //creating an array with the prices

            int percussionChoice = input.nextInt();
            //accepting an int as input

            percussionTotal += percussionPrices[percussionChoice-1];
            //adding the price of the selected option

            menuMethod(percussionTotal, stringTotal, brassTotal, woodwindTotal, miscTotal);
            //calling the menu method to return to the main menu

        }
        else if (menu == 2)
        {

            System.out.println("Here are the string instruments: ");
            System.out.println("1. Violin ($1200.00)  2. Viola ($1100.00)  3. Cello ($1550.00)" +
                    "  4. Harp ($5000.00) 5. Guitar ($465.50) 6. Return");

            double[] stringPrices = {1200.00, 1100.00, 1550.00, 5000.00, 460.50, 0.00};
            //creating an array with the prices

            int stringChoice = input.nextInt();
            //accepting an int as input

            stringTotal += stringPrices[stringChoice-1];
            //adding the price of the selected option

            menuMethod(percussionTotal, stringTotal, brassTotal, woodwindTotal, miscTotal);
            //calling the menu method to return to the main menu

        }
        else if (menu == 3)
        {

            System.out.println("Here are the brass instruments: ");
            System.out.println("1. Tuba ($999.99)  2. Trumpet ($1300.00) 3. Saxophone ($730.99) 4. Trombone ($980.00) " +
                               "5. Flugelhorn ($100.00) 6. Return");

            double[] brassPrices = {999.99, 1300.00, 730.99, 980.00, 100.00, 0.00};
            //creating an array with the prices

            int brassChoice = input.nextInt();
            //accepting an int as input

            brassTotal += brassPrices[brassChoice-1];
            //adding the price of the selected option

            menuMethod(percussionTotal, stringTotal, brassTotal, woodwindTotal, miscTotal);
            //calling the menu method to return to the main menu

        }
        else if (menu == 4)
        {

            System.out.println("Here are the woodwind instruments: ");
            System.out.println("1. Flute ($600.00)  2. Oboe ($350.79)  3. Clarinet ($200.50)  4. Picoolo ($350.00)" +
                                "  5. Recorder ($99.89) 6. Return");

            double[] woodwindPrices = {600.00, 350.79, 200.50, 350.00, 99.89, 0.00};
            //creating an array with the prices

            int woodwindChoice = input.nextInt();
            //accepting an int as input

            woodwindTotal += woodwindPrices[woodwindChoice-1];
            //adding the price of the selected option

            menuMethod(percussionTotal, stringTotal, brassTotal, woodwindTotal, miscTotal);
            //calling the menu method to return to the main menu

        }
        else if (menu == 5)
        {

            System.out.println("Here are the miscellaneous items: ");
            System.out.println("1. Guitar Pick ($3.99) 2. Violin/Viola Bow ($72.50)  3. Cello Bow ($89.90)" +
                                " 4. Drum sticks ($17.80) 5. Rosin ($9.99) 6. Return");

            double[] miscPrices = {3.99, 72.50, 89.90, 17.80, 9.99, 0.00};
            //creating an array with the prices

            int miscChoice = input.nextInt();
            //accepting an int as input

            miscTotal += miscPrices[miscChoice-1];
            //adding the price of the selected option

            menuMethod(percussionTotal, stringTotal, brassTotal, woodwindTotal, miscTotal);
            //calling the menu method to return to the main menu

        }
        else if (menu == 6)
        {

            System.out.println("Thank you for shopping at Lyrics's!");
            System.out.print("Your total price, with 8% tax and $20 packaging, is: $");

            System.out.println(priceCalculator(percussionTotal, stringTotal, brassTotal, woodwindTotal, miscTotal));
            //printing and calling the priceCalculator method using the price variables

        }
        else
        {
            System.out.println("Invalid response. Please choose a number.");
        }

    }

    public static double priceCalculator(double percussionTotal, double stringTotal, double brassTotal, double woodwindTotal,
                                         double miscTotal)
    {

        double totalPrice = percussionTotal + stringTotal + brassTotal + woodwindTotal + miscTotal;
        //adding all the prices together to get the total price

        totalPrice *= 1.08;
        //sales tax

        totalPrice += 20.00;
        //packaging price

        double finalPrice = (int) (totalPrice*100) / 100.00;
        //rounding the price to two decimals

        return finalPrice;
        //returning the double to the method

    }
}
