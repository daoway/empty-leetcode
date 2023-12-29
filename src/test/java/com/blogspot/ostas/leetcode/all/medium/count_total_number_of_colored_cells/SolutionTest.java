package com.blogspot.ostas.leetcode.all.medium.count_total_number_of_colored_cells;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 1
    Output: 1
    Explanation: After 1 minute, there is only 1 blue cell, so we return 1.
    Example 2:
    Input: n = 2
    Output: 5
    Explanation: After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5.
      Constraints:
    1 <= n <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 1;
        long expected = 1;
        var result = solution.coloredCells(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        long expected = 5;
        var result = solution.coloredCells(n);
        assertThat(result).isEqualTo(expected);
    }

}
