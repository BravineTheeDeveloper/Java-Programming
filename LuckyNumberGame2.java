import java.util.Scanner;
public class LuckyNumberGame2 {
    public static void main(String[] args)
    {
        // Create a new Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rounds you want to play: ");
        int rounds = input.nextInt(); // Read the number of rounds from the user

        // Assume that the secret number is 7, and initialize the score to 0
        int secretNumber = 7;
        int score = 0;

        // Use a for loop to repeat the game for the specified number of rounds
        for (int i = 1; i <= rounds; i++)
        {
            // Prompt the user to enter their lucky number for the current round
            System.out.printf("Round %d: Enter your lucky number: ", i);
            int luckyNumber = input.nextInt(); // Read the user's lucky number

            // Determine the outcome of the round based on the rules specified in the problem
            if (luckyNumber % secretNumber == 0) { // If the remainder is zero, it's a draw
                System.out.println("Draw!");
                score++;
            } else if (luckyNumber % 2 == 0) { // If the number is even, it's a win
                System.out.println("You win!");
                score += 3;
            } else { // If the number is odd, it's a loss
                System.out.println("You lose!");
                score -= 3; 
            }
        }

        // Print the final score and a message indicating whether the user has won or lost
        System.out.printf("Your total score is %d.\n", score);
        if (score > 0)
        {
            System.out.println("Congratulations, you win!");
        } else
        {
            System.out.println("Sorry, you lose.");
        }

        // Close the Scanner object to release resources
        input.close();
    }
}
