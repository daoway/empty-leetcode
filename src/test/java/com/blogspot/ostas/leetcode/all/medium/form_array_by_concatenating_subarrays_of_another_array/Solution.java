package com.blogspot.ostas.leetcode.all.medium.form_array_by_concatenating_subarrays_of_another_array;

/*
      1764. form array by concatenating subarrays of another array

https://leetcode.com/problems/form-array-by-concatenating-subarrays-of-another-array

You are given a 2D integer array groups of length n. You are also given an integer array nums.
You are asked if you can choose n disjoint subarrays from the array nums such that the ith subarray is equal to groups[i] (0-indexed), and if i > 0, the (i-1)th subarray appears before the ith subarray in nums (i.e. the subarrays must be in the same order as groups).
Return true if you can do this task, and false otherwise.
Note that the subarrays are disjoint if and only if there is no index k such that nums[k] belongs to more than one subarray. A subarray is a contiguous sequence of elements within an array.

*/
class Solution {
  public boolean canChoose(int[][] groups, int[] nums) {
    return false;
  }
}