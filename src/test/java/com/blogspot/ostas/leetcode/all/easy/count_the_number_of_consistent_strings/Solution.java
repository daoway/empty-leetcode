package com.blogspot.ostas.leetcode.all.easy.count_the_number_of_consistent_strings;

/*
      1684. count the number of consistent strings

https://leetcode.com/problems/count-the-number-of-consistent-strings

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

*/
import java.util.HashSet;
import java.util.Set;

public class Solution {
  private static Set<Character> toSet(final String s) {
    final Set<Character> charSet = new HashSet<>();
    for (final char c : s.toCharArray()) {
      charSet.add(c);
    }
    return charSet;
  }

  private static boolean wordConsistsExactlyFromChars(String word, Set<Character> allowedChars) {
    for (final char c : word.toCharArray()) {
      if (!allowedChars.contains(c)) {
        return false;
      }
    }
    return true;
  }

  public int countConsistentStrings(String allowed, String[] words) {
    int count = 0;
    final Set<Character> allowedChars = toSet(allowed);
    for (final String word : words) {
      if (wordConsistsExactlyFromChars(word, allowedChars)) {
        count++;
      }
    }
    return count;
  }
}
