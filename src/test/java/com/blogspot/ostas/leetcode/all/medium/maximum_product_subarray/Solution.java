package com.blogspot.ostas.leetcode.all.medium.maximum_product_subarray;

/*
      152. maximum product subarray

https://leetcode.com/problems/maximum-product-subarray

Given an integer array nums, find a
subarray
that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

*/

class Solution {
  public int maxProduct(int[] nums) {
    int maxProduct = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      int product = 1;
      for (int j = i; j <= nums.length-1; j++) {
        product*=nums[j];
        maxProduct = Math.max(maxProduct,product);
      }
    }
    return maxProduct;
  }
}
