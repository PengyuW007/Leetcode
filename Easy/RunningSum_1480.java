package Easy;

public class RunningSum_1480 {
    public static void main(String[] args) {
        int nums[] = {3,1,2,10,1};

        int res []= runningSum(nums);
        for(int i = 0;i< res.length;i++){
            System.out.println(res[i]);
        }
    }

    public static int[] runningSum(int[] nums) {
        //dynamic programming
         for(int i = 1;i< nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }





}
