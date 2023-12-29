package com.blogspot.ostas.leetcode.all.medium.sum_of_two_integers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 1, b = 2
    Output: 3
    Example 2:
    Input: a = 2, b = 3
    Output: 5
      Constraints:
    -1000 <= a, b <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int a = 1;
        int b = 2;
        int expected = 3;
        var result = solution.getSum(a, b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int a = 2;
        int b = 3;
        int expected = 5;
        var result = solution.getSum(a, b);
        assertThat(result).isEqualTo(expected);
    }

}
