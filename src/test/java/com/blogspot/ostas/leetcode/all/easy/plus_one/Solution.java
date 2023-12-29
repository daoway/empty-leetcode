package com.blogspot.ostas.leetcode.all.easy.plus_one;

/*
      66. plus one

https://leetcode.com/problems/plus-one

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

*/

public class Solution {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    int lastDigit = digits[n - 1];
    if (lastDigit < 9) {
      digits[n - 1] = lastDigit + 1;
      return digits;
    } else {
      for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
          digits[i]++;
          return digits;
        }
        digits[i] = 0;
      }

      int[] ans = new int[n + 1];
      ans[0] = 1;
      return ans;
    }
  }
}
