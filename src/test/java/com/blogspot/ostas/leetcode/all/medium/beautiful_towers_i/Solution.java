package com.blogspot.ostas.leetcode.all.medium.beautiful_towers_i;

import java.util.List;

/*
      2865. beautiful towers i

https://leetcode.com/problems/beautiful-towers-i

You are given a 0-indexed array maxHeights of n integers.
You are tasked with building n towers in the coordinate line. The ith tower is built at coordinate i and has a height of heights[i].
A configuration of towers is beautiful if the following conditions hold:
1 <= heights[i] <= maxHeights[i]
heights is a mountain array.
Array heights is a mountain if there exists an index i such that:
For all 0 < j <= i, heights[j - 1] <= heights[j]
For all i <= k < n - 1, heights[k + 1] <= heights[k]
Return the maximum possible sum of heights of a beautiful configuration of towers.

*/
class Solution {
  public long maximumSumOfHeights(List<Integer> maxHeights) {
    return 0;
  }
}