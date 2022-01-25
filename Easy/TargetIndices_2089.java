package Easy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TargetIndices_2089 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        List<Integer> list = targetIndices(nums, 2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }

        temp.sort(Comparator.naturalOrder());

        for (int i = 0; i < nums.length; i++) {
            if (temp.get(i) == target) {
                res.add(i);
            }
        }

        return res;
    }
}
