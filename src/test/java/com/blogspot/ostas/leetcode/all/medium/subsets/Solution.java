package com.blogspot.ostas.leetcode.all.medium.subsets;

import java.util.ArrayList;
import java.util.List;

/*
      78. subsets

https://leetcode.com/problems/subsets

Given an integer array nums of unique elements, return all possible
subsets
(the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

*/

class Solution {
  private void search(int[] nums, int k, List<List<Integer>> result, List<Integer> subset) {
    if (k == nums.length) {
      result.add(new ArrayList<>(subset));
    } else {
      subset.add(nums[k]);
      search(nums, k + 1, result, subset);
      subset.remove(subset.size() - 1);
      search(nums, k + 1, result, subset);
    }
  }

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    search(nums, 0, result, new ArrayList<>());
    return result;
  }
}
