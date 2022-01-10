package com.company;

public class Main
{
    enum Directions {North, South, West, East}

    public static void main(String[] args)
    {
        //prints what is written in quotations
        System.out.println("Question 1:\n");

        //declares  variables
        Directions dir1, dir2, dir3, dir4;

        //sets value to variables
        dir2 = Directions.South;
        dir3 = Directions.West;

        //prints value, ordinal and name of both variables
        System.out.println("The value of dir2 is: " + dir2);
        System.out.println("The ordinal of dir2 is: " + dir2.ordinal());
        System.out.println("The name of dir2 is: " + dir2.name());

        System.out.println("The value of dir3 is: " + dir3);
        System.out.println("The ordinal of dir3 is: " + dir3.ordinal());
        System.out.println("The name of dir3 is: " + dir3.name());
    }
}
