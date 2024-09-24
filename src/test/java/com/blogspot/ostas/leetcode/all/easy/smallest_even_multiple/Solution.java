package com.blogspot.ostas.leetcode.all.easy.smallest_even_multiple;

/*
      2413. smallest even multiple

https://leetcode.com/problems/smallest-even-multiple

Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

*/
class Solution {
  public int smallestEvenMultiple(int n) {
    return n * (n % 2 + 1);
  }
}