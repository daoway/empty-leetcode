package com.blogspot.ostas.leetcode.all.easy.valid_perfect_square;

/*
      367. valid perfect square

https://leetcode.com/problems/valid-perfect-square

Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.

*/

class Solution {
  public boolean isPerfectSquare(int num) {
    int start = 1;
    int end = num;
    while (start <= end) {
      final int mid = start + (end - start) / 2;
      final long t = (long) mid * mid;
      if (num == t) {
        return true;
      }
      if (num > t) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return false;
  }
}