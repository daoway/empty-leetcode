package com.blogspot.ostas.leetcode.all.easy.design_hashmap;

/*
      706. design hashmap

https://leetcode.com/problems/design-hashmap

Design a HashMap without using any built-in hash table libraries.
Implement the MyHashMap class:
MyHashMap() initializes the object with an empty map.
void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.

*/
class MyHashMap {
  private final int bucketsCount = 1024;
  public ListNode[] data = new ListNode[bucketsCount];

  public MyHashMap() {
    for (int i = 0; i < bucketsCount; i++) {
      data[i] = new ListNode();
    }
  }

  public void put(int key, int value) {
    ListNode head = bucketNumberByKey(key);
    if (head == null) {
      data[hash(key)] = new ListNode();
    }
    if (data[hash(key)].keyval == null) {
      data[hash(key)].keyval = new MyKeyVal(key, value);
    } else {
      //in head
      //find key with value "key" and replace keyval value with new value
      ListNode dummy = new ListNode(null, head);
      var current = dummy.next;
      while (current != null) {
        if (current.keyval.getKey() == key) {
          current.keyval.setValue(value);
          return;
        }
        current = current.next;
      }
      head.next = new ListNode(new MyKeyVal(key, value), head.next);
    }
  }

  private ListNode bucketNumberByKey(int key) {
    int bucketNumber = hash(key);
    return data[bucketNumber];
  }

  public int get(int key) {
    ListNode head = bucketNumberByKey(key);
    ListNode dummy = new ListNode(null, head);
    var current = dummy.next;
    while (current != null) {
      if (current.keyval != null && current.keyval.getKey() == key) {
        return current.keyval.getValue();
      }
      current = current.next;
    }
    return -1;
  }

  public void remove(int key) {
    var hash = hash(key);
    var dummy = new ListNode(null, data[hash]);
    var current = dummy.next;
    var prev = dummy;
    while (current!=null && current.keyval!=null && current.keyval.getKey() != key){
      prev = prev.next;
      current = current.next;
    }
    if(current == null) return;
    prev.next = current.next;
    data[hash] = dummy.next;
  }

  private int hash(int key) {
    return key % bucketsCount;
  }

  public static final class MyKeyVal {
    int key;
    int value;

    public MyKeyVal(int key, int value) {
      this.key = key;
      this.value = value;
    }

    public int getKey() {
      return key;
    }

    public void setKey(int key) {
      this.key = key;
    }

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "{ " +
          key +
          ", " + value +
          " }";
    }
  }

  class ListNode {
    public MyKeyVal keyval;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(MyKeyVal val, ListNode next) {
      this.keyval = val;
      this.next = next;
    }
  }
}
/**
 * Your MyHashMap object will be instantiated and called as such: * MyHashMap obj = new MyHashMap(); * obj.put(key,value); * int param_2 = obj.get(key); * obj.remove(key);
 */