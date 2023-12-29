package com.blogspot.ostas.leetcode.all.easy.divide_array_into_equal_pairs;

/*
      2206. divide array into equal pairs

https://leetcode.com/problems/divide-array-into-equal-pairs

You are given an integer array nums consisting of 2 * n integers.
You need to divide nums into n pairs such that:
Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.

*/
public class Solution {
  public boolean divideArray(int[] nums) {
    int[] freq = new int[500 + 1];
    for (final int num : nums) {
      freq[num]++;
    }
    for (final int j : freq) {
      if (j == 0) {
        continue;
      }
      if (j % 2 != 0) {
        return false;
      }
    }
    return true;
  }
}