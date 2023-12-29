package com.blogspot.ostas.leetcode.all.easy.move_zeroes;

/*
      283. move zeroes

https://leetcode.com/problems/move-zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

*/

public class Solution {

  public void moveZeroes(int[] nums) {
    int nonZeroIndex = 0;

    // Move all non-zero elements to the left side of the array
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[nonZeroIndex] = nums[i];
        nonZeroIndex++;
      }
    }

    // Fill the remaining positions with zeros
    for (int i = nonZeroIndex; i < nums.length; i++) {
      nums[i] = 0;
    }
  }

}