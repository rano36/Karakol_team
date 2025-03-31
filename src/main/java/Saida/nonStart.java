package Saida;

public class nonStart {
    public String nonStart(String a, String b) {
        if (a.length() >=1 && b.length() >=1 ){
            return a.substring(1,a.length()).concat(b.substring(1,b.length()));
        } return a.concat(b);
    }
}
