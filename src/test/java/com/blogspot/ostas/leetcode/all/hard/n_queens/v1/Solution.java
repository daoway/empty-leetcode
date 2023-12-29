package com.blogspot.ostas.leetcode.all.hard.n_queens.v1;

/*
      51. n-queens

https://leetcode.com/problems/n-queens

The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

*/

//// Time Limit Exceeded

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();
    char[][] board = new char[n][n];
    initializeBoard(board);

    generateAllConfigurations(result, board, 0, n);

    return result;
  }

  private void initializeBoard(char[][] board) {
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        board[i][j] = '.';
      }
    }
  }

  private void generateAllConfigurations(List<List<String>> result, char[][] board, int row, int n) {
    if (row == n) {
      if (isValid(board)) {
        result.add(constructSolution(board));
      }
      return;
    }

    for (int col = 0; col < n; col++) {
      board[row][col] = 'Q';
      generateAllConfigurations(result, board, row + 1, n);
      board[row][col] = '.';
    }
  }

  private boolean isValid(char[][] board) {
    int n = board.length;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == 'Q' && !isSafe(board, i, j)) {
          return false;
        }
      }
    }

    return true;
  }

  private boolean isSafe(char[][] board, int row, int col) {
    int n = board.length;

    for (int i = 0; i < row; i++) {
      if (board[i][col] == 'Q') {
        return false; // Check column
      }
      if (col - (row - i) >= 0 && board[i][col - (row - i)] == 'Q') {
        return false; // Check left diagonal
      }
      if (col + (row - i) < n && board[i][col + (row - i)] == 'Q') {
        return false; // Check right diagonal
      }
    }

    return true;
  }

  private List<String> constructSolution(char[][] board) {
    List<String> solution = new ArrayList<>();
    for (char[] row : board) {
      solution.add(new String(row));
    }
    return solution;
  }
}
