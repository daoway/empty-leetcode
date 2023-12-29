package com.blogspot.ostas.leetcode.all.medium.permutations.v1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Solution {
  public List<List<Integer>> permute(int[] nums) {
    return permute(nums, new LinkedHashSet<>(), new ArrayList<>());
  }

  private List<List<Integer>> permute(int[] nums, Set<Integer> result,
                                      List<List<Integer>> results) {
    if (result.size() == nums.length) {
      results.add(new ArrayList<>(result));
    } else {
      for (int num : nums) {
        if (result.add(num)) {
          permute(nums, result, results);
          result.remove(num);
        }
      }
    }
    return results;
  }
}
