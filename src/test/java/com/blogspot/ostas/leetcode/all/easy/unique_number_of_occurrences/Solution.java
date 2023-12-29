package com.blogspot.ostas.leetcode.all.easy.unique_number_of_occurrences;

/*
      1207. unique number of occurrences

https://leetcode.com/problems/unique-number-of-occurrences

Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
  public boolean uniqueOccurrences(int[] arr) {
    Map<Integer,Integer> frequency = new HashMap<>();
    for (int i=0;i<arr.length;i++){
      frequency.put(arr[i],frequency.getOrDefault(arr[i],0)+1);
    }

    var s = new HashSet<>(frequency.values());

    return (s.size() == frequency.values().size());
  }
}