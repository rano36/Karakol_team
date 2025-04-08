package rano.String_1;

public class MiddleTwo {
    public String middleTwo(String str) {
        int n = str.length();
        int mid = n / 2;
        return str.substring(mid - 1, mid + 1);
    }
}