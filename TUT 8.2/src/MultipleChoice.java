import java.util.Scanner;

class MultipleChoice extends TestQuestion
{
    public int AmountChoices;
    public String[] choices;

    @Override
    public void readQuestion()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of choices: "); //prompt user to input num of choices
        int AmountChoices = scan.nextInt();

        while(AmountChoices < 0)
        {
            System.out.println("Enter the amount of choices (1 or more): "); //Error Checking
            AmountChoices = scan.nextInt();
        }

        System.out.println("Enter the Question:"); // Ask user to enter the question
        scan.nextLine();

        testQuestion = scan.nextLine(); // uses variable testQuestion from TestQuestion.java/ Super Class to store question

        choices = new String[AmountChoices];

        for(int i = 1; i < AmountChoices + 1; i++)
        {
            // Ask user to enter multiple choice questions choices
            System.out.print("Now Enter choice number " + (i) + ": ");
            choices[i - 1] = scan.nextLine();
        }
    }

    public String printQuestion()
    {
        String str = testQuestion + "\n";
        char displayCharacter = 'a';

        for(int i = 0; i < choices.length; i++)
        {
            //Print With formatting and labeling
            str += ("\t" + Character.toString((char) (displayCharacter + i)) + ") " + choices[i] + "\n");
        }

        return str;
    }
}