package com.blogspot.ostas.leetcode.all.easy.sort_array_by_parity.naive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
      905. sort array by parity

https://leetcode.com/problems/sort-array-by-parity

Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
Return any array that satisfies this condition.

*/

class Solution {
  public int[] sortArrayByParityX(int[] nums) {
    List<Integer> even =
        new ArrayList<>(Arrays.stream(nums).filter(x -> x % 2 == 0).boxed().toList());
    List<Integer> odd = Arrays.stream(nums).filter(x -> x % 2 != 0).boxed().toList();
    even.addAll(odd);
    return even.stream().mapToInt(Integer::intValue).toArray();
  }

  public int[] sortArrayByParity(int[] nums) {
    List<Integer> odd = new ArrayList<>();
    List<Integer> even = new ArrayList<>();
    for (final int n : nums) {
      if (n % 2 == 0) {
        even.add(n);
      } else {
        odd.add(n);
      }
    }
    even.addAll(odd);
    return even.stream().mapToInt(Integer::intValue).toArray();
  }

}