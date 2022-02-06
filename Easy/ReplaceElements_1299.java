package Easy;

import java.util.Arrays;

public class ReplaceElements_1299 {
    public static void main(String[] args) {
        int arr[] = {400};
        int[] res = replaceElements(arr);

        System.out.println(Arrays.toString(res));

    }

    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int max = 0;
            for (int j = i + 1; j < len; j++) {
                max = Math.max(max, arr[j]);
            }
            if (i == len - 1) {
                res[i] = -1;
            } else {
                res[i] = max;
            }
        }
        return res;
    }
}
