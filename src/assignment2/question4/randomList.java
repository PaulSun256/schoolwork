/*
+========================================+
|             Assignment 2 4             |
+========================================+
|          Paul Sun, 2020/09/20          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
|  Code that prints out a random element |
|   of 3 different sets of integers. I   |
|  didn't use arrays, I just configured  |
| the random generator a bit differently |
|              for each one.             |
+========================================+
*/

class RandomList	{
    public static void main(String[] args) {

        // using randInt with different mins and max to simulate a set / array of integers drawn at random
        System.out.println(randInt(1, 30));
        System.out.println(randInt(-4, 2));
        System.out.println(randInt(1, 6) * 10);
    }

    // inclusive random integer generator
    public static int randInt(int min, int max) {
        int randomInt = (int)(Math.random()*((max + 1) - min) + min);
        return randomInt;
    }
}