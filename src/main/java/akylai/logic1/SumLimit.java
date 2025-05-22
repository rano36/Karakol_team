package akylai.logic1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        String str = Integer.toString(a + b);
        String str2 = Integer.toString(a);
        if (str2.length() == str.length()) {
            return a + b;
        } else {
            return a;
        }
    }
}