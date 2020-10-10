/*
+========================================+
|             Assignment 6 3             |
+========================================+
|          Paul Sun, 2020/10/09          |
+========================================+
|              ICS3U Ms. S               |
+========================================+
|  This takes pairs of numbers and tries |
|        to calculate pi with it.        |
+========================================+
*/

import java.util.*;

class FindPi	{
    public static void main(String[] args) {

        // getting input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter stuff:");
        int total = input.nextInt();
        int arr[] = new int[total];

        // keep on getting user input and store the numbers in the array of numbers / pairs with a for loop
        System.out.println("Please enter some integers, where the total number of them is the number you previously entered: ");
        for(int i = 0; i < total; i++)  arr[i] = input.nextInt();

        System.out.println(piCalc(arr));
    }

    // caluclate pi
    public static double piCalc(int arr[])	{

        // as usual, declare variables up here
        int a, b, normalPair = 0, coPrime = 0;

        for(int i = 0; i < arr.length - 1; i++)	{
            
            // starts at previous + 1 because we need to account for duplicates, a thing I somehow overlooked for 6 WHOLE HOURS. I hate myself.
            for(int j = i + 1; j < arr.length; j++)	{
                
                // pick the numbers for the pairs
                a = arr[i];
                b = arr[j];

                // use a method I made to check whether or not it's a co prime
                if(isNotCommon(a, b))   {
                    coPrime++;
                }

                // adds 1 to total count
                normalPair++;
            }
        }
        
        // debug stuff
        // System.out.println(coPrime);
        // System.out.println(normalPair);

        // do math
        double probablyPi = (6.0 * normalPair) / (coPrime);
        probablyPi = Math.pow(probablyPi, 0.5);

        return Math.round(probablyPi * 100000) / 100000.0;

    }


    // my method for calculating the co prime ness of 2 numbers
    public static boolean isNotCommon(int x, int y) {
        
        // find the smallest one
        int min = Math.min(x, y), max = Math.max(x, y);

        // if any number between 2 and the smallest number are equally divisible by both, then it's not a co prime and it exits the method
        for (int i = 2; i <= min; i++)  if (min % i == 0 && max % i == 0)   return false;

        // if the program gets here, it obviously means that neither share any common factors
        return true;
    }
}