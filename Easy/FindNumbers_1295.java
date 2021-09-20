package Easy;

public class FindNumbers_1295 {
    public static void main(String[] args) {
        int nums[] = {555,901,482,1771};

        System.out.println(findNumbers2(nums));
    }

    public static int findNumbers1(int[] nums) {
        int res = 0;

        for(int i = 0;i< nums.length;i++){
            int curr = nums[i];
            int count = 0;
            while(curr>0){
                count++;
                curr/=10;
            }

            if(count%2==0){
                res++;
            }
        }

        return res;
    }

    public static int findNumbers2(int[] nums){
        int res = 0;
        String numsString[] = new String[nums.length];

        for(int i = 0;i< nums.length;i++){
            numsString[i]=String.valueOf(nums[i]);

            if(numsString[i].length()%2==0){
                res++;
            }
        }

        return res;
    }
}
