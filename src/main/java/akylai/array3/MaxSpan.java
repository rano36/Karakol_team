package akylai.array3;

public class MaxSpan {

    public int maxSpan(int[] nums) {
        int maxSpan = 0;
        for (int i = 0; i < nums.length; i++) {
            int first = i;
            int last = i;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    last = j;
                }
            }
            int span = last - first + 1;
            if (span > maxSpan) {
                maxSpan = span;
            }
        }
        return maxSpan;
    }
}