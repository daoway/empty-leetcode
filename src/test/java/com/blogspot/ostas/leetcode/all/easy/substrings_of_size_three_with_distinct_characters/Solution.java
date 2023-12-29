package com.blogspot.ostas.leetcode.all.easy.substrings_of_size_three_with_distinct_characters;

/*
      1876. substrings of size three with distinct characters

https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters

A string is good if there are no repeated characters.
Given a string s, return the number of good substrings of length three in s.
Note that if there are multiple occurrences of the same substring, every occurrence should be counted.
A substring is a contiguous sequence of characters in a string.

*/

import java.util.stream.Collectors;

class Solution {
  public int countGoodSubstrings(String s) {
    char[] chars = s.toCharArray();
    int n = chars.length;
    if (n == 1 || n == 2) {
      return 0;
    }
    int start = 0;
    int end = 0;

    int result = 0;
    while (end != n) {
      while (end != start + 3) {
        end++;
      }
      var substring = s.substring(start, end);
      var x = substring.chars().boxed().collect(Collectors.toSet());
      if (x.size() == 3) {
        result++;
      }
      start++;
    }
    return result;
  }
}
