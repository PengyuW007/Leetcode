package Easy;
import java.util.ArrayList;
import java.util.Comparator;

public class FindGCD_1979 {
    public static void main(String[] args) {
        int nums[] ={7,5,6,8,3};
        findGCD(nums);
    }

    public static int findGCD(int[] nums) {
        int res = 0;
        ArrayList<Integer>arr = new ArrayList<>();

        for(int i = 0;i< nums.length;i++){
            arr.add(nums[i]);
        }

        arr.sort(Comparator.naturalOrder());

        int max = arr.get(arr.size()-1);
        int min = arr.get(0);

        res = max%min;

        while(res!=0){
            res%=min;
        }

        return res;
    }
}
