package Easy;

public class HammingDistance_461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y;//detect different bits

        //use this counter to count the number of bits are different
        while (xor != 0) {
            count += xor & 1;
            xor >>= 1;
        }

        return count;
    }
}
