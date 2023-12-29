package com.blogspot.ostas.leetcode.all.easy.find_words_containing_character;

import java.util.List;

/*
      2942. find words containing character

https://leetcode.com/problems/find-words-containing-character

You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.

*/


import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
  public List<Integer> findWordsContaining(String[] words, char x) {
    return IntStream.range(0, words.length)
        .filter(ind -> words[ind].contains(Character.toString(x))).boxed()
        .collect(Collectors.toList());
  }
}
