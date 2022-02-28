package Easy;

public class CountNegatives_1351 {
    public static void main(String[] args) {
        int[][] grid = {{1, -1}, {-1, 1}, {2, 3}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            int j = grid[i].length - 1;
            while (j > -1) {
                if (grid[i][j] < 0)
                    count++;
                j--;
            }
        }
        return count;
    }
}
