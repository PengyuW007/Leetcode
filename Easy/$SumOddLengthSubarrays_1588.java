package Easy;

import java.util.ArrayList;
import java.util.List;

public class $SumOddLengthSubarrays_1588 {
    public static void main(String[] args) {
        int arr[] ={1,4,2,5,3};
        //sumOddLengthSubarrays(arr);
        System.out.println(sumOddLengthSubarrays(arr));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int res = 0;

        List<List<Integer>>list1 = subsets(arr);
        List<List<Integer>>list2 = oddSubsets(list1);


        for(int i = 0;i<list2.size();i++){
            for(int j = 0;j<list2.get(i).size();j++){
                //res+=list2.get(i).get(j);
                System.out.print(list2.get(i).get(j)+" ");
            }
            System.out.println();
        }

        return res;
    }

    private static List<List<Integer>> oddSubsets(List<List<Integer>> subsets) {
        List<List<Integer>> res = new ArrayList<>();
        int len = subsets.size();

        for (int i = 0; i < len; i++) {
            if((subsets.get(i).size())%2!=0){
                res.add(subsets.get(i));
            }
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
