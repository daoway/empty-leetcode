package com.blogspot.ostas.leetcode.all.medium.count_ways_to_build_good_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: low = 3, high = 3, zero = 1, one = 1
    Output: 8
    Explanation:
    One possible valid good string is "011".
    It can be constructed as follows: "" -> "0" -> "01" -> "011".
    All binary strings from "000" to "111" are good strings in this example.
    Example 2:
    Input: low = 2, high = 3, zero = 1, one = 2
    Output: 5
    Explanation: The good strings are "00", "11", "000", "110", and "011".
      Constraints:
    1 <= low <= high <= 105
    1 <= zero, one <= low
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int low = 3;
        int high = 3;
        int zero = 1;
        int one = 1;
        int expected = 8;
        var result = solution.countGoodStrings(low, high, zero, one);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int low = 2;
        int high = 3;
        int zero = 1;
        int one = 2;
        int expected = 5;
        var result = solution.countGoodStrings(low, high, zero, one);
        assertThat(result).isEqualTo(expected);
    }

}
