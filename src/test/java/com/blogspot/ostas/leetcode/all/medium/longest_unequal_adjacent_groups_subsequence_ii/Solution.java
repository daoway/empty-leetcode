package com.blogspot.ostas.leetcode.all.medium.longest_unequal_adjacent_groups_subsequence_ii;

import java.util.List;

/*
      2901. longest unequal adjacent groups subsequence ii

https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-ii

You are given an integer n, a 0-indexed string array words, and a 0-indexed array groups, both arrays having length n.
The hamming distance between two strings of equal length is the number of positions at which the corresponding characters are different.
You need to select the longest subsequence from an array of indices [0, 1, ..., n - 1], such that for the subsequence denoted as [i0, i1, ..., ik - 1] having length k, the following holds:
For adjacent indices in the subsequence, their corresponding groups are unequal, i.e., groups[ij] != groups[ij + 1], for each j where 0 < j + 1 < k.
words[ij] and words[ij + 1] are equal in length, and the hamming distance between them is 1, where 0 < j + 1 < k, for all indices in the subsequence.
Return a string array containing the words corresponding to the indices (in order) in the selected subsequence. If there are multiple answers, return any of them.
A subsequence of an array is a new array that is formed from the original array by deleting some (possibly none) of the elements without disturbing the relative positions of the remaining elements.
Note: strings in words may be unequal in length.

*/
class Solution {
  public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
    return null;
  }
}