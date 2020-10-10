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
        Scanner input = new Scanner(System.in);
        System.out.println("Enter stuff:");
        int total = input.nextInt();
        int arr[] = new int[total];

        for(int i = 0; i < total; i++)  arr[i] = input.nextInt();

        System.out.println(arr.length);
        
        System.out.println(piCalc(arr));
    }

    // caluclate pi
    public static double piCalc(int arr[])	{

        int a, b, normalPair = 0, coPrime = 0;

        for(int i = 0; i < arr.length - 1; i++)	{
            for(int j = i + 1; j < arr.length; j++)	{
                
                a = arr[i];
                b = arr[j];

                if(isNotCommon(a, b))   {
                    coPrime++;
                }
                normalPair++;
            }
        }

        System.out.println(coPrime);
        System.out.println(normalPair);

        double probablyPi = (6.0 * normalPair) / (coPrime);
        probablyPi = Math.pow(probablyPi, 0.5);
        return Math.round(probablyPi * 100000) / 100000.0;

    }

    public static boolean isNotCommon(int x, int y) {
        int min = Math.min(x, y), max = Math.max(x, y);

        for (int i = 2; i <= min; i++)  if (min % i == 0 && max % i == 0)   return false;
        return true;
    }
}