package com.blogspot.ostas.leetcode.all.medium.odd_even_linked_list.v1;

import com.blogspot.ostas.leetcode.all.common.ListNode;

class Solution {
  public ListNode oddEvenList(ListNode head) {
    ListNode oddHead = new ListNode(0);
    ListNode evenHead = new ListNode(0);
    ListNode odd = oddHead;
    ListNode even = evenHead;

    boolean isOdd = true;

    while (head != null) {
      if (isOdd) {
        odd.next = head;
        odd = odd.next;
      } else {
        even.next = head;
        even = even.next;
      }
      head = head.next;
      isOdd = !isOdd;
    }

    odd.next = evenHead.next;
    even.next = null;
    return oddHead.next;
  }
}
