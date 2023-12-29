package com.blogspot.ostas.leetcode.all.easy.palindrome_number;

/*
      9. palindrome number

https://leetcode.com/problems/palindrome-number

Given an integer x, return true if x is a
palindrome
, and false otherwise.

*/


class Solution {
  public boolean isPalindrome(int x) {
    var array = String.valueOf(x).getBytes();
    for (int i = 0, j = array.length - 1; i < array.length - 1 && j > 0; i++, j--) {
      if (array[i] != array[j]) {
        return false;
      }
    }
    return true;
  }
}
