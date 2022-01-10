import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //declares variables
        int val;
        int sum = 0;

        //creates scanner for input
        Scanner scan = new Scanner(System.in);

        //declare variable
        String line;

        //prompt user for input
        System.out.println("Enter a line of text");

        //checks if user entered something
        Scanner scanLine = new Scanner(scan.nextLine());

        //runs while user has entered something
        while (scanLine.hasNext()) {
            //try statement to check for any words when running
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
            //catches error
            catch (NumberFormatException ne) {
            }
        }

        //displays output
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
