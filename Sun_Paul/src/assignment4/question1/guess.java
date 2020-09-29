/*
+========================================+
|             Assignment 4 1             |
+========================================+
|          Paul Sun, 2020/09/28          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
| Generates a random integer and lets the|
|  user guess what it is. Will also log  |
|       how many guesses they took.      |
+========================================+
*/

import java.util.Scanner;

class Guess	{
    public static void main(String[] args) {

        // declaring variables and initializing because I can
        int guessThis = randInt(1, 20), playerGuess, timesGuessed = 1;

        // prompt for initial guess to initialize while loop as well.
        System.out.println("Guess a number between 1 and 20 (inclusive): ");
        playerGuess = getInt();

        // let the player keep guessing until they get it right
        while(guessThis != playerGuess) {
            // ternary to save some lines. Tells you if you guessed low or high
            System.out.printf("Wrong! You guessed %s. Try again: ", (playerGuess > guessThis) ?  "high" : "low" );
            playerGuess = getInt();

            // increases their guess count by 1
            timesGuessed++;
        }

        // they did it!
        System.out.printf("You did it! The number was %d, and it took you %d tries.", guessThis, timesGuessed);
    }

    // inclusive random integer generator
    public static int randInt(int min, int max) {
        int randomInt = (int)(Math.random()*((max + 1) - min) + min);
        return randomInt;
    }

    // integer input, so you don't crash the code when you forget how to type
    public static int getInt(){

        Scanner scan = new Scanner(System.in);

        while(true){

            // get input
            String input = scan.nextLine();

            // tries to turn it into an int, and if it can't it tries again.
            try {
                int n = Integer.parseInt(input);
                return n;
            } catch(Exception e) {
                System.out.println("lol im not dum enter an integer: ");
            }
        }
    }
}