package com.blogspot.ostas.leetcode.all.medium.design_linked_list;

/*
      707. design linked list

https://leetcode.com/problems/design-linked-list

Design your implementation of the linked list. You can choose to use a singly or doubly linked list.
A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node.
If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.
Implement the MyLinkedList class:
MyLinkedList() Initializes the MyLinkedList object.
int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
void addAtHead(int val) Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
void addAtTail(int val) Append a node of value val as the last element of the linked list.
void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list. If index equals the length of the linked list, the node will be appended to the end of the linked list. If index is greater than the length, the node will not be inserted.
void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.

*/
import java.util.Objects;

class MyLinkedList {
  static class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
      this.val = val;
    }

    public ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return "{val=" + val +
          ", next=" + next +
          '}';
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ListNode listNode = (ListNode) o;
      return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, next);
    }
  }

  private ListNode head;

  public ListNode getHead() {
    return head;
  }

  public MyLinkedList() {
  }

  public int get(int index) {
    ListNode dummy = new ListNode(0,head);
    ListNode current = dummy.next;

    int count=0;

    while (current!=null){
      if(count == index) break;
      count++;
      current = current.next;
    }
    if(current!=null) return current.val;
    return -1;
  }

  public void addAtHead(int val) {
    var n = new ListNode(val);
    n.next = head;
    head = n;
  }

  public void addAtTail(int val) {
    if(head == null){
      head = new ListNode(val);
      return;
    }
    ListNode dummy = new ListNode(0,head);
    ListNode current = dummy.next;

    while (current.next!=null){
      current = current.next;
    }
    current.next = new ListNode(val);

    head = dummy.next;
  }

  public void addAtIndex(int index, int val) {
    ListNode dummy = new ListNode(0,head);
    ListNode current = dummy.next;
    ListNode prev = dummy;

    int count=0;

    while (current!=null){
      if(count == index) break;
      count++;
      prev = prev.next;
      current = current.next;
    }
    if(index > count) return;
    //new node item to insert
    ListNode insert = new ListNode(val);
    insert.next = current;
    prev.next = insert;

    head = dummy.next;
  }

  public void deleteAtIndex(int index) {
    ListNode dummy = new ListNode(0,head);
    ListNode current = dummy.next;
    ListNode prev = dummy;

    int count=0;

    while (current!=null){
      if(count == index) break;
      count++;
      prev = prev.next;
      current = current.next;
    }
    if(current == null) return;;
    prev.next = current.next;

    head = dummy.next;
  }
}
/**
 * Your MyLinkedList object will be instantiated and called as such: * MyLinkedList obj = new MyLinkedList(); * int param_1 = obj.get(index); * obj.addAtHead(val); * obj.addAtTail(val); * obj.addAtIndex(index,val); * obj.deleteAtIndex(index);
 */