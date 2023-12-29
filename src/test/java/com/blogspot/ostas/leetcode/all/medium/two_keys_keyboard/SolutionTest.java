package com.blogspot.ostas.leetcode.all.medium.two_keys_keyboard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 3
    Explanation: Initially, we have one character 'A'.
    In step 1, we use Copy All operation.
    In step 2, we use Paste operation to get 'AA'.
    In step 3, we use Paste operation to get 'AAA'.
    Example 2:
    Input: n = 1
    Output: 0
      Constraints:
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 3;
        var result = solution.minSteps(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 0;
        var result = solution.minSteps(n);
        assertThat(result).isEqualTo(expected);
    }

}
