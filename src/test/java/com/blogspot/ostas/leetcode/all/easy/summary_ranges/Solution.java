package com.blogspot.ostas.leetcode.all.easy.summary_ranges;

import java.util.ArrayList;
import java.util.List;

/*
      228. summary ranges

https://leetcode.com/problems/summary-ranges

You are given a sorted unique integer array nums.
A range [a,b] is the set of all integers from a to b (inclusive).
Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.
Each range [a,b] in the list should be output as:
"a->b" if a != b
"a" if a == b

*/
class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> ranges = new ArrayList<>();
    if (nums == null || nums.length == 0) {
      return ranges;
    }

    int start = nums[0];
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1] + 1) {
        addRange(ranges, start, nums[i - 1]);
        start = nums[i];
      }
    }
    addRange(ranges, start, nums[nums.length - 1]);

    return ranges;
  }

  private static void addRange(List<String> ranges, int start, int end) {
    if (start == end) {
      ranges.add(String.valueOf(start));
    } else {
      ranges.add(start + "->" + end);
    }
  }
}