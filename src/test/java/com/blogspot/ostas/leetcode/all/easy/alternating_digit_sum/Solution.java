package com.blogspot.ostas.leetcode.all.easy.alternating_digit_sum;

import java.util.ArrayList;
import java.util.List;

/*
      2544. alternating digit sum

https://leetcode.com/problems/alternating-digit-sum

You are given a positive integer n. Each digit of n has a sign according to the following rules:
The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign.

*/
class Solution {
    public int alternateDigitSum(int n) {
        int makeNegative = 1;
        int sum = 0;
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            digits.add(digit);
        }

        for (int i = digits.size() - 1; i >= 0; i--) {
            sum += (digits.get(i) * makeNegative);
            if (makeNegative == 1) {
                makeNegative = -1;
            } else {
                makeNegative = 1;
            }

        }
        return sum;
    }
}