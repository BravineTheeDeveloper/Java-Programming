import java.util.Scanner;

public class LuckyNumberGame {

    public static void main(String[] args) {

        // get number of rounds from user
        Scanner scanner = new Scanner(System.in);
        int numRounds = 0;
        while (numRounds <= 0) {
            System.out.print("Enter number of rounds (must be a positive integer): ");
            if (scanner.hasNextInt()) {
                numRounds = scanner.nextInt();
                if (numRounds <= 0) {
                    System.out.println("Error: Number of rounds must be a positive integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a positive integer.");
                scanner.next(); // consume invalid input
            }
        }

        int secretNumber = 7; // arbitrary secret number

        int totalScore = 0; // initialize score to zero

        //The for loop repeats the game for the specified number of rounds
        for (int x = 1; x <= numRounds; x++) {
            System.out.print("Enter lucky number for round " + x + ": ");
            int luckyNumber = scanner.nextInt();

            int remainder = luckyNumber % secretNumber;

            if (remainder == 0) {
                System.out.println("Draw for round " + x);
                totalScore++;
            } else if (remainder % 2 == 0) {
                System.out.println("Win for round " + x);
                totalScore += 3;
            } else {
                System.out.println("Loss for round " + x);
                totalScore -= 3;
            }
        }

        // check if player wins
        if (totalScore > 0) {
            System.out.println("Congratulations, you win! Total score: " + totalScore);
        } else {
            System.out.println("Sorry, you lose. Total score: " + totalScore);
        }

        // close scanner
        scanner.close();
    }

}