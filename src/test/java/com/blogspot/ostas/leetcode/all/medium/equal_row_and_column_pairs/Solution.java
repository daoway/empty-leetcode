package com.blogspot.ostas.leetcode.all.medium.equal_row_and_column_pairs;

/*
      2352. equal row and column pairs

https://leetcode.com/problems/equal-row-and-column-pairs

Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).

*/
public class Solution {
  public int equalPairs(int[][] grid) {
    final int n = grid.length;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int k = 0;
        while (k < n) {
          if (grid[i][k] != grid[k][j]) {
            break;
          }
          k++;
        }
        // R[i] == C[j]
        if (k == n) {
          ans++;
        }
      }
    }
    return ans;
  }

}