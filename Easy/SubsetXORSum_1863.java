package Easy;

import java.util.List;
import java.util.ArrayList;

public class SubsetXORSum_1863 {
    public static void main(String[] args) {
        int[] nums = {5, 1, 6};
        System.out.println(subsetXORSum(nums));

    }

    public static int subsetXORSum(int[] nums) {
        int res = 0;
        int count = subsets(nums).size();
        List<List<Integer>> sub = subsets(nums);

        for (int i = 0; i < count; i++) {
            int xor = 0;
            for (int j = 0; j < sub.get(i).size(); j++) {
                xor ^= sub.get(i).get(j);
            }
            res += xor;
        }

        return res;
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }
}
