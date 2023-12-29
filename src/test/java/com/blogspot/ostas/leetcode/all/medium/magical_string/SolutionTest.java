package com.blogspot.ostas.leetcode.all.medium.magical_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 6
    Output: 3
    Explanation: The first 6 elements of magical string s is "122112" and it contains three 1's, so return 3.
    Example 2:
    Input: n = 1
    Output: 1
      Constraints:
    1 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 6;
        int expected = 3;
        var result = solution.magicalString(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.magicalString(n);
        assertThat(result).isEqualTo(expected);
    }

}
