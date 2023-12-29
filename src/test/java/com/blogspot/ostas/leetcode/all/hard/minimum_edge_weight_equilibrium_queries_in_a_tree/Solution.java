package com.blogspot.ostas.leetcode.all.hard.minimum_edge_weight_equilibrium_queries_in_a_tree;

/*
      2846. minimum edge weight equilibrium queries in a tree

https://leetcode.com/problems/minimum-edge-weight-equilibrium-queries-in-a-tree

There is an undirected tree with n nodes labeled from 0 to n - 1. You are given the integer n and a 2D integer array edges of length n - 1, where edges[i] = [ui, vi, wi] indicates that there is an edge between nodes ui and vi with weight wi in the tree.
You are also given a 2D integer array queries of length m, where queries[i] = [ai, bi]. For each query, find the minimum number of operations required to make the weight of every edge on the path from ai to bi equal. In one operation, you can choose any edge of the tree and change its weight to any value.
Note that:
Queries are independent of each other, meaning that the tree returns to its initial state on each new query.
The path from ai to bi is a sequence of distinct nodes starting with node ai and ending with node bi such that every two adjacent nodes in the sequence share an edge in the tree.
Return an array answer of length m where answer[i] is the answer to the ith query.

*/
class Solution {
  public int[] minOperationsQueries(int n, int[][] edges, int[][] queries) {
    return null;
  }
}