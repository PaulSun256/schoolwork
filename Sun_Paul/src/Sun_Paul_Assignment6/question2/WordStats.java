/*
+========================================+
|             Assignment 6 2             |
+========================================+
|          Paul Sun, 2020/10/09          |
+========================================+
|              ICS3U Ms. S               |
+========================================+
| Takes a line from the input and returns|
|  how many words and average letter per |
|                  word.                 |
+========================================+
*/
import java.util.*;

class WordStats	{
    public static void main(String[] args) {
        // input, obviously
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String str = input.nextLine().trim();

        wordStats(str);
    }

    // prints out information about the series of words
    public static void wordStats(String str)	{
        int wordCount = 1;
        for(int i = 0; i < str.length(); i++)	if(str.charAt(i) == ' ') wordCount++; // find wordcount from number of spaces after trimming (in main)
        
        // str = str.replaceAll("\\p{Punct}", "");    i forgot we didn't need to replace punctuation :pepega:

        double averageChar = str.replace(" ", "").length() / (wordCount * 1.0);

        System.out.printf("Total number of words:  %d\nAverage chars per word: %.1f", wordCount, averageChar);
    }
}