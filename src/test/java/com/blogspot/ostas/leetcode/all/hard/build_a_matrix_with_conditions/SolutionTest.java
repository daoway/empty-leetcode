package com.blogspot.ostas.leetcode.all.hard.build_a_matrix_with_conditions;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 3, rowConditions = [[1,2],[3,2]], colConditions = [[2,1],[3,2]]
    Output: [[3,0,0],[0,0,1],[0,2,0]]
    Explanation: The diagram above shows a valid example of a matrix that satisfies all the conditions.
    The row conditions are the following:
    - Number 1 is in row 1, and number 2 is in row 2, so 1 is above 2 in the matrix.
    - Number 3 is in row 0, and number 2 is in row 2, so 3 is above 2 in the matrix.
    The column conditions are the following:
    - Number 2 is in column 1, and number 1 is in column 2, so 2 is left of 1 in the matrix.
    - Number 3 is in column 0, and number 2 is in column 1, so 3 is left of 2 in the matrix.
    Note that there may be multiple correct answers.
    Example 2:
    Input: k = 3, rowConditions = [[1,2],[2,3],[3,1],[2,3]], colConditions = [[2,1]]
    Output: []
    Explanation: From the first two conditions, 3 has to be below 1 but the third conditions needs 3 to be above 1 to be satisfied.
    No matrix can satisfy all the conditions, so we return the empty matrix.
      Constraints:
    2 <= k <= 400
    1 <= rowConditions.length, colConditions.length <= 104
    rowConditions[i].length == colConditions[i].length == 2
    1 <= abovei, belowi, lefti, righti <= k
    abovei != belowi
    lefti != righti
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 3;
        int[][] rowConditions = new int[][]{{1, 2}, {3, 2}};
        int[][] colConditions = new int[][]{{2, 1}, {3, 2}};
        int[][] expected1 = new int[][]{{3, 0, 0}, {0, 0, 1}, {0, 2, 0}};
        int[][] expected2 = new int[][]{{0, 0, 1}, {3, 0, 0}, {0, 2, 0}};
        var result = solution.buildMatrix(k, rowConditions, colConditions);
        assertThat(result).isIn(expected1, expected2);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 3;
        int[][] rowConditions = new int[][]{{1, 2}, {2, 3}, {3, 1}, {2, 3}};
        int[][] colConditions = new int[][]{{2, 1}};
        int[][] expected = new int[][]{};
        var result = solution.buildMatrix(k, rowConditions, colConditions);
        assertThat(result).isEqualTo(expected);
    }

}
