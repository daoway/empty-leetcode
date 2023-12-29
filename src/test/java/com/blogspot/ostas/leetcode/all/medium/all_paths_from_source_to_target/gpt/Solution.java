package com.blogspot.ostas.leetcode.all.medium.all_paths_from_source_to_target.gpt;

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
    List<Integer> currentPath = new ArrayList<>();

    dfs(graph, 0, graph.length - 1, currentPath, result);

    return result;
  }

  private void dfs(int[][] graph, int current, int target, List<Integer> currentPath,
                   List<List<Integer>> result) {
    // Add the current node to the path
    currentPath.add(current);

    // If the current node is the target, add the current path to the result
    if (current == target) {
      result.add(new ArrayList<>(currentPath));
    } else {
      // Continue DFS for each neighbor of the current node
      for (int neighbor : graph[current]) {
        dfs(graph, neighbor, target, currentPath, result);
      }
    }

    // Backtrack: remove the current node from the path
    currentPath.remove(currentPath.size() - 1);
  }
}