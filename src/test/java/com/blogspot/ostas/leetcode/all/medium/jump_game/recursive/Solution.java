package com.blogspot.ostas.leetcode.all.medium.jump_game.recursive;

/*
      55. jump game

https://leetcode.com/problems/jump-game

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

*/


class Solution {
  public boolean canJump(int[] nums) {
    return canJumpFromPosition(0, nums);
  }

  private boolean canJumpFromPosition(int position, int[] nums) {
    // Base case: If we've reached the last index, we can jump to the end
    if (position == nums.length - 1) {
      return true;
    }

    // Base case: If we can't reach any further index, we can't jump to the end
    if (nums[position] == 0) {
      return false;
    }

    // Recursive case: Try jumping to all possible next positions
    for (int i = 1; i <= nums[position]; i++) {
      if (canJumpFromPosition(position + i, nums)) {
        return true;
      }
    }

    // If we couldn't find a valid next position, we can't jump to the end
    return false;
  }
}