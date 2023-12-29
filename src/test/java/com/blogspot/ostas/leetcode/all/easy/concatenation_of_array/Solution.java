package com.blogspot.ostas.leetcode.all.easy.concatenation_of_array;

/*
      1929. concatenation of array

https://leetcode.com/problems/concatenation-of-array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans.

*/
class Solution {
  public int[] getConcatenation(int[] nums) {
    int l = nums.length * 2;
    int[] result = new int[l];
    for (int i = 0; i < nums.length; i++) {
      result[i] = nums[i];
    }
    int j = 0;
    for (int i = nums.length; i < l; i++, j++) {
      result[i] = nums[j];
    }
    return result;
  }
}