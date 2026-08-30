package Mid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class $ThreeSum_15 {
    public static void main(String[] args) {
        int[]nums = {-1,0,1,2,-1,-4};
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>>res = new ArrayList<>();
        ArrayList<Integer>temp = new ArrayList<>();
        HashMap<Integer,Integer>map = new HashMap<>();

        for (int i = 0;i<nums.length;i++) {
            temp.add(nums[i]);
            map.put(nums[i],i);
        }

        for(int i = 0;i< temp.size();i++){
            int pivot = -nums[i];
            for(int j = i+1;j<temp.size();j++){
                int op = pivot-temp.get(j);
                if(map.containsKey(op)&&map.get(op)!=j){
                    res.get(i).add(nums[i]);
                    res.get(i).add(j);
                    res.get(i).add(map.get(op));
                    break;
                }
            }
        }
        return res;
    }
}
