package Easy;

import java.util.HashMap;

public class SortedTwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int res[] = twoSum(nums,6);
        for(int i=0;i<2;i++){
            System.out.println(res[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int res [] = new int[2];
        int left = 0;
        int right = nums.length - 1;

        HashMap<Integer,Integer>num = new HashMap<>();
        for(int i=0;i< nums.length;i++){
            num.put(i,nums[i]);
        }

        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                res[0]=left;
                res[1]=right;
                break;
            }

            if(sum<target){
                left++;
            }else{
                right--;
            }

        }
        return res;
    }
}
