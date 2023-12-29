package com.blogspot.ostas.leetcode.all.easy.maximum_count_of_positive_integer_and_negative_integer;

/*
      2529. maximum count of positive integer and negative integer

https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer

Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
Note that 0 is neither positive nor negative.

*/

class Solution {
  // O(n)
  public int maximumCountX(int[] nums) {
    var positive = 0;
    var negative = 0;
    for (final int num : nums) {
      if (num == 0) {
        continue;
      }
      if (num > 0) {
        positive++;
      } else {
        negative++;
      }
    }
    return Math.max(positive, negative);
  }

  // O(log n)
  public int maximumCount(int[] nums) {
    int positiveCount = 0;
    int negativeCount = 0;

    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      if (nums[left] > 0) {
        positiveCount += right - left + 1; // All remaining elements are positive
        break;
      } else if (nums[right] < 0) {
        negativeCount += right - left + 1; // All remaining elements are negative
        break;
      } else {
        if (nums[left] < 0) {
          negativeCount++;
          left++;
        } else if (nums[right] > 0) {
          positiveCount++;
          right--;
        } else {
          // 0 is neither positive nor negative, so we can skip it
          left++;
          right--;
        }
      }
    }

    return Math.max(positiveCount, negativeCount);
  }
}