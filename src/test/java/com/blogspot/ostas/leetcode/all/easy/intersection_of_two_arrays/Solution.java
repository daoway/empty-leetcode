package com.blogspot.ostas.leetcode.all.easy.intersection_of_two_arrays;

/*
      349. intersection of two arrays

https://leetcode.com/problems/intersection-of-two-arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

*/

import java.util.Arrays;
import java.util.HashSet;

class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    if (nums1.length <= nums2.length) {
      return intersect_small_big(nums1, nums2);
    } else {
      return intersect_small_big(nums2, nums1);
    }
  }

  public int[] intersect_small_big(int[] nums1, int[] nums2) {
    var result = new HashSet<Integer>(nums2.length);
    for (Integer num : nums1) {
      if (search(nums2, num)) {
        result.add(num);
      }
    }
    return result.stream().mapToInt(i -> i).toArray();
  }

  private boolean search(int[] array, Integer target) {
    int start = 0, end = array.length - 1, mid = 0;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (array[mid] == target) {
        return true;
      }
      if (array[mid] < target) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return false;
  }
}
