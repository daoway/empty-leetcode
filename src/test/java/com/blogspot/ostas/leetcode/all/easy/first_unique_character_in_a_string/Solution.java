package com.blogspot.ostas.leetcode.all.easy.first_unique_character_in_a_string;

/*
      387. first unique character in a string

https://leetcode.com/problems/first-unique-character-in-a-string

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

*/

class Solution {
  public int firstUniqChar(String s) {
    final int[] freq = new int[26];
    final char[] chars = s.toCharArray();

    for (final char c : chars) {
      freq[c - 'a']++;
    }

    for (int i = 0; i < chars.length; i++) {
      if (freq[chars[i] - 'a'] == 1) {
        return i;
      }
    }

    return -1;
  }
}
