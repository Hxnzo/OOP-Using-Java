import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of questions: ");
        int numQuestion = scan.nextInt();

        while(numQuestion < 0)
        {
            System.out.println("Enter the number of questions (Greater than Zero): ");
            numQuestion = scan.nextInt();
        }

        TestQuestion[] questionList = new TestQuestion[numQuestion];

        for(int i = 0; i < numQuestion; i++)
        {
            System.out.println("Enter e for essay and m for multiple choice: ");
            char type = scan.next().charAt(0);

            while(type != 'e' && type != 'm' && type != 'E' && type != 'M')
            {
                System.out.println("Enter the type of question, e for essay and m for multiple choice: Enter either m or e ");
                type = scan.next().charAt(0);
            }

            if (type == 'e' || type == 'E')
            {
                questionList[i] = new Essay();
                questionList[i].readQuestion();
            }
            else if (type == 'm' || type == 'M')
            {
                questionList[i] = new MultipleChoice();
                questionList[i].readQuestion();
            }
        }

        System.out.println("The Questions are: ");

        for (int i = 0; i < numQuestion ; i++) { // Print out all the Questions

            System.out.println("\n" + questionList[i]);

        }
    }
}
