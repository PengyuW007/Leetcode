package Easy;

public class MinOperationsToMakeArraySumDivisibleByK_3512 {
    public static void main(String[] args) {
        int[]nums = {3,9,7};

        System.out.println(minOperations(nums,5));
    }
    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum % k;
    }
}
