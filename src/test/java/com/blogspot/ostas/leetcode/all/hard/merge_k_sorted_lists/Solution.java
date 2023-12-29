package com.blogspot.ostas.leetcode.all.hard.merge_k_sorted_lists;

/*
      23. merge k sorted lists

https://leetcode.com/problems/merge-k-sorted-lists

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

*/

import com.blogspot.ostas.leetcode.all.common.ListNode;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    for (ListNode listNode : lists) {
      while (listNode != null) {
        queue.add(listNode.val);
        listNode = listNode.next;
      }
    }
    var result = new ListNode();
    while (!queue.isEmpty()){
      result.next = new ListNode(queue.poll(),result.next);
    }
    return result.next;
  }
}