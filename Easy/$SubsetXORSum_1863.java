package Easy;

public class $SubsetXORSum_1863 {
    public static void main(String[] args) {
        int []nums = {1,3};
        System.out.println(subsetXORSum(nums));;
    }

    public static int subsetXORSum(int[] nums) {
        int res =0;

        for(int i=0;i< nums.length;i++){
            res^=nums[i];
        }

        return res;
    }
}
