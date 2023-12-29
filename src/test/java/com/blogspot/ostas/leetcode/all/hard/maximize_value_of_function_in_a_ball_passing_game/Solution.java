package com.blogspot.ostas.leetcode.all.hard.maximize_value_of_function_in_a_ball_passing_game;

import java.util.List;

/*
      2836. maximize value of function in a ball passing game

https://leetcode.com/problems/maximize-value-of-function-in-a-ball-passing-game

You are given a 0-indexed integer array receiver of length n and an integer k.
There are n players having a unique id in the range [0, n - 1] who will play a ball passing game, and receiver[i] is the id of the player who receives passes from the player with id i. Players can pass to themselves, i.e. receiver[i] may be equal to i.
You must choose one of the n players as the starting player for the game, and the ball will be passed exactly k times starting from the chosen player.
For a chosen starting player having id x, we define a function f(x) that denotes the sum of x and the ids of all players who receive the ball during the k passes, including repetitions. In other words, f(x) = x + receiver[x] + receiver[receiver[x]] + ... + receiver(k)[x].
Your task is to choose a starting player having id x that maximizes the value of f(x).
Return an integer denoting the maximum value of the function.
Note: receiver may contain duplicates.

*/
class Solution {
  public long getMaxFunctionValue(List<Integer> receiver, long k) {
    return 0;
  }
}