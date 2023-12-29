package com.blogspot.ostas.leetcode.all.medium.find_the_duplicate_number;

/*
      287. find the duplicate number

https://leetcode.com/problems/find-the-duplicate-number

Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.

*/

class Solution {
  public int findDuplicate(int[] nums) {
    int[] freq = new int[100001];
    for(int n : nums){
      freq[n]++;
      if(freq[n]>=2) return n;
    }
    return 0;
  }
}