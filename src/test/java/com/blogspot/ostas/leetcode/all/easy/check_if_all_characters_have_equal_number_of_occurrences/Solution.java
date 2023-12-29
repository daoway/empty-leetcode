package com.blogspot.ostas.leetcode.all.easy.check_if_all_characters_have_equal_number_of_occurrences;

/*
      1941. check if all characters have equal number of occurrences

https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences

Given a string s, return true if s is a good string, or false otherwise.
A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
  public boolean areOccurrencesEqual(String s) {
    final Map<Character, Integer> map = new HashMap<>();
    for (final char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return new HashSet<>(map.values()).size() == 1;
  }
}