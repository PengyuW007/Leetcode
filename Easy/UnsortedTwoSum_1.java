package Easy;

import java.util.HashMap;

public class UnsortedTwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] res = twoSum(nums, 6);
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            temp.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int op = target - nums[i];

            if (temp.containsKey(op) && temp.get(op) != i) {
                res[0] = i;
                res[1] = temp.get(op);
                break;
            }
        }

        return res;
    }
}
