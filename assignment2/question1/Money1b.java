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
class Money {
    public static void main(String[] args)  {
        int amount = randInt(10, 100);
        int money = amount;
        amount = (int) Math.ceil(amount / 5.0) * 5;
        int quarters = amount / 25;
        amount -= quarters * 25;
        int dimes = amount / 10;
        amount -= dimes * 10;
        int nickels = amount / 5;
        amount -= nickels * 5;
        
        System.out.println("Money    Quarter    Dimes    Nickels");
        System.out.println("  " + money + "       " + quarters + "           " + dimes + "         " + nickels);
    }

    public static int randInt(int min, int max) {
        int randomInt = (int)(Math.random()*((max + 1) - min) + min);
        return randomInt;
    }
    
}
