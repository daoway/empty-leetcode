package com.blogspot.ostas.leetcode.all.easy.merge_two_sorted_lists;

import com.blogspot.ostas.leetcode.all.common.ListNode;

/*
      21. merge two sorted lists

https://leetcode.com/problems/merge-two-sorted-lists

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

*/

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var result = new ListNode();
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            result = list1;
            result.next = mergeTwoLists(list1.next,list2);
        }else{
            result = list2;
            result.next = mergeTwoLists(list1,list2.next);
        }
        return result;
    }


  public ListNode mergeTwoListsX(ListNode list1, ListNode list2) {
    var temp_node = new ListNode();
    var current_node = temp_node;
    if(list1 == null){
      return list2;
    }
    if(list2 == null){
      return list1;
    }

    while (list1!=null && list2!=null){
      if(list1.val <list2.val){
        current_node.next = list1;
        list1 = list1.next;
      }else{
        current_node.next = list2;
        list2 = list2.next;
      }
      current_node = current_node.next;
    }

    //case when one of the lists reached the end
    //their length could be not the same,  when it's non null after previous traversal adding to current_node
    if(list1!=null){
      current_node.next = list1;
    }

    if(list2!=null){
      current_node.next = list2;
    }

    return temp_node.next;
  }

}
