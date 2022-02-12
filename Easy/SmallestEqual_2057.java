package Easy;

public class SmallestEqual_2057 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,5,2};
        System.out.println(smallestEqual(nums));
    }

    public static int smallestEqual(int[] nums) {
        int res = -1;

        for(int i = 0;i< nums.length;i++){
            if(i%10==nums[i]){
                res=i;
                break;
            }
        }
        return res;
    }
}
