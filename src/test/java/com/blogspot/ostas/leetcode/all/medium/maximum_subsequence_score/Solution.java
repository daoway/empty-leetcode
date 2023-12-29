package com.blogspot.ostas.leetcode.all.medium.maximum_subsequence_score;

/*
      2542. maximum subsequence score

https://leetcode.com/problems/maximum-subsequence-score

You are given two 0-indexed integer arrays nums1 and nums2 of equal length n and a positive integer k. You must choose a subsequence of indices from nums1 of length k.
For chosen indices i0, i1, ..., ik - 1, your score is defined as:
The sum of the selected elements from nums1 multiplied with the minimum of the selected elements from nums2.
It can defined simply as: (nums1[i0] + nums1[i1] +...+ nums1[ik - 1]) * min(nums2[i0] , nums2[i1], ... ,nums2[ik - 1]).
Return the maximum possible score.
A subsequence of indices of an array is a set that can be derived from the set {0, 1, ..., n-1} by deleting some or no elements.

*/

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
  static class Pair<A,B>{
    private A key;
    private B value;

    private Pair(A key, B value) {
      this.key = key;
      this.value = value;
    }

    public A getKey() {
      return key;
    }

    public void setKey(A key) {
      this.key = key;
    }

    public B getValue() {
      return value;
    }

    public void setValue(B value) {
      this.value = value;
    }
  }
  public long maxScore(int[] nums1, int[] nums2, int k) {
    long ans = 0;
    long sum = 0;
    // (nums2[i], nums1[i]) sorted by nums2[i] in descending order.
    Pair<Integer, Integer>[] pairsArray = new Pair[nums1.length];
    Queue<Integer> minHeap = new PriorityQueue<>();

    for (int i = 0; i < nums1.length; ++i)
      pairsArray[i] = new Pair<>(nums2[i], nums1[i]);

    Arrays.sort(pairsArray, (a, b) -> Integer.compare(b.getKey(), a.getKey()));

    for (Pair<Integer, Integer> a : pairsArray) {
      final int num2 = a.getKey();
      final int num1 = a.getValue();
      minHeap.offer(num1);
      sum += num1;
      if (minHeap.size() > k)
        sum -= minHeap.poll();
      if (minHeap.size() == k)
        ans = Math.max(ans, sum * num2);
    }

    return ans;
  }
}
