package com.blogspot.ostas.leetcode.all.easy.merge_strings_alternately;

/*
      1768. merge strings alternately

https://leetcode.com/problems/merge-strings-alternately

You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

*/

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
  public String mergeAlternatelyX(String word1, String word2) {
    final var chars1 = word1.toCharArray();
    final var chars2 = word2.toCharArray();
    final StringBuilder result = new StringBuilder();
    int ind1 = 0;
    int ind2 = 0;
    while (!(ind1 == chars1.length && ind2 == chars2.length)) {
      if (ind1 < chars1.length) {
        result.append(chars1[ind1]);
        ind1++;
      }
      if (ind2 < chars2.length) {
        result.append(chars2[ind2]);
        ind2++;
      }
    }
    return result.toString();
  }

  public String mergeAlternately(String word1, String word2) {
    final StringBuilder result = new StringBuilder();
    final Queue<Character> queue1 = new ArrayDeque<>();
    for (int i = 0; i < word1.length(); i++) {
      queue1.offer(word1.charAt(i));
    }
    final Queue<Character> queue2 = new ArrayDeque<>();
    for (int i = 0; i < word2.length(); i++) {
      queue2.offer(word2.charAt(i));
    }

    while (!(queue1.isEmpty() && queue2.isEmpty())) {
      final var x = queue1.poll();
      if (x != null) {
        result.append(x);
      }
      final var y = queue2.poll();
      if (y != null) {
        result.append(y);
      }
    }
    return result.toString();
  }

}
