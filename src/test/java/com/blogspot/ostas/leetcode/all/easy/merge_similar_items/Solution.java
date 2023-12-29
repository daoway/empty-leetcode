package com.blogspot.ostas.leetcode.all.easy.merge_similar_items;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
      2363. merge similar items

https://leetcode.com/problems/merge-similar-items

You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:
items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
The value of each item in items is unique.
Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.
Note: ret should be returned in ascending order by value.

*/

public class Solution {
  public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

    final Map<Integer, Integer> map = new TreeMap<>();
    for (final int[] it : items1) {
      map.put(it[0], map.getOrDefault(it[0], 0) + it[1]);
    }
    for (final int[] it : items2) {
      map.put(it[0], map.getOrDefault(it[0], 0) + it[1]);
    }

    final List<List<Integer>> results = new ArrayList<>();
    for (final Map.Entry<Integer, Integer> el : map.entrySet()) {
      results.add(List.of(el.getKey(), el.getValue()));
    }
    return results;
  }

}
