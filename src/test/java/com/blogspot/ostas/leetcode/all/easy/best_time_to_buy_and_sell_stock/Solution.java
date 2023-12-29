package com.blogspot.ostas.leetcode.all.easy.best_time_to_buy_and_sell_stock;

/*
      121. best time to buy and sell stock

https://leetcode.com/problems/best-time-to-buy-and-sell-stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

*/
class Solution {

  public int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int ans = Integer.MIN_VALUE;
    for (int val : prices) {
      min = Math.min(min, val);
      ans = Math.max(ans, val - min);
    }
    return ans;
  }
}