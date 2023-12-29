package com.blogspot.ostas.leetcode.all.medium.reverse_integer;

/*
      7. reverse integer

https://leetcode.com/problems/reverse-integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

*/

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int reverse(int x) {
    List<Integer> list = new ArrayList<>();
    int test = Math.abs(x);
    int posNeg;
    if( x > 0 ){
      posNeg = 1;
    }else{
      posNeg = -1;
    }
    while (test > 0){
      //System.out.println(x % 10);
      list.add(test % 10);
      test /= 10;
    }

    int result = 0;
    for(int i=0;i<list.size();i++){
      //System.out.println(list.get(i)*Math.pow(10,list.size() - 1 - i));
      result += list.get(i)*Math.pow(10,list.size() - 1 - i);
    }
    if(result >= Math.pow(2,31)-1) return 0;
    return result*posNeg;
  }
}