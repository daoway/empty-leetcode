package com.blogspot.ostas.leetcode.all.easy.add_strings;

/*
      415. add strings

https://leetcode.com/problems/add-strings

Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

*/
class Solution {
  public String addStrings(String num1, String num2) {
    int carry = 0;
    StringBuilder result = new StringBuilder();

    int i = num1.length() - 1;
    int j = num2.length() - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
      int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
      int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

      int sum = digit1 + digit2 + carry;
      carry = sum / 10;
      int currentDigit = sum % 10;

      result.insert(0, currentDigit); // Insert the current digit at the beginning of the result string.

      // Move to the next digits in both strings.
      i--;
      j--;
    }

    return result.toString();
  }

}