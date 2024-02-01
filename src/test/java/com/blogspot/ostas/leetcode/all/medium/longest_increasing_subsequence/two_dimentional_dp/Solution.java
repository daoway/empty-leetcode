package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence.two_dimentional_dp;

import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        return longestCommonSubsequence(nums,nums.length);
    }
    public static int longestCommonSubsequence(int[] arr, int n) {
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);
        int[][] dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                } else if(arr[i-1] == sortedArray[j-1]) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][n];
    }
}
