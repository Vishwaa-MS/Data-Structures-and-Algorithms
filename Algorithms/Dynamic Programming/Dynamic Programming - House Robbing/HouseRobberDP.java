public class HouseRobberDP {

    public int maxMoneyTopDown(int[] HouseNetWorth) {
        int dp[] = new int[HouseNetWorth.length];
        return maxMoneyTopDown(dp, HouseNetWorth, 0);
    }

    private int maxMoneyTopDown(int[] dp, int[] HouseNetWorth, int currentIndex) {
        if (currentIndex >= HouseNetWorth.length) {
            return 0;
        }
        if (dp[currentIndex] == 0) {
            int stealCurrent = HouseNetWorth[currentIndex] + maxMoneyTopDown(dp, HouseNetWorth, currentIndex + 2);
            int skipCurrent = maxMoneyTopDown(dp, HouseNetWorth, currentIndex + 1);
            dp[currentIndex] = Math.max(stealCurrent, skipCurrent);
        }
        return dp[currentIndex];
    }

    public int macMoneyBottomUp(int[] worth) {
        int[] dp = new int[worth.length + 2];
        dp[worth.length] = 0;
        for (int i = worth.length - 1; i >= 0; i--) {
            dp[i] = Math.max(worth[i] + dp[i + 2], dp[i + 1]);
        }
        return dp[0];  // max value is stored in the 0th index;
    }
}
