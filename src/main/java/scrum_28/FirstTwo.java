package scrum_28;

public class FirstTwo {
    public String firstTwo(String str) {
        if (str.length() < 2){
            return str;
        }
        else {
            return str.substring (0,2);
        }
    }
}