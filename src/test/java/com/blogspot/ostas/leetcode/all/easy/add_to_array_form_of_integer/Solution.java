package com.blogspot.ostas.leetcode.all.easy.add_to_array_form_of_integer;

import java.util.List;

/*
      989. add to array-form of integer

https://leetcode.com/problems/add-to-array-form-of-integer

The array-form of an integer num is an array representing its digits in left to right order.
For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

*/
import java.math.BigInteger;
import java.util.List;

class Solution {
  public List<Integer> addToArrayForm(int[] num, int k) {
    final StringBuilder stringBuilder = new StringBuilder();
    for (final var n : num){
      stringBuilder.append(n);
    }
    return (new BigInteger(stringBuilder.toString()))
        .add(BigInteger.valueOf(k))
        .toString().chars()
        .map(Character::getNumericValue).boxed().toList();
  }

}