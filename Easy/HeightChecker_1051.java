package Easy;

import java.util.Arrays;

public class HeightChecker_1051 {
    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int count = 0;

        int[] temp = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }
}
