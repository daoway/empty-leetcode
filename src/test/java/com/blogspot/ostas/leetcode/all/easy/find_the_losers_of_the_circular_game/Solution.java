package com.blogspot.ostas.leetcode.all.easy.find_the_losers_of_the_circular_game;

/*
      2682. find the losers of the circular game

https://leetcode.com/problems/find-the-losers-of-the-circular-game

There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 <= i < n, and moving clockwise from the nth friend brings you to the 1st friend.
The rules of the game are as follows:
1st friend receives the ball.
After that, 1st friend passes it to the friend who is k steps away from them in the clockwise direction.
After that, the friend who receives the ball should pass it to the friend who is 2 * k steps away from them in the clockwise direction.
After that, the friend who receives the ball should pass it to the friend who is 3 * k steps away from them in the clockwise direction, and so on and so forth.
In other words, on the ith turn, the friend holding the ball should pass it to the friend who is i * k steps away from them in the clockwise direction.
The game is finished when some friend receives the ball for the second time.
The losers of the game are friends who did not receive the ball in the entire game.
Given the number of friends, n, and an integer k, return the array answer, which contains the losers of the game in the ascending order.

*/
class Solution {
  public int[] circularGameLosers(int n, int k) {
    return null;
  }
}