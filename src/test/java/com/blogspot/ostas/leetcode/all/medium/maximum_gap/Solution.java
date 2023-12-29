package com.blogspot.ostas.leetcode.all.medium.maximum_gap;

/*
      164. maximum gap

https://leetcode.com/problems/maximum-gap

Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.
You must write an algorithm that runs in linear time and uses linear extra space.

*/

import java.util.Arrays;

class Solution {
  public int maximumGap(int[] nums) {
    if(nums.length<2) return 0;
    Arrays.sort(nums);
    var maxDiff = Integer.MIN_VALUE;
    for(int i=0;i<nums.length-1;i++){
      maxDiff = Math.max(maxDiff,nums[i+1] - nums[i]);
    }
    return maxDiff;
  }
}