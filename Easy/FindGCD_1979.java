package Easy;
import java.util.ArrayList;
import java.util.Comparator;

public class FindGCD_1979 {
    public static void main(String[] args) {
        int nums[] ={2,5,6,9,10};
        System.out.println(findGCD2(nums));;
    }

    public static int findGCD1(int[] nums) {
        int reminder;
        ArrayList<Integer>arr = new ArrayList<>();

        for(int i = 0;i< nums.length;i++){
            arr.add(nums[i]);
        }

        arr.sort(Comparator.naturalOrder());

        int max = arr.get(arr.size()-1);
        int min = arr.get(0);

        while(min!=0){
            reminder=max%min;
            max = min;
            min = reminder;
        }

        return max;
    }

    public static int findGCD2(int []nums){
        int res = 0;
        ArrayList<Integer>arr = new ArrayList<>();

        for(int i = 0;i< nums.length;i++){
            arr.add(nums[i]);
        }

        arr.sort(Comparator.naturalOrder());

        int max = arr.get(arr.size()-1);
        int a = max;
        int min = arr.get(0);
        int b = min;

        for(int i = min;i>=1;i--){
            if(a%i==0&&b%i==0){
                res =i;
            }
        }
        return res;
    }
}
