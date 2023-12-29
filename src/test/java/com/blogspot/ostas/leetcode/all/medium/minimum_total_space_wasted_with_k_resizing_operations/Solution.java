package com.blogspot.ostas.leetcode.all.medium.minimum_total_space_wasted_with_k_resizing_operations;

/*
      1959. minimum total space wasted with k resizing operations

https://leetcode.com/problems/minimum-total-space-wasted-with-k-resizing-operations

You are currently designing a dynamic array. You are given a 0-indexed integer array nums, where nums[i] is the number of elements that will be in the array at time i. In addition, you are given an integer k, the maximum number of times you can resize the array (to any size).
The size of the array at time t, sizet, must be at least nums[t] because there needs to be enough space in the array to hold all the elements. The space wasted at time t is defined as sizet - nums[t], and the total space wasted is the sum of the space wasted across every time t where 0 <= t < nums.length.
Return the minimum total space wasted if you can resize the array at most k times.
Note: The array can have any size at the start and does not count towards the number of resizing operations.

*/
class Solution {
  public int minSpaceWastedKResizing(int[] nums, int k) {
    return 0;
  }
}