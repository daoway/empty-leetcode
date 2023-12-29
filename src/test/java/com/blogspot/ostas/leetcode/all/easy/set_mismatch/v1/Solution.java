package com.blogspot.ostas.leetcode.all.easy.set_mismatch.v1;

import java.util.Arrays;

class Solution {
  public int[] findErrorNums(int[] nums) {
    int[] result = new int[2];
    Arrays.sort(nums);

    int n = nums.length;
    int sum = n * (n + 1) / 2; // Sum of first n natural numbers

    int actualSum = 0;
    int prev = 0;

    for (int num : nums) {
      actualSum += num;
      if (num == prev) {
        result[0] = num; // Found the duplicate
      }
      prev = num;
    }

    result[1] = sum - (actualSum - result[0]); // Calculate the missing number

    return result;
  }
}
