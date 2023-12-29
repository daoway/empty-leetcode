package com.blogspot.ostas.leetcode.all.medium.flatten_nested_list_iterator;

import java.util.List;

// You should not implement it, or speculate about its implementation
public interface NestedInteger {

  // @return true if this NestedInteger holds a single integer, rather than a nested list.
  boolean isInteger();

  // @return the single integer that this NestedInteger holds, if it holds a single integer
  // Return null if this NestedInteger holds a nested list
  Integer getInteger();

  // @return the nested list that this NestedInteger holds, if it holds a nested list
  // Return empty list if this NestedInteger holds a single integer
  List<NestedInteger> getList();
}