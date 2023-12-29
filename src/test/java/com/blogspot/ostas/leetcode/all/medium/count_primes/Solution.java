package com.blogspot.ostas.leetcode.all.medium.count_primes;

/*
      204. count primes

https://leetcode.com/problems/count-primes

Given an integer n, return the number of prime numbers that are strictly less than n.

*/
class Solution {
    //Time Limit Exceeded
    private boolean isPrime(int i) {
        if (i <= 1) {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false; // i has a divisor other than 1 and itself
            }
        }

        return true; // i is a prime number
    }

    public int countPrimes(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) result++;
        }
        return result;
    }
}