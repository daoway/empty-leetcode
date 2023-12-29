package com.blogspot.ostas.leetcode.all.easy.climbing_stairs;

/*
      70. climbing stairs

https://leetcode.com/problems/climbing-stairs

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

*/
class Solution {
  public int climbStairs(int n) {
    double sqrt5 = Math.sqrt(5);
    double result = Math.pow((1+sqrt5)/2,n+1) - Math.pow((1-sqrt5)/2,n+1);
    return (int) (result/sqrt5);
  }
}