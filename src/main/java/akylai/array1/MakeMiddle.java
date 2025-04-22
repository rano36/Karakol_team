package akylai.array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        if (nums.length % 2 != 0) {
            return nums;
        }
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }
}