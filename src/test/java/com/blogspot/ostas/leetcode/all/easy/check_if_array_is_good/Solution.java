package com.blogspot.ostas.leetcode.all.easy.check_if_array_is_good;

import java.util.Arrays;

/*
      2784. check if array is good

https://leetcode.com/problems/check-if-array-is-good

You are given an integer array nums. We consider an array good if it is a permutation of an array base[n].
base[n] = [1, 2, ..., n - 1, n, n] (in other words, it is an array of length n + 1 which contains 1 to n - 1 exactly once, plus two occurrences of n). For example, base[1] = [1, 1] and base[3] = [1, 2, 3, 3].
Return true if the given array is good, otherwise return false.
Note: A permutation of integers represents an arrangement of these numbers.

*/
class Solution {
    public boolean isGood(int[] nums) {
        if (nums.length == 0) return true;
        if (nums.length == 1) return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] - nums[i] != 1) {
                return false;
            }
        }
        return nums[nums.length - 1] == nums[nums.length - 2] && nums[nums.length - 1] == nums.length - 1;
    }
}
