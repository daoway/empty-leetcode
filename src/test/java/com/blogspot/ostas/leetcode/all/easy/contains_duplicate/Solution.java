package com.blogspot.ostas.leetcode.all.easy.contains_duplicate;

import java.util.HashSet;

/*
      217. contains duplicate

https://leetcode.com/problems/contains-duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

*/
class Solution {
  public boolean containsDuplicate(int[] nums) {
    var countsMap = new HashSet<Integer>();
    for (int num : nums) {
      if (countsMap.contains(num)) {
        return true;
      } else {
        countsMap.add(num);
      }
    }
    return false;
  }
}