package com.blogspot.ostas.leetcode.all.hard.n_queens;

import java.util.ArrayList;
import java.util.List;

/*
      51. n-queens

https://leetcode.com/problems/n-queens

The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

*/

class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();
    int[] board = new int[n];
    placeQueens(result, board, 0, n);
    return result;
  }

  private void placeQueens(List<List<String>> result, int[] board, int row, int n) {
    if (row == n) {
      result.add(generateSolution(board));
      return;
    }

    for (int col = 0; col < n; col++) {
      if (isSafe(board, row, col)) {
        board[row] = col;
        placeQueens(result, board, row + 1, n);
      }
    }
  }

  private boolean isSafe(int[] board, int row, int col) {
    for (int i = 0; i < row; i++) {
      if (board[i] == col || Math.abs(board[i] - col) == row - i) {
        return false;
      }
    }
    return true;
  }

  private List<String> generateSolution(int[] board) {
    List<String> solution = new ArrayList<>();
    for (int row : board) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < board.length; i++) {
        sb.append(i == row ? 'Q' : '.');
      }
      solution.add(sb.toString());
    }
    return solution;
  }
}