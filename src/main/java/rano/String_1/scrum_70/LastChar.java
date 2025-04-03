package rano.string_1.scrum_70;

public class LastChar {
    public String lastChars(String a, String b) {
        if (a.length() == 0 || b.length() == 0) {
            return "@";
        } else {
            return a.charAt(0) + "" + b.charAt(b.length() - 1);
        }
    }
}