package com.blogspot.ostas.leetcode.all.hard.median_of_two_sorted_arrays;

/*
      4. median of two sorted arrays

https://leetcode.com/problems/median-of-two-sorted-arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

*/

import java.util.PriorityQueue;

public class Solution {


  public double median(int[] numbers) {
    // Step 1: Sort the numbers in ascending order
    //Arrays.sort(numbers);

    int length = numbers.length;
    // Step 2: Check if the number of values is odd or even
    if (length % 2 != 0) {
      // Odd number of values
      return numbers[length / 2];
    } else {
      // Even number of values
      int midIndex = length / 2;
      return (numbers[midIndex - 1] + numbers[midIndex]) / 2.0;
    }
  }

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    for (int el : nums1) {
      queue.offer(el);
    }
    for (int el : nums2) {
      queue.offer(el);
    }
    int[] merged = new int[nums1.length + nums2.length];
    int i = 0;
    while (!queue.isEmpty()) {
      merged[i] = queue.poll();
      i++;
    }

    return median(merged);
  }

}
