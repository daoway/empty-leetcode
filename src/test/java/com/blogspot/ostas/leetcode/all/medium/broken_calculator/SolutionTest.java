package com.blogspot.ostas.leetcode.all.medium.broken_calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startValue = 2, target = 3
    Output: 2
    Explanation: Use double operation and then decrement operation {2 -> 4 -> 3}.
    Example 2:
    Input: startValue = 5, target = 8
    Output: 2
    Explanation: Use decrement and then double {5 -> 4 -> 8}.
    Example 3:
    Input: startValue = 3, target = 10
    Output: 3
    Explanation: Use double, decrement and double {3 -> 6 -> 5 -> 10}.
      Constraints:
    1 <= startValue, target <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int startValue = 2;
        int target = 3;
        int expected = 2;
        var result = solution.brokenCalc(startValue, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int startValue = 5;
        int target = 8;
        int expected = 2;
        var result = solution.brokenCalc(startValue, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int startValue = 3;
        int target = 10;
        int expected = 3;
        var result = solution.brokenCalc(startValue, target);
        assertThat(result).isEqualTo(expected);
    }

}
