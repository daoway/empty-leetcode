package com.blogspot.ostas.leetcode.all.medium.can_convert_string_in_k_moves;

/*
      1540. can convert string in k moves

https://leetcode.com/problems/can-convert-string-in-k-moves

Given two strings s and t, your goal is to convert s into t in k moves or less.
During the ith (1 <= i <= k) move you can:
Choose any index j (1-indexed) from s, such that 1 <= j <= s.length and j has not been chosen in any previous move, and shift the character at that index i times.
Do nothing.
Shifting a character means replacing it by the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Shifting a character by i means applying the shift operations i times.
Remember that any index j can be picked at most once.
Return true if it's possible to convert s into t in no more than k moves, otherwise return false.

*/
class Solution {
  public boolean canConvertString(String s, String t, int k) {
    return false;
  }
}