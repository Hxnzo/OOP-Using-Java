package com.company;

public class Line
{
    // instance variables
    private Point pointA;
    private Point pointB;

    //sets the point values from point class to the instance variables
    public Line(Point point1, Point point2)
    {
        //set values to variables
        pointA = point1;
        pointB = point2;
    }

    /*
        did not add setters and getters for line class since they are never called
    */

    // method to calculate distance of a line
    public double getLength()
    {
        return Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2) + Math.pow(pointB.getY() - pointA.getY(), 2));
    }

}
