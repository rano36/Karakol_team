package rano.logic_1;

public class Less20 {
    public boolean less20(int n) {
        if ((n % 20 == 18 || n % 20 == 19) || (n % 40 == 38 || n % 40 == 39)) {
            return true;
        } else {
            return false;
        }
    }
}