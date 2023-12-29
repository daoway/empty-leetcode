package com.blogspot.ostas.leetcode.all.easy.valid_anagram;

import java.util.HashMap;
import java.util.Map;

/*
      242. valid anagram

https://leetcode.com/problems/valid-anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

*/
class Solution {
  private Map<Character, Integer> characterCount(String inputString) {
    Map<Character, Integer> charCountMap = new HashMap<>();
    char[] strArray = inputString.toCharArray();
    for (char c : strArray) {
      if (charCountMap.containsKey(c)) {
        charCountMap.put(c, charCountMap.get(c) + 1);
      }
      else {
        charCountMap.put(c, 1);
      }
    }
    return charCountMap;
  }

  public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return false;
    Map<Character,Integer> map1 = characterCount(s);
    Map<Character,Integer> map2 = characterCount(t);

    for(int i=0;i<s.length();i++){
      if(!map1.get(s.charAt(i)).equals(map2.get(s.charAt(i)))) return false;
    }
    return true;
  }
}