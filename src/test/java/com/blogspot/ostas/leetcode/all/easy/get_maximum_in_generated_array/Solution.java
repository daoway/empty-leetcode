package com.blogspot.ostas.leetcode.all.easy.get_maximum_in_generated_array;

/*
      1646. get maximum in generated array

https://leetcode.com/problems/get-maximum-in-generated-array

You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
nums[0] = 0
nums[1] = 1
nums[2 * i] = nums[i] when 2 <= 2 * i <= n
nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 <= 2 * i + 1 <= n
Return the maximum integer in the array nums.

*/

class Solution {
  public int getMaximumGenerated(int n) {
    if (n == 0) {
      return 0;
    }

    final int[] nums = new int[n + 1];
    nums[1] = 1;
    int max = 1;

    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        nums[i] = nums[i / 2];
      } else {
        nums[i] = nums[i / 2] + nums[i / 2 + 1];
      }
      max = Math.max(max, nums[i]);
    }

    return max;
  }
}
