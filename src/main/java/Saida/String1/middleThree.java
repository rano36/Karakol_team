package Saida.String1;

public class middleThree {
    public String middleThree(String str) {
        int midIndex = str.length() / 2;
        return str.substring(midIndex - 1, midIndex + 2);
    }
}
