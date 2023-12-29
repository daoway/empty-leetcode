package com.blogspot.ostas.leetcode.all.medium.find_kth_largest_xor_coordinate_value;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: matrix = [[5,2],[1,6]], k = 1
    Output: 7
    Explanation: The value of coordinate (0,1) is 5 XOR 2 = 7, which is the largest value.
    Example 2:
    Input: matrix = [[5,2],[1,6]], k = 2
    Output: 5
    Explanation: The value of coordinate (0,0) is 5 = 5, which is the 2nd largest value.
    Example 3:
    Input: matrix = [[5,2],[1,6]], k = 3
    Output: 4
    Explanation: The value of coordinate (1,0) is 5 XOR 1 = 4, which is the 3rd largest value.
      Constraints:
    m == matrix.length
    n == matrix[i].length
    1 <= m, n <= 1000
    0 <= matrix[i][j] <= 106
    1 <= k <= m * n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{5, 2}, {1, 6}};
        int k = 1;
        int expected = 7;
        var result = solution.kthLargestValue(matrix, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{5, 2}, {1, 6}};
        int k = 2;
        int expected = 5;
        var result = solution.kthLargestValue(matrix, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] matrix = new int[][]{{5, 2}, {1, 6}};
        int k = 3;
        int expected = 4;
        var result = solution.kthLargestValue(matrix, k);
        assertThat(result).isEqualTo(expected);
    }

}
