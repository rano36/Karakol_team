package rano.warmap1;

public class Diff21 {
    public int diff21(int n) {
        if (n > 21) {
            return (n - 21) * 2;
        } else {
            return (21 - n);
        }
    }
}