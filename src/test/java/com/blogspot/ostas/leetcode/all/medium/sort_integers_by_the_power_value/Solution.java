package com.blogspot.ostas.leetcode.all.medium.sort_integers_by_the_power_value;

/*
      1387. sort integers by the power value

https://leetcode.com/problems/sort-integers-by-the-power-value

The power of an integer x is defined as the number of steps needed to transform x into 1 using the following steps:
if x is even then x = x / 2
if x is odd then x = 3 * x + 1
For example, the power of x = 3 is 7 because 3 needs 7 steps to become 1 (3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1).
Given three integers lo, hi and k. The task is to sort all integers in the interval [lo, hi] by the power value in ascending order, if two or more integers have the same power value sort them by ascending order.
Return the kth integer in the range [lo, hi] sorted by the power value.
Notice that for any integer x (lo <= x <= hi) it is guaranteed that x will transform into 1 using these steps and that the power of x is will fit in a 32-bit signed integer.

*/
class Solution {
    int power(int x, int count) {
        if (x == 1) {
            return count;
        }
        if (x % 2 == 0) {
            return power(x / 2, count + 1);
        } else {
            return power(3 * x + 1, count + 1);
        }
    }

    public int getKth(int lo, int hi, int k) {
        int x = power(3, 0);
        System.out.println(x);
        return 0;
    }
}