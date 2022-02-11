package Easy;

import java.util.Arrays;
public class ArrayPairSum_561 {
    public static void main(String[] args) {
        int sum[] = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(sum));
    }

    public static int arrayPairSum(int[] nums) {
        int res = 0;

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i += 2) {
            res += Math.min(nums[i], nums[i - 1]);
        }

        return res;
    }
}
