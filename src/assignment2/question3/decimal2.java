/*
+========================================+
|             Assignment 2 3             |
+========================================+
|          Paul Sun, 2020/09/19          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
|       Calculates the result of 2       |
|  predetermined equations, available on |
|          the assignment sheet.         |
+========================================+
*/

class Equations {
    public static void main(String[] args) {

        // calculate the result of the equations, and rounds them to the nearest 100th
        float equation1 = (float)(1 / 4.0 + 10 - 3 / 5.0);
        float equation2 = (float)((Math.pow((27.3 + 0.3), 3) - (3 + 15.3) / (1.22 / 2)) / Math.sqrt(6));

        // outputs our answer
        System.out.printf("%4.2f \n", equation1);
        System.out.printf("%4.2f \n", equation2);
    }
}