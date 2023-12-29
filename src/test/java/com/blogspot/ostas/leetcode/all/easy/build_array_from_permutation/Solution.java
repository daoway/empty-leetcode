package com.blogspot.ostas.leetcode.all.easy.build_array_from_permutation;

/*
      1920. build array from permutation

https://leetcode.com/problems/build-array-from-permutation

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

*/
class Solution {
  public int[] buildArray(int[] nums) {
    int[] ans = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      ans[i] = nums[nums[i]];
    }
    return ans;
  }
}