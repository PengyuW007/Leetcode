package Easy;

import java.util.Arrays;

public class CountBits_338 {
    public static void main(String[] args) {
        int res[]= countBits(2);

        System.out.println(Arrays.toString(res));
    }

    public static int[] countBits(int n) {
        int []res = new int[n+1];

        for(int i = 0;i<n+1;i++){
            int count = 0;
            String curr = Integer.toBinaryString(i);
            for(int j = 0;j<curr.length();j++){
                if(curr.charAt(j)=='1')
                    count++;
            }
            res[i]=count;
        }
        return res;
    }
}
