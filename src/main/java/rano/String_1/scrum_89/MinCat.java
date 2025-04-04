package rano.string_1.scrum_89;

public class MinCat {
    public String minCat(String a, String b) {
        if (a.length() > b.length()) {
            return b.substring(b.length() - a.length()) + a;
        } else if (a.length() < b.length()) {
            return a + b.substring(b.length() - a.length());
        }
        return a + b;
    }
}