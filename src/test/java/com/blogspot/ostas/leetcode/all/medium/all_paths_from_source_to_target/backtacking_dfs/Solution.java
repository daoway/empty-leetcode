package com.blogspot.ostas.leetcode.all.medium.all_paths_from_source_to_target.backtacking_dfs;

/*
      797. all paths from source to target

https://leetcode.com/problems/all-paths-from-source-to-target

Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1, find all possible paths from node 0 to node n - 1 and return them in any order.
The graph is given as follows: graph[i] is a list of all nodes you can visit from node i (i.e., there is a directed edge from node i to node graph[i][j]).

*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new ArrayList<>();
    dfs(graph, 0, new ArrayList<>(List.of(0)), result);
    return result;
  }

  private void dfs(int[][] graph, int u, List<Integer> path, List<List<Integer>> result) {
    if (u == graph.length - 1) {
      result.add(new ArrayList<>(path));
      return;
    }

    for (final int v : graph[u]) {
      path.add(v);
      dfs(graph, v, path, result);
      path.remove(path.size() - 1);
    }
  }
}