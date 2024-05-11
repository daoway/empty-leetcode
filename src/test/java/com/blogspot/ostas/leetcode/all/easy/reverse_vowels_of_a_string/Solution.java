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
  class Letter{
    public char letter;
    public int index;
    public boolean isVowel;
    public Letter(char letter, int index, boolean isVowel) {
      this.letter = letter;
      this.index = index;
      this.isVowel = isVowel;
    }
  }
  public String reverseVowels(String s) {
    StringBuilder result = new StringBuilder(s);
    List<Letter> letters = new ArrayList<>();
    List<Integer> vowelIndexes = new ArrayList<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      boolean vowel = isVowel(c);
      letters.add(new Letter(c,i, vowel));
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