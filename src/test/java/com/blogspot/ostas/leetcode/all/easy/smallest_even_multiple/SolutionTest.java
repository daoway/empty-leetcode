package com.blogspot.ostas.leetcode.all.easy.smallest_even_multiple;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5
    Output: 10
    Explanation: The smallest multiple of both 5 and 2 is 10.
    Example 2:
    Input: n = 6
    Output: 6
    Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
      Constraints:
    1 <= n <= 150
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int expected = 10;
        var result = solution.smallestEvenMultiple(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int expected = 6;
        var result = solution.smallestEvenMultiple(n);
        assertThat(result).isEqualTo(expected);
    }

}
