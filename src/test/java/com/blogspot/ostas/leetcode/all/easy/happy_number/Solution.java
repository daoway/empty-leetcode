package com.blogspot.ostas.leetcode.all.easy.happy_number;

/*
      202. happy number

https://leetcode.com/problems/happy-number

Write an algorithm to determine if a number n is happy.
A happy number is a number defined by the following process:
Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

*/

class Solution {
  public boolean isHappy(int n) {
    int slow = n;
    int fast = n;

    do {
      slow = sumOfDigits(slow);          // Move one step
      fast = sumOfDigits(sumOfDigits(fast)); // Move two steps
    } while (slow != fast);

    return slow == 1; // If we reach 1, it's a happy number; otherwise, it's in a cycle.
  }

  private int sumOfDigits(int n) {
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit * digit;
      n /= 10;
    }
    return sum;
  }
}
