package Easy;

import java.util.ArrayList;

public class DecompressRLElist_1313 {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3};
        int res[] = decompressRLElist(nums);

        //System.out.println("res length "+res.length);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        //get the length of the result array
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }

        int res[] = new int[len];

        ArrayList<Integer> res2 = new ArrayList<>();
        //operation
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            for (int j = 0; j < freq; j++) {
                res2.add(val);
            }

        }

        for (int i = 0; i < res2.size(); i++) {
            res[i] = res2.get(i);
        }

        return res;
    }
}
