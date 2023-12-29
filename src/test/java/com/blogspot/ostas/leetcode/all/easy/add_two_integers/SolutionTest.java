package com.blogspot.ostas.leetcode.all.easy.add_two_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num1 = 12, num2 = 5
    Output: 17
    Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
    Example 2:
    Input: num1 = -10, num2 = 4
    Output: -6
    Explanation: num1 + num2 = -6, so -6 is returned.
      Constraints:
    -100 <= num1, num2 <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num1 = 12;
        int num2 = 5;
        int expected = 17;
        var result = solution.sum(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num1 = -10;
        int num2 = 4;
        int expected = -6;
        var result = solution.sum(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

}
