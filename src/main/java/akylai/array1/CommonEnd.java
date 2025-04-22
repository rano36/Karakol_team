package akylai.array1;

public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        if (a.length < 1 && b.length < 1) {
            return false;
        }
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }
}