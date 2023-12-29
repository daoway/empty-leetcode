package com.blogspot.ostas.leetcode.all.easy.sort_integers_by_the_number_of_one_bits;

/*
      1356. sort integers by the number of 1 bits

https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits

You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
Return the array after sorting it.

*/

import java.util.Arrays;

class Solution {
  public int[] sortByBits(int[] arr) {
    return Arrays.stream(arr).boxed().sorted((o1, o2) -> {
      int b1 = Integer.bitCount(o1);
      int b2 = Integer.bitCount(o2);
      if (b1 == b2) {
        return o1 - o2;
      } else {
        return b1 - b2;
      }
    }).mapToInt(Integer::intValue).toArray();
  }

  private int bytesOneCountX(int x) {
    return (int) Integer.toBinaryString(x).chars().filter(c -> Character.getNumericValue(c) == 1)
        .count();
  }

}
