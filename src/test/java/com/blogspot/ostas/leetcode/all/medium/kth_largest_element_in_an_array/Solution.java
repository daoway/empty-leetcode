package com.blogspot.ostas.leetcode.all.medium.kth_largest_element_in_an_array;

import java.util.Arrays;

/*
      215. kth largest element in an array

https://leetcode.com/problems/kth-largest-element-in-an-array

Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?

*/
class Solution {
  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length-k];
  }
}