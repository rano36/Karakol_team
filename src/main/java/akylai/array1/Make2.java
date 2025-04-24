package akylai.array1;

public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] ab = new int[2];
        int index = 0;
        for (int i = 0; i < a.length; i++)
            if (index < 2) {
                ab[index] = a[i];
                index++;
            }
        for (int i = 0; i < b.length; i++)
            if (index < 2) {
                ab[index] = b[i];
                index++;
            }
        return ab;
    }
}