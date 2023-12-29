package com.blogspot.ostas.leetcode.all.medium.merge_nodes_in_between_zeros;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      2181. merge nodes in between zeros

https://leetcode.com/problems/merge-nodes-in-between-zeros

You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
Return the head of the modified linked list.

*/

class Solution {
  public ListNode mergeNodes(ListNode head) {
    if(!(head!=null && head.val == 0)) return null;

    final ListNode result = new ListNode();

    while (head != null) {
      int sum = 0;
      while (head != null && head.val != 0) {
        sum += head.val;
        head = head.next;
      }
      if (sum != 0) {
        result.next = new ListNode(sum, result.next);
      }
      head = head.next;
    }
    return reverse(result.next);
  }

  private ListNode reverse(ListNode head) {
    var current = head;
    ListNode previous = null;
    while (current != null) {
      var nextElement = current.next;
      current.next = previous;
      previous = current;
      current = nextElement;
    }
    return previous;
  }
}
