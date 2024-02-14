package com.blogspot.ostas.leetcode.all.medium.sort_integers_by_the_power_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: lo = 12, hi = 15, k = 2
    Output: 13
    Explanation: The power of 12 is 9 (12 --> 6 --> 3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1)
    The power of 13 is 9
    The power of 14 is 17
    The power of 15 is 17
    The interval sorted by the power value [12,13,14,15]. For k = 2 answer is the second element which is 13.
    Notice that 12 and 13 have the same power value and we sorted them in ascending order. Same for 14 and 15.
    Example 2:
    Input: lo = 7, hi = 11, k = 4
    Output: 7
    Explanation: The power array corresponding to the interval [7, 8, 9, 10, 11] is [16, 3, 19, 6, 14].
    The interval sorted by power is [8, 10, 11, 7, 9].
    The fourth number in the sorted array is 7.
      Constraints:
    1 <= lo <= hi <= 1000
    1 <= k <= hi - lo + 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int lo = 12;
        int hi = 15;
        int k = 2;
        int expected = 13;
        var result = solution.getKth(lo, hi, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int lo = 7;
        int hi = 11;
        int k = 4;
        int expected = 7;
        var result = solution.getKth(lo, hi, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int lo = 10;
        int hi = 20;
        int k = 5;
        int expected = 13;
        var result = solution.getKth(lo, hi, k);
        assertThat(result).isEqualTo(expected);
    }
}
