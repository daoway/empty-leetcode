package com.blogspot.ostas.leetcode.all.easy.transpose_matrix;

/*
      867. transpose matrix

https://leetcode.com/problems/transpose-matrix

Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

*/
class Solution {
  public int[][] transpose(int[][] matrix) {
    int n = matrix.length;
    int m = matrix[0].length;
    int[][] result = new int[m][n];
    if(n == m){
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
        }
      }
      return matrix;
    }else{
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          result[j][i] = matrix[i][j];
        }
      }
      return result;
    }
  }
}