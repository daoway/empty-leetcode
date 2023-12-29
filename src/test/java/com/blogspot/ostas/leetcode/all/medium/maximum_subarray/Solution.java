package com.blogspot.ostas.leetcode.all.medium.maximum_subarray;

/*
      53. maximum subarray

https://leetcode.com/problems/maximum-subarray

Given an integer array nums, find the
subarray
with the largest sum, and return its sum.

*/

class Solution {
  public int maxSubArray(int[] nums) {
    if(nums.length == 1) return nums[0];

    int sum = 0;
    int max = Integer.MIN_VALUE;

    for(int n : nums){
      sum += n;
      max = Math.max(max, sum);

      if(sum < 0){
        sum = 0;
      }
    }
    return max;
  }
}