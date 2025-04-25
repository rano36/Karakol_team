package saida.string1;

public class hasBad {
    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.startsWith("bad", 0)
                || str.startsWith("bad", 1)) {
            return true;
        } else return false;
    }
}
