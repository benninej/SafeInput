import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    // test for getNonZeroLenString

        //String name = getNonZeroLenString(in, "Enter your name");
        // System.out.println("You entered: " + name);

        // test for getInt
        // int age = getInt(in, "Enter your age");
        // System.out.println("You entered: " + age);

        // test for getDouble
        // double gpa = getDouble(in, "Enter your GPA")
        // System.out.println("You entered: " + gpa);

        // test for getRangedInt
        int score = getRangedInt(in, "Enter your test score ", 0,100);
        System.out.println("You entered: " + score);
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

    /**
     * a method that prompts for and returns an integer value
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return an integer value
     */

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine(); // clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer: " + trash);
            }

        } while (!done);

        return retInt;
    }

    /**
     * a method that prompts for and returns a double value
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return a double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double: " + trash);
            }

        } while (!done);

        return retVal;
    }

    /**
     * a method that prompts for and returns an integer value within a specified range
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @param low the minimum acceptable value
     * @param high the maximum acceptable value
     * @return an integer value within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        boolean done = false;
        String trash = "";

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine(); // clear the buffer
                done = true;

                if (retInt < low || retInt > high)
                {
                    System.out.println("You must enter an integer between " + low + " and " + high);
                    done = false;
                }
                else
                {
                    done = true;
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer between " + low + " and " + high + "not: " + trash);
            }

        } while (!done);

        return retInt;
    }
}