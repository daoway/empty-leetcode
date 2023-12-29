package com.blogspot.ostas.leetcode.all.easy.number_of_one_bits;

/*
      191. number of 1 bits

https://leetcode.com/problems/number-of-1-bits

Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
Note:
Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.

*/

public class Solution {
  public int hammingWeight(int n) {
    return Integer.bitCount(n);
  }

  public int hammingWeightXXX(int n) {
    return (int) Integer.toBinaryString(n).chars()
        .filter(x -> Character.getNumericValue(x) == 1).count();
  }

}

