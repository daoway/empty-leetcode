package com.blogspot.ostas.leetcode.all.easy.power_of_three;

/*
      326. power of three

https://leetcode.com/problems/power-of-three

Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.

*/

class Solution {
  public boolean isPowerOfThree(int n) {
    if (n == 0) {
      return false;
    }
    if (n == 1) {
      return true;
    }
    if (n % 3 == 0) {
      return isPowerOfThree(n / 3);
    } else {
      return false;
    }
  }
}