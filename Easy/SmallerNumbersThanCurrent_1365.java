package Easy;

import java.util.*;

public class SmallerNumbersThanCurrent_1365 {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 8};
        int res[] = smallerNumbersThanCurrent(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int res[] = new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    sum++;
                }
            }
            arr.add(sum);
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = arr.get(i);
        }

        return res;
    }
}
