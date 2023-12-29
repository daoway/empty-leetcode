package com.blogspot.ostas.leetcode.all.easy.the_k_weakest_rows_in_a_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat =
    [[1,1,0,0,0],
     [1,1,1,1,0],
     [1,0,0,0,0],
     [1,1,0,0,0],
     [1,1,1,1,1]],
    k = 3
    Output: [2,0,3]
    Explanation:
    The number of soldiers in each row is:
    - Row 0: 2
    - Row 1: 4
    - Row 2: 1
    - Row 3: 2
    - Row 4: 5
    The rows ordered from weakest to strongest are [2,0,3,1,4].
    Example 2:
    Input: mat =
    [[1,0,0,0],
     [1,1,1,1],
     [1,0,0,0],
     [1,0,0,0]],
    k = 2
    Output: [0,2]
    Explanation:
    The number of soldiers in each row is:
    - Row 0: 1
    - Row 1: 4
    - Row 2: 1
    - Row 3: 1
    The rows ordered from weakest to strongest are [0,2,3,1].
      Constraints:
    m == mat.length
    n == mat[i].length
    2 <= n, m <= 100
    1 <= k <= m
    matrix[i][j] is either 0 or 1.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int k = 3;
        int[] expected = new int[]{2, 0, 3};
        var result = solution.kWeakestRows(mat, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        int k = 2;
        int[] expected = new int[]{0, 2};
        var result = solution.kWeakestRows(mat, k);
        assertThat(result).isEqualTo(expected);
    }

}
