package com.blogspot.ostas.leetcode.all.medium.flatten_nested_list_iterator;

import java.util.List;

/*
      341. flatten nested list iterator

https://leetcode.com/problems/flatten-nested-list-iterator

You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.
Implement the NestedIterator class:
NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
int next() Returns the next integer in the nested list.
boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.
Your code will be tested with the following pseudocode:
initialize iterator with nestedList
res = []
while iterator.hasNext()
    append iterator.next() to the end of res
return res
If res matches the expected flattened list, then your code will be judged as correct.

*/
class NestedIterator {
  public NestedIterator(List<NestedInteger> nestedList) {
  }

  public Integer next() {
    return null;
  }

  public boolean hasNext() {
    return false;
  }
}