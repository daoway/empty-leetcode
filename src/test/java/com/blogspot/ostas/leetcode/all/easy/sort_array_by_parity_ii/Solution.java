package com.blogspot.ostas.leetcode.all.easy.sort_array_by_parity_ii;

/*
      922. sort array by parity ii

https://leetcode.com/problems/sort-array-by-parity-ii

Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

*/

public class Solution {
  public int[] sortArrayByParityII(int[] nums) {
    int evenIndex = 0;
    int oddIndex = 1;
    int n = nums.length;

    while (evenIndex < n && oddIndex < n) {
      while (evenIndex < n && nums[evenIndex] % 2 == 0) {
        evenIndex += 2;
      }

      while (oddIndex < n && nums[oddIndex] % 2 != 0) {
        oddIndex += 2;
      }

      if (evenIndex < n && oddIndex < n) {
        swap(nums, evenIndex, oddIndex);
      }
    }

    return nums;
  }

  private static void swap(int[] nums, int evenIndex, int oddIndex) {
    int temp = nums[evenIndex];
    nums[evenIndex] = nums[oddIndex];
    nums[oddIndex] = temp;
  }
}
