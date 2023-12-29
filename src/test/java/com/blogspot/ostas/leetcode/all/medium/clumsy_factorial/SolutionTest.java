package com.blogspot.ostas.leetcode.all.medium.clumsy_factorial;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: 7
    Explanation: 7 = 4 * 3 / 2 + 1
    Example 2:
    Input: n = 10
    Output: 12
    Explanation: 12 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1
      Constraints:
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int expected = 7;
        var result = solution.clumsy(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 10;
        int expected = 12;
        var result = solution.clumsy(n);
        assertThat(result).isEqualTo(expected);
    }

}
