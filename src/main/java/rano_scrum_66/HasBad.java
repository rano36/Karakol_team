package rano_scrum_66;

public class HasBad {
    public boolean hasBad(String str) {
        if (str.length() < 3) {
            return false;
        }
        if  (str.startsWith("bad") || (str.length() > 3 && str.substring(1, 4).equals("bad"))) {
            return true;
        }
        return false;
    }
}