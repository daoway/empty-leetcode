package com.blogspot.ostas.leetcode.all.easy.arranging_coins;

/*
      441. arranging coins

https://leetcode.com/problems/arranging-coins

You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.

*/
class Solution {
  public int arrangeCoins(int n) {
    int left = 1, right = n, result = 0;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      long sum = ((long) (mid) * (mid + 1)) / 2; // sum of arithmetic progression from 1..mid - n*(n+1)/2
      if (sum > n) {
        right = mid - 1;
      } else {
        left = mid + 1;
        result = Math.max(result, mid);
      }
    }

    return result;
  }
}