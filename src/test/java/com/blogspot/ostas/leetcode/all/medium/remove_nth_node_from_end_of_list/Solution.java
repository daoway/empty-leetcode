package com.blogspot.ostas.leetcode.all.medium.remove_nth_node_from_end_of_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      19. remove nth node from end of list

https://leetcode.com/problems/remove-nth-node-from-end-of-list

Given the head of a linked list, remove the nth node from the end of the list and return its head.

*/

class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {

    var dummy = new ListNode(0, head);
    var left  = dummy;
    var right = head;

    for(int i=0;i<n;i++){
      right = right.next;
    }

    while(right!=null){
      left = left.next;
      right = right.next;
    }
    left.next = left.next.next;

    return dummy.next;
  }
}
