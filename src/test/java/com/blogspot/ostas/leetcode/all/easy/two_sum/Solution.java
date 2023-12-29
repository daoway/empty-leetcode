package com.blogspot.ostas.leetcode.all.easy.two_sum;

/*
      1. two sum

https://leetcode.com/problems/two-sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

*/
class Solution {
  public int[] twoSumX(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j && nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          break;
        }
      }
    }
    return result;
  }

  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i != j) {
          if (nums[i] + nums[j] == target) {
            return new int[] {i, j};
          }
        }
      }
    }
    throw new RuntimeException("No target, no fun");
  }

}