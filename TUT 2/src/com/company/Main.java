package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        //Didnt say to use classes so i did not use them!
        Scanner inputScan = new Scanner (System.in);

        //Question 1:
        double x = 32;
        double y = 8;

        System.out.println("A) " + Math.sqrt(y));
        System.out.println("B) " + Math.pow(x,y));
        System.out.println("C) x = " + Math.log10(x) + "\ty = " + Math.log10(y));
        System.out.println("D) x = " + Math.pow(x,2) + "\ty = " + Math.pow(y,2));

        //Question 2
        double radius;
        double surfaceArea;
        double volume;

        System.out.println("\nEnter a radius value for SurfaceArea and Volume: ");
        radius = inputScan.nextDouble();

        surfaceArea = (4*Math.PI*(Math.pow(radius, 3)))/3;
        volume = 4*Math.PI*(Math.pow(radius,2));

        System.out.println("The SurfaceArea is: " + surfaceArea);
        System.out.println("The Volume is: " + volume);

        //Question 3
        Random generator = new Random();

        int num;

        num = generator.nextInt((25) + 1);
        System.out.println("\nRandom Number 1: " + num);
        num = generator.nextInt((25) + 1);
        System.out.println("Random Number 2: " + num);
        num = generator.nextInt((25) + 1);
        System.out.println("Random Number 3: " + num);
        num = generator.nextInt((25) + 1);
        System.out.println("Random Number 4: " + num);
        num = generator.nextInt((25) + 1);
        System.out.println("Random Number 5: " + num);
        num = generator.nextInt((25) + 1);
        System.out.println("Random Number 6: " + num);
        num = generator.nextInt((25) + 1);
        System.out.println("Random Number 7: " + num);

    }
}
