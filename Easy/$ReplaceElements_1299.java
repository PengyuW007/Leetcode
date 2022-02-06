package Easy;

import java.util.Arrays;

public class $ReplaceElements_1299 {
    public static void main(String[] args) {
        int arr[] = {17, 18, 5, 4, 6, 1};
        int[] res = replaceElements(arr);

        System.out.println(Arrays.toString(res));

    }

    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int curr = arr[i];
            int max = arr[i];
            for (int j = i + 1; j < len; j++) {
                max = Math.max(max, arr[j]);
            }
            if (curr != max) {
                res[i] = max;
            }
        }

        return res;
    }
}
