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
        float equation1 = (float)(Math.round((1 / 4.0 + 10 - 3 / 5.0) * 100.0) / 100.0);
        float equation2 = (float)(Math.round((Math.pow((27.3 + 0.3), 3) - (3 + 15.3) / (1.22 / 2)) / Math.sqrt(6) * 100.0) / 100.0);

        // outputs our answer
        System.out.println(equation1);
        System.out.println(equation2);
    }
}