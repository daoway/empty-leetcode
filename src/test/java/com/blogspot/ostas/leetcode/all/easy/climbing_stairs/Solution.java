package com.blogspot.ostas.leetcode.all.easy.climbing_stairs;

/*
      70. climbing stairs

https://leetcode.com/problems/climbing-stairs

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

*/
class Solution {
    public int climbStairsx(int n) {
        double sqrt5 = Math.sqrt(5);
        double result = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) (result / sqrt5);
    }


    public int climbStairs(int n) {
        // dp[i]  - the number of ways to climb to the i-th stair, THEN dp[i] = dp[i-1] // one step + dp[i-2] //two steps
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}