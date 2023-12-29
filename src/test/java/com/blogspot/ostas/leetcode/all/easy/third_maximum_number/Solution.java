package com.blogspot.ostas.leetcode.all.easy.third_maximum_number;

/*
      414. third maximum number

https://leetcode.com/problems/third-maximum-number

Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

*/

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

class Solution {
  public int thirdMax_X(int[] nums) {
    final TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

    for (final int num : nums) {
      set.add(num);

      if (set.size() > 3) {
        set.remove(set.last());
      }
    }

    if (set.size() == 3) {
      return set.last();
    } else {
      return set.first();
    }
  }
  public int thirdMax(int[] nums) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(3); // Use a min-heap with a size of 3
    Set<Integer> seen = new HashSet<>(); // To keep track of distinct elements

    for (int num : nums) {
      if (!seen.contains(num)) {
        queue.offer(num);
        seen.add(num);

        if (queue.size() > 3) {
          queue.poll(); // Remove the smallest element if the size exceeds 3
        }
      }
    }

    if (queue.size() == 2) {
      return Math.max(queue.poll(),  queue.poll());
    }

    // The queue now contains the 3rd maximum element
    return queue.peek();
  }
}