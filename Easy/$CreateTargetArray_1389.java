package Easy;

public class $CreateTargetArray_1389 {
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 3, 4};
        int index[] = {0, 1, 2, 2, 1};
        int res[] = createTargetArray(nums,index);
        for(int i = 0;i<nums.length;i++){
            System.out.println(res[i]);
        }
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int []res = new int[nums.length];

        for(int i = 0;i< nums.length;i++){
            res[index[i]] = nums[i];

        }

        return res;
    }

    private static void swap(int a, int b) {
        int swap;

        swap = a;
        a = b;
        b = swap;
    }
}
