package com.blogspot.ostas.leetcode.all.easy.remove_letter_to_equalize_frequency;

/*
      2423. remove letter to equalize frequency

https://leetcode.com/problems/remove-letter-to-equalize-frequency

You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.
Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.
Note:
The frequency of a letter x is the number of times it occurs in the string.
You must remove exactly one letter and cannot choose to do nothing.

*/

class Solution {
  public boolean equalFrequency(String word) {
    int[] count = new int[26];

    for (final char c : word.toCharArray())
      count[c - 'a']++;

    // Try to remove each letter, then check if the frequency of all letters in
    // word are equal
    for (final char c : word.toCharArray()) {
      count[c - 'a']--;
      if (equalCount(count))
        return true;
      count[c - 'a']++;
    }

    return false;
  }

  private boolean equalCount(int[] count) {
    int freq = -1;
    for (final int c : count) {
      if (c == 0 || c == freq)
        continue;
      if (freq == -1)
        freq = c;
      else
        return false;
    }
    return true;
  }
}