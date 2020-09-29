/*
+========================================+
|             Assignment 4 3             |
+========================================+
|          Paul Sun, 2020/09/28          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
|    Checks whether or not an integer    |
|  entered by the user is a prime number |
|                 or not.                |
+========================================+
*/

import java.util.Scanner;

class Prime	{
    public static void main(String[] args) {

        // get user input and initialize variables
        System.out.println("Enter an integer: ");
        int userInt = getInt();
        boolean isNotPrime = false;

        // anything less than or equal to 3 is prime, so don't even bother running them through this loop, things might malfunction
        // if it is bigger, then chech whether it can divide neatly into any number between itself / 2 and 2
        if(userInt > 3) for(int i = 2; i < userInt / 2; ++i)	{
            if(userInt % i == 0)	{
                isNotPrime = true;
                break;
            }
        }
        
        // of course, 1 isn't a prime, so we change that here
        if(userInt == 1)	isNotPrime = true;

        // tells the user whether or not it is prime
        System.out.println((!isNotPrime ? "Yes, it's prime." : "No, it's not prime."));

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