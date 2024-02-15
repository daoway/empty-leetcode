package com.blogspot.ostas.leetcode.all.medium.triangle;

import java.util.Comparator;
import java.util.List;

/*
      120. triangle

https://leetcode.com/problems/triangle

Given a triangle array, return the minimum path sum from top to bottom.
For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.

*/
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return triangle.stream().map(row -> row.stream().min(Comparator.naturalOrder()).get()).mapToInt(Integer::intValue).sum();
    }
}