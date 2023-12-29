package com.blogspot.ostas.leetcode.all.easy.number_of_good_pairs;

/*
      1512. number of good pairs

https://leetcode.com/problems/number-of-good-pairs

Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int numIdenticalPairs(int[] nums) {
    final Map<Integer, Integer> map = new HashMap<>();
    int count = 0;
    for (final int element : nums) {
      int elementFrequency = map.getOrDefault(element, 0);
      count += elementFrequency;
      map.put(element, elementFrequency + 1);
    }
    return count;
  }
}
