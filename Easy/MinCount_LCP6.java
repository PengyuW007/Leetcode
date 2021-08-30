package Easy;

public class MinCount_LCP6 {
    public static void main(String[] args) {
        int coins[] = {2,3,10};
        System.out.println(minCount(coins));
    }

    public static int minCount(int[] coins) {
       int res =0;

       for(int i = 0;i<coins.length;i++){
           int item = coins[i];
           int coinI;
           if(item%2 == 0){
               //even
               res+=item/2;
           }else{
               coinI=item/2+1;
               res+=coinI;
           }
       }

       return res;
    }
}
