package asan.codingBat.warmup1;

public class SleepIn {
    public static void main(String[] args) {
        System.out.println(sleepIn(false,true));
        System.out.println(monkeyTrouble(false,true));

    }
    /*The parameter weekday is true if it is a weekday,
     and the parameter vacation is true if we are on vacation.
     We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true

     */
    public static boolean sleepIn(boolean weekday, boolean vacation){
        return !weekday || vacation;
    }


    /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate
    if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling.
    Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false

     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /*
    
     */
    public static int sumDouble(int a, int b) {
        return (a == b) ? 2 * (a + b) : a + b;
    }


}
