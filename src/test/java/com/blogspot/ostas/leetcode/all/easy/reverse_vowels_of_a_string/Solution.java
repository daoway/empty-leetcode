package com.blogspot.ostas.leetcode.all.easy.reverse_vowels_of_a_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
      345. reverse vowels of a string

https://leetcode.com/problems/reverse-vowels-of-a-string

Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

*/
class Solution {
  public String reverseVowels(String s) {
    final StringBuilder result = new StringBuilder(s);
    final List<Integer> vowelIndexes = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      boolean vowel = isVowel(s.charAt(i));
      if(vowel) {
        vowelIndexes.add(i);
      }
    }

    List<Integer> reverseVowelIndexes = vowelIndexes.reversed();
    Map<Integer, Integer> indexMap = new HashMap<>();
    for (int i=0;i<vowelIndexes.size();i++) {
      indexMap.put(vowelIndexes.get(i), reverseVowelIndexes.get(i));
    }

    for (Map.Entry<Integer, Integer> entry : indexMap.entrySet()) {
      result.setCharAt(entry.getKey(), s.charAt(entry.getValue()));
    }

    return result.toString();
  }

  private boolean isVowel(char c) {
    return c == 'a' || c == 'e' ||  c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
  }
}