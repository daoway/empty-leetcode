package com.blogspot.ostas.leetcode.all.medium.permutations_ii;


/*
      47. permutations ii

https://leetcode.com/problems/permutations-ii

Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {
  public void search(int[] nums, List<List<Integer>> result, LinkedList<Integer> permutation,
                     boolean[] chosen) {
    if (permutation.size() == nums.length) {
      result.add(new ArrayList<>(permutation));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (chosen[i]) {
          continue;
        }
        if (i > 0 && nums[i - 1] == nums[i] && !chosen[i - 1]) {
          continue;
        }

        chosen[i] = true;
        permutation.addLast(nums[i]);
        search(nums, result, permutation, chosen);
        chosen[i] = false;
        permutation.removeLast();
      }
    }
  }

  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] chosen = new boolean[nums.length];
    var permutation = new LinkedList<Integer>();
    Arrays.sort(nums);
    search(nums, result, permutation, chosen);
    return result;
  }

}
