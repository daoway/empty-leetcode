package com.blogspot.ostas.leetcode.all.medium.longest_substring_without_repeating_characters;

/*
      3. longest substring without repeating characters

https://leetcode.com/problems/longest-substring-without-repeating-characters

Given a string s, find the length of the longest
substring
without repeating characters.

*/

import java.util.HashSet;

class Solution {
  public int lengthOfLongestSubstring(String s) {
    final var chars = new HashSet<Character>();
    var left = 0;
    var ans = 0;
    for (int right = 0; right < s.length(); right++) {
      while (chars.contains(s.charAt(right))) {
        chars.remove(s.charAt(left));
        left++;
      }
      chars.add(s.charAt(right));
      ans = Math.max(ans, right - left + 1);
    }
    return ans;
  }
}
