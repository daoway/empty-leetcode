package com.blogspot.ostas.leetcode.all.easy.search_insert_position;

/*
      35. search insert position

https://leetcode.com/problems/search-insert-position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

*/

class Solution {
  public int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length-1;
    int mid;
    while (low <= high) {
      mid = low  + ((high - low) / 2);
      //if (nums[mid] == target) return mid;
      if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return low;
  }
}