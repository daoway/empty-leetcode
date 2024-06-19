package com.blogspot.ostas.leetcode.all.easy.account_balance_after_rounded_purchase;

import java.math.BigDecimal;

/*
      2806. account balance after rounded purchase

https://leetcode.com/problems/account-balance-after-rounded-purchase

Initially, you have a bank account balance of 100 dollars.
You are given an integer purchaseAmount representing the amount you will spend on a purchase in dollars.
At the store where you will make the purchase, the purchase amount is rounded to the nearest multiple of 10. In other words, you pay a non-negative amount, roundedAmount, such that roundedAmount is a multiple of 10 and abs(roundedAmount - purchaseAmount) is minimized.
If there is more than one nearest multiple of 10, the largest multiple is chosen.
Return an integer denoting your account balance after making a purchase worth purchaseAmount dollars from the store.
Note: 0 is considered to be a multiple of 10 in this problem.

*/
class Solution {
  public int accountBalanceAfterPurchase(int purchaseAmount) {
    return 100 - (int) (Math.round(purchaseAmount/10.0) * 10);
  }
}