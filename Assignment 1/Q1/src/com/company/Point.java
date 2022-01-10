package com.company;

public class Point
{
    // declare instance variables
    private double pointX;
    private double pointY;

    //sets the inputs from the user to the instance variables
    public Point(double xVal, double yVal)
    {
        pointX = xVal;
        pointY = yVal;
    }

    //setter and getter for x value
    public double getX()
    {
        return pointX;
    }
    public void setX(double xVal)
    {
        pointX = xVal;
    }

    //setter and getter for y value
    public double getY()
    {
        return pointY;
    }
    public void setY(double yVal)
    {
        pointY = yVal;
    }
}
