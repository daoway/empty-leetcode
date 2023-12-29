package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_operations_to_reinitialize_a_permutation;

/*
      1806. minimum number of operations to reinitialize a permutation

https://leetcode.com/problems/minimum-number-of-operations-to-reinitialize-a-permutation

You are given an even integer n. You initially have a permutation perm of size n where perm[i] == i (0-indexed).
In one operation, you will create a new array arr, and for each i:
If i % 2 == 0, then arr[i] = perm[i / 2].
If i % 2 == 1, then arr[i] = perm[n / 2 + (i - 1) / 2].
You will then assign arr to perm.
Return the minimum non-zero number of operations you need to perform on perm to return the permutation to its initial value.

*/
class Solution {
  public int reinitializePermutation(int n) {
    return 0;
  }
}