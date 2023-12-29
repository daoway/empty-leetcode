package com.blogspot.ostas.leetcode.all.easy.count_negative_numbers_in_a_sorted_matrix;

/*
      1351. count negative numbers in a sorted matrix

https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

*/
class Solution {
  public int countNegatives(int[][] grid) {
    int sum = 0;
    for (int[] arr : grid) {
      sum += countNegativesBS(arr);
    }
    return sum;
  }

  private int countNegativesBS(int[] arr) {
    int start =0;
    int end = arr.length-1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] >= 0) {
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }

    }
    return arr.length - end - 1;
  }
}