/* 10. Number Guessing Game 
• Objective: Implement loops and conditional logic. 
• Task: Create a game where the user guesses a randomly generated number. 
• Instructions: 
o Generate a random number between 1 and 100. 
o Prompt the user to guess the number. 
o Provide feedback if the guess is too high or too low. 
o Continue until the user guesses correctly.  */

import java.util.*;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        System.out.println("== Number Guessing Game ==");
        System.out.println("Guess a number between 1 and 100");
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        } while (guess != secretNumber);
        sc.close();
    }
}
