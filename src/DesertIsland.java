import java.util.Scanner;

public class DesertIsland
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Creating a String array of 10 options
        String[] options = {"1. computer", "2. dog", "3. piano", "4. money", "5. phone", "6. shoes", "7. bike", "8. boat", "9. matches", "10. books"};

        // Generating a new int array with 10 integer elements
        int[] userDecisions = new int[10];


        // Checking if user tries to input more than the choices
        System.out.println("Please make 10 choices between the options listed below 😄");

        // Printing out all elements of array on program run
        for (String option: options)
        {
            System.out.println(option);
        }

        System.out.println('\n');


        // People
        for (int userInputNumber = 0; userInputNumber < 10; userInputNumber++)
        {
            int inputNumber = scanner.nextInt();

            // Logging user input number (subtracting 1 to avoid user from having to type 0 for first index)
            userDecisions[inputNumber - 1]++;
        }


        // Most popular choice
        for (int i = 0; i < options.length; i++)
        {
            System.out.println(options[i]);
            System.out.println(userDecisions[i]);
            System.out.println();
        }


        // Logging most popular choice
        int mostPopularChoice = 0;
        int mostPopularChoiceValue = 0;

        for (int i = 0; i < userDecisions.length; i++)
        {
            if(userDecisions[i] > mostPopularChoiceValue)
            {
                mostPopularChoice = userDecisions[i];
            }
        }
        System.out.println("The most popular choice is " + options[mostPopularChoice]);
    }
}
