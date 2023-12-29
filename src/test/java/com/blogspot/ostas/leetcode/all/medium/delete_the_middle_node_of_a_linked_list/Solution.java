package com.blogspot.ostas.leetcode.all.medium.delete_the_middle_node_of_a_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      2095. delete the middle node of a linked list

https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list

You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

*/
class Solution {
  public ListNode deleteMiddle(ListNode head) {
    ListNode slowPointer = head;
    ListNode fastPointer = head;
    ListNode previous = null;
    // Base cases
    if (head == null)
      return null;
    if (head.next == null) {
      return null;
    }

    while (fastPointer != null && fastPointer.next != null) {
      previous = slowPointer;
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
    }
    previous.next = slowPointer.next;
    return head;
  }
}
