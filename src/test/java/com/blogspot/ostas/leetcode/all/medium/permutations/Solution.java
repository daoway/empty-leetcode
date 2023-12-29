package com.blogspot.ostas.leetcode.all.medium.permutations;

import java.util.ArrayList;
import java.util.List;

/*
      46. permutations

https://leetcode.com/problems/permutations

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

*/

class Solution {
  public void search(int[] nums, List<List<Integer>> result, List<Integer> permutation,
                     boolean[] chosen) {
    if (permutation.size() == nums.length) {
      result.add(new ArrayList<>(permutation));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (chosen[i]) {
          continue;
        }
        chosen[i] = true;
        permutation.add(nums[i]);
        search(nums, result, permutation, chosen);
        chosen[i] = false;
        permutation.remove(permutation.size() - 1);
      }
    }
  }

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] chosen = new boolean[nums.length];
    List<Integer> permutation = new ArrayList<>();
    search(nums, result, permutation, chosen);
    return result;
  }
}