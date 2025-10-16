import java.util.Scanner;

public class SafeInput
{
    /**
     * a method that prompts for and returns with at leats one character
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return a nonempty String
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
