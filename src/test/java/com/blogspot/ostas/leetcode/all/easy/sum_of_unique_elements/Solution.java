package com.blogspot.ostas.leetcode.all.easy.sum_of_unique_elements;

/*
      1748. sum of unique elements

https://leetcode.com/problems/sum-of-unique-elements

You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int sumOfUnique(int[] nums) {
    final Map<Integer, Integer> map = new HashMap<>();
    for (final int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int count = 0;
    for (final Map.Entry<Integer, Integer> el : map.entrySet()) {
      if (el.getValue() == 1) {
        count += el.getKey();
      }
    }
    return count;
  }
}
