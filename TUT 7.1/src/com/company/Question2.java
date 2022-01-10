package com.company;
import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //declares variables
        double gpa;

        do
        {
            //asks user for gpa
            System.out.println("Enter your GPA: ");
            gpa = scan.nextDouble();

            //checks if gpa is between 3.50 and 4.30
            if (gpa >= 3.50 && gpa <= 4.30)
            {
                System.out.println("Congratulations!! You made the Dean's list");
            }
            //checks if gpa is between 0 and 3.50
            else if (gpa < 3.50 && gpa >= 0)
            {
                System.out.println("Sorry you did not make the Dean's list");
            }
            //asks user to input a valid gpa if the above satements are not true
            else
            {
                System.out.println("Please enter a valid GPA\n");
            }

        }while(gpa < 0 || gpa > 4.30); //keeps asking user for a valid input

    }
}
