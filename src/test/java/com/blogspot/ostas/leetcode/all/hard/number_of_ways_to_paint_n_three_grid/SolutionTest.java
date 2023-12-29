package com.blogspot.ostas.leetcode.all.hard.number_of_ways_to_paint_n_three_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 12
    Explanation: There are 12 possible way to paint the grid as shown.
    Example 2:
    Input: n = 5000
    Output: 30228214
      Constraints:
    n == grid.length
    1 <= n <= 5000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        int expected = 12;
        var result = solution.numOfWays(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 5000;
        int expected = 30228214;
        var result = solution.numOfWays(n);
        assertThat(result).isEqualTo(expected);
    }

}
