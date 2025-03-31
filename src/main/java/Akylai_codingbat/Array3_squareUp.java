package Akylai_codingbat;

public class Array3_squareUp {
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    continue;
                }
                result[i * n + j] = n - j;
            }
        }
        return result;
    }
}
