package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //asks user for input
        System.out.println("Please enter a base integer: ");
        //sets input to variable
        int base = scan.nextInt();

        //asks user for input
        System.out.println("Please enter the exponent(positive int) you want the base raised to: ");
        //sets input to variable
        int exp = scan.nextInt();

        //runs method power
        int answer = power(base, exp);

        System.out.println("the base " + base + " raised to exp " + exp + " is: " + answer);
    }

    public static int power(int base, int exp)
    {
        //checks if the exp is 0 and returns 1 if it is
        if(exp == 0)
        {
            return 1;
        }
        else
        {
            //multiplies the base by the base to the power exp-1
            return base * power(base, exp-1);
        }
    }
}
