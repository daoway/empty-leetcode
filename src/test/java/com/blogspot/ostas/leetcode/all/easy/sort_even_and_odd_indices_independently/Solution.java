package com.blogspot.ostas.leetcode.all.easy.sort_even_and_odd_indices_independently;

/*
      2164. sort even and odd indices independently

https://leetcode.com/problems/sort-even-and-odd-indices-independently

You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:
Sort the values at odd indices of nums in non-increasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
Sort the values at even indices of nums in non-decreasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
Return the array formed after rearranging the values of nums.

*/
class Solution {
  public int[] sortEvenOdd(int[] nums) {
    final int n = nums.length;
    int[] result = new int[n];
    int[] evenCount = new int[101];
    int[] oddCount = new int[101];

    for (int i = 0; i < n; i++) {
      if (i % 2 != 0) {
        oddCount[nums[i]]++;
      } else {
        evenCount[nums[i]]++;
      }
    }

    int index = 0;
    for (int i = 1; i < 101; i++) {
      while (evenCount[i] > 0) {
        evenCount[i]--;
        result[index] = i;
        index += 2;
      }
    }

    index = 1;
    for (int i = 100; i > 0; i--) {
      while (oddCount[i] > 0) {
        oddCount[i]--;
        result[index] = i;
        index += 2;
      }
    }

    return result;
  }
}
