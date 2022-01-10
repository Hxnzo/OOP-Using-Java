import java.util.Scanner;

public class Strings
{
    public static void main (String[] args)
    {
        //declares variables
        String[] stringList;
        int size;

        //create scanner for input
        Scanner scan = new Scanner (System.in);

        //prompt user to input amount of words they will be entering
        System.out.print ("\nHow many words do you want to sort? ");
        size = scan.nextInt();
        stringList = new String[size];

        //prompt user to enter the words
        System.out.println ("\nEnter the words: ");
        for (int i = 0; i < size; i++)
        {
            //store words in array
            stringList[i] = scan.next();
        }

        //sends the array and size to sorting class and runs algorithm to sort words
        Sorting.insertionSort(stringList, size);

        //displays output of words after sorting
        System.out.println ("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
        {
            System.out.print(stringList[i] + "  ");
        }

        System.out.println ();
    }
}



