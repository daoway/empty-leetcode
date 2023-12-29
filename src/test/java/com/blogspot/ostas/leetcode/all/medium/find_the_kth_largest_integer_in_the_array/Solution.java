package com.blogspot.ostas.leetcode.all.medium.find_the_kth_largest_integer_in_the_array;

/*
      1985. find the kth largest integer in the array

https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array

You are given an array of strings nums and an integer k. Each string in nums represents an integer without leading zeros.
Return the string that represents the kth largest integer in nums.
Note: Duplicate numbers should be counted distinctly. For example, if nums is ["1","2","2"], "2" is the first largest integer, "2" is the second-largest integer, and "1" is the third-largest integer.

*/

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
  public String kthLargestNumber(String[] nums, int k) {
    final Queue<String> queue = new PriorityQueue<>(k,
        (a, b) -> a.length() == b.length() ? a.compareTo(b) : a.length() - b.length());
    for (final String num : nums) {
      queue.offer(num);
      if (queue.size() > k) {
        queue.poll();
      }
    }
    return queue.poll();
  }
}