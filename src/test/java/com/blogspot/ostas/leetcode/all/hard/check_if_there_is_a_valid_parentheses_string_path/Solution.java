package com.blogspot.ostas.leetcode.all.hard.check_if_there_is_a_valid_parentheses_string_path;

/*
      2267. check if there is a valid parentheses string path

https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path

A parentheses string is a non-empty string consisting only of '(' and ')'. It is valid if any of the following conditions is true:
It is ().
It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
It can be written as (A), where A is a valid parentheses string.
You are given an m x n matrix of parentheses grid. A valid parentheses string path in the grid is a path satisfying all of the following conditions:
The path starts from the upper left cell (0, 0).
The path ends at the bottom-right cell (m - 1, n - 1).
The path only ever moves down or right.
The resulting parentheses string formed by the path is valid.
Return true if there exists a valid parentheses string path in the grid. Otherwise, return false.

*/
class Solution {
  public boolean hasValidPath(char[][] grid) {
    return false;
  }
}