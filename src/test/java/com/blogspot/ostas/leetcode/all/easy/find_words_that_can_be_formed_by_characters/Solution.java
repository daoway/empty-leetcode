package com.blogspot.ostas.leetcode.all.easy.find_words_that_can_be_formed_by_characters;

/*
      1160. find words that can be formed by characters

https://leetcode.com/problems/find-words-that-can-be-formed-by-characters

You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once).
Return the sum of lengths of all good strings in words.

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
  private static Map<Character, Integer> countCharacters(String word) {
    final Map<Character, Integer> charCount = new HashMap<>();
    for (final char c : word.toCharArray()) {
      charCount.put(c, charCount.getOrDefault(c, 0) + 1);
    }
    return charCount;
  }

  private static boolean canForm(String word, Map<Character, Integer> charCount) {
    final Map<Character, Integer> wordCount = countCharacters(word);
    for (final Map.Entry<Character, Integer> entry : wordCount.entrySet()) {
      final char c = entry.getKey();
      final int count = entry.getValue();
      if (!charCount.containsKey(c) || count > charCount.get(c)) {
        return false;
      }
    }
    return true;
  }

  public int countCharacters(String[] words, String chars) {
    final Map<Character, Integer> charCount = countCharacters(chars);
    int totalLength = 0;

    for (final String word : words) {
      if (canForm(word, charCount)) {
        totalLength += word.length();
      }
    }

    return totalLength;
  }
}
