package com.blogspot.ostas.leetcode.all.easy.running_sum_of_one_d_array;

/*
      1480. running sum of 1d array

https://leetcode.com/problems/running-sum-of-1d-array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

*/

class Solution {
  public int[] runningSum(int[] nums) {
    final int[] sums = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      sums[i] = sum;
    }
    return sums;
  }
}