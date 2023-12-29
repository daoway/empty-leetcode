package com.blogspot.ostas.leetcode.all.medium.maximum_rows_covered_by_columns;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[0,0,0],[1,0,1],[0,1,1],[0,0,1]], numSelect = 2
    Output: 3
    Explanation: One possible way to cover 3 rows is shown in the diagram above.
    We choose s = {0, 2}.
    - Row 0 is covered because it has no occurrences of 1.
    - Row 1 is covered because the columns with value 1, i.e. 0 and 2 are present in s.
    - Row 2 is not covered because matrix[2][1] == 1 but 1 is not present in s.
    - Row 3 is covered because matrix[2][2] == 1 and 2 is present in s.
    Thus, we can cover three rows.
    Note that s = {1, 2} will also cover 3 rows, but it can be shown that no more than three rows can be covered.
    Example 2:
    Input: matrix = [[1],[0]], numSelect = 1
    Output: 2
    Explanation: Selecting the only column will result in both rows being covered since the entire matrix is selected.
    Therefore, we return 2.
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 12
    matrix[i][j] is either 0 or 1.
    1 <= numSelect <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 0, 1}};
        int numSelect = 2;
        int expected = 3;
        var result = solution.maximumRows(matrix, numSelect);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1}, {0}};
        int numSelect = 1;
        int expected = 2;
        var result = solution.maximumRows(matrix, numSelect);
        assertThat(result).isEqualTo(expected);
    }

}
