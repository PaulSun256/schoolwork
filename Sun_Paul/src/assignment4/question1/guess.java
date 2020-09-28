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
        Scanner input = new Scanner(System.in);
        int guessThis = randInt(1, 20), playerGuess, timesGuessed = 0;
        System.out.println("Guess a number between 1 and 20 (inclusive): ");
        playerGuess = getInt();
        while(guessThis != playerGuess) {
            System.out.println("Wrong! Try again: ");
            playerGuess = getInt();
            timesGuessed++;
        }
        System.out.printf("You did it! The number was %d, and it took you %d tries.", guessThis, timesGuessed);
        input.close();
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
            String input = scan.nextLine();
            try {
                int n = Integer.parseInt(input);
                return n;
            } catch(Exception e) {
                System.out.println("lol im not dum enter an integer: ");
            }
        }
    }
}