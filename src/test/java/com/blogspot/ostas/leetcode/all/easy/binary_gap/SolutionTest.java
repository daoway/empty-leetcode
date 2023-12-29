package com.blogspot.ostas.leetcode.all.easy.binary_gap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 22
    Output: 2
    Explanation: 22 in binary is "10110".
    The first adjacent pair of 1's is "10110" with a distance of 2.
    The second adjacent pair of 1's is "10110" with a distance of 1.
    The answer is the largest of these two distances, which is 2.
    Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.
    Example 2:
    Input: n = 8
    Output: 0
    Explanation: 8 in binary is "1000".
    There are not any adjacent pairs of 1's in the binary representation of 8, so we return 0.
    Example 3:
    Input: n = 5
    Output: 2
    Explanation: 5 in binary is "101".
      Constraints:
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 22;
        int expected = 2;
        var result = solution.binaryGap(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 8;
        int expected = 0;
        var result = solution.binaryGap(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int expected = 2;
        var result = solution.binaryGap(n);
        assertThat(result).isEqualTo(expected);
    }

}
