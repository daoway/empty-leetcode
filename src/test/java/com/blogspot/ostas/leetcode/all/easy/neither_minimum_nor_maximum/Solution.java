package com.blogspot.ostas.leetcode.all.easy.neither_minimum_nor_maximum;

/*
      2733. neither minimum nor maximum

https://leetcode.com/problems/neither-minimum-nor-maximum

Given an integer array nums containing distinct positive integers, find and return any number from the array that is neither the minimum nor the maximum value in the array, or -1 if there is no such number.
Return the selected integer.

*/

import java.util.Arrays;
import java.util.TreeSet;

class Solution {
  public int findNonMinOrMax(int[] nums) {
    if (nums.length == 1) {
      return -1;
    }
    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
    }
    var min = set.first();
    set.remove(min);
    var max = set.last();
    set.remove(max);
    return set.stream().findFirst().orElse(-1);
  }

  public int findNonMinOrMaxXXX(int[] nums) {
    if (nums.length < 3) {
      return -1;
    }
    Arrays.sort(nums, 0, 3);
    return nums[1];
  }

}
