package com.blogspot.ostas.leetcode.all.medium.longest_turbulent_subarray;

/*
      978. longest turbulent subarray

https://leetcode.com/problems/longest-turbulent-subarray

Given an integer array arr, return the length of a maximum size turbulent subarray of arr.
A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.
More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of arr is said to be turbulent if and only if:
For i <= k < j:
arr[k] > arr[k + 1] when k is odd, and
arr[k] < arr[k + 1] when k is even.
Or, for i <= k < j:
arr[k] > arr[k + 1] when k is even, and
arr[k] < arr[k + 1] when k is odd.

*/
class Solution {
  public int maxTurbulenceSize(int[] arr) {
    return 0;
  }
}