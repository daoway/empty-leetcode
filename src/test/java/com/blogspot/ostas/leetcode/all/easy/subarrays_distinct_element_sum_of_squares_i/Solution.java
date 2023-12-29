package com.blogspot.ostas.leetcode.all.easy.subarrays_distinct_element_sum_of_squares_i;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
      2913. subarrays distinct element sum of squares i

https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i

You are given a 0-indexed integer array nums.
The distinct count of a subarray of nums is defined as:
Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].
Return the sum of the squares of distinct counts of all subarrays of nums.
A subarray is a contiguous non-empty sequence of elements within an array.

*/

class Solution {
  public int sumCounts(List<Integer> nums) {
    int n = nums.size();
    int result = 0;

    for (int i = 0; i < n; i++) {
      Set<Integer> distinctCount = new HashSet<>();
      for (int j = i; j < n; j++) {
        distinctCount.add(nums.get(j));
        result += Math.pow(distinctCount.size(), 2);
      }
    }

    return result;
  }

  public int sumCountsX(List<Integer> nums) {
    int ans = 0;
    int n = nums.size();
    for (int i = 0; i < n; i++) {
      int[] s = new int[101];
      int cnt = 0;
      for (int j = i; j < n; j++) {
        if (++s[nums.get(j)] == 1) {
          cnt++;
        }
        ans += cnt * cnt;
      }
    }
    return ans;
  }
}
