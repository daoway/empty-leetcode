package com.blogspot.ostas.leetcode.all.easy.check_if_the_sentence_is_pangram;

/*
      1832. check if the sentence is pangram

https://leetcode.com/problems/check-if-the-sentence-is-pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

*/
public class Solution {
  public boolean checkIfPangram(String sentence) {
    for (char c = 'a'; c <= 'z'; c++) {
      if (sentence.indexOf(c) == -1) {
        return false;
      }
    }
    return true;
  }
}