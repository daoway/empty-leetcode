package com.blogspot.ostas.leetcode.all.hard.max_sum_of_rectangle_no_larger_than_k;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[1,0,1],[0,-2,3]], k = 2
    Output: 2
    Explanation: Because the sum of the blue rectangle [[0, 1], [-2, 3]] is 2, and 2 is the max number no larger than k (k = 2).
    Example 2:
    Input: matrix = [[2,2,-1]], k = 3
    Output: 3
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 100
    -100 <= matrix[i][j] <= 100
    -105 <= k <= 105
      Follow up: What if the number of rows is much larger than the number of columns?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{1, 0, 1}, {0, -2, 3}};
        int k = 2;
        int expected = 2;
        var result = solution.maxSumSubmatrix(matrix, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{2, 2, -1}};
        int k = 3;
        int expected = 3;
        var result = solution.maxSumSubmatrix(matrix, k);
        assertThat(result).isEqualTo(expected);
    }

}
