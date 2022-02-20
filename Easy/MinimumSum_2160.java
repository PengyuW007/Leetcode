package Easy;

import java.util.Arrays;

public class MinimumSum_2160 {
    public static void main(String[] args) {
        System.out.println(minimumSum1(4009));

    }

    public static int minimumSum1(int num){
        int[] intArr = new int[4];
        for (int i = 0 ;i< 4;i++){
            intArr[i] = num % 10;
            num /=10;
        }Arrays.sort(intArr);

        intArr = swap(intArr, 1, 2);

        return intArr[0] * 10 + intArr[1] + intArr[2] * 10 + intArr[3];
    }

    public static int minimumSum2(int num) {
        String numStr = num + "";

        int intArr[] = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            intArr[i] = (int) numStr.charAt(i) - 48;
        }
        Arrays.sort(intArr);

        intArr = swap(intArr, 1, 2);

        return intArr[0] * 10 + intArr[1] + intArr[2] * 10 + intArr[3];
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
