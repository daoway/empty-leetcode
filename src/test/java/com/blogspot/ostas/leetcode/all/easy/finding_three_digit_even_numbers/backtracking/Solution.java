package com.blogspot.ostas.leetcode.all.easy.finding_three_digit_even_numbers.backtracking;

import java.util.HashSet;
import java.util.Set;

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

public class Solution {
    public static int[] findEvenNumbers(int[] digits) {
        Set<Integer> uniqueIntegers = new HashSet<>();
        // Generate all permutations of three elements from digits
        permute(digits, 0, uniqueIntegers);
        return uniqueIntegers.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    private static void permute(int[] digits, int start, Set<Integer> uniqueIntegers) {
        if (start == 3) {
            // Concatenate the three digits
            int num = digits[0] * 100 + digits[1] * 10 + digits[2];
            // Check if the number is even and doesn't have leading zeros
            if (num % 2 == 0 && String.valueOf(num).length() == 3) {
                uniqueIntegers.add(num);
            }
            return;
        }

        for (int i = start; i < digits.length; i++) {
            swap(digits, i, start);
            permute(digits, start + 1, uniqueIntegers);
            swap(digits, i, start);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
