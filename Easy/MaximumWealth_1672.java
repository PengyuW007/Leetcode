package Easy;

public class MaximumWealth_1672 {
    public static void main(String[] args) {
        int accounts[][] = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int sum;
        int ans = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++)
                sum += accounts[i][j];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
