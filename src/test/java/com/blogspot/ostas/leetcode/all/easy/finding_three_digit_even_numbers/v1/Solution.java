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
        int a,b,c;
        for (int i = 100; i < 1000; i += 2) {
            a = i % 10;
            b = (i / 10) % 10;
            c = i / 100;

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

//        int [] res = new int[list.size()];
//        for(int i = 0; i < res.length; i++){
//            res[i] = list.get(i);
//        }
//        return res;

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}