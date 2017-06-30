/*
 * My name is Elijah Gonzales and this program is of my own
 * This program demonstrates the random method for a guessing game
 */
import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    public static void main(String[] args) {

        Random rand = new Random(); // Imported Random number generator
        int randomNumber = rand.nextInt(1000); // Produces 1 through 1000 ! 0
        Scanner input = new Scanner(System.in);
        int numberOfGuesses = 0; // Sets number of guesses to 0
        int lowNumber = 1; // Sets original low number to 1
        int highNumber = 1000; // Sets original high humber to 1000
        int guess = 0; // Initializes guess variable to use in while statement

        // Keeps program in loop until correct answer is given
        while (guess != randomNumber) {
            System.out.println("Guess a number between " + lowNumber + " and "
                    + highNumber + ".");
            guess = input.nextInt();
            numberOfGuesses++; // Adds 1 each guess

            if (guess == randomNumber) { // Checks for correct answer
                System.out.println("Correct! The number was " + randomNumber + "."
                        + " It took you only " + numberOfGuesses + " guesses.");
            } else if (guess < randomNumber) { // Answer to low
                System.out.println("HIGHER");
                lowNumber = ++guess;
            } else if (guess > randomNumber) { // Answer to high
                System.out.println("LOWER.");
                highNumber = --guess;
            }
        }
    }
}
