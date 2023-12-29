package com.blogspot.ostas.leetcode.all.easy.sqrt_x_;

/*
      69. sqrt(x)

https://leetcode.com/problems/sqrtx

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

*/
class Solution {
  public int mySqrt(int x) {
    int left = 1, right = x, half;
    while (left <= right) {
      int mid = (left + right) / 2;
      half = x / mid;
      if (half == mid) {
        return mid;
      } else if (mid > half) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return right;
  }
}