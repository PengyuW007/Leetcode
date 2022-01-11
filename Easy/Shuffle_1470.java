package Easy;

public class Shuffle_1470 {
    public static void main(String[] args) {
        int []nums = {2,5,1,3,4,7};
        int []shuffle = shuffle(nums,3);

        for(int i = 0;i< nums.length;i++){
            System.out.println(shuffle[i]);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];

        for(int i = 0;i<n;i++) {
            res[i*2]=nums[i];
            res[2*i+1] = nums[i+n];
        }

        return res;
    }
}
