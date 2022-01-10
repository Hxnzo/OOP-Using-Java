package com.company;

public class Question2
{
    enum Rank{ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king}

    public static void main(String[] args)
    {
        //declares variables
        Rank highCard, faceCard, card1, card2;

        //assigns value to variables
        highCard = Rank.ace;
        faceCard = Rank.queen;
        card1 = Rank.seven;
        card2 = Rank.three;

        //prints highcard variable and facecard
        System.out.println("A blackjack hand: "+ highCard.name() + " and " + faceCard.name());

        //sets the value of the number to the variable
        int card1Val = (card1.ordinal() + 1);
        int card2Val = (card2.ordinal() + 1);

        //prints the name of the two numbers and adds them up
        System.out.println("A two card hand: " + card1.name() + " and " + card2.name());
        System.out.println("Hand value: " + (card1Val + card2Val));
    }
}
