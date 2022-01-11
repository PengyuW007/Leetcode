package Easy;

public class CountKDifference_2006 {
    public static void main(String[] args) {
        int nums[] = {1,3};

        System.out.println(countKDifference(nums,3));
    }

    public static int countKDifference(int[] nums, int k) {
        int res = 0;

        for(int i = 0;i< nums.length;i++){
            for(int j = 0;j<i+1;j++){
                if(Math.abs(nums[j]-nums[i])==k){
                    res++;
                }
            }
        }

        return res;
    }
}
