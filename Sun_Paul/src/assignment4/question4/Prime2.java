/*
+========================================+
|             Assignment 4 4             |
+========================================+
|          Paul Sun, 2020/09/28          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
|  Modified the prime program to display |
|  the prime numbers between 2 different |
|                numbers.                |
+========================================+
*/

import java.util.Scanner;

class Prime2	{
    public static void main(String[] args) {
        
        // prompts for the 2 integers
        System.out.println("Enter 2 different integers (in ascending order) separated by a new line: ");
        int start = getInt(), finish = getInt();

        System.out.println("Here are the integers between those 2 that are prime: ");

        // tests if any of the integers in between are prime, and if they are, it prints out the number, or says it's not.
        for(int i = start; i < finish + 1; ++i)	{
            System.out.println(isPrime(i) ? i + " is prime" : i + " is not prime");
        }
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

    // determines if a number is prime
    public static boolean isPrime(int userInt) {
        
        // if any of the numbers are 4, 0, or 1, it tells that it's not prime. This is because my code to see if they are prime doesn't actually use the proper method
        if(userInt == 4 || userInt == 0 || userInt == 1) return false;

        // check if the number can divide evenly into any of the numbers between 2 and half of itself. ++i because it increments i and then passes it to the function, rather than passing i then incrementing it
        if(userInt > 3) for(int i = 2; i < userInt / 2; ++i)	{
            if(userInt % i == 0)	{
                return false;
            }
        }

        return true;
    }
}