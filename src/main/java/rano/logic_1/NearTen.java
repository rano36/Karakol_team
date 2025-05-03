package rano.logic_1;

public class NearTen {
    public boolean nearTen(int num) {
        int num1 = num % 10;
        if (num1 <= 2 || num1 >= 8) {
            return true;
        } else {
            return false;
        }
    }
}
