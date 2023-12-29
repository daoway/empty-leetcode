package com.blogspot.ostas.leetcode.all.medium.multiply_strings;

/*
      43. multiply strings

https://leetcode.com/problems/multiply-strings

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

*/

class Solution {
  public String multiply(String num1, String num2) {
    int m = num1.length();
    int n = num2.length();
    int[] result = new int[m + n];

    // Perform long multiplication
    for (int i = m - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
        int p1 = i + j;
        int p2 = i + j + 1;
        int sum = mul + result[p2];

        result[p1] += sum / 10;
        result[p2] = sum % 10;
      }
    }

    // Convert the result to a string
    StringBuilder sb = new StringBuilder();
    for (int digit : result) {
      if (!(sb.length() == 0 && digit == 0)) {
        sb.append(digit);
      }
    }

    return sb.length() == 0 ? "0" : sb.toString();
  }
}
