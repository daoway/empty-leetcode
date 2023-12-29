package com.blogspot.ostas.leetcode.all.hard.maximum_points_after_collecting_coins_from_all_nodes;

/*
      2920. maximum points after collecting coins from all nodes

https://leetcode.com/problems/maximum-points-after-collecting-coins-from-all-nodes

There exists an undirected tree rooted at node 0 with n nodes labeled from 0 to n - 1. You are given a 2D integer array edges of length n - 1, where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the tree. You are also given a 0-indexed array coins of size n where coins[i] indicates the number of coins in the vertex i, and an integer k.
Starting from the root, you have to collect all the coins such that the coins at a node can only be collected if the coins of its ancestors have been already collected.
Coins at nodei can be collected in one of the following ways:
Collect all the coins, but you will get coins[i] - k points. If coins[i] - k is negative then you will lose abs(coins[i] - k) points.
Collect all the coins, but you will get floor(coins[i] / 2) points. If this way is used, then for all the nodej present in the subtree of nodei, coins[j] will get reduced to floor(coins[j] / 2).
Return the maximum points you can get after collecting the coins from all the tree nodes.

*/
class Solution {
  public int maximumPoints(int[][] edges, int[] coins, int k) {
    return 0;
  }
}