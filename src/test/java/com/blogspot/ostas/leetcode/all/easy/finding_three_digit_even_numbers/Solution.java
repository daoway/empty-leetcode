package com.blogspot.ostas.leetcode.all.easy.finding_three_digit_even_numbers;

import java.util.*;

/*
      2094. finding 3-digit even numbers

https://leetcode.com/problems/finding-3-digit-even-numbers

You are given an integer array digits, where each element is a digit. The array may contain duplicates.
You need to find all the unique integers that follow the given requirements:
The integer consists of the concatenation of three elements from digits in any arbitrary order.
The integer does not have leading zeros.
The integer is even.
For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.
Return a sorted array of the unique integers.

*/
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        for (int digit : digits) {
            set.add(digit);
        }
        int min3Digit = 100;
        int max3Digit = 999;
        TreeSet<Integer> result = new TreeSet<>();
        for (int i = min3Digit; i <= max3Digit; i++) {
            var candidateDigits = numberToDigits(i);
            if(set.containsAll(candidateDigits) && i % 2 == 0){
                result.add(i);
            }

        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private Set<Integer> numberToDigits(int n) {
        var result = new HashSet<Integer>();
        while (n > 0) {
            result.add(n % 10);
            n /= 10;
        }
        return result;
    }
}