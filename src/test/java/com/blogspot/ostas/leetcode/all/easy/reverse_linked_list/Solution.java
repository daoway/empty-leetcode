package com.blogspot.ostas.leetcode.all.easy.reverse_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      206. reverse linked list

https://leetcode.com/problems/reverse-linked-list

Given the head of a singly linked list, reverse the list, and return the reversed list.

*/

class Solution {
  public ListNode reverseListX(ListNode head) {
    ListNode previous = null;
    ListNode current = head;
    while (current != null) {
      var nextElement = current.next;
      current.next = previous;
      previous = current;
      current = nextElement;
    }
    return previous;
  }

  public ListNode reverseListXX(ListNode head) {

    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return head;
    }
    ListNode node = reverseListXX(head.next);
    head.next.next = head;
    head.next = null;
    return node;
  }

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    if (head.next == null) {
      return head;
    }
    ListNode node = new ListNode();
    while(head!=null){
      node.next = new ListNode(head.val,node.next);
      head = head.next;
    }
    return node.next;
  }


}
