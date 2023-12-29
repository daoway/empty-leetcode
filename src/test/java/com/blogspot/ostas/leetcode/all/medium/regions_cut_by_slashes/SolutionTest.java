package com.blogspot.ostas.leetcode.all.medium.regions_cut_by_slashes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [" /","/ "]
    Output: 2
    Example 2:
    Input: grid = [" /","  "]
    Output: 1
    Example 3:
    Input: grid = ["/\\","\\/"]
    Output: 5
    Explanation: Recall that because \ characters are escaped, "\\/" refers to \/, and "/\\" refers to /\.
      Constraints:
    n == grid.length == grid[i].length
    1 <= n <= 30
    grid[i][j] is either '/', '\', or ' '.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] grid = new String[]{" /", "/ "};
        int expected = 2;
        var result = solution.regionsBySlashes(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] grid = new String[]{" /", "  "};
        int expected = 1;
        var result = solution.regionsBySlashes(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] grid = new String[]{"/\\", "\\/"};
        int expected = 5;
        var result = solution.regionsBySlashes(grid);
        assertThat(result).isEqualTo(expected);
    }

}
