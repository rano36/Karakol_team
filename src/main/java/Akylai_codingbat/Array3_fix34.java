package Akylai_codingbat;

public class Array3_fix34 {

    public int[] fix34(int[] nums) {
        int t=0;
        for(int i=0; i< nums.length ; i++)
            for(int j=0;j<nums.length ; j++)

                if(nums[i]==4 && nums[j]==3)
                {
                    t=nums[j+1];
                    nums[j+1]=nums[i];
                    nums[i]=t;
                }
        return nums;
    }
}
