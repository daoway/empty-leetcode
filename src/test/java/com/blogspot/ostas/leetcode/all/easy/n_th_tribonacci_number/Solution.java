package com.blogspot.ostas.leetcode.all.easy.n_th_tribonacci_number;

/*
      1137. n-th tribonacci number

https://leetcode.com/problems/n-th-tribonacci-number

The Tribonacci sequence Tn is defined as follows: 
T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
Given n, return the value of Tn.

*/

class Solution {
  public int tribonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    if (n == 2) {
      return 1;
    }
    int first = 0, second = 1, third = 1, result = 1;
    for (int i = 3; i <= n; i++) {
      result = first + second + third;
      first = second;
      second = third;
      third = result;
    }
    return result;
  }
}
