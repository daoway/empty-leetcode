package com.blogspot.ostas.leetcode.all.easy.shuffle_the_array;

/*
      1470. shuffle the array

https://leetcode.com/problems/shuffle-the-array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

*/

import java.util.ArrayList;

class Solution {
  public int[] shuffleX(int[] nums, int n) {
    int[] x = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = nums[i];
    }

    int[] y = new int[n];
    for (int i = n, j = 0; i < 2 * n; i++, j++) {
      y[j] = nums[i];
    }

    var shuffled = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      shuffled.add(x[i]);
      shuffled.add(y[i]);
    }
    return shuffled.stream().mapToInt(Integer::intValue).toArray();
  }

  public int[] shuffle(int[] nums, int n) {
    int[] x = new int[n];
    System.arraycopy(nums, 0, x, 0, n);

    int[] y = new int[n];
    System.arraycopy(nums, n, y, 0, n);

    var shuffled = new ArrayList<Integer>();
    for (int i = 0; i < n; i++) {
      shuffled.add(x[i]);
      shuffled.add(y[i]);
    }

    return shuffled.stream().mapToInt(Integer::intValue).toArray();
  }

}
