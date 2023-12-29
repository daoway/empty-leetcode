package com.blogspot.ostas.leetcode.all.hard.shortest_path_to_get_all_keys;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = ["@.a..","###.#","b.A.B"]
    Output: 8
    Explanation: Note that the goal is to obtain all the keys not to open all the locks.
    Example 2:
    Input: grid = ["@..aA","..B#.","....b"]
    Output: 6
    Example 3:
    Input: grid = ["@Aa"]
    Output: -1
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 30
    grid[i][j] is either an English letter, '.', '#', or '@'.
    There is exactly one '@' in the grid.
    The number of keys in the grid is in the range [1, 6].
    Each key in the grid is unique.
    Each key in the grid has a matching lock.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] grid = new String[]{"@.a..", "###.#", "b.A.B"};
        int expected = 8;
        var result = solution.shortestPathAllKeys(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] grid = new String[]{"@..aA", "..B#.", "....b"};
        int expected = 6;
        var result = solution.shortestPathAllKeys(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] grid = new String[]{"@Aa"};
        int expected = -1;
        var result = solution.shortestPathAllKeys(grid);
        assertThat(result).isEqualTo(expected);
    }

}
