package com.blogspot.ostas.leetcode.all.medium.coin_change;

import java.util.Arrays;

/*
      322. coin change

https://leetcode.com/problems/coin-change

You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.

*/
class Solution {

    /*
    We will create an array dp
    of size target + 1 to store the minimum number of coins required to make up each target amount
    from 0 to the given target. We will initialize all elements of dp to a value greater than the target
    amount itself.
    We will iterate through each target amount from 1 to the given target. For each amount, we will
    iterate through each coin denomination. If the current coin denomination is less than or equal to
    the target amount, we will calculate the minimum number of coins required to make up the current
    amount using the formula:
    dp[target] = min(dp[target], dp[target - coin] + 1)
    Finally, if dp[target] is still greater than the target amount, it means it was not possible to make
    up the target amount using the given coin denominations, so we return -1. Otherwise, we return
    dp[target], which represents the minimum number of coins required to make up the target amount.
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (final int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}