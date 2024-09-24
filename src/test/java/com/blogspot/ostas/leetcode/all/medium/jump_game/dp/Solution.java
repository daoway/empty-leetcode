package com.blogspot.ostas.leetcode.all.medium.jump_game.dp;

/*
      55. jump game

https://leetcode.com/problems/jump-game

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

*/
// greegy approach

class Solution {
  public boolean canJump(int[] nums) {
    int n = nums.length;
    boolean[] dp = new boolean[n];
    dp[0] = true;  // We can always reach the first index

    for (int i = 0; i < n; i++) {
      if (dp[i]) {  // If we can reach index i
        int maxJump = Math.min(i + nums[i], n - 1);  // Ensure we don't go out of bounds
        for (int j = i + 1; j <= maxJump; j++) {
          dp[j] = true;  // Mark the indices we can jump to as reachable
        }
      }
    }

    return dp[n - 1];  // Check if we can reach the last index
  }
}