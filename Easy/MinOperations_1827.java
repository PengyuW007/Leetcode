package Easy;

public class MinOperations_1827 {
    public static void main(String[] args) {
        int nums[] = {7,4,2,8,1,7,7,10};
        System.out.println(minOperations2(nums));
    }

    public static int minOperations1(int[] nums) {
        int res = 0;
        int max = 0, maxIndex = 0;
        int temp[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = maxIndex + 1; i < nums.length; i++) {
            max++;
            temp[i] = max;
        }

        for (int i = maxIndex + 1; i < nums.length; i++) {
            res += (temp[i] - nums[i]);
        }

        return res;
    }

    public static int minOperations2(int[] nums){
        if (nums.length == 1){
            return 0;
        }
        int operations = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i-1]){
                operations += (nums[i-1] + 1 - nums[i]);
                nums[i] = nums[i-1] + 1;
            }
        }

        return operations;
    }

}
