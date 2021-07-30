package Easy;

public class Decode_1720 {
    public static void main(String[] args) {
        int arr[]={1,2,3};

        System.out.println(1^2);
    }

    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] res = new int[n + 1];

        for (int i = 0; i < n+1; i++) {
            res[i]=encoded[i]^encoded[i+1];
        }

        return res;
    }
}
