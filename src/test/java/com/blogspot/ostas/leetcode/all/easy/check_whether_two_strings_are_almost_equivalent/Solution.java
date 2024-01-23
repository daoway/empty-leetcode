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
        var chars1 = word1.toCharArray();
        var chars2 = word2.toCharArray();
        //by definition both word1 and and word 2 is same length
        if (chars1.length != chars2.length) return false;
        for (int i = 0; i < chars1.length; i++) {
            frequencyCharsOfWord1[chars1[i] - 'a']++;
            frequencyCharsOfWord2[chars2[i] - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (Math.abs(frequencyCharsOfWord1[i] - frequencyCharsOfWord2[i]) > 3) return false;
        }
        return true;
    }
}