package com.blogspot.ostas.leetcode.all.easy.find_the_distinct_difference_array;

/*
      2670. find the distinct difference array

https://leetcode.com/problems/find-the-distinct-difference-array

You are given a 0-indexed array nums of length n.
The distinct difference array of nums is an array diff of length n such that diff[i] is equal to the number of distinct elements in the suffix nums[i + 1, ..., n - 1] subtracted from the number of distinct elements in the prefix nums[0, ..., i].
Return the distinct difference array of nums.
Note that nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j inclusive. Particularly, if i > j then nums[i, ..., j] denotes an empty subarray.

*/
import java.util.HashSet;
import java.util.Set;

public class Solution{
  public int[] distinctDifferenceArray(int[] nums) {
    final int[] diff = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      diff[i] = - count_prefix(i, nums) + count_suffix(i, nums);
    }
    return diff;
  }

  private int count_suffix(int i, int[] nums) {
    final Set<Integer> set = new HashSet<>();
    for (int j = 0; j <= i; j++) {
      set.add(nums[j]);
    }
    return set.size();
  }

  private int count_prefix(int i, int[] nums) {
    final Set<Integer> set = new HashSet<>();
    for (int j = i+1; j <= nums.length-1; j++) {
      set.add(nums[j]);
    }
    return set.size();
  }

}
