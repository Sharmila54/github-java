                 import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Define the range
        int min = 1;
        int max = 100;

        // Create an instance of the Random class
        Random random = new Random();

        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max - min + 1) + min;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + min + " and " + max);

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < min || userGuess > max) {
                System.out.println("Please enter a number within the specified range.");
            } else if (userGuess < randomNumber) {
                System.out.println("Try higher!");
            } else if (userGuess > randomNumber) {
                System.out.println("Try lower!");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number, which is " + randomNumber);
                System.out.println("Number of tries: " + numberOfTries);
            }
        }

        // Close the scanner
        scanner.close();
    }
}

             

  
