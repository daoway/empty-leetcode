package com.blogspot.ostas.leetcode.all.medium.single_number_ii;

/*
      137. single number ii

https://leetcode.com/problems/single-number-ii

Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
You must implement a solution with a linear runtime complexity and use only constant extra space.

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public int singleNumber(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    for (final int num : nums) {
      map.put(num, map.getOrDefault(num,0)+1);
    }
    for (final var entry : map.entrySet()){
      if(entry.getValue()!=3) return entry.getKey();
    }
    return 0;
  }

}
