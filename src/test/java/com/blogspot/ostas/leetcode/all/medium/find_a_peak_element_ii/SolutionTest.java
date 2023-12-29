package com.blogspot.ostas.leetcode.all.medium.find_a_peak_element_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,4],[3,2]]
    Output: [0,1]
    Explanation: Both 3 and 4 are peak elements so [1,0] and [0,1] are both acceptable answers.
    Example 2:
    Input: mat = [[10,20,15],[21,30,14],[7,16,32]]
    Output: [1,1]
    Explanation: Both 30 and 32 are peak elements so [1,1] and [2,2] are both acceptable answers.
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 500
    1 <= mat[i][j] <= 105
    No two adjacent cells are equal.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 4}, {3, 2}};
        int[] expected1 = new int[]{0, 1};
        int[] expected2 = new int[]{1, 0};
        var result = solution.findPeakGrid(mat);
        assertThat(result).isIn(expected1, expected2);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};
        int[] expected1 = new int[]{1, 1};
        int[] expected2 = new int[]{2, 2};
        var result = solution.findPeakGrid(mat);
        assertThat(result).isIn(expected1, expected2);
    }

}
