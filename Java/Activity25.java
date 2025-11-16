import java.util.Random;
import java.util.Scanner;

public class Activity25 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        Random randomNumber = new Random();

        int computerValue = randomNumber.nextInt(20) + 1;
        int numberOfTries = 0;
        int guess = 0;

        System.out.println("I have picked a number between 1 and 20. Can you guess it?");

        while (guess != computerValue) {
            System.out.print("Enter your guess: ");
            guess = kbd.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 20) {
                System.out.println("Invalid input! Please enter a number between 1 and 20.");
            } else if (guess < computerValue) {
                System.out.println("Your guess is too low!");
            } else if (guess > computerValue) {
                System.out.println("Your guess is too high!");
            } else {
                System.out.println("Congratulations! You guessed it in " + numberOfTries + " tries. The number was: " + computerValue);
            }
        }

        kbd.close();
    }
}
