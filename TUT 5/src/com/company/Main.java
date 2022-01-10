package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //instance variable for class
        average calcAverage = new average();

        //declare variable
        int amount = 0;

        //runs only if the amount is between 2-4
        while(amount < 2 || amount > 4)
        {
            System.out.println("How many integers will you be getting the average of (2-4): ");
            amount = scan.nextInt();
        }

        //runs if 2 integers are entered
        if(amount == 2)
        {
            //asks user for the integers
            System.out.println("Please enter your first int value: ");
            int num1 = scan.nextInt();
            System.out.println("Please enter your second int value: ");
            int num2 = scan.nextInt();

            //calculates average from the average class
            calcAverage.average(num1,num2);
        }
        //runs if 3 integers are entered
        else if(amount == 3)
        {
            //asks user for the integers
            System.out.println("Please enter your first int value: ");
            int num1 = scan.nextInt();
            System.out.println("Please enter your second int value: ");
            int num2 = scan.nextInt();
            System.out.println("Please enter your third int value: ");
            int num3 = scan.nextInt();

            //calculates average from the average class
            calcAverage.average(num1,num2,num3);
        }
        //runs if 4 integers are entered
        else if(amount == 4)
        {
            //asks user for the integers
            System.out.println("Please enter your first int value: ");
            int num1 = scan.nextInt();
            System.out.println("Please enter your second int value: ");
            int num2 = scan.nextInt();
            System.out.println("Please enter your third int value: ");
            int num3 = scan.nextInt();
            System.out.println("Please enter your fourth int value: ");
            int num4 = scan.nextInt();

            //calculates average from the average class
            calcAverage.average(num1,num2,num3,num4);
        }
    }
}
