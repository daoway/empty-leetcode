package com.blogspot.ostas.leetcode.all.easy.find_subsequence_of_length_k_with_the_largest_sum;

/*
      2099. find subsequence of length k with the largest sum

https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum

You are given an integer array nums and an integer k. You want to find a subsequence of nums of length k that has the largest sum.
Return any such subsequence as an integer array of length k.
A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

*/

import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.IntStream;

class Solution {
  public int[] maxSubsequence(int[] nums, int k) {
    return IntStream.rangeClosed(0, nums.length-1)
        .boxed()
        .map(index -> new AbstractMap.SimpleEntry<>(index, nums[index]))
        .sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
        .limit(k)
        .sorted((Map.Entry.comparingByKey()))
        .mapToInt(Map.Entry::getValue).toArray();
  }
}
