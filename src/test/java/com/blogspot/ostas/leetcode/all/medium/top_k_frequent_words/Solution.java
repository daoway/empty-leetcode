package com.blogspot.ostas.leetcode.all.medium.top_k_frequent_words;

/*
      692. top k frequent words

https://leetcode.com/problems/top-k-frequent-words

Given an array of strings words and an integer k, return the k most frequent strings.
Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
  final Comparator<Map.Entry<String, Integer>> valueComparator =
      Map.Entry.comparingByValue(Comparator.reverseOrder());
  final Comparator<Map.Entry<String, Integer>> keyComparator = Map.Entry.comparingByKey();
  final Comparator<Map.Entry<String, Integer>> entryComparator =
      valueComparator.thenComparing(keyComparator);

  public List<String> topKFrequent(String[] words, int k) {
    final List<String> result = new ArrayList<>();
    final Map<String, Integer> map = new HashMap<>();
    for (final String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    final PriorityQueue<Map.Entry<String, Integer>> queue =
        new PriorityQueue<>(entryComparator);
    for (final var entry : map.entrySet()) {
      queue.add(entry);
    }
    int index = 0;
    while (!queue.isEmpty() && index < k) {
      result.add(queue.poll().getKey());
      index++;
    }
    return result;
  }
}
