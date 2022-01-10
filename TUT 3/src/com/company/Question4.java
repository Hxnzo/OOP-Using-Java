package com.company;
import java.util.Scanner;


public class Question4
{
    public static void main(String[] args)
    {
        //allows to get input
        Scanner scan = new Scanner(System.in);

        //declares variables
        double x1, y1, x2, y2; // coordinates of two points
        double total;

        // Read in the two points
        System.out.print ("Enter the coordinates of the first point (put a space between them): ");
        x1 = scan.nextDouble();
        y1 =scan.nextDouble();

        System.out.print ("Enter the coordinates of the second point: (put a space between them):");
        x2 =scan.nextDouble();
        y2 =scan.nextDouble();

        //calculate the total distance
        total = Math.sqrt((Math.pow((x1-x2), 2)) + (Math.pow(y1-y2,2)));

        //print  the total distance
        System.out.println("The distance between the points is: " + total);
    }
}
