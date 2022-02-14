package Easy;

import java.util.Arrays;

public class MaxProduct_1464 {
    public static void main(String[] args) {
        int []nums = {1,5,4,5};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
