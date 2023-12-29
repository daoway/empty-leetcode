package com.blogspot.ostas.leetcode.all.hard.dungeon_game;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: dungeon = [[-2,-3,3],[-5,-10,1],[10,30,-5]]
    Output: 7
    Explanation: The initial health of the knight must be at least 7 if he follows the optimal path: RIGHT-> RIGHT -> DOWN -> DOWN.
    Example 2:
    Input: dungeon = [[0]]
    Output: 1
      Constraints:
    m == dungeon.length
    n == dungeon[i].length
    1 <= m, n <= 200
    -1000 <= dungeon[i][j] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] dungeon = new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        int expected = 7;
        var result = solution.calculateMinimumHP(dungeon);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] dungeon = new int[][]{{0}};
        int expected = 1;
        var result = solution.calculateMinimumHP(dungeon);
        assertThat(result).isEqualTo(expected);
    }

}
