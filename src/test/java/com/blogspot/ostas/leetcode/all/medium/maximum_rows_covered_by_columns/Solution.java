package com.blogspot.ostas.leetcode.all.medium.maximum_rows_covered_by_columns;

/*
      2397. maximum rows covered by columns

https://leetcode.com/problems/maximum-rows-covered-by-columns

You are given a 0-indexed m x n binary matrix matrix and an integer numSelect, which denotes the number of distinct columns you must select from matrix.
Let us consider s = {c1, c2, ...., cnumSelect} as the set of columns selected by you. A row row is covered by s if:
For each cell matrix[row][col] (0 <= col <= n - 1) where matrix[row][col] == 1, col is present in s or,
No cell in row has a value of 1.
You need to choose numSelect columns such that the number of rows that are covered is maximized.
Return the maximum number of rows that can be covered by a set of numSelect columns.

*/
class Solution {
  public int maximumRows(int[][] matrix, int numSelect) {
    return 0;
  }
}