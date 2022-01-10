package com.company;

import java.util.Locale;

public class StringManipulation
{
    public static String manipulate(String userInput)
    {
        //create a blank string to store the changed input
        String changed = "";

        //creates an array of all the words inputted
        String checkUnderscore[] = userInput.split("_");

        for(int i = 1; i < checkUnderscore.length; i++)
        {
            //makes first letter capital for every word after the underscores
            String firstLetter = checkUnderscore[i].substring(0, 1).toUpperCase();
            //the rest of the words are then placed into another variable
            String remainingLetters = checkUnderscore[i].substring(1);

            //put both variables together to get everything after the first word
            changed = changed + firstLetter + remainingLetters;
        }

        if(checkUnderscore.length > 1)
        {
            //if there is more than 1 word then it changes to this by adding the first word in front of it
            changed = checkUnderscore[0] + changed;
        }
        else if(checkUnderscore.length == 1)
        {
            //if there is only one word then it capitalises the first letter and prints the rest
            changed = userInput.substring(0,1).toUpperCase() + userInput.substring(1);
        }

        //returns changed input
        return changed;
    }

}
