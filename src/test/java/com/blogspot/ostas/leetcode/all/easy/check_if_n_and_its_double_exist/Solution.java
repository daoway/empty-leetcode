package com.blogspot.ostas.leetcode.all.easy.check_if_n_and_its_double_exist;

/*
      1346. check if n and its double exist

https://leetcode.com/problems/check-if-n-and-its-double-exist

Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

*/
import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean checkIfExist(int[] arr) {

    final Set<Integer> set = new HashSet<>();

    for (final int k : arr) {
      if (set.contains(2 * k) || (set.contains(k / 2) && k % 2 == 0)) return true;
      set.add(k);
    }

    return false;
  }

}