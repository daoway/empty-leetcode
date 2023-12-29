package com.blogspot.ostas.leetcode.all.easy.find_if_path_exists_in_graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
      1971. find if path exists in graph

https://leetcode.com/problems/find-if-path-exists-in-graph

There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
You want to determine if there is a valid path that exists from vertex source to vertex destination.
Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

*/
class Solution {
  public boolean validPath(int n, int[][] edges, int start, int end) {
    Map<Integer, List<Integer>> graph = buildGraph(edges);
    Set<Integer> visited = new HashSet<>();
    return dfs(graph, visited, start, end);
  }

  private Map<Integer, List<Integer>> buildGraph(int[][] edges) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int[] edge : edges) {
      graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
      graph.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
    }
    return graph;
  }

  private boolean dfs(Map<Integer, List<Integer>> graph, Set<Integer> visited, int current,
                      int end) {
    if (current == end) {
      return true; // Found a path
    }

    visited.add(current);

    List<Integer> neighbors = graph.getOrDefault(current, new ArrayList<>());
    for (int neighbor : neighbors) {
      if (!visited.contains(neighbor) && dfs(graph, visited, neighbor, end)) {
        return true;
      }
    }

    return false;
  }
}