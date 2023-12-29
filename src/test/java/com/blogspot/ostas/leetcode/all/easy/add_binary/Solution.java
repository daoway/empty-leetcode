package com.blogspot.ostas.leetcode.all.easy.add_binary;

/*
      67. add binary

https://leetcode.com/problems/add-binary

Given two binary strings a and b, return their sum as a binary string.

*/
import java.math.BigInteger;

class Solution {
  public String addBinary(String a, String b) {
    //return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    return (new BigInteger(a, 2)).add(new BigInteger(b,2)).toString(2);
  }
}