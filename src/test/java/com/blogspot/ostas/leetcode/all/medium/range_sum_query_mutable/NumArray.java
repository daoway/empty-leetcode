package com.blogspot.ostas.leetcode.all.medium.range_sum_query_mutable;

/*
      307. range sum query - mutable

https://leetcode.com/problems/range-sum-query-mutable

Given an integer array nums, handle multiple queries of the following types:
Update the value of an element in nums.
Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:
NumArray(int[] nums) Initializes the object with the integer array nums.
void update(int index, int val) Updates the value of nums[index] to be val.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).

*/
 /////////////////////////////////////
//        Time Limit Exceeded
//////////////////////////////////////
class NumArray {
  private final int[] sums;
  private final int[] nums;
  public NumArray(int[] nums) {
    this.nums = nums;
    this.sums = new int[nums.length];
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      sums[i] = sum;
    }
  }

  public void update(int index, int val) {
    int diff = val - nums[index];
    nums[index] = val;
    for (int k = index; k < sums.length; k++) {
      sums[k] += diff;
    }
  }

  public int sumRange(int left, int right) {
    if (left == 0) {
      return sums[right];
    } else {
      return sums[right] - sums[left - 1];
    }
  }
}
