package com.blogspot.ostas.leetcode.all.easy.squares_of_a_sorted_array;

/*
      977. squares of a sorted array

https://leetcode.com/problems/squares-of-a-sorted-array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

*/

class Solution {
  public int[] sortedSquares(int[] nums) {
    final int[] output = new int[nums.length];
    int curr = nums.length - 1;
    int p1 = 0;
    int p2 = nums.length - 1;
    while (p1 <= p2) {
      if (Math.abs(nums[p1]) > Math.abs(nums[p2])) {
        output[curr] = nums[p1] * nums[p1];
        p1++;
      } else {
        output[curr] = nums[p2] * nums[p2];
        p2--;
      }
      curr--;
    }
    return output;
  }

  public int[] sortedSquaresX(int[] nums) {
    var max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) {
        nums[i] = -1 * nums[i];
      }
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    final var freq = new int[max + 1];

    for (final int value : nums) {
      freq[value]++;
    }

    int element = 0, index = 0;
    while (element < max + 1) {
      if (freq[element] > 0) {
        nums[index] = element * element;
        freq[element]--;
        index++;
      } else {
        element++;
      }
    }
    return nums;
  }

}