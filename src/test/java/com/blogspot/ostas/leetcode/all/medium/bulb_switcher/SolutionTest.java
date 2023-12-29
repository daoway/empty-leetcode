package com.blogspot.ostas.leetcode.all.medium.bulb_switcher;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 1
    Explanation: At first, the three bulbs are [off, off, off].
    After the first round, the three bulbs are [on, on, on].
    After the second round, the three bulbs are [on, off, on].
    After the third round, the three bulbs are [on, off, off].
    So you should return 1 because there is only one bulb is on.
    Example 2:
    Input: n = 0
    Output: 0
    Example 3:
    Input: n = 1
    Output: 1
      Constraints:
    0 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 1;
        var result = solution.bulbSwitch(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 0;
        int expected = 0;
        var result = solution.bulbSwitch(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.bulbSwitch(n);
        assertThat(result).isEqualTo(expected);
    }

}
