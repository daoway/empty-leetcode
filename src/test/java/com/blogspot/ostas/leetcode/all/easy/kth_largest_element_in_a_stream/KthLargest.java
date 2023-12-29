package com.blogspot.ostas.leetcode.all.easy.kth_largest_element_in_a_stream;

/*
      703. kth largest element in a stream

https://leetcode.com/problems/kth-largest-element-in-a-stream

Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order, not the kth distinct element.
Implement KthLargest class:
KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.

*/

import java.util.PriorityQueue;
import java.util.Queue;

class KthLargest {
  private final int k;
  private final Queue<Integer> queue;

  public KthLargest(int k, int[] nums) {
    this.k = k;
    queue = new PriorityQueue<>(k);
    for (final int num : nums) {
      heapify(num);
    }
  }

  public int add(int val) {
    heapify(val);
    return queue.peek();
  }

  private void heapify(int val) {
    queue.offer(val);
    if (queue.size() > k) {
      queue.poll();
    }
  }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */