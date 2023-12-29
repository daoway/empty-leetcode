package com.blogspot.ostas.leetcode.all.hard.last_day_where_you_can_still_cross;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: row = 2, col = 2, cells = [[1,1],[2,1],[1,2],[2,2]]
    Output: 2
    Explanation: The above image depicts how the matrix changes each day starting from day 0.
    The last day where it is possible to cross from top to bottom is on day 2.
    Example 2:
    Input: row = 2, col = 2, cells = [[1,1],[1,2],[2,1],[2,2]]
    Output: 1
    Explanation: The above image depicts how the matrix changes each day starting from day 0.
    The last day where it is possible to cross from top to bottom is on day 1.
    Example 3:
    Input: row = 3, col = 3, cells = [[1,2],[2,1],[3,3],[2,2],[1,1],[1,3],[2,3],[3,2],[3,1]]
    Output: 3
    Explanation: The above image depicts how the matrix changes each day starting from day 0.
    The last day where it is possible to cross from top to bottom is on day 3.
      Constraints:
    2 <= row, col <= 2 * 104
    4 <= row * col <= 2 * 104
    cells.length == row * col
    1 <= ri <= row
    1 <= ci <= col
    All the values of cells are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int row = 2;
        int col = 2;
        int[][] cells = new int[][]{{1, 1}, {2, 1}, {1, 2}, {2, 2}};
        int expected = 2;
        var result = solution.latestDayToCross(row, col, cells);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int row = 2;
        int col = 2;
        int[][] cells = new int[][]{{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        int expected = 1;
        var result = solution.latestDayToCross(row, col, cells);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int row = 3;
        int col = 3;
        int[][] cells = new int[][]{{1, 2}, {2, 1}, {3, 3}, {2, 2}, {1, 1}, {1, 3}, {2, 3}, {3, 2},
                {3, 1}};
        int expected = 3;
        var result = solution.latestDayToCross(row, col, cells);
        assertThat(result).isEqualTo(expected);
    }

}
