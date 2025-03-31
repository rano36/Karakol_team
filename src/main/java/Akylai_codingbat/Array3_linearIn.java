package Akylai_codingbat;

public class Array3_linearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0, j = 0;
        while (i < outer.length && j < inner.length) {
            if (outer[i] == inner[j]) {
                j++;
            }
            i++;
        }
        return j == inner.length;
    }
}
