package com.blogspot.ostas.leetcode.all.medium.flip_string_to_monotone_increasing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "00110"
    Output: 1
    Explanation: We flip the last digit to get 00111.
    Example 2:
    Input: s = "010110"
    Output: 2
    Explanation: We flip to get 011111, or alternatively 000111.
    Example 3:
    Input: s = "00011000"
    Output: 2
    Explanation: We flip to get 00000000.
      Constraints:
    1 <= s.length <= 105
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "00110";
        int expected = 1;
        var result = solution.minFlipsMonoIncr(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "010110";
        int expected = 2;
        var result = solution.minFlipsMonoIncr(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "00011000";
        int expected = 2;
        var result = solution.minFlipsMonoIncr(s);
        assertThat(result).isEqualTo(expected);
    }

}
