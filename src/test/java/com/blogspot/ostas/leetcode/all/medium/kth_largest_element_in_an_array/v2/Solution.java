package com.blogspot.ostas.leetcode.all.medium.kth_largest_element_in_an_array.v2;

import java.util.PriorityQueue;

public class Solution{
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1-o2);
    for (int num : nums) {
      priorityQueue.add(num);
      if (priorityQueue.size() > k) {
        priorityQueue.remove();
      }
    }

    return priorityQueue.poll();
  }
}