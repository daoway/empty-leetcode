package com.blogspot.ostas.leetcode.all.easy.ransom_note;

/*
      383. ransom note

https://leetcode.com/problems/ransom-note

Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

*/
import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    final Map<Character, Integer> magazineMap = new HashMap<>();
    for (final char c : magazine.toCharArray()) {
      magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
    }

    for (final char c : ransomNote.toCharArray()) {
      if (!magazineMap.containsKey(c) || magazineMap.get(c) <= 0) {
        return false;
      }
      magazineMap.put(c, magazineMap.get(c) - 1);
    }
    return true;
  }
}
