package com.blogspot.ostas.leetcode.all.hard.build_a_matrix_with_conditions;

/*
      2392. build a matrix with conditions

https://leetcode.com/problems/build-a-matrix-with-conditions

You are given a positive integer k. You are also given:
a 2D integer array rowConditions of size n where rowConditions[i] = [abovei, belowi], and
a 2D integer array colConditions of size m where colConditions[i] = [lefti, righti].
The two arrays contain integers from 1 to k.
You have to build a k x k matrix that contains each of the numbers from 1 to k exactly once. The remaining cells should have the value 0.
The matrix should also satisfy the following conditions:
The number abovei should appear in a row that is strictly above the row at which the number belowi appears for all i from 0 to n - 1.
The number lefti should appear in a column that is strictly left of the column at which the number righti appears for all i from 0 to m - 1.
Return any matrix that satisfies the conditions. If no answer exists, return an empty matrix.

*/
class Solution {
  public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
    return null;
  }
}