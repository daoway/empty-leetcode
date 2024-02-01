package com.blogspot.ostas.leetcode.all.medium.longest_increasing_subsequence.recursive;

public class Solution {
    private int max_ultimate;

    public int lengthOfLisHelper(int[] arr, int n) {
        if (n == 1) {
            return 1;
        }
        int curr_result;
        int max_ending_here = 1;
        for (int i = n - 1; i > 0; i--) {
            curr_result = lengthOfLisHelper(arr, i);
            if ((arr[i - 1] < arr[n - 1]) && (curr_result + 1 > max_ending_here)) {
                max_ending_here = curr_result + 1;
            }
        }
        max_ultimate = Math.max(max_ending_here, max_ultimate);
        return max_ending_here;
    }

    public int lengthOfLIS(int[] nums) {
        lengthOfLisHelper(nums, nums.length);
        return max_ultimate;
    }
}
