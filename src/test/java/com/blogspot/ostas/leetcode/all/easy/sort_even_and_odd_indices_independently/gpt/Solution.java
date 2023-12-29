package com.blogspot.ostas.leetcode.all.easy.sort_even_and_odd_indices_independently.gpt;

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

import java.util.Arrays;

public class Solution {
  public int[] sortEvenOdd(int[] nums) {
    int n = nums.length;

    int[] oddSubarray = new int[(n + 1) / 2];
    int[] evenSubarray = new int[n / 2];

    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        evenSubarray[i / 2] = nums[i];
      } else {
        oddSubarray[i / 2] = nums[i];
      }
    }

    // Sort the odd subarray in non-increasing order
    Arrays.sort(oddSubarray);
    reverse(oddSubarray);

    // Sort the even subarray in non-decreasing order
    Arrays.sort(evenSubarray);

    // Combine the sorted odd and even subarrays back into the original array
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        nums[i] = evenSubarray[i / 2];
      } else {
        nums[i] = oddSubarray[i / 2];
      }
    }

    return nums;
  }

  private void reverse(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
  }
}
