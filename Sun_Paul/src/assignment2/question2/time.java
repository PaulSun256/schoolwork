/*
+========================================+
|             Assignment 2 2             |
+========================================+
|          Paul Sun, 2020/09/18          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
|  Calculates the time (hour, minute and |
|    second) from a random number that   |
|           represents seconds           |
+========================================+
*/

class Clock {
    public static void main(String[] args)  {

        // generate a random number from 99 - 5999, inclusive, and display it on the screen
        int timeSeconds = randInt(99, 5999);
        System.out.println("Seconds: " + timeSeconds);

        // converts total seconds into hours, minutes and seconds, and displays it out on the screen. This is a bit of condensed and confusing code, so I'll explain
        int seconds = timeSeconds % 60;  // we can get the seconds number by taking the remainder of time / 60
        int hours = timeSeconds / 60;    // for now, we keep hours as minutes, because we'll need this for the real minutes
                                         // this is to avoid excess calculations, because minutes depends on seconds / 60, and so do hours
        int minutes = hours % 60;        // taking the hours (still minutes) and getting it's remainder of dividing by 60 (ie, 63 mins becomes 3)
        hours = hours / 60;              // finally, we can get the real hours, by dividing. Java saves us some work by throwing away decimal in int / int division

        // here is how to do it without formatting
        // 
        // seconds = seconds / 10 + seconds % 10;
        // minutes = minutes / 10 + minutes % 10;
        // hours = hours / 10 + hours % 10;
        
        // outputs our answer. We formatted it so that it will "pad" some 0s on the left to make all numbers 2 digits long, ie 1:1:11 > 01:01:11
        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);

    }

    // inclusive random integer generator
    public static int randInt(int min, int max) {
        int randomInt = (int)(Math.random()*((max + 1) - min) + min);
        return randomInt;
    }
}