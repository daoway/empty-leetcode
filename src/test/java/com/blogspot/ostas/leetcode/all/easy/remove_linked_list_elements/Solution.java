package com.blogspot.ostas.leetcode.all.easy.remove_linked_list_elements;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      203. remove linked list elements

https://leetcode.com/problems/remove-linked-list-elements

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

*/

class Solution {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }

    ListNode cur = head;

    while (cur.next != null) {
      if (cur.next.val == val) {
        cur.next = cur.next.next;
      } else {
        cur = cur.next;
      }
    }
    if(head.val == val) return head.next;
    return head;
  }

}
