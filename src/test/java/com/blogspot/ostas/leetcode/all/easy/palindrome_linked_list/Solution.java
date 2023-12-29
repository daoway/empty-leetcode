package com.blogspot.ostas.leetcode.all.easy.palindrome_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      234. palindrome linked list

https://leetcode.com/problems/palindrome-linked-list

Given the head of a singly linked list, return true if it is a
palindrome
or false otherwise.

*/

public class Solution {
  public boolean isPalindrome(ListNode head) {
    var secondHalf = middle(head).next;
    ListNode secondHead = reverse(secondHalf);
    ListNode left = head;
    ListNode right = secondHead;
    while (right != null) {
      if (right.val != left.val) {
        //bringing back correct order in head
        reverse(secondHalf);
        return false;
      }
      right = right.next;
      left = left.next;
    }
    //bringing back correct order in head
    reverse(secondHalf);
    return true;
  }

  public ListNode middle(ListNode head) {
    ListNode slowPointer = head;
    ListNode fastPointer = head.next; //needed for two elements list
    while (fastPointer != null && fastPointer.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
    }
    return slowPointer;
  }

  public ListNode reverse(ListNode mid) {
    ListNode previous = null;
    ListNode current = mid;
    while (current != null) {
      var temp = current.next;
      current.next = previous;
      previous = current;
      current = temp;
    }
    return previous;
  }
}
