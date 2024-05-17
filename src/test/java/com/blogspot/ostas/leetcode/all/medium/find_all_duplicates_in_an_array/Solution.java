package com.blogspot.ostas.leetcode.all.medium.find_all_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.List;

/*
      442. find all duplicates in an array

https://leetcode.com/problems/find-all-duplicates-in-an-array

Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
You must write an algorithm that runs in O(n) time and uses only constant extra space.

*/
class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    int[] freq = new int[nums.length + 1];
    for (final int num : nums) {
      freq[num]++;
    }
    List<Integer> result = new ArrayList<>();
    for (int num = 1; num <= nums.length; num++) {
      if (freq[num] == 2) {
        result.add(num);
      }
    }
    return result;
  }
}