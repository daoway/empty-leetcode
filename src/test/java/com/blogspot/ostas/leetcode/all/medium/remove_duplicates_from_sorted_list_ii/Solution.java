package com.blogspot.ostas.leetcode.all.medium.remove_duplicates_from_sorted_list_ii;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      82. remove duplicates from sorted list ii

https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii

Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

*/

public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(0, head);
    ListNode previous = dummy;
    while (head != null) {
      //if in head current node equals to next
      if (head.next != null && head.val == head.next.val) {
        //iterate all nodes with same values
        //after while head will be last node with exact value and (!) head.next will not contain duplicates
        while (head.next != null && head.val == head.next.val) {
          head = head.next;
        }
        //changing the pointer from node previous to next node with equal value
        previous.next = head.next;
      } else {
        // if no save values, still tracking previos node!
        previous = previous.next;
      }

      //moving head pointer for list traversal
      head = head.next;
    }
    return dummy.next;
  }
}
