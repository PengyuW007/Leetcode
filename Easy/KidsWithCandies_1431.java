package Easy;

import java.util.ArrayList;
import java.util.List;
public class KidsWithCandies_1431 {
    public static void main(String[] args) {
        int []candies = {12,1,12};
        List<Boolean>kids = new ArrayList<>();
        kids = kidsWithCandies(candies,10);

        for(int i =0;i<kids.size();i++){
            System.out.println(kids.get(i));
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean>kids = new ArrayList<>();
            ArrayList<Integer>can = new ArrayList<>();
            int max = candies[0];

            for(int i = 0;i<candies.length;i++){
                can.add(candies[i]);
            }//add array to arraylist

            for(int i = 1;i<can.size();i++){
                max = Math.max(max,candies[i]);
            }

            for(int i = 0;i<can.size();i++){
                if(can.get(i)+extraCandies>=max){
                    kids.add(true);
                }else{
                    kids.add(false);
                }
            }

            return kids;
    }
}
