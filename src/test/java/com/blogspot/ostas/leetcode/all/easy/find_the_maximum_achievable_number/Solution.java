package com.blogspot.ostas.leetcode.all.easy.find_the_maximum_achievable_number;

/*
      2769. find the maximum achievable number

https://leetcode.com/problems/find-the-maximum-achievable-number

You are given two integers, num and t.
An integer x is called achievable if it can become equal to num after applying the following operation no more than t times:
Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
Return the maximum possible achievable number. It can be proven that there exists at least one achievable number.

*/

class Solution {
  public int theMaximumAchievableX(int num, int t) {
    //ans - 1
    //num + 1 -max
    return num + 2 * t;
  }
}