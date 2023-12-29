package com.blogspot.ostas.leetcode.all.easy.n_repeated_element_in_size_two_n_array;

/*
      961. n-repeated element in size 2n array

https://leetcode.com/problems/n-repeated-element-in-size-2n-array

You are given an integer array nums with the following properties:
nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.

*/

import java.util.Arrays;

public class Solution {

  public int repeatedNTimes(int[] nums) {
    final int[] freq = new int[Arrays.stream(nums).max().getAsInt() + 1];
    for (final int num : nums) {
      if (++freq[num] >= 2) {
        return num;
      }
    }
    return 0;
  }

  public int repeatedNTimesXXX(int[] nums) {
    final int[] freq = new int[10000 + 1];
    for (final int num : nums) {
      freq[num]++;
      if (freq[num] == nums.length / 2) {
        return num;
      }
    }
    return 0;
  }

}