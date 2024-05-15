package com.blogspot.ostas.leetcode.all.easy.finding_three_digit_even_numbers.v0;

/*

As we know that we want unique numbers of 3 digits only that too only even.  so first we
gather the frequency of all the digits we have, then we iterate from 100 to 999 ( all possible 3 digits numbers, 100,102,104...
all possible even 3 digit numbers).  for ex  we are iterating and we are
at 104  so we will see that if we have  digits
1,0,4 in our database if yes then we can make this number from our
available digits given to us.


Time complexity : O(digits.length)  // due to making of frequency map
Space Complexity : O(1) //fixed map array space for digits 0 to 9
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] numberFreq = new int[10]; // for freq of 0 to 9 (digits are fixed)

        for (int digit : digits) { //make a frequency numberFreq of digits
            numberFreq[digit]++;
        }

        List<Integer> arr = new ArrayList<>();

        for (int i = 100; i <= 999; i = i + 2) { //will always runs from 100 to 999
            int num = i;
            int[] digitFreq = new int[10];
            while (num > 0) {  // will always run 3 times
                int rem = num % 10;
                digitFreq[rem]++;
                num = num / 10;
            }

            boolean res = findans(digitFreq, numberFreq);
            if (res) arr.add(i);
        }

        return arr.stream().mapToInt(i -> i).toArray();
    }

    private boolean findans(int[] currentNum, int[] database) {

        for (int i = 0; i < 10; i++) {  //it will always run for at max 10 times
            if (currentNum[i] > database[i]) return false;
        }
        return true;
    }
}