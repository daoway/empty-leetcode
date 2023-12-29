package com.blogspot.ostas.leetcode.all.medium.remove_nodes_from_linked_list;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      2487. remove nodes from linked list

https://leetcode.com/problems/remove-nodes-from-linked-list

You are given the head of a linked list.
Remove every node which has a node with a greater value anywhere to the right side of it.
Return the head of the modified linked list.

*/

public class Solution {
/*
    ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
*/

  //non recursive reversal
  public ListNode reverseList(ListNode head) {
    var current = head;
    ListNode previous = null;
    while (current != null) {
      var nextElement = current.next;
      current.next = previous;
      previous = current;
      current = nextElement;
    }
    return previous;
  }


/*
    public ListNode removeNodes(ListNode head) {
        var node = reverseList(head);
        var max = node.val;
        var dummy = new ListNode();
        var res = dummy;
        while (node!=null){
            if(max <= node.val){
                max = node.val;
                res.next = new ListNode(node.val);
                res = res.next;
            }
            node = node.next;
        }
        return reverseList(dummy.next);
    }
*/

  //optimal memory solution - instead of constructing new LL and returning it, removing nodes inplace - (node.next = node.next.next;)
  public ListNode removeNodes(ListNode head) {
    var node = reverseList(head);
    var headptr = node;
    var max = node.val;

    while (node.next!=null){
      if(max > node.next.val){ // remove
        node.next = node.next.next;
      }else{
        node = node.next; // normal traversal
        max = node.val;
      }
    }
    return reverseList(headptr);
  }


}
