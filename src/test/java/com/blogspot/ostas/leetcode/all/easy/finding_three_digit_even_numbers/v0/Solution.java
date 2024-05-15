package com.blogspot.ostas.leetcode.all.easy.finding_three_digit_even_numbers.v0;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] numberFreq = new int[10];
        for (final int digit : digits) {
            numberFreq[digit]++;
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 100; i <= 999; i += 2) {
            int num = i;
            int[] digitFreq = new int[10];
            while (num > 0) {
                int digit = num % 10;
                digitFreq[digit]++;
                num /= 10;
            }

            boolean res = true;

            for (int j = 0; j < 10; j++) {
                if (digitFreq[j] > numberFreq[j]) {
                    res = false;
                    break;
                }
            }

            if (res) {
                result.add(i);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}