package com.blogspot.ostas.leetcode.all.easy.final_value_of_variable_after_performing_operations;

/*
      2011. final value of variable after performing operations

https://leetcode.com/problems/final-value-of-variable-after-performing-operations

There is a programming language with only four operations and one variable X:
++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.
Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

*/
class Solution {
  public int finalValueAfterOperations(String[] operations) {
    int x = 0;
    for (final String op : operations) {
      final char operand = op.charAt(1); // middle char - "--X" or "++X" -> - or +
      if (operand == '-') {
        x--;
      } else {
        x++;
      }
    }
    return x;
  }
}