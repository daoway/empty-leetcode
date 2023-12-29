package com.blogspot.ostas.leetcode.all.easy.middle_of_the_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      876. middle of the linked list

https://leetcode.com/problems/middle-of-the-linked-list

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

*/

class Solution {
  public ListNode middleNode(ListNode head) {
    ListNode slowPointer = head;
    ListNode fastPointer = head;
        /*
            fast pointer will go 2 times faster than slow pointer, so when it reached the end, slow pointer will be at half of the size of linked list.
            speed of traversal is the key here
         */
    while (fastPointer != null && fastPointer.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
    }
    return slowPointer;
  }
}
