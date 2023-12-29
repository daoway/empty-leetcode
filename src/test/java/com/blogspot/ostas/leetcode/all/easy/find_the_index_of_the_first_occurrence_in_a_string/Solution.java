package com.blogspot.ostas.leetcode.all.easy.find_the_index_of_the_first_occurrence_in_a_string;

/*
      28. find the index of the first occurrence in a string

https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

*/
public class Solution {

  public int strStr(String haystack, String needle) {
    if (needle.length() > haystack.length()) {
      return -1;
    }
    final char[] src = haystack.toCharArray();
    final char[] tgt = needle.toCharArray();

    char first = tgt[0];
    final int max = (src.length - tgt.length);
    for (int i = 0; i <= max; i++) {
      // Look for first character.
      if (src[i] != first) {
        while (i <= max && src[i] != first) {
          i++;
        };
      }
      // Found first character, now look at the rest of v2
      if (i <= max) {
        int j = i + 1;
        int end = j + tgt.length - 1;
        int k = 1;
        while (j < end && src[j] == tgt[k]) {
          j++;
          k++;
        }
        if (j == end) {
          // Found whole string.
          return i;
        }
      }
    }
    return -1;
  }
}