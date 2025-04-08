package rano.String_1;

public class MiddleTwo {
    public String middleThree(String str) {
        int mis = str.length() / 2;
        return str.substring(mis - 1, mis + 2);
    }
}
