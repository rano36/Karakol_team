package akylai.array1;

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int run = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = run;

        return nums;
    }
}