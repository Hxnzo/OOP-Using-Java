package com.company;
import java.util.Scanner;

public class Question2TUT4
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //asks user for input
        System.out.println("Please enter a word to see if it is a palindrome: ");
        //sets input to variable
        String word = scan.next();

        //runs method to see if it is a palindrome or not
        System.out.println(palindrome(word.toLowerCase()));
    }

    public static boolean palindrome(String word)
    {
        //declares variables
        int front = 0;
        int back = word.length() - 1;

        //runs while the back is greater than the front
        while (back > front)
        {
            //sets the char variable as the first variable from the word
            char frontChar = word.charAt(front++);
            //sets the char variable as the last variable from the word and keeps checking variable until
            // the front dn back meet in the middle
            char backChar = word.charAt(back--);

            //if the characters are not the same then it is not a palindrome
            if (frontChar != backChar)
            {
                return false;
            }
        }

        //if it is a palindrome then returns true
        return true;
    }
}
