package com.blogspot.ostas.leetcode.all.hard.least_operators_to_express_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: x = 3, target = 19
    Output: 5
    Explanation: 3 * 3 + 3 * 3 + 3 / 3.
    The expression contains 5 operations.
    Example 2:
    Input: x = 5, target = 501
    Output: 8
    Explanation: 5 * 5 * 5 * 5 - 5 * 5 * 5 + 5 / 5.
    The expression contains 8 operations.
    Example 3:
    Input: x = 100, target = 100000000
    Output: 3
    Explanation: 100 * 100 * 100 * 100.
    The expression contains 3 operations.
      Constraints:
    2 <= x <= 100
    1 <= target <= 2 * 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int x = 3;
        int target = 19;
        int expected = 5;
        var result = solution.leastOpsExpressTarget(x, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int x = 5;
        int target = 501;
        int expected = 8;
        var result = solution.leastOpsExpressTarget(x, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int x = 100;
        int target = 100000000;
        int expected = 3;
        var result = solution.leastOpsExpressTarget(x, target);
        assertThat(result).isEqualTo(expected);
    }

}
