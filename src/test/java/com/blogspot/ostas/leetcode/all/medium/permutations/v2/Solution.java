package com.blogspot.ostas.leetcode.all.medium.permutations.v2;

import java.util.ArrayList;
import java.util.List;

class Solution {
  List<List<Integer>> result;
  int[] nums;

  public List<List<Integer>> permute(int[] nums) {
    result = new ArrayList<>();
    this.nums = nums;
    permutations(0);
    return result;
  }

  public void permutations(int start) {
    if (start == nums.length) {
      List<Integer> row = new ArrayList<>();
      for (int num : nums) row.add(num);
      result.add(row);
    } else {
      for (int i = start; i < nums.length; i++) {
        swap(i, start);
        permutations(start + 1);
        swap(i, start);
      }
    }
  }

  public void swap(int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}