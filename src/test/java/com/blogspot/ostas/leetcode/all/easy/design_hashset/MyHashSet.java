package com.blogspot.ostas.leetcode.all.easy.design_hashset;

/*
      705. design hashset

https://leetcode.com/problems/design-hashset

Design a HashSet without using any built-in hash table libraries.
Implement MyHashSet class:
void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

*/
class MyHashSet {
  private final boolean[] set;

  /**
   * Initialize your data structure here.
   */
  public MyHashSet() {
    set = new boolean[1000001];
  }

  public void add(int key) {
    set[key] = true;
  }

  public void remove(int key) {
    set[key] = false;
  }

  /**
   * Returns true if this set contains the specified element
   */
  public boolean contains(int key) {
    return set[key];
  }
}
