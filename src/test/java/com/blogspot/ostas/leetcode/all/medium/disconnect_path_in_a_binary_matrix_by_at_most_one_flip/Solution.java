package com.blogspot.ostas.leetcode.all.medium.disconnect_path_in_a_binary_matrix_by_at_most_one_flip;

/*
      2556. disconnect path in a binary matrix by at most one flip

https://leetcode.com/problems/disconnect-path-in-a-binary-matrix-by-at-most-one-flip

You are given a 0-indexed m x n binary matrix grid. You can move from a cell (row, col) to any of the cells (row + 1, col) or (row, col + 1) that has the value 1. The matrix is disconnected if there is no path from (0, 0) to (m - 1, n - 1).
You can flip the value of at most one (possibly none) cell. You cannot flip the cells (0, 0) and (m - 1, n - 1).
Return true if it is possible to make the matrix disconnect or false otherwise.
Note that flipping a cell changes its value from 0 to 1 or from 1 to 0.

*/
class Solution {
  public boolean isPossibleToCutPath(int[][] grid) {
    return false;
  }
}