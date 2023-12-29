package com.blogspot.ostas.leetcode.all.easy.maximum_product_of_three_numbers;

/*
      628. maximum product of three numbers

https://leetcode.com/problems/maximum-product-of-three-numbers

Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

*/

import java.util.Arrays;

class Solution {
  public int maximumProduct(int[] nums) {
    Arrays.sort(nums);
    int length = nums.length;
    int x1 = nums[0] * nums[1] * nums[length - 1];
    int x2 = nums[length - 1] * nums[length - 2] * nums[length - 3];
    return Math.max(x1, x2);
  }
}
