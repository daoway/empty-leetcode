package com.blogspot.ostas.leetcode.all.easy.single_number;

import java.util.HashMap;
import java.util.Map;

/*
      136. single number

https://leetcode.com/problems/single-number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

*/
public class Solution {

  public int singleNumber(int[] nums) {
    final Map<Integer,Integer> map = new HashMap<>();
    for (final int num : nums) {
      map.put(num, map.getOrDefault(num,0)+1);
    }
    for (final var entry : map.entrySet()){
      if(entry.getValue()!=2) return entry.getKey();
    }
    return 0;
  }

}