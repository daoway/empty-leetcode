package com.blogspot.ostas.leetcode.all.easy.divisor_game;

/*
      1025. divisor game

https://leetcode.com/problems/divisor-game

Alice and Bob take turns playing a game, with Alice starting first.
Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:
Choosing any x with 0 < x < n and n % x == 0.
Replacing the number n on the chalkboard with n - x.
Also, if a player cannot make a move, they lose the game.
Return true if and only if Alice wins the game, assuming both players play optimally.

*/
class Solution {
  public boolean divisorGameX(int n) {
    return n % 2 == 0;
  }
    public boolean divisorGame(int n) {
      final boolean[] dp = new boolean[n + 1];

      for (int i = 2; i <= n; i++) {
        for (int x = 1; x < i; x++) {
          if (i % x == 0 && !dp[i - x]) {
            dp[i] = true;
            break;
          }
        }
      }

      return dp[n];
    }
}