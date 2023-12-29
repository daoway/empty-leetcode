package com.blogspot.ostas.leetcode.all.medium.detect_cycles_in_two_d_grid;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [["a","a","a","a"],["a","b","b","a"],["a","b","b","a"],["a","a","a","a"]]
    Output: true
    Explanation: There are two valid cycles shown in different colors in the image below:
    Example 2:
    Input: grid = [["c","c","c","a"],["c","d","c","c"],["c","c","e","c"],["f","c","c","c"]]
    Output: true
    Explanation: There is only one valid cycle highlighted in the image below:
    Example 3:
    Input: grid = [["a","b","b"],["b","z","b"],["b","b","a"]]
    Output: false
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 500
    grid consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        char[][] grid = new char[][]{{'a', 'a', 'a', 'a'}, {'a', 'b', 'b', 'a'}, {'a', 'b', 'b', 'a'},
                {'a', 'a', 'a', 'a'}};
        boolean expected = true;
        var result = solution.containsCycle(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        char[][] grid = new char[][]{{'c', 'c', 'c', 'a'}, {'c', 'd', 'c', 'c'}, {'c', 'c', 'e', 'c'},
                {'f', 'c', 'c', 'c'}};
        boolean expected = true;
        var result = solution.containsCycle(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        char[][] grid = new char[][]{{'a', 'b', 'b'}, {'b', 'z', 'b'}, {'b', 'b', 'a'}};
        boolean expected = false;
        var result = solution.containsCycle(grid);
        assertThat(result).isEqualTo(expected);
    }

}
