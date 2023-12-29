package com.blogspot.ostas.leetcode.all.easy.two_out_of_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
      2032. two out of three

https://leetcode.com/problems/two-out-of-three

Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.

*/

public class Solution {
  public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
    final List<Integer> result = new ArrayList<>();
    final int[] count = new int[101];

    updateCounts(nums1, count);
    updateCounts(nums2, count);
    updateCounts(nums3, count);

    for (int i = 1; i <= 100; i++) {
      if (count[i] >= 2) {
        result.add(i);
      }
    }

    return result;
  }

  private static void updateCounts(int[] nums, int[] count) {
    for (final int num : Arrays.stream(nums).boxed().collect(Collectors.toSet())) {
      count[num]++;
    }
  }
}