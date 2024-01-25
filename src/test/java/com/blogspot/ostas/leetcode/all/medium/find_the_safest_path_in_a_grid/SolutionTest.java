package com.blogspot.ostas.leetcode.all.medium.find_the_safest_path_in_a_grid;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[1,0,0],[0,0,0],[0,0,1]]
    Output: 0
    Explanation: All paths from (0, 0) to (n - 1, n - 1) go through the thieves in cells (0, 0) and (n - 1, n - 1).
    Example 2:
    Input: grid = [[0,0,1],[0,0,0],[0,0,0]]
    Output: 2
    Explanation: The path depicted in the picture above has a safeness factor of 2 since:
    - The closest cell of the path to the thief at cell (0, 2) is cell (0, 0). The distance between them is | 0 - 0 | + | 0 - 2 | = 2.
    It can be shown that there are no other paths with a higher safeness factor.
    Example 3:
    Input: grid = [[0,0,0,1],[0,0,0,0],[0,0,0,0],[1,0,0,0]]
    Output: 2
    Explanation: The path depicted in the picture above has a safeness factor of 2 since:
    - The closest cell of the path to the thief at cell (0, 3) is cell (1, 2). The distance between them is | 0 - 1 | + | 3 - 2 | = 2.
    - The closest cell of the path to the thief at cell (3, 0) is cell (3, 2). The distance between them is | 3 - 3 | + | 0 - 2 | = 2.
    It can be shown that there are no other paths with a higher safeness factor.
      Constraints:
    1 <= grid.length == n <= 400
    grid[i].length == n
    grid[i][j] is either 0 or 1.
    There is at least one thief in the grid.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        List<List<Integer>> grid = List.of(List.of(1, 0, 0), List.of(0, 0, 0), List.of(0, 0, 1));
        int expected = 0;
        var result = solution.maximumSafenessFactor(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        List<List<Integer>> grid = List.of(List.of(0, 0, 1), List.of(0, 0, 0), List.of(0, 0, 0));
        int expected = 2;
        var result = solution.maximumSafenessFactor(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        List<List<Integer>> grid =
                List.of(List.of(0, 0, 0, 1), List.of(0, 0, 0, 0), List.of(0, 0, 0, 0),
                        List.of(1, 0, 0, 0));
        int expected = 2;
        var result = solution.maximumSafenessFactor(grid);
        assertThat(result).isEqualTo(expected);
    }

}
