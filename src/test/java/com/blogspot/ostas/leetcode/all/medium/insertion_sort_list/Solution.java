package com.blogspot.ostas.leetcode.all.medium.insertion_sort_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      147. insertion sort list

https://leetcode.com/problems/insertion-sort-list

Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
The steps of the insertion sort algorithm:
Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
It repeats until no input elements remain.
The following is a graphical example of the insertion sort algorithm. The partially sorted list (black) initially contains only the first element in the list. One element (red) is removed from the input data and inserted in-place into the sorted list with each iteration.

*/

class Solution {
  public ListNode insertionSortList(ListNode head) {
    var dummyNode = new ListNode(0, head);
    ListNode curr = head, prev = dummyNode;
    while (curr != null) {
      if (curr.next != null && curr.next.val < curr.val) {
        while (prev.next != null && prev.next.val < curr.next.val) {
          prev = prev.next;
        }
        var tmp = prev.next;
        prev.next = curr.next;
        curr.next = curr.next.next;
        prev.next.next = tmp;
        prev = dummyNode;
      } else {
        curr = curr.next; //already sorted - moving forward
      }
    }
    return dummyNode.next;
  }
}
