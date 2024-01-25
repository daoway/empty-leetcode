package com.blogspot.ostas.leetcode.all.medium.k_highest_ranked_items_within_a_price_range;

import java.util.List;

/*
      2146. k highest ranked items within a price range

https://leetcode.com/problems/k-highest-ranked-items-within-a-price-range

You are given a 0-indexed 2D integer array grid of size m x n that represents a map of the items in a shop. The integers in the grid represent the following:
0 represents a wall that you cannot pass through.
1 represents an empty cell that you can freely move to and from.
All other positive integers represent the price of an item in that cell. You may also freely move to and from these item cells.
It takes 1 step to travel between adjacent grid cells.
You are also given integer arrays pricing and start where pricing = [low, high] and start = [row, col] indicates that you start at the position (row, col) and are interested only in items with a price in the range of [low, high] (inclusive). You are further given an integer k.
You are interested in the positions of the k highest-ranked items whose prices are within the given price range. The rank is determined by the first of these criteria that is different:
Distance, defined as the length of the shortest path from the start (shorter distance has a higher rank).
Price (lower price has a higher rank, but it must be in the price range).
The row number (smaller row number has a higher rank).
The column number (smaller column number has a higher rank).
Return the k highest-ranked items within the price range sorted by their rank (highest to lowest). If there are fewer than k reachable items within the price range, return all of them.

*/
class Solution {
  public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
    return null;
  }
}