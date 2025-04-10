package Aiperi.array1;

public class makeEnds {
    public int[] makeEnds(int[] nums) {
        int[] result = new int[2];
        if (nums.length < 2) {
            result[0] = nums[0];
            result[1] = nums[0];
            return result;
        }
        result[0] = nums[0];
        result[1] = nums[nums.length - 1];
        return result;
    }
}