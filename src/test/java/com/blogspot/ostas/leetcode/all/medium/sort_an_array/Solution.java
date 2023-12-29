package com.blogspot.ostas.leetcode.all.medium.sort_an_array;

/*
      912. sort an array

https://leetcode.com/problems/sort-an-array

Given an array of integers nums, sort the array in ascending order and return it.
You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

*/

class Solution {
  public int[] sortArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      nums[i] += 5e4;
      if (nums[i] > max) {
        max = nums[i];
      }
    }

    int[] frequency = new int[max + 1];

    for (int value : nums) {
      frequency[value]++;
    }
    int element = 0, index = 0;
    while (element < max + 1) {
      if (frequency[element] > 0) {
        nums[index] = (int) (element - 5e4);
        frequency[element]--;
        index++;
      } else {
        element++;
      }
    }
    return nums;
  }
}
