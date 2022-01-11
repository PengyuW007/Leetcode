package Mid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class $MajorityElement_229 {
    public static void main(String[] args) {
        List<Integer>output;
        int nums[] = {3,2,3};
        output = majorityElement(nums);

        for (Integer integer : output) {
          System.out.println(integer);
        }
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer>output = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        int fre = nums.length/3;
        int i;
        int count = 0;
        for(i = 0;i< nums.length;i++){
            temp.add(nums[i] );
        }

        temp = temp.stream().sorted().collect(Collectors.toList());

        for(i = 1;i< temp.size();i++){
            if(temp.get(i).equals(temp.get(i - 1))){
                count++;
            }else {
                count++;
                if(count>fre){
                    System.out.println(temp.get(i-1));
                    output.add(temp.get(i-1));
                }
                count = 0;
            }
        }

        //System.out.println(output.size());

        return output;
    }
}
