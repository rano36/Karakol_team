package rano.String_1;

public class FrondAgain {
    public boolean frontAgain(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2).equals(str.substring(str.length() - 2));
        } else {
            return false;
        }
    }
}
