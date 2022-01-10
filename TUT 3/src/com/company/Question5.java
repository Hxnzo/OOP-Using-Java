package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;

public class Question5
{
    public static void main(String[] args)
    {
        //allows for input
        Scanner scan = new Scanner(System.in);

        //creates a non-changable variable
        final double OUNCES_PER_POUND = 16.0;

        //declares variables
        double pricePerPound;// price per pound
        double weightOunces;// weight in ounces
        double weight1;// weight in pounds
        double totalPrice;// total price for the item

        //gets the format for decimals and money
        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat weight2 = new DecimalFormat("0.##");

        //prints
        System.out.println ("Welcome to the CS Deli!");

        //asks user for input
        System.out.print ("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        //asks user for input
        System.out.print ("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        //calculates the weight and total price
        weight1 = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight1;

        //prints everything in proper format using the $ sign and decimals
        System.out.println("\n\n***** CSDeli *****");
        System.out.println("\nUnit Price: " + money.format(pricePerPound));
        System.out.println("Weight: " + weight2.format(weight1) + " lbs");
        System.out.println("\nTotal: " + money.format(totalPrice));
        System.out.println("\n***** CSDeli *****");
    }
}
