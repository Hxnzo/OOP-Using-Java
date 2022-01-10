package com.company;
import java.util.Scanner;

public class isTriangle
{
    public static void main(String[] args)
    {
        // creating object for scanner class
        Scanner scan = new Scanner(System.in);

        //asks user for input of x and y value
        System.out.print("x1 of line 1: ");
        double line1x1 = scan.nextDouble();
        System.out.print("y1 of line 1: ");
        double line1y1 = scan.nextDouble();
        Point line1Point1 = new Point(line1x1, line1y1);
        //asks user for input of x and y value
        System.out.print("x2 of line 1: ");
        double line1x2 = scan.nextDouble();
        System.out.print("y2 of line 1: ");
        double line1y2 = scan.nextDouble();
        Point line1Point2 = new Point(line1x2, line1y2);

        //creates the first line
        Line line1 = new Line(line1Point1, line1Point2);
        //gets the length of the first line
        double line1Length = line1.getLength();

        //--------------------------------------------------------------------------

        //asks user for input of x and y value
        System.out.print("\nx1 of line 2: ");
        double line2x1 = scan.nextDouble();
        System.out.print("y1 of line 2: ");
        double line2y1 = scan.nextDouble();
        Point line2Point1 = new Point(line2x1, line2y1);
        //asks user for input of x and y value
        System.out.print("x2 of line 2: ");
        double line2x2 = scan.nextDouble();
        System.out.print("y2 of line 2: ");
        double line2y2 = scan.nextDouble();
        Point line2Point2 = new Point(line2x2, line2y2);

        //creates the second line
        Line line2 = new Line(line2Point1, line2Point2);
        //gets the length of the second line
        double line2Length = line2.getLength();

        //--------------------------------------------------------------------------

        //asks user for input of x and y value
        System.out.print("\nx1 of line 3: ");
        double line3x1 = scan.nextDouble();
        System.out.print("y1 of line 3: ");
        double line3y1 = scan.nextDouble();
        Point line3Point1 = new Point(line3x1, line3y1);
        //asks user for input of x and y value
        System.out.print("x2 of line 3: ");
        double line3x2 = scan.nextDouble();
        System.out.print("y2 of line 3: ");
        double line3y2 = scan.nextDouble();
        Point line3Point2 = new Point(line3x2, line3y2);

        //creates the third line
        Line line3 = new Line(line3Point1, line3Point2);
        //gets the length of the third line
        double line3Length = line3.getLength();

        //--------------------------------------------------------------------------



        //check if 2 lines added together is bigger than the other line
        if(line1Length < (line2Length + line3Length))
        {
            System.out.println("Triangle formation is possible");
        }
        else if (line2Length < (line1Length + line3Length))
        {
            System.out.println("Triangle formation is possible");
        }
        else if (line3Length < (line1Length + line2Length))
        {
            System.out.println("Triangle formation is possible");
        }
        //if 2 lines are smaller than 1 line then display that it is not possible
        else
        {
            System.out.println("Triangle formation is not possible");
        }

    }
}
