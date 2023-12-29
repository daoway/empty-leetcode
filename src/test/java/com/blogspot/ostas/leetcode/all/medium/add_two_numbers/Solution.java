package com.blogspot.ostas.leetcode.all.medium.add_two_numbers;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      2. add two numbers

https://leetcode.com/problems/add-two-numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

*/
import java.math.BigInteger;
public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    var x0 = new BigInteger(listNodeToInt(l1));
    var x1 = new BigInteger(listNodeToInt(l2));
    var nodesAsString = x0.add(x1).toString();
    var xx = new ListNode();
    for(int i=0;i<nodesAsString.length();i++){
      var x = Character.toString(nodesAsString.charAt(i));
      var val = Integer.parseInt(x);
      xx.next = new ListNode(val,xx.next);
    }
    return xx.next;
  }

  public String listNodeToInt(ListNode head){
    var sb = new StringBuilder();
    while (head!=null){
      sb.append(head.val);
      head = head.next;
    }
    return sb.reverse().toString();
  }
}
