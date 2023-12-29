package com.blogspot.ostas.leetcode.all.easy.word_pattern;

/*
      290. word pattern

https://leetcode.com/problems/word-pattern

Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

*/
import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean wordPattern(String pattern, String s) {
    var chars = pattern.toCharArray();
    var words = s.split("\\W+");
    if (chars.length != words.length) {
      return false;
    }
    Map<Character, String> map = new HashMap<>();

    for (int i = 0; i < chars.length; i++) {
      char currentChar = chars[i];
      String currentWord = words[i];

      if (!map.containsKey(currentChar)) {
        if (map.containsValue(currentWord)) {
          return false; // The word is already mapped to another character
        }
        map.put(currentChar, currentWord);
      } else {
        if (!map.get(currentChar).equals(currentWord)) {
          return false; // Mismatched mapping
        }
      }
    }

    return true;
  }
}