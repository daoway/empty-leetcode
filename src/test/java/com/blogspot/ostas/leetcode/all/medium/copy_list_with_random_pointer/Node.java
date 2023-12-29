package com.blogspot.ostas.leetcode.all.medium.copy_list_with_random_pointer;

// Definition for a Node.
class Node {
  int val;
  Node next;
  Node random;

  public Node(int val) {
    this.val = val;
    this.next = null;
    this.random = null;
  }
}