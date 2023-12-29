package com.blogspot.ostas.leetcode.all.easy.count_elements_with_strictly_smaller_and_greater_elements;

import java.util.TreeSet;

/*
      2148. count elements with strictly smaller and greater elements

https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements

Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

*/
class Solution implements AbstractSolution {
    @Override
    public int countElements(int[] nums) {
        var mm = minMax(nums);
        int result = 0;
        for (final int el : nums) {
            if (el != mm[0] && el != mm[1]) result++;
        }
        return result;
    }

    public int[] minMax(int[] array) {
        int[] result = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (final int el : array) {
            result[0] = Math.min(result[0], el);
            result[1] = Math.max(result[1], el);
        }
        return result;
    }
}