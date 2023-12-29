package com.blogspot.ostas.leetcode.all.easy.last_visited_integers;

import java.util.List;

/*
      2899. last visited integers

https://leetcode.com/problems/last-visited-integers

Given a 0-indexed array of strings words where words[i] is either a positive integer represented as a string or the string "prev".
Start iterating from the beginning of the array; for every "prev" string seen in words, find the last visited integer in words which is defined as follows:
Let k be the number of consecutive "prev" strings seen so far (containing the current string). Let nums be the 0-indexed array of integers seen so far and nums_reverse be the reverse of nums, then the integer at (k - 1)th index of nums_reverse will be the last visited integer for this "prev".
If k is greater than the total visited integers, then the last visited integer will be -1.
Return an integer array containing the last visited integers.

*/
class Solution {
  public List<Integer> lastVisitedIntegers(List<String> words) {
    return null;
  }
}