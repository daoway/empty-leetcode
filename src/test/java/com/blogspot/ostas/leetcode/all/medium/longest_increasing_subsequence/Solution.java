package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence;

import java.util.Arrays;

/*
      300. longest increasing subsequence

https://leetcode.com/problems/longest-increasing-subsequence

Given an integer array nums, return the length of the longest strictly increasing
subsequence
.

*/
class Solution {
    private int max(int[] L) {
        int maxLength = Integer.MIN_VALUE;
        for (final int length : L) {
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] L = new int[n];
        // Initialize the array with minimum length 1 for each index
        Arrays.fill(L, 1);

        // Iterate to fill in the values of L(i) using the recurrence relation
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    L[i] = Math.max(L[i], L[j] + 1);
                }
            }
        }
        // Find the maximum value in the array L
        return max(L);
    }
}