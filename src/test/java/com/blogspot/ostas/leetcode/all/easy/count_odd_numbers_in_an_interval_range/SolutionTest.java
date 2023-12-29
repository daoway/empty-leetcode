package com.blogspot.ostas.leetcode.all.easy.count_odd_numbers_in_an_interval_range;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: low = 3, high = 7
    Output: 3
    Explanation: The odd numbers between 3 and 7 are [3,5,7].
    Example 2:
    Input: low = 8, high = 10
    Output: 1
    Explanation: The odd numbers between 8 and 10 are [9].
      Constraints:
    0 <= low <= high <= 10^9
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int low = 3;
        int high = 7;
        int expected = 3;
        var result = solution.countOdds(low, high);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int low = 8;
        int high = 10;
        int expected = 1;
        var result = solution.countOdds(low, high);
        assertThat(result).isEqualTo(expected);
    }

}
