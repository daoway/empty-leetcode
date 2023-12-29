package com.blogspot.ostas.leetcode.all.easy.valid_palindrome;

/*
      125. valid palindrome

https://leetcode.com/problems/valid-palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

*/

public class Solution {
  public boolean isPalindrome(String s) {

    var array = s.toLowerCase().chars().filter(Character::isLetterOrDigit).toArray();

    for (int i = 0, j = array.length - 1; i < array.length - 1 && j > 0; i++, j--) {
      if (array[i] != array[j]) return false;
    }
    return true;
  }
}
