package com.blogspot.ostas.leetcode.all.easy.find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

/*
      448. find all numbers disappeared in an array

https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq = new int[nums.length + 1];
        for (final int num : nums) {
            freq[num]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int num = 1; num <= nums.length; num++) {
            if (freq[num] == 0) {
                result.add(num);
            }
        }
        return result;
    }
}