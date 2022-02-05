package Easy;

public class DiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        int len = mat.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || i + j == len - 1) {
                    res+=mat[i][j];
                }
            }
        }

        return res;
    }
}
