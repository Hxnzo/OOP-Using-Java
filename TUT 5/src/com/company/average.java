package com.company;

public class average
{
    public void average (int a, int b)
    {
        //calculates average
        float averageValue = (float)(a+b)/2;
        //displays average with 2 decimal places
        System.out.println("average is: " + String.format("%.2f", averageValue));
    }

    public void average (int a, int b, int c)
    {
        //calculates average
        float averageValue = (float)(a+b+c)/3;
        //displays average with 2 decimal places
        System.out.println("average is: " + String.format("%.2f", averageValue));
    }

    public void average (int a, int b, int c, int d)
    {
        //calculates average
        float averageValue = (float)(a+b+c+d)/4;
        //displays average with 2 decimal places
        System.out.println("average is: " + String.format("%.2f", averageValue));
    }
}
