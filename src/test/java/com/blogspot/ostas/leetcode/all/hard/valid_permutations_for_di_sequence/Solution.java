package com.blogspot.ostas.leetcode.all.hard.valid_permutations_for_di_sequence;

/*
      903. valid permutations for di sequence

https://leetcode.com/problems/valid-permutations-for-di-sequence

You are given a string s of length n where s[i] is either:
'D' means decreasing, or
'I' means increasing.
A permutation perm of n + 1 integers of all the integers in the range [0, n] is called a valid permutation if for all valid i:
If s[i] == 'D', then perm[i] > perm[i + 1], and
If s[i] == 'I', then perm[i] < perm[i + 1].
Return the number of valid permutations perm. Since the answer may be large, return it modulo 109 + 7.

*/
class Solution {
  public int numPermsDISequence(String s) {
    return 0;
  }
}