/*
+========================================+
|            Assignment 2 1a             |
+========================================+
|          Paul Sun, 2020/09/18          |
+========================================+
|               ICS3U Ms.S               |
+========================================+
| Calculates the minimum number of coins |
|  needed to represent a certain amount  |
|                of money.               |
+========================================+
*/

// follow me on github because i want followers
// https://github.com/PaulSun256/

class Money {
    public static void main(String[] args)  {

        // calculating a random number of cents
        int amount = randInt(10, 100);
        int money = amount;                            // our output format will need to have the original value as well as the calculated value.
                                                       // to stop recalculating by adding bigger formulas for each coin, we just save 2 copies, to save computing power
        amount = (int) Math.ceil(amount / 5.0) * 5;    // dividing by 5 and rounding up, then multiplying by 5 is the same as rounding to the next highest 5.
                                                       // this is because this requires us to have an extra nickel for remaining money
        int quarters = amount / 25;                    // dividing this amount by the corresponding values of coins, in decending order to have the lowest number of coins
        amount -= quarters * 25;
        int dimes = amount / 10;
        amount -= dimes * 10;
        int nickels = amount / 5;
        amount -= nickels * 5;
        
        // outputs our answer
        System.out.println("Money    Quarter    Dimes    Nickels");
        System.out.println("  " + money + "       " + quarters + "           " + dimes + "         " + nickels);
    }

    // inclusive random integer generator
    public static int randInt(int min, int max) {
        int randomInt = (int)(Math.random()*((max + 1) - min) + min);
        return randomInt;
    }
    
}
