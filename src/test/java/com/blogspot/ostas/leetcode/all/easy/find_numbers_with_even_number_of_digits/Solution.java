package com.blogspot.ostas.leetcode.all.easy.find_numbers_with_even_number_of_digits;

/*
      1295. find numbers with even number of digits

https://leetcode.com/problems/find-numbers-with-even-number-of-digits

Given an array nums of integers, return how many of them contain an even number of digits.

*/
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }
            if (count % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}