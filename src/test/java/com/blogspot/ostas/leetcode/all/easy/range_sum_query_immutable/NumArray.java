package com.blogspot.ostas.leetcode.all.easy.range_sum_query_immutable;

/*
      303. range sum query - immutable

https://leetcode.com/problems/range-sum-query-immutable

Given an integer array nums, handle multiple queries of the following type:
Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:
NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).

*/
class NumArray {
    private final int[] sums;

    public NumArray(int[] nums) {
        this.sums = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sums[i] = sum;
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