package com.blogspot.ostas.leetcode.all.hard.count_k_subsequences_of_a_string_with_maximum_beauty;

/*
      2842. count k-subsequences of a string with maximum beauty

https://leetcode.com/problems/count-k-subsequences-of-a-string-with-maximum-beauty

You are given a string s and an integer k.
A k-subsequence is a subsequence of s, having length k, and all its characters are unique, i.e., every character occurs once.
Let f(c) denote the number of times the character c occurs in s.
The beauty of a k-subsequence is the sum of f(c) for every character c in the k-subsequence.
For example, consider s = "abbbdd" and k = 2:
f('a') = 1, f('b') = 3, f('d') = 2
Some k-subsequences of s are:
"abbbdd" -> "ab" having a beauty of f('a') + f('b') = 4
"abbbdd" -> "ad" having a beauty of f('a') + f('d') = 3
"abbbdd" -> "bd" having a beauty of f('b') + f('d') = 5
Return an integer denoting the number of k-subsequences whose beauty is the maximum among all k-subsequences. Since the answer may be too large, return it modulo 109 + 7.
A subsequence of a string is a new string formed from the original string by deleting some (possibly none) of the characters without disturbing the relative positions of the remaining characters.
Notes
f(c) is the number of times a character c occurs in s, not a k-subsequence.
Two k-subsequences are considered different if one is formed by an index that is not present in the other. So, two k-subsequences may form the same string.

*/
class Solution {
  public int countKSubsequencesWithMaxBeauty(String s, int k) {
    return 0;
  }
}