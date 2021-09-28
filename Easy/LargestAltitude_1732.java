package Easy;

public class LargestAltitude_1732 {
    public static void main(String[] args) {
        int[]gain = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain));
    }

    public static int largestAltitude(int[] gain) {
        int highest = 0,curr=0;

        for (int i = 0; i < gain.length; i++) {
            curr+=gain[i];
            if(curr>highest){
                highest = curr;
            }
        }

        return highest;
    }
}
