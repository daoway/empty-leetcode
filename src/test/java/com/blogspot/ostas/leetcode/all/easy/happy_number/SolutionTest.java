package com.blogspot.ostas.leetcode.all.easy.happy_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 19
    Output: true
    Explanation:
    12 + 92 = 82
    82 + 22 = 68
    62 + 82 = 100
    12 + 02 + 02 = 1
    Example 2:
    Input: n = 2
    Output: false
      Constraints:
    1 <= n <= 231 - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 19;
        boolean expected = true;
        var result = solution.isHappy(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        boolean expected = false;
        var result = solution.isHappy(n);
        assertThat(result).isEqualTo(expected);
    }

}
