package rano.logic_1;

public class Love6 {
    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        } else if (a + b == 6) {
            return true;
        } else if (a - b == 6 || b - a == 6) {
            return true;
        } else {
            return false;
        }
    }
}