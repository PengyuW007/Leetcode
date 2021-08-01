package Easy;

public class Decode_1720 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};

        int decoded[]= decode(arr,1);
        for (int i=0;i<decoded.length;i++){
            System.out.println(decoded[i]);
        }

    }

    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] decode = new int[n + 1];

        decode[0] = first;
        for (int i = 1; i < n + 1; i++) {
            decode[i] = encoded[i - 1] ^ decode[i - 1];
        }

        return decode;
    }
}
