package com.company;
import java.util.Scanner;

public class MyMain_string
{
    public static void main(String[] args)
    {
        // creating object for scanner class
        Scanner scan = new Scanner(System.in);

        //asks user for some input
        System.out.print("Please enter a word or sentence with underscores instead of spaces: ");
        String userInput = scan.next();

        //creates a variable connected to the class
        StringManipulation string1 = new StringManipulation();

        //prints the variable from manipulate class
        System.out.println(string1.manipulate(userInput));
    }
}
