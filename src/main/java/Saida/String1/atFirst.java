package Saida.String1;

public class atFirst {
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        if (str.length() > 0) {
            return str + "@";
        } else {
            return str = "@@";
        }
    }
}
