package com.blogspot.ostas.leetcode.all.medium.sort_integers_by_the_power_value;

import java.util.PriorityQueue;

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
    private Integer power(int x, Integer count) {
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
        final PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((a, b) -> {
            int compare = a.power.compareTo(b.power);
            if (compare == 0) {
                return a.val.compareTo(b.val);
            }
            return compare;
        });
        for (int i = lo; i <= hi; i++) {
            priorityQueue.add(Pair.of(i, power(i, 0)));
        }
        for (int i = 0; i < k - 1; i++) {
            priorityQueue.poll();
        }
        final Pair result = priorityQueue.poll();
        return result != null ? result.val : -1;
    }

    static class Pair {
        private final Integer val;
        private final Integer power;

        private Pair(int val, Integer power) {
            this.val = val;
            this.power = power;
        }

        public static Pair of(int val, Integer power) {
            return new Pair(val, power);
        }
    }
}