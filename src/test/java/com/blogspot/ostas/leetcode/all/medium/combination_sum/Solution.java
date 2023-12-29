package com.blogspot.ostas.leetcode.all.medium.combination_sum;


/*
      39. combination sum

https://leetcode.com/problems/combination-sum

Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
frequency
of at least one of the chosen numbers is different.
The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

*/

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(0, candidates, target, new ArrayList<>(), result);
    return result;
  }

  private void dfs(int startIndex, int[] candidates, int target, List<Integer> path,
                   List<List<Integer>> result) {
    if (target < 0) {
      return;
    }
    if (target == 0) {
      result.add(new ArrayList<>(path));
      return;
    }

    for (int i = startIndex; i < candidates.length; i++) {
      path.add(candidates[i]);
      dfs(i, candidates, target - candidates[i], path, result);
      path.remove(path.size() - 1);
    }
  }
}