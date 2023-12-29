package com.blogspot.ostas.leetcode.all.medium.maximum_product_subarray.v1;

class Solution {
  private static int max(int n1, int n2, int n3) {
    return Math.max(Math.max(n1, n2), n3);
  }

  private static int min(int n1, int n2, int n3) {
    return Math.min(Math.min(n1, n2), n3);
  }

  public int maxProduct(int[] nums) {
    int result = nums[0];
    int currentMin = 1, currentMax = 1;
    for (final int num : nums) {
      int tmp = currentMax * num;
      currentMax = max(num * currentMax, num * currentMin, num);
      currentMin = min(tmp, num * currentMin, num);
      result = Math.max(result, currentMax);
    }
    return result;
  }
}
