package Easy;

import java.util.*;
import java.util.List;

public class $LuckyNumbers_1380 {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> res = luckyNumbers(matrix);

        System.out.println(res.get(0));

    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer>res = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            int min = 0;
            int col = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                min = Math.min(min,matrix[i][j]);
            }

            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]==min){
                    col = j;
                }
            }
            max = Math.max(matrix[i][col],max);
        }

        res.add(max);
        return res;
    }
}
