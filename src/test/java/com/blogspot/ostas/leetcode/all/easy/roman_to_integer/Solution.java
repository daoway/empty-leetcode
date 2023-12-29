package com.blogspot.ostas.leetcode.all.easy.roman_to_integer;

/*
      13. roman to integer

https://leetcode.com/problems/roman-to-integer

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

*/

public class Solution {
  private final int[] mapping = new int[128];
  public Solution() {
    mapping['I'] =  1;
    mapping['V'] =  5;
    mapping['X'] =  10;
    mapping['L'] =  50;
    mapping['C'] =  100;
    mapping['D'] =  500;
    mapping['M'] =  1000;
  }

  public int romanToInt(String s) {
    var chars = s.toCharArray();
    var result = 0;
    for (int i = 0; i < chars.length-1; i++) {
      var current = mapping[chars[i]];
      var next = mapping[chars[i + 1]];
      if (current < next) {
        result -= current;
      } else {
        result += current;
      }
    }
    return result + mapping[chars[chars.length - 1]];
  }

}