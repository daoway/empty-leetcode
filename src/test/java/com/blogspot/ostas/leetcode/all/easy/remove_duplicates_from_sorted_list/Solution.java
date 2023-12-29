package com.blogspot.ostas.leetcode.all.easy.remove_duplicates_from_sorted_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      83. remove duplicates from sorted list

https://leetcode.com/problems/remove-duplicates-from-sorted-list

Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

*/

class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    if(head == null) return null;
    var current = head;
    while (current.next != null) {
      if(current.val == current.next.val){
        current.next = current.next.next;
      }else {
        current = current.next;
      }
    }
    return head;
  }
}
