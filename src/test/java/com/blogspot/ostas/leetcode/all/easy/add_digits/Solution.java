package com.blogspot.ostas.leetcode.all.easy.add_digits;

/*
      258. add digits

https://leetcode.com/problems/add-digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

*/
class Solution {
    public int addDigits(int num) {
        if (num == 0) return 0;
        var currentSum = digitsSum(num);
        while (!(currentSum >= 0 && currentSum <= 9)) {
            currentSum = digitsSum(currentSum);
        }
        return currentSum;
    }

    public int digitsSum(int num) {
        int result = 0;
        while (num > 0) {
            result += num % 10;
            num /= 10;
        }
        return result;
    }

}