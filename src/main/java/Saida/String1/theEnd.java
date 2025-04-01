package Saida.String1;

public class theEnd {
    public String theEnd(String str, boolean front) {
        if (str.length() > 0 && front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
}
