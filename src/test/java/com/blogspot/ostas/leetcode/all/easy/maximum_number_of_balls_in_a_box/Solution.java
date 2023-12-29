package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_balls_in_a_box;

/*
      1742. maximum number of balls in a box

https://leetcode.com/problems/maximum-number-of-balls-in-a-box

You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1), and an infinite number of boxes numbered from 1 to infinity.
Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.
Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.

*/

import java.util.HashMap;
import java.util.Map;

class Solution {
  private static int sumOfDigitsX(int i) {
    int sum = 0;
    for (final char digit : String.valueOf(i).toCharArray()) {
      sum += Character.digit(digit, 10);
    }
    return sum;
  }
  private static int sumOfDigits(int i) {
    int sum = 0;
    while (i > 0) {
      sum += i % 10;
      i /= 10;
    }
    return sum;
  }

  public int countBalls(int lowLimit, int highLimit) {
    final Map<Integer, Integer> map = new HashMap<>();
    for (int i = lowLimit; i < highLimit + 1; i++) {
      var boxNumber = sumOfDigits(i);
      map.put(boxNumber, map.getOrDefault(boxNumber, 0) + 1);
    }

    return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
  }
}