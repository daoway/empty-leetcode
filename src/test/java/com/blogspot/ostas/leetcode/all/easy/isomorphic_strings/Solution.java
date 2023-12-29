package com.blogspot.ostas.leetcode.all.easy.isomorphic_strings;

/*
      205. isomorphic strings

https://leetcode.com/problems/isomorphic-strings

Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public boolean isIsomorphic(String s, String t) {
    Map<Character, List<Integer>> map1 = stringToMap(s);
    Map<Character, List<Integer>> map2 = stringToMap(t);

    Iterator<List<Integer>> iterator1 = map1.values().iterator();
    Iterator<List<Integer>> iterator2 = map2.values().iterator();

    while (iterator1.hasNext() && iterator2.hasNext()) {
      List<Integer> value1 = iterator1.next();
      List<Integer> value2 = iterator2.next();
      if (!value1.equals(value2)) {
        return false;
      }
    }
    return true;
  }

  private Map<Character, List<Integer>> stringToMap(String s) {
    Map<Character, List<Integer>> charPositionMap = new LinkedHashMap<>();
    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      charPositionMap.putIfAbsent(c, new ArrayList<>());
      charPositionMap.get(c).add(i);
      //or just
      //charPositionMap.computeIfAbsent(chars[i], k -> new ArrayList<>()).add(i);
    }
    return charPositionMap;
  }
}
