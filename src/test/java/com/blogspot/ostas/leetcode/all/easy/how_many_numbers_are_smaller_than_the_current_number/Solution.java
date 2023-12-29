package com.blogspot.ostas.leetcode.all.easy.how_many_numbers_are_smaller_than_the_current_number;

/*
      1365. how many numbers are smaller than the current number

https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number

Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.

*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] sortedArr = nums.clone();
    Arrays.sort(sortedArr);

    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      indexMap.putIfAbsent(sortedArr[i], i);
    }

    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = indexMap.get(nums[i]);
    }

    return result;
  }
}
