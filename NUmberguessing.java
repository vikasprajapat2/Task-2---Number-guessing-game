import java.util.Scanner;

public class NUmberguessing {
 
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
 
        int number = 1 + (int)(100* Math.random());

        int A = 5;
 
        int i, guess;
 
        System.out.println("Guessing the number" + " 1 to 100." + "Guess the number" + " 5 Attempts.");
 
        for (i = 0; i < A; i++) {
 
           System.out.println("Guess the number:");
 
            guess = sc.nextInt();
 
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess
                     && i != A - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess
                     && i != A - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
 
        if (i == A) {
            System.out.println( "You have exhausted" + " A trials.");
 
            System.out.println("The number was " + number);
        }
    }
 
    public static void main(String[] args)
    {
 
        guessingNumberGame();
    }
}