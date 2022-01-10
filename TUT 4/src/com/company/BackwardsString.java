package com.company;
import java.util.Scanner;

public class BackwardsString
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //asks user for input
        System.out.println("Please enter a word to see it backwards: ");
        //sets input to variable
        String word = scan.next();

        //runs method to get the word backwards
        String wordBackward = backwards(word.toLowerCase());

        //prints the backwards word
        System.out.println("The word you entered backwards is: " + wordBackward);
    }

    public static String backwards(String word)
    {
        //creates a variable and keeps it blank to set the characters as the word
        String backward = "";

        //runs for loop to set the backward variable each character from word but backwards
        for(int i = word.length() - 1; i >= 0; i--)
        {
            //gets the word backwards
            backward = backward + word.charAt(i);
        }

        //returns the backwards word
        return backward;
    }
}
