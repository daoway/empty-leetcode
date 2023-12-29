package com.blogspot.ostas.leetcode.all.medium.sum_of_square_numbers;

/*
      633. sum of square numbers

https://leetcode.com/problems/sum-of-square-numbers

Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

*/

class Solution {
  public boolean judgeSquareSum(int c) {
    if (c == 0) {
      return true;
    }
    //a^2 + b^2 = c ?
    var max = (int) Math.floor(Math.sqrt(c));
    int start = 1;
    int end = max;
    while (start <= max) {
      var test = Math.pow(start, 2) + Math.pow(end, 2);
      if (test == c) {
        return true;
      }
      if (test > c) {
        end--;
      } else {
        start++;
      }
    }
    return false;
  }
}
