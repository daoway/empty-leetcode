package com.blogspot.ostas.leetcode.all.medium.decremental_string_concatenation;

/*
      2746. decremental string concatenation

https://leetcode.com/problems/decremental-string-concatenation

You are given a 0-indexed array words containing n strings.
Let's define a join operation join(x, y) between two strings x and y as concatenating them into xy. However, if the last character of x is equal to the first character of y, one of them is deleted.
For example join("ab", "ba") = "aba" and join("ab", "cde") = "abcde".
You are to perform n - 1 join operations. Let str0 = words[0]. Starting from i = 1 up to i = n - 1, for the ith operation, you can do one of the following:
Make stri = join(stri - 1, words[i])
Make stri = join(words[i], stri - 1)
Your task is to minimize the length of strn - 1.
Return an integer denoting the minimum possible length of strn - 1.

*/
class Solution {
  public int minimizeConcatenatedLength(String[] words) {
    return 0;
  }
}