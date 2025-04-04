package rano_scrum_31;

public class Right2 {
    public String right2(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
    }
}