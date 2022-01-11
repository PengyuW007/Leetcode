package Easy;

public class SubtractProductAndSum_1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum2(4421));
    }

    public static int subtractProductAndSum1(int n) {
        int sum = 0, product = 1;
        String newString = String.valueOf(n);
        int stringSize = newString.length();

        for (int i = 0; i < stringSize; i++) {
            int thisChar = Integer.parseInt(String.valueOf(newString.charAt(i)));
            sum += thisChar;
            product *= thisChar;
        }

        return product - sum;
    }

    public static int subtractProductAndSum2(int n) {
        int sum = 0, product = 1;
        while (n != 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return product - sum;
    }

}
