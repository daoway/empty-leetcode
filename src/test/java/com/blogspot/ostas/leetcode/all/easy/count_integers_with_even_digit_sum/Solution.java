package com.blogspot.ostas.leetcode.all.easy.count_integers_with_even_digit_sum;

import java.util.stream.IntStream;

/*
      2180. count integers with even digit sum

https://leetcode.com/problems/count-integers-with-even-digit-sum

Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
The digit sum of a positive integer is the sum of all its digits.

*/
class Solution {
    public int countEven(int num) {
        return (int) IntStream.rangeClosed(2, num).boxed().filter(x -> sumDigits(x) % 2 == 0).count();
    }

    int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}