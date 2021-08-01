package Easy;

public class MaxProductDifference_1913 {
    public static void main(String[] args) {
            int nums[]={5,6,2,7,4};

        System.out.println(maxProductDifference(nums));
    }

    public static int maxProductDifference(int[] nums) {
        int res = 0;
        int now;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        now = nums[i] * nums[j] - nums[k] * nums[l];
                        if (now > res) {
                            res = now;
                        }
                    }
                }
            }
        }

        return res;
    }
}
