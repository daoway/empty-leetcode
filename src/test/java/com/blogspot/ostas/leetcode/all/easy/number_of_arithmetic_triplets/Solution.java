package com.blogspot.ostas.leetcode.all.easy.number_of_arithmetic_triplets;

/*
      2367. number of arithmetic triplets

https://leetcode.com/problems/number-of-arithmetic-triplets

You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:
i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.
Return the number of unique arithmetic triplets.

*/

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int arithmeticTriplets(int[] nums, int diff) {
    int count = 0;
    Set<Integer> set = new HashSet<>();
    for (final int num : nums) {
      set.add(num);
    }

    for (final int num : nums) {
      if (set.contains(num - diff) && set.contains(num - diff - diff)) {
        count++;
      }
    }

    return count;
  }

  public int arithmeticTripletsXXX(int[] nums, int diff) {
    int n = nums.length;
    int count = 0;

    for (int i = 0; i < n - 2; i++) {
      for (int j = i + 1; j < n - 1; j++) {
        for (int k = j + 1; k < n; k++) {
          if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
            count++;
          }
        }
      }
    }

    return count;
  }

}
