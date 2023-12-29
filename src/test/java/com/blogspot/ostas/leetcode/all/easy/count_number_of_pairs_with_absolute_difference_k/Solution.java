package com.blogspot.ostas.leetcode.all.easy.count_number_of_pairs_with_absolute_difference_k;

import java.util.HashMap;
import java.util.Map;

/*
      2006. count number of pairs with absolute difference k

https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k

Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:
x if x >= 0.
-x if x < 0.

*/
class Solution {
  public int countKDifference(int[] nums, int k) {
    int ans = 0;
    final Map<Integer, Integer> map = new HashMap<>();
    int abs1, abs2;
    for (final int num : nums) {
      abs1 = num - k;
      abs2 = num + k;
      if (map.containsKey(abs1)) {
        ans += map.get(abs1);
      }
      if (map.containsKey(abs2)) {
        ans += map.get(abs2);
      }
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    return ans;
  }

}