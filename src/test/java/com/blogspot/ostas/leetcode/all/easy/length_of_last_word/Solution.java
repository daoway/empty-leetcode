package com.blogspot.ostas.leetcode.all.easy.length_of_last_word;

/*
      58. length of last word

https://leetcode.com/problems/length-of-last-word

Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal
substring
consisting of non-space characters only.

*/

public class Solution{
  public int lengthOfLastWord(String s) {
    var x = s.split("\\W+");
    return x[x.length-1].length();
  }
}