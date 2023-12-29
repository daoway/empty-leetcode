package com.blogspot.ostas.leetcode.all.easy.set_mismatch;

/*
      645. set mismatch

https://leetcode.com/problems/set-mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
You are given an integer array nums representing the data status of this set after the error.
Find the number that occurs twice and the number that is missing and return them in the form of an array.

*/

class Solution {
  public int[] findErrorNums(int[] nums) {
    final int[] result = new int[2];
    final int[] freq = new int[nums.length + 1];
    for (final int x : nums) {
      freq[x]++;
    }
    for (int i = 1; i < freq.length; i++) {
      if (freq[i] == 2) {
        result[0] = i;
      }
      if (freq[i] == 0) {
        result[1] = i;
      }

    }
    return result;
  }
}
