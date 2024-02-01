package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence.recursive;

public class Solution {
    private int max;
    public int lengthOfLISHelper(int[] arr, int n) {
        // Base case: if there is only one element, the LIS length is 1
        if (n == 1) {
            return 1;
        }
        int currResult;
        int maxEnding = 1;

        for (int i = n - 1; i > 0; i--) {
            // Recursively calculate LIS for previous elements
            currResult = lengthOfLISHelper(arr, i);

            // Check if the current element can be included in the increasing subsequence
            if ((arr[i - 1] < arr[n - 1]) && (currResult + 1 > maxEnding)) {
                maxEnding = currResult + 1;
            }
        }
        max = Math.max(maxEnding, max);
        return maxEnding;
    }

    public int lengthOfLIS(int[] nums) {
        lengthOfLISHelper(nums, nums.length);
        return max;
    }
}
