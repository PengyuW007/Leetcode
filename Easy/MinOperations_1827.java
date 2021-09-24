package Easy;

public class MinOperations_1827 {
    public static void main(String[] args) {
        int nums[] = {1, 5, 2, 4, 1};
        System.out.println(minOperations(nums));
    }

    public static int minOperations(int[] nums) {
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
            temp[i] = max++;
            //System.out.println(max);
        }

        System.out.println();
        for (int i = maxIndex+1; i < nums.length; i++) {
            res += temp[i] - nums[i]+1;
            //System.out.println(i+" "+res);
        }

        return res;
    }
}
