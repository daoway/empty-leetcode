package com.blogspot.ostas.leetcode.all.easy.finding_three_digit_even_numbers.v1;

import java.util.ArrayList;
import java.util.List;

//The map is precalculated by digits array.
//Time Complexity: O(n). n = 900/2.
//Space: O(1)

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 100; i < 1000; i += 2) {
            int a = i % 10;
            int b = (i / 10) % 10;
            int c = i / 100;

            count[a]--;
            count[b]--;
            count[c]--;
            if (count[a] >= 0 && count[b] >= 0 && count[c] >= 0) {
                list.add(i);
            }

            count[a]++;
            count[b]++;
            count[c]++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}