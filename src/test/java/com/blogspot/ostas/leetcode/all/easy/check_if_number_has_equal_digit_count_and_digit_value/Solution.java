package com.blogspot.ostas.leetcode.all.easy.check_if_number_has_equal_digit_count_and_digit_value;

/*
      2283. check if number has equal digit count and digit value

https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value

You are given a 0-indexed string num of length n consisting of digits.
Return true if for every index i in the range 0 <= i < n, the digit i occurs num[i] times in num, otherwise return false.

*/
class Solution {
  public boolean digitCount(String num) {
    var freq = new int[10];

    for (final char c : num.toCharArray()) {
      freq[c - '0']++;
    }

    for (int i = 0; i < num.length(); i++) {
      if (freq[i] != num.charAt(i) - '0') {
        return false;
      }
    }

    return true;
  }
}
