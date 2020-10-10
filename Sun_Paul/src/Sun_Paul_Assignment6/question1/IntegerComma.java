/*
+========================================+
|             Assignment 6 1             |
+========================================+
|          Paul Sun, 2020/10/08          |
+========================================+
|              ICS3U Ms. S               |
+========================================+
| Gets integer input as single line, and |
|    calculates the sum, the smallest    |
| value, checks if they are all even, is |
| an arithmetic progression, and whether |
|   it can be sorted into an arithmetic  |
|              progression.              |
+========================================+
*/

import java.util.*;

class IntegerComma	{
    public static void main(String[] args) {

        // declaring variables and getting user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some integers, but you need to separate them with a comma");
        String temp = input.nextLine();
        
        int numbers[] = toArray(temp), numSorted[] = toArray(temp); 
        // the reason we don't actually sort numSorted here, is because min() sorts it for us, which means having 2 copies works fine.
        // this also lets use reuse the isArithmetic method.

        // outputs the results of the calculations
        System.out.println("Minimum value is " + min(numSorted));
        System.out.println("Sum is " + sum(numbers));
        System.out.println((isAllEven(numbers) ? "All of the values are even numbers" : "Not all of the numbers are even numbers"));
        System.out.println((isArithmetic(numbers) ? "Yes it is an arithmetic sequence" : "No it is not an arithmetic sequence"));
        System.out.println((isArithmetic(numSorted) ? "The numbers can be rearranged to form an arithmetic sequence" : "The numbers cannot be rearranged to form an arithmetic sequence"));

    }

    // converts the string into an array, bc it's pretty bulky code to do so
    public static int[] toArray(String str)	{
        str = str.replace(" ", "");
        int length = 1;                                                                     // for loops stop one before the last character so we start at 1 not 0

        for(int i = 0; i < str.length(); i++)	if(str.charAt(i) == ',')    length++;
        
        // create arrays
        int intArray[] = new int[length];
        String strArray[] = str.split(",", 0);

        // fill integer array by parsing the elements in the string array
        for(int i = 0; i < length; i++)	intArray[i] = Integer.parseInt(strArray[i]);

        return intArray;
    }

    // finds sum of all elements
    public static int sum(int arr[])	{
        int total = 0;

        // adds up all of the elements
        for(int i = 0; i < arr.length; i++)	{
            total += arr[i];
        }

        return total;
    }

    // sorts array (this is important for arithmetic check) and returns lowest value (index 0)
    public static int min(int arr[])	{
        Arrays.sort(arr);
        return arr[0];
    }

    // If the remainder of division by 2 is 1, then it's odd and we return false, so the method stops.
    // Otherwise, the for loop finishes, and that means that they are all even.
    public static boolean isAllEven(int arr[])	{
        for(int i = 0; i < arr.length; i++)	{
            if(arr[i] % 2 == 1) return false;
        }
        return true;
    }

    // Functions can modify arrays values, so we can clone an array, pass it through min() which sorts it for us! 
    // This means that we don't need another method, and can save some typing by just having 2 copies of the array instead of 2 methods
    public static boolean isArithmetic(int arr[])	{

        // uncomment the line below to get the couldBeArithmetic() method.
        //Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 0; i < arr.length - 1; i++)	{
            if(diff != arr[i + 1] - arr[i])	return false;
        }
        return true;
    }

}