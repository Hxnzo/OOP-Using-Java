package com.company;
import java.util.Random;


public class Question3
{
    public static void main(String[] args)
    {
        //creates random generator
        Random generator = new Random();

        //sets random number between 1-6
        int die1 = generator.nextInt((6) + 1);
        int die2 = generator.nextInt((6) + 1);

        //displays what two numbers were randomly set and then adds them up
        System.out.println("You rolled two dice!");
        System.out.println("Dice 1: " + die1);
        System.out.println("Dice 2: " + die2);
        System.out.println("The total is: " + (die1 + die2));
    }
}
