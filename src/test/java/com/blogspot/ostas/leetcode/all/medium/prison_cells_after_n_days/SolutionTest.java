package com.blogspot.ostas.leetcode.all.medium.prison_cells_after_n_days;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: cells = [0,1,0,1,1,0,0,1], n = 7
    Output: [0,0,1,1,0,0,0,0]
    Explanation: The following table summarizes the state of the prison on each day:
    Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
    Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
    Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
    Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
    Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
    Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
    Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
    Day 7: [0, 0, 1, 1, 0, 0, 0, 0]
    Example 2:
    Input: cells = [1,0,0,1,0,0,1,0], n = 1000000000
    Output: [0,0,1,1,1,1,1,0]
      Constraints:
    cells.length == 8
    cells[i] is either 0 or 1.
    1 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] cells = new int[]{0, 1, 0, 1, 1, 0, 0, 1};
        int n = 7;
        int[] expected = new int[]{0, 0, 1, 1, 0, 0, 0, 0};
        var result = solution.prisonAfterNDays(cells, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] cells = new int[]{1, 0, 0, 1, 0, 0, 1, 0};
        int n = 1000000000;
        int[] expected = new int[]{0, 0, 1, 1, 1, 1, 1, 0};
        var result = solution.prisonAfterNDays(cells, n);
        assertThat(result).isEqualTo(expected);
    }

}
