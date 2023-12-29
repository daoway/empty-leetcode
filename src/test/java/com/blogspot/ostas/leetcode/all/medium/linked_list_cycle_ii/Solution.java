package com.blogspot.ostas.leetcode.all.medium.linked_list_cycle_ii;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      142. linked list cycle ii

https://leetcode.com/problems/linked-list-cycle-ii

Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.

*/

public class Solution {

  public ListNode intersect(ListNode head) {
    var slowPointer = head;
    var fastPointer = head;
    while (fastPointer != null && fastPointer.next != null) {
      fastPointer = fastPointer.next.next;
      slowPointer = slowPointer.next;
      if (slowPointer == fastPointer) {
        return slowPointer;
      }
    }
    return null;
  }

  public ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) {
      return null;
    }
    var intersect = intersect(head);
    if (intersect == null) {
      return null;
    }
    var start = head;
    while (intersect != start) {
      start = start.next;
      intersect = intersect.next;
    }
    return start;
  }

}