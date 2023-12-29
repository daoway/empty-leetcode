package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_words_found_in_sentences;

/*
      2114. maximum number of words found in sentences

https://leetcode.com/problems/maximum-number-of-words-found-in-sentences

A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.

*/

import java.util.Arrays;
import java.util.Comparator;

class Solution {
  public int mostWordsFoundX(String[] sentences) {
    int max = -1;
    for (final String s : sentences) {
      var count = s.split("\\W+").length;
      if (count > max) {
        max = count;
      }
    }
    return max;
  }

  public int mostWordsFound(String[] sentences) {
    return Arrays.stream(sentences).map(s -> s.split("\\s").length).max(Comparator.naturalOrder())
        .get();
  }

}