import java.util.Scanner;

class Essay extends TestQuestion
{
    private int blankSpaces;

    @Override
    void readQuestion()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of Blank Spaces: ");
        blankSpaces = scan.nextInt();

        while(blankSpaces < 0)
        {
            System.out.println("Enter the number of Empty Lines (1 or more): "); // Error Checking
            blankSpaces = scan.nextInt();
        }

        System.out.println("Enter the Question:"); // Ask user to enter question
        scan.nextLine(); // What does this do?

        testQuestion = scan.nextLine();
    }

    public String printQuestion()
    {
        // Print out the Question
        String str = testQuestion;

        for(int i = 0; i < blankSpaces; i++)
        {
            str += "\n";
        }

        return str;
    }
}