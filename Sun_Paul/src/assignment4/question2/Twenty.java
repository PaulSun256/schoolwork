/*
+========================================+
|             Assignment 4 2             |
+========================================+
|          Paul Sun, 2020/09/28          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
| Prints out the result of 1 - 1/2 + 1/3 |
|             - 1/4 .. - 1/20            |
+========================================+
*/

class Twenty	{
    public static void main(String[] args) {

        // initializing the sum
        double sum = 0.0;

        // we use mod 2 to find out whether or not we need to add or subtract, so if it's odd, we do sum += -1.0 / (i + 1), and addition is sum += 1.0 / (i + 1)
        // since it's one line, we don't need the braces {} and we can actually mash it on the same line too.
        for(int i = 0; i < 20; i++)     sum += (i % 2 == 0) ? 1.0 / (i + 1) : - 1.0 / (i + 1);
        
        // rounds to 4th decimal
        System.out.println(Math.round(sum * 10000) / 10000.0);
    }
}