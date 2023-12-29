package com.blogspot.ostas.leetcode.all.easy.pascal_s_triangle;

import java.util.ArrayList;
import java.util.List;

/*
      118. pascal's triangle

https://leetcode.com/problems/pascals-triangle

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

*/

class Solution {
  public List<List<Integer>> generate(int numRows) {
    final var result = new ArrayList<List<Integer>>(numRows);
    if (numRows == 0) {
      return result;
    }
    result.add(List.of(1));
    for (int i = 2; i <= numRows; i++) {
      addNew(result);
    }
    return result;
  }

  private void addNew(final List<List<Integer>> result) {
    final var currentRow = new ArrayList<Integer>();
    final var previousRow = result.get(result.size() - 1);
    currentRow.add(1);
    for (int i = 0; i < previousRow.size() - 1; i++) {
      currentRow.add(previousRow.get(i) + previousRow.get(i + 1));
    }
    currentRow.add(1);
    result.add(currentRow);
  }
}
