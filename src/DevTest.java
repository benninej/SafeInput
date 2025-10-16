import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    // test for getNonZeroLenString

        String name = DevTest.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);
    }
    // Code for the library methods goes here to be tested
    // the is copied or moved to SafeInput.

    /**
     * a method that prompts for and returns with at leats one character
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return a string response with at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // init return string

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();

            if (retString.isEmpty())
            {

                System.out.println("You must enter at least one character");
            }

        } while (retString.isEmpty());
        return retString;
    }
}