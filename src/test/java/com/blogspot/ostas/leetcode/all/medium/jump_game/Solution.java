package com.blogspot.ostas.leetcode.all.medium.jump_game;

/*
      55. jump game

https://leetcode.com/problems/jump-game

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

*/
// greegy approach

class Solution {
  public boolean canJump(int[] nums) {
    int farthest = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > farthest) {
        return false;
      }
      farthest = Math.max(farthest, i + nums[i]);
      if (farthest >= nums.length - 1) {
        return true;
      }
    }
    return false;
  }
}