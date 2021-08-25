package Easy;

import java.util.ArrayList;
import java.util.Comparator;

public class MaxProductDifference_1913 {
    public static void main(String[] args) {
        int nums[] = {5, 6, 2, 7, 4};

        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int res = 0;
        if (nums.length >= 4) {
            for (int i = 0; i < nums.length; i++) {
                arr.add(nums[i]);
            }//add all items from array to arraylist

            arr.sort(Comparator.naturalOrder());

            int min = arr.get(0);
            int min2 = arr.get(1);

            int max2 = arr.get(arr.size() - 2);
            int max = arr.get(arr.size() - 1);

            res = max * max2 - min * min2;
        }

        return res;
    }
}
