package com.blogspot.ostas.leetcode.all.medium.determine_if_two_strings_are_close;

/*
      1657. determine if two strings are close

https://leetcode.com/problems/determine-if-two-strings-are-close

Two strings are considered close if you can attain one from the other using the following operations:
Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.
Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

  public boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length())
      return false;
    var set1 = toSet(word1);
    var set2 = toSet(word2);
    if (!set1.keySet().equals(set2.keySet())) {
      return false;
    }

    var freqs1 = new ArrayList<>(set1.values());
    var freqs2 = new ArrayList<>(set2.values());

    Collections.sort(freqs1);
    Collections.sort(freqs2);
    return freqs1.equals(freqs2);
  }

  private HashMap<Character, Integer> toSet(String word1) {
    var set1 = new HashMap<Character, Integer>();
    for (int i = 0; i < word1.length(); i++) {
      char key = word1.charAt(i);
      if (set1.containsKey(key)) {
        set1.put(key, set1.get(key) + 1);
      } else {
        set1.put(key, 1);
      }
    }
    return set1;
  }
}