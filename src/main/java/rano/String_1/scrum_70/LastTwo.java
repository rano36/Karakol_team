package rano.string_1.scrum_70;

public class LastTwo {
    public String lastTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        String start = str.substring(0, str.length() - 2);
        String lastTwoSwapped = str.charAt(str.length() - 1) + "" + str.charAt(str.length() - 2);
        return start + lastTwoSwapped;
    }

}
