package aiperi.warm_up1;

public class Diff21 {
    public int diff21(int n) {
        if(n <= 21)
            return 21 - n;
        return 2 * (n - 21);
    }
}