package rano_scrum_66;

public class MiddleThree {
    public String middleThree(String str) {
        int mis = str.length() / 2;
        return str.substring(mis - 1, mis + 2);
    }
}