/*
+========================================+
|             Assignment 4 5             |
+========================================+
|          Paul Sun, 220/09/29           |
+========================================+
|               ICS3U Ms.S               |
+========================================+
|  This shows all the factors of a prime |
|          number (user input).          |
+========================================+
*/

import java.util.Scanner;

class PrimeFactor	{
    public static void main(String[] args) {

        // initialize and get user input
        System.out.println("Please enter an integer: ");
        int userInt = getInt();
        
        System.out.printf("The prime factors of %d are: \n", userInt);
        
        // gets rid of the 2 s in the number
        while(userInt % 2 == 0) {
            System.out.println(2);
            userInt /= 2;
        }

        // now that they are odd, we try to find the other primes
        // This works, because it removes all occurences of the odd numbers.
        // Example: Let's try getting rid of 35, it's not divisible by
        // 3, but it is by 5, 7 times, but instead of printing 5, 7 times, it stops because it only goes up to the square root of 35, and 7 isn't divisible by 5 (35 / 5)
        for(int i = 3; i <= Math.sqrt(userInt); i += 2) {
            while(userInt % i == 0) {
                System.out.println(i);
                userInt /= i;
            }
        }

        // this last part is for the remaining prime number.
        if(userInt > 2)	System.out.println(userInt);
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