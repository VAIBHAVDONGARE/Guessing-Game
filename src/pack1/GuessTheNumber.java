package pack1;
import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      int numberToGuess = rand.nextInt(100) + 1;
      int numGuesses = 0;
      
      System.out.print("Hello! What is your name? ");
      String name = input.nextLine();
      System.out.println("Hello, " + name + "! I'm thinking of a number between 1 and 100. Can you guess it?");
      
      while (true) {
         System.out.print("Enter your guess: ");
         int guess = input.nextInt();
         numGuesses++;
         
         if (guess < numberToGuess) {
            System.out.println("Too low, try again.");
         } else if (guess > numberToGuess) {
            System.out.println("Too high, try again.");
         } else {
            System.out.println("Congratulations, " + name + "! You guessed my number (" + numberToGuess + ") in " + numGuesses + " guesses.");
            break;
         }
      }
      
      input.close();
   }
}


