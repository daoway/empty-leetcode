package com.blogspot.ostas.leetcode.all.medium.coin_change.recursive;

import java.util.Arrays;

public class CoinChangeProblem {

    public static void main(String[] args) {
        var x = countWays(100);
        System.out.println("total count : " + x);

        var x1 = countWays(100, new int[]{1, 2, 5, 10, 25, 50});
        System.out.println("total count : " + x1);

        var x2 = change(100, new int[]{1, 2, 5, 10, 25, 50});
        System.out.println("total count : " + x2);

        var x3 = countWays(100, new int[]{1, 2, 5, 10, 25, 50});
        System.out.println("total count : " + x3);
    }

    // T(n) = O(amount^coinCount)
    //naive solution with hardcoded coins
    static int countWays(int amount) {
        int count = 0;
        for (int a = 0; a <= amount; a++) {
            for (int b = 0; b <= amount / 2; b++) {
                for (int c = 0; c <= amount / 5; c++) {
                    for (int d = 0; d <= amount / 10; d++) {
                        for (int e = 0; e <= amount / 25; e++) {
                            for (int f = 0; f <= amount / 50; f++) {
                                if (a + 2 * b + 5 * c + 10 * d + 25 * e + 50 * f == amount) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
///////////////////////////////////////////////////////////////////////////////////////
    //added params coins[] but for loops is same as before
    static int countWaysX(int amount, int[] coins) {
        int count = 0;

        for (int a = 0; a <= amount / coins[0]; a++) {
            for (int b = 0; b <= amount / coins[1]; b++) {
                for (int c = 0; c <= amount / coins[2]; c++) {
                    for (int d = 0; d <= amount / coins[3]; d++) {
                        for (int e = 0; e <= amount / coins[4]; e++) {
                            for (int f = 0; f <= amount / coins[5]; f++) {
                                if (a * coins[0] + b * coins[1] + c * coins[2] + d * coins[3] + e * coins[4] + f * coins[5] == amount) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
/////////////////////////////////////////////////////////////////////
    static int countWays(int amount, int[] coins) {
        int[] coinCount = new int[coins.length];
        return countWaysHelper(amount, coins, coinCount, 0);
    }

    static int countWaysHelper(int remainingAmount, int[] coins, int[] coinCount, int index) {
        if (remainingAmount == 0) {
            return 1; // If remaining amount is 0, there is one way to make change, which is using no coins
        }

        if (remainingAmount < 0 || index == coins.length) {
            return 0; // If remaining amount is negative or we've exhausted all coins, there's no way to make change
        }

        int ways = 0;
        int maxCount = remainingAmount / coins[index];
        for (int i = 0; i <= maxCount; i++) {
            coinCount[index] = i;
            ways += countWaysHelper(remainingAmount - i * coins[index], coins, coinCount, index + 1);
        }
        return ways;
    }
///////////////////////////////////////////////////////////////////////////////////

    //https://faangmaster.medium.com/%D1%87%D0%B8%D1%81%D0%BB%D0%BE-%D1%81%D0%BF%D0%BE%D1%81%D0%BE%D0%B1%D0%BE%D0%B2-%D1%80%D0%B0%D0%B7%D0%BC%D0%B5%D0%BD%D1%8F%D1%82%D1%8C-%D0%B4%D0%B5%D0%BD%D1%8C%D0%B3%D0%B8-8c295519be35
    public static int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        }

        if (coins.length == 0) {
            return 0;
        }

        int[][] dp = new int[amount + 1][coins.length];

        //Заполняем первую строку
        Arrays.fill(dp[0], 1);

        //Заполняем первый столбец
        for (int i = 1; i <= amount; i++) {
            dp[i][0] = (i < coins[0]) ? 0 : dp[i - coins[0]][0];
        }


        //Вычисляем все остальные значения в матрице
        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j < coins.length; j++) {
                dp[i][j] = dp[i][j - 1] + ((i < coins[j]) ? 0 : dp[i - coins[j]][j]);
            }
        }

        return dp[amount][coins.length - 1];
    }

    static int coinChange(int amount, int[] coins) {
        int[][] dp = new int[coins.length + 1][amount + 1];

        // Base case: If amount is 0, there's one way to make change (using no coins)
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j < coins[i - 1]) {
                    // If the current amount is less than the coin value,
                    // then we cannot include this coin, so copy the value from the row above.
                    dp[i][j] = dp[i - 1][j];
                } else {
                    // Otherwise, the number of ways to make change includes:
                    // 1. Not using the current coin (value from the row above).
                    // 2. Using the current coin (value from the same row but with the amount reduced by the coin value).
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
                }
            }
        }

        return dp[coins.length][amount];
    }
}
