package com.blogspot.ostas.leetcode.all.medium.largest_magic_square;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: grid = [[7,1,4,5,6],[2,5,1,6,4],[1,5,4,3,2],[1,2,7,3,4]]
    Output: 3
    Explanation: The largest magic square has a size of 3.
    Every row sum, column sum, and diagonal sum of this magic square is equal to 12.
    - Row sums: 5+1+6 = 5+4+3 = 2+7+3 = 12
    - Column sums: 5+5+2 = 1+4+7 = 6+3+3 = 12
    - Diagonal sums: 5+4+3 = 6+4+2 = 12
    Example 2:
    Input: grid = [[5,1,3,1],[9,3,3,1],[1,3,3,8]]
    Output: 2
      Constraints:
    m == grid.length
    n == grid[i].length
    1 <= m, n <= 50
    1 <= grid[i][j] <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] grid = new int[][]{{7, 1, 4, 5, 6}, {2, 5, 1, 6, 4}, {1, 5, 4, 3, 2}, {1, 2, 7, 3, 4}};
        int expected = 3;
        var result = solution.largestMagicSquare(grid);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] grid = new int[][]{{5, 1, 3, 1}, {9, 3, 3, 1}, {1, 3, 3, 8}};
        int expected = 2;
        var result = solution.largestMagicSquare(grid);
        assertThat(result).isEqualTo(expected);
    }

}
