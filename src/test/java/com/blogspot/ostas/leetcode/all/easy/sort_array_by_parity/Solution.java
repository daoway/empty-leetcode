package com.blogspot.ostas.leetcode.all.easy.sort_array_by_parity;

/*
      905. sort array by parity

https://leetcode.com/problems/sort-array-by-parity

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

*/

class Solution {
  private static void swap(int[] nums, int start, int end) {
    int temp = nums[start];
    nums[start] = nums[end];
    nums[end] = temp;
  }

  public int[] sortArrayByParityX(int[] nums) {
    int start = 0;
    int end = nums.length - 1;

    while (start < end) {
      if (nums[start] % 2 == 1 && nums[end] % 2 == 0) {
        swap(nums, start, end);
      }
      if (nums[start] % 2 == 0) {
        start++;
      }
      if (nums[end] % 2 == 1) {
        end--;
      }
    }

    return nums;
  }

  public int[] sortArrayByParity(int[] nums) {
    int left = 0; // Points to the beginning of the array
    int right = nums.length - 1; // Points to the end of the array

    while (left < right) {
      // Move left pointer to the right until an odd number is found
      while (left < right && nums[left] % 2 == 0) {
        left++;
      }

      // Move right pointer to the left until an even number is found
      while (left < right && nums[right] % 2 != 0) {
        right--;
      }

      // Swap the even and odd elements
      if (left < right) {
        swap(nums, left, right);
        left++;
        right--;
      }
    }

    return nums;
  }
}