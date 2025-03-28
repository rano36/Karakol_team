package Akylai_codingbat;

public class Array3_fix45 {

    public int[] fix45(int[] nums) {
        int n;
        for (int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == 5 && nums[j] == 4){
                    n = nums[j + 1];
                    nums[j + 1] = nums[i];
                    nums[i] = n;
                }
            }
        }
        return nums;
    }
}
