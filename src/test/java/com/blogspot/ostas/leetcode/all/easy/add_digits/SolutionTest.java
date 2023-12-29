package com.blogspot.ostas.leetcode.all.easy.add_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 38
    Output: 2
    Explanation: The process is
    38 --> 3 + 8 --> 11
    11 --> 1 + 1 --> 2
    Since 2 has only one digit, return it.
    Example 2:
    Input: num = 0
    Output: 0
      Constraints:
    0 <= num <= 231 - 1
      Follow up: Could you do it without any loop/recursion in O(1) runtime?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num = 38;
        int expected = 2;
        var result = solution.addDigits(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num = 0;
        int expected = 0;
        var result = solution.addDigits(num);
        assertThat(result).isEqualTo(expected);
    }

}
