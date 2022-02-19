package Easy;

public class IsOneBitCharacter_717 {
    public static void main(String[] args) {
        int bits[] = {1, 1, 1, 0};

        System.out.println(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
