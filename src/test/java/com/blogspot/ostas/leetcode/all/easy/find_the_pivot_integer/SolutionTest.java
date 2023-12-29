package com.blogspot.ostas.leetcode.all.easy.find_the_pivot_integer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 8
    Output: 6
    Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
    Example 2:
    Input: n = 1
    Output: 1
    Explanation: 1 is the pivot integer since: 1 = 1.
    Example 3:
    Input: n = 4
    Output: -1
    Explanation: It can be proved that no such integer exist.
      Constraints:
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 8;
        int expected = 6;
        var result = solution.pivotInteger(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.pivotInteger(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 4;
        int expected = -1;
        var result = solution.pivotInteger(n);
        assertThat(result).isEqualTo(expected);
    }

}
