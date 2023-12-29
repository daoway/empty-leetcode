package com.blogspot.ostas.leetcode.all.hard.maximize_grid_happiness;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 2, n = 3, introvertsCount = 1, extrovertsCount = 2
    Output: 240
    Explanation: Assume the grid is 1-indexed with coordinates (row, column).
    We can put the introvert in cell (1,1) and put the extroverts in cells (1,3) and (2,3).
    - Introvert at (1,1) happiness: 120 (starting happiness) - (0 * 30) (0 neighbors) = 120
    - Extrovert at (1,3) happiness: 40 (starting happiness) + (1 * 20) (1 neighbor) = 60
    - Extrovert at (2,3) happiness: 40 (starting happiness) + (1 * 20) (1 neighbor) = 60
    The grid happiness is 120 + 60 + 60 = 240.
    The above figure shows the grid in this example with each person's happiness. The introvert stays in the light green cell while the extroverts live on the light purple cells.
    Example 2:
    Input: m = 3, n = 1, introvertsCount = 2, extrovertsCount = 1
    Output: 260
    Explanation: Place the two introverts in (1,1) and (3,1) and the extrovert at (2,1).
    - Introvert at (1,1) happiness: 120 (starting happiness) - (1 * 30) (1 neighbor) = 90
    - Extrovert at (2,1) happiness: 40 (starting happiness) + (2 * 20) (2 neighbors) = 80
    - Introvert at (3,1) happiness: 120 (starting happiness) - (1 * 30) (1 neighbor) = 90
    The grid happiness is 90 + 80 + 90 = 260.
    Example 3:
    Input: m = 2, n = 2, introvertsCount = 4, extrovertsCount = 0
    Output: 240
      Constraints:
    1 <= m, n <= 5
    0 <= introvertsCount, extrovertsCount <= min(m * n, 6)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 2;
        int n = 3;
        int introvertsCount = 1;
        int extrovertsCount = 2;
        int expected = 240;
        var result = solution.getMaxGridHappiness(m, n, introvertsCount, extrovertsCount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 3;
        int n = 1;
        int introvertsCount = 2;
        int extrovertsCount = 1;
        int expected = 260;
        var result = solution.getMaxGridHappiness(m, n, introvertsCount, extrovertsCount);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int m = 2;
        int n = 2;
        int introvertsCount = 4;
        int extrovertsCount = 0;
        int expected = 240;
        var result = solution.getMaxGridHappiness(m, n, introvertsCount, extrovertsCount);
        assertThat(result).isEqualTo(expected);
    }

}
