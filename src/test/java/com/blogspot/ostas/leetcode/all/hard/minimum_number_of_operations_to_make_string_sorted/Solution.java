package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_operations_to_make_string_sorted;

/*
      1830. minimum number of operations to make string sorted

https://leetcode.com/problems/minimum-number-of-operations-to-make-string-sorted

You are given a string s (0-indexed). You are asked to perform the following operation on s until you get a sorted string:
Find the largest index i such that 1 <= i < s.length and s[i] < s[i - 1].
Find the largest index j such that i <= j < s.length and s[k] < s[i - 1] for all the possible values of k in the range [i, j] inclusive.
Swap the two characters at indices i - 1 and j.
Reverse the suffix starting at index i.
Return the number of operations needed to make the string sorted. Since the answer can be too large, return it modulo 109 + 7.

*/
class Solution {
  public int makeStringSorted(String s) {
    return 0;
  }
}