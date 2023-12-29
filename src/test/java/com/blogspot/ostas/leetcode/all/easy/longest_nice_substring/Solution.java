package com.blogspot.ostas.leetcode.all.easy.longest_nice_substring;

/*
      1763. longest nice substring

https://leetcode.com/problems/longest-nice-substring

A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase. For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear. However, "abA" is not because 'b' appears, but 'B' does not.
Given a string s, return the longest substring of s that is nice. If there are multiple, return the substring of the earliest occurrence. If there are none, return an empty string.

*/

import java.util.HashSet;
import java.util.Set;

class Solution {
  public String longestNiceSubstring(String s) {
    int n = s.length();
    String result = "";

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j <= n; j++) {
        String substring = s.substring(i, j);
        if (isNice(substring) && substring.length() > result.length()) {
          result = substring;
        }
      }
    }

    return result;
  }

  private boolean isNice(String s) {
    Set<Character> chars = new HashSet<>();
    for (char c : s.toCharArray()) {
      chars.add(c);
    }

    for (char c : s.toCharArray()) {
      char oppositeCase =
          (Character.isUpperCase(c)) ? Character.toLowerCase(c) : Character.toUpperCase(c);
      if (!chars.contains(c) || !chars.contains(oppositeCase)) {
        return false;
      }
    }
    return true;
  }

}