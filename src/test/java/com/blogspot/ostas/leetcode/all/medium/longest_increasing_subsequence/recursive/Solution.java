package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence.recursive;

public class Solution {
    private int maxUltimate;

    public int lengthOfLISHelper(int[] arr, int n) {
        if (n == 1) {
            return 1;
        }
        int currResult;
        int maxEndingHere = 1;
        for (int i = n - 1; i > 0; i--) {
            currResult = lengthOfLISHelper(arr, i);
            if ((arr[i - 1] < arr[n - 1]) && (currResult + 1 > maxEndingHere)) {
                maxEndingHere = currResult + 1;
            }
        }
        maxUltimate = Math.max(maxEndingHere, maxUltimate);
        return maxEndingHere;
    }

    public int lengthOfLIS(int[] nums) {
        lengthOfLISHelper(nums, nums.length);
        return maxUltimate;
    }
}
