package com.blogspot.ostas.leetcode.all.easy.ugly_number;

/*
      263. ugly number

https://leetcode.com/problems/ugly-number

An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

*/
class Solution {
    public boolean isUgly(int n) {
        //without this check - Time Limit Exceeded
        if (n <= 0) {
            return false; // Ugly numbers are positive integers
        }
        // Repeatedly divide by 2, 3, and 5 until n becomes 1 (2/2 = 1) or contains other prime factors
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1; // If n is 1, it's an ugly number
    }
}