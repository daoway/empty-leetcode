package com.blogspot.ostas.leetcode.all.hard.minimum_moves_to_move_a_box_to_their_target_location;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [["#","#","#","#","#","#"],
               ["#","T","#","#","#","#"],
               ["#",".",".","B",".","#"],
               ["#",".","#","#",".","#"],
               ["#",".",".",".","S","#"],
               ["#","#","#","#","#","#"]]
    Output: 3
    Explanation: We return only the number of times the box is pushed.
    Example 2:
    Input: grid = [["#","#","#","#","#","#"],
               ["#","T","#","#","#","#"],
               ["#",".",".","B",".","#"],
               ["#","#","#","#",".","#"],
               ["#",".",".",".","S","#"],
               ["#","#","#","#","#","#"]]
    Output: -1
    Example 3:
    Input: grid = [["#","#","#","#","#","#"],
               ["#","T",".",".","#","#"],
               ["#",".","#","B",".","#"],
               ["#",".",".",".",".","#"],
               ["#",".",".",".","S","#"],
               ["#","#","#","#","#","#"]]
    Output: 5
    Explanation: push the box down, left, left, up and up.
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 20
    grid contains only characters '.', '#', 'S', 'T', or 'B'.
    There is only one character 'S', 'B', and 'T' in the grid.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] grid = new char[][]{{'#', '#', '#', '#', '#', '#'}, {'#', 'T', '#', '#', '#', '#'},
                {'#', '.', '.', 'B', '.', '#'}, {'#', '.', '#', '#', '.', '#'},
                {'#', '.', '.', '.', 'S', '#'},
                {'#', '#', '#', '#', '#', '#'}};
        int expected = 3;
        var result = solution.minPushBox(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] grid = new char[][]{{'#', '#', '#', '#', '#', '#'}, {'#', 'T', '#', '#', '#', '#'},
                {'#', '.', '.', 'B', '.', '#'}, {'#', '#', '#', '#', '.', '#'},
                {'#', '.', '.', '.', 'S', '#'},
                {'#', '#', '#', '#', '#', '#'}};
        int expected = -1;
        var result = solution.minPushBox(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        char[][] grid = new char[][]{{'#', '#', '#', '#', '#', '#'}, {'#', 'T', '.', '.', '#', '#'},
                {'#', '.', '#', 'B', '.', '#'}, {'#', '.', '.', '.', '.', '#'},
                {'#', '.', '.', '.', 'S', '#'},
                {'#', '#', '#', '#', '#', '#'}};
        int expected = 5;
        var result = solution.minPushBox(grid);
        assertThat(result).isEqualTo(expected);
    }

}
