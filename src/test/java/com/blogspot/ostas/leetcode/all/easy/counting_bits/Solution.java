package com.blogspot.ostas.leetcode.all.easy.counting_bits;

/*
      338. counting bits

https://leetcode.com/problems/counting-bits

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

*/
class Solution {
  public int[] countBits(int n) {
    int[] result = new int[n+1];
    for(int i=0;i<=n;i++){
      var s = Integer.toBinaryString(i);
      for(int j=0;j<s.length();j++){
        if(s.charAt(j) == '1') result[i]++;
      }
    }
    return result;
  }
}
