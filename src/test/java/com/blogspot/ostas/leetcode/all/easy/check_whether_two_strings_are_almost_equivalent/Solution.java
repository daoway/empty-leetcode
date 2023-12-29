package com.blogspot.ostas.leetcode.all.easy.check_whether_two_strings_are_almost_equivalent;

/*
      2068. check whether two strings are almost equivalent

https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent

Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.
Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.
The frequency of a letter x is the number of times it occurs in the string.

*/
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        final int[] frequencyCharsOfWord1 = new int[26];
        final int[] frequencyCharsOfWord2 = new int[26];
        for (final char ch : word1.toCharArray()) {
            frequencyCharsOfWord1[ch - 'a']++;
        }
        for (final char ch : word2.toCharArray()) {
            frequencyCharsOfWord2[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (Math.abs(frequencyCharsOfWord1[i] - frequencyCharsOfWord2[i]) > 3) return false;
        }
        return true;
    }
}