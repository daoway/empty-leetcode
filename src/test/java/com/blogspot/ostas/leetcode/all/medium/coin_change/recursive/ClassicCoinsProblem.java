package com.blogspot.ostas.leetcode.all.medium.coin_change.recursive;

class ClassicCoinsProblem {
    // Returns the count of ways we can
    // sum coins[0...n-1] coins to get sum "sum"
    int count(int[] coins, int index, int sum) {
        // If sum is 0 then there is 1 solution
        // (do not include any coin)
        if (sum == 0)
            return 1;

        // If sum is less than 0 then no
        // solution exists
        if (sum < 0)
            return 0;

        // If there are no coins and sum
        // is greater than 0, then no
        // solution exist
        if (index <= 0)
            return 0;

        // count is sum of solutions (i)
        // including coins[n-1] (ii) excluding coins[n-1]
        return count(coins, index - 1, sum)
                + count(coins, index, sum - coins[index - 1]);
    }

    public int countWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (final int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        ClassicCoinsProblem solution = new ClassicCoinsProblem();
        int[] coins = { 1, 2, 5, 10, 25, 50 };
        int target = 100;
        int n = coins.length;
        var resultRecursive = solution.count(coins, n, target);
        System.out.println(resultRecursive);
        var resultDP = solution.countWays(coins,target);
        System.out.println(resultDP);
    }
}
