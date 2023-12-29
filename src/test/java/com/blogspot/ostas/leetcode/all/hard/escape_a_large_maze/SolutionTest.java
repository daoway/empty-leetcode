package com.blogspot.ostas.leetcode.all.hard.escape_a_large_maze;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]
    Output: false
    Explanation: The target square is inaccessible starting from the source square because we cannot move.
    We cannot move north or east because those squares are blocked.
    We cannot move south or west because we cannot go outside of the grid.
    Example 2:
    Input: blocked = [], source = [0,0], target = [999999,999999]
    Output: true
    Explanation: Because there are no blocked cells, it is possible to reach the target square.
      Constraints:
    0 <= blocked.length <= 200
    blocked[i].length == 2
    0 <= xi, yi < 106
    source.length == target.length == 2
    0 <= sx, sy, tx, ty < 106
    source != target
    It is guaranteed that source and target are not blocked.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] blocked = new int[][]{{0, 1}, {1, 0}};
        int[] source = new int[]{0, 0};
        int[] target = new int[]{0, 2};
        boolean expected = false;
        var result = solution.isEscapePossible(blocked, source, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] blocked = new int[][]{};
        int[] source = new int[]{0, 0};
        int[] target = new int[]{999999, 999999};
        boolean expected = true;
        var result = solution.isEscapePossible(blocked, source, target);
        assertThat(result).isEqualTo(expected);
    }

}
