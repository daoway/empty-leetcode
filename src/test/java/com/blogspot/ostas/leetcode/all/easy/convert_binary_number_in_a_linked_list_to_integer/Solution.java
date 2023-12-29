package com.blogspot.ostas.leetcode.all.easy.convert_binary_number_in_a_linked_list_to_integer;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      1290. convert binary number in a linked list to integer

https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.

*/
class Solution {
  public int getDecimalValue(ListNode head) {
    StringBuilder stringBuilder = new StringBuilder();
    while(true){
      stringBuilder.append(head.val);
      if(head.next == null){
        break;
      }else{
        head = head.next;
      }
    }
    return  Integer.parseInt(stringBuilder.toString(),2);
  }
}