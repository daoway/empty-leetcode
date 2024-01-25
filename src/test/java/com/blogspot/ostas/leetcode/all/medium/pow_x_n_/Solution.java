package com.blogspot.ostas.leetcode.all.medium.pow_x_n_;

/*
      50. pow(x, n)

https://leetcode.com/problems/powx-n

Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

*/

class Solution {
  public double myPow(double x, long n) {
    if (n == 0) {
      return 1;
    }
    if (n < 0) {
      return 1 / myPow(x, -n);
    }
    if (n % 2 == 1) {
      return x * myPow(x, n - 1);
    }
    return myPow(x * x, n / 2);
  }
}
