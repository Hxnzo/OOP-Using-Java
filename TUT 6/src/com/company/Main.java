package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        //declare variables
        int num = 0;
        int right = 0;
        int wrong = 0;

        //keeps asking for input until a positive number is inputted
        while(num <= 0)
        {
            //asks for input of how many questions there will be
            System.out.println("How many questions would you like to enter (has to be a positive integer)?");
            num = scan.nextInt();

        }

        //sets the size of the array
        int key[] = new int [num];

        //creates space to organize
        System.out.println("\n\n");

        for(int i = 0; i < num; i++)
        {
            //sets the key to each index in array
            System.out.println("Enter the key to question " + (i+1));
            key[i] = scan.nextInt();
        }

        //creates space to organize
        System.out.println("\n\n");

        for(int i = 0; i < num; i++)
        {
            //asks student/user for answer to question
            System.out.println("Enter the answer to question " + (i+1));
            int answer = scan.nextInt();

            //checks if the key and answer match
            if(answer == key[i])
            {
                //adds 1 to right if the key and answer match
                right++;
            }
            else
            {
                //adds 1 to wrong if the key and answer dont match
                wrong++;
            }
        }

        //sets amount of decimal points
        DecimalFormat decPlaces = new DecimalFormat("#.##");
        //calculates percentCorrect
        float percentCorrect = (((float)right/num)*100);

        //displays the percent correct and amount right and wrong
        System.out.println("The amount of correct answers is " + right + " and the amount of wrong answers is " + wrong);
        System.out.println("the percent correct is " + decPlaces.format(percentCorrect));
    }
}
