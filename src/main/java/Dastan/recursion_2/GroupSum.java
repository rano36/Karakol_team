package Dastan.recursion_2;

public class GroupSum {
    public boolean groupSum(int start, int[] nums, int target) {
        if (start == nums.length) {
            return target == 0;
        }
        boolean include = groupSum(start + 1, nums, target - nums[start]);
        boolean exclude = groupSum(start + 1, nums, target);

        return include || exclude;
    }
}