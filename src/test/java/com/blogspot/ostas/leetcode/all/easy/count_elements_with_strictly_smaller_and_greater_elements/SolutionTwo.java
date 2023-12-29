package com.blogspot.ostas.leetcode.all.easy.count_elements_with_strictly_smaller_and_greater_elements;

import java.util.TreeSet;

/*
      2148. count elements with strictly smaller and greater elements

https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements

Given an integer array nums, return the number of elements that have both a strictly smaller and a strictly greater element appear in nums.

*/
class SolutionTwo implements AbstractSolution {
    @Override
    public int countElements(int[] nums) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : nums) {
            treeSet.add(num);
        }
        int result = 0;
        for (int num : nums) {
            if (treeSet.lower(num) != null && treeSet.higher(num) != null) result++;
        }
        return result;
    }
}