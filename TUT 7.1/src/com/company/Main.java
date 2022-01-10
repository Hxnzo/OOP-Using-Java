package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //asks user for x value
        System.out.println("Please enter an x value: ");
        int x = scan.nextInt();
        //asks user for y value
        System.out.println("Please enter an y value: ");
        int y = scan.nextInt();
        //asks user for z value
        System.out.println("Please enter an z value: ");
        int z = scan.nextInt();

        //checks if x>y>z
        if(x > y && y > z)
        {
            //prints x if statement is true
            System.out.println(x);
        }
        //checks if x and y are less than 0
        else if(x < 0 && y < 0 && x != y)
        {
            //prints values if x and y are less than 0
            System.out.println(x + " " + y);
        }
        //checks if x and y are greater than 0
        else if(x > 0 && y > 0 && x != y)
        {
            //prints x and y if they are greater than 0
            System.out.println(x + " " + y);
        }
        //checks if x and y are equal to each other but not equal to z
        else if(x == y && y != z)
        {
            //prints if above statement is true
            System.out.println(x + " " + y + " " + z);
        }
        else
        {
            System.out.println("\nNone of the statements are true");
        }
    }
}
