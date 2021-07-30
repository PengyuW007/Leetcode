package Easy;

public class GetConcatenation_1929 {
    public static void main(String[] args) {
        int []nums = {1,3,2,1};

        int []ans=getConcatenation(nums);

        for(int i= 0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int []ans = new int[2*n];

        for(int i = 0;i<2* n;i++){
            ans[i]=nums[i%n];
        }

        return ans;
    }
}
