package com.blogspot.ostas.leetcode.all.easy.split_a_string_in_balanced_strings;

/*
      1221. split a string in balanced strings

https://leetcode.com/problems/split-a-string-in-balanced-strings

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

*/

class Solution {
  public int balancedStringSplit(String s) {
    int result = 0;
    int balance = 0;

    for (final char aChar : s.toCharArray()) {
      if (aChar == 'L') {
        balance++;
      } else if (aChar == 'R') {
        balance--;
      }

      if (balance == 0) {
        result++;
      }
    }

    return result;
  }
}