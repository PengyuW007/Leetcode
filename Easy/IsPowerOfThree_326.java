package Easy;

public class IsPowerOfThree_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(243));
    }

    public static boolean isPowerOfThree(int n) {
        return n>0&&(Math.pow(3,19)%n)==0;
    }
}
