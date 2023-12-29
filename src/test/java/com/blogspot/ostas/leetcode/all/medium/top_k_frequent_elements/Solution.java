package com.blogspot.ostas.leetcode.all.medium.top_k_frequent_elements;

/*
      347. top k frequent elements

https://leetcode.com/problems/top-k-frequent-elements

Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
  public int[] topKFrequentX(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (!map.containsKey(num)) {
        map.put(num, 0);
      } else {
        map.put(num, map.get(num) + 1);
      }
    }

    Queue<Map.Entry<Integer, Integer>>
        queue = new PriorityQueue<>((a, b) -> Integer.compare(b.getValue(), a.getValue()));
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      queue.offer(entry);
    }

    var result = new int[k];
    for (int i = 0; i < k; i++) {
      result[i] = queue.poll().getKey();
    }
    return result;
  }

  public int[] topKFrequent(int[] nums, int k) {
    final int numberOfBuckets = nums.length+1;
    final Map<Integer, Integer> map = new HashMap<>();
    for (final int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    final List<Integer>[] buckets = new List[numberOfBuckets];
    for (int i = 0; i < numberOfBuckets; i++) {
      buckets[i] = new ArrayList<>();
    }
    for (final var mapEntry : map.entrySet()) {
      buckets[mapEntry.getValue()].add(mapEntry.getKey());
    }
    final int[] result = new int[k];
    int index = 0;
    for (int j = buckets.length - 1; index < k; j--) {
      for (final int value : buckets[j]) {
        result[index] = value;
        index++;
      }
    }
    return result;
  }

}
