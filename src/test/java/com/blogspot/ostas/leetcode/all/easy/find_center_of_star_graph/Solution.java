package com.blogspot.ostas.leetcode.all.easy.find_center_of_star_graph;

import java.util.HashMap;
import java.util.Map;

/*
      1791. find center of star graph

https://leetcode.com/problems/find-center-of-star-graph

There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.
You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

*/
class Solution {
  public int findCenterX(int[][] edges) {
    int[] nodeFrequency = new int[edges.length + 2];

    for (int[] edge : edges) {
      nodeFrequency[edge[0]]++;
      nodeFrequency[edge[1]]++;

      // If any node's nodeFrequency becomes 2, it must be the center of the star -- by definition of star graph
      if (nodeFrequency[edge[0]] == 2) {
        return edge[0];
      }
      if (nodeFrequency[edge[1]] == 2) {
        return edge[1];
      }
    }

    return -1; // In case there is no center found
  }

  public int findCenter(int[][] edges) {
    Map<Integer, Integer> nodeCount = new HashMap<>();

    for (int[] edge : edges) {
      nodeCount.put(edge[0], nodeCount.getOrDefault(edge[0], 0) + 1);
      nodeCount.put(edge[1], nodeCount.getOrDefault(edge[1], 0) + 1);

      if (nodeCount.get(edge[0]) == 2) {
        return edge[0];
      }
      if (nodeCount.get(edge[1]) == 2) {
        return edge[1];
      }
    }

    return -1; // In case there is no center found
  }

}