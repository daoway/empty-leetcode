package com.blogspot.ostas.leetcode.all.easy.majority_element;

/*
      169. majority element

https://leetcode.com/problems/majority-element

Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int majorityElement(int[] nums) {
    final Map<Integer, Integer> map = new HashMap<>();
    int majorityElement = 0; // Initialize with a default value
    int maxFreq = 0;

    for (final int el : nums) {
      int count = map.getOrDefault(el, 0) + 1;
      map.put(el, count);

      if (count > maxFreq) {
        maxFreq = count;
        majorityElement = el;
      }
    }
    return majorityElement;
  }
}
