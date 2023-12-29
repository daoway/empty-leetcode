package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_balls_in_a_box.v1;

class Solution {
  private static int sumOfDigits(int i) {
    int sum = 0;
    while (i > 0) {
      sum += i % 10;
      i /= 10;
    }
    return sum;
  }

  public int countBalls(int lowLimit, int highLimit) {
    int[] freq = new int[46]; // The maximum possible sum is 9+9+9+9+9 = 45
    for (int i = lowLimit; i <= highLimit; i++) {
      int boxNumber = sumOfDigits(i);
      freq[boxNumber]++;
    }

    int maxCount = 0;
    for (final int count : freq) {
      maxCount = Math.max(maxCount, count);
    }

    return maxCount;
  }
}