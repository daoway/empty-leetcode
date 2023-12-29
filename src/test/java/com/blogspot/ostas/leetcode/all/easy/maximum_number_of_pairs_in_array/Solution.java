package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_pairs_in_array;

/*
      2341. maximum number of pairs in array

https://leetcode.com/problems/maximum-number-of-pairs-in-array

You are given a 0-indexed integer array nums. In one operation, you may do the following:
Choose two integers in nums that are equal.
Remove both integers from nums, forming a pair.
The operation is done on nums as many times as possible.
Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] numberOfPairs(int[] nums) {
    final Map<Integer, Integer> map = new HashMap<>();
    for (final int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    int[] answer = new int[2];
    for (final int freq : map.values()) {
      if (freq == 1) {
        answer[1]++;
      }
      if (freq >= 2) {
        answer[0] += freq / 2;
        answer[1] += freq % 2;
      }
    }
    return answer;
  }
}
