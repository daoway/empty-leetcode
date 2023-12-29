package com.blogspot.ostas.leetcode.all.easy.power_of_two;

/*
      231. power of two

https://leetcode.com/problems/power-of-two

Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

*/

class Solution {
  public boolean isPowerOfTwo(int n) {
    if (n <= 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }
    if (n % 2 == 0) {
      return isPowerOfTwo(n / 2);
    } else {
      return false;
    }
  }
}
