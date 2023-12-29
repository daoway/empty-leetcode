package com.blogspot.ostas.leetcode.all.medium.reconstruct_a_two_row_binary_matrix;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: upper = 2, lower = 1, colsum = [1,1,1]
    Output: [[1,1,0],[0,0,1]]
    Explanation: [[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct answers.
    Example 2:
    Input: upper = 2, lower = 3, colsum = [2,2,1,1]
    Output: []
    Example 3:
    Input: upper = 5, lower = 5, colsum = [2,1,2,0,1,0,1,2,0,1]
    Output: [[1,1,1,0,1,0,0,1,0,0],[1,0,1,0,0,0,1,1,0,1]]
      Constraints:
    1 <= colsum.length <= 10^5
    0 <= upper, lower <= colsum.length
    0 <= colsum[i] <= 2
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int upper = 2;
        int lower = 1;
        int[] colsum = new int[]{1, 1, 1};
        List<List<Integer>> expected = List.of(List.of(1, 1, 0), List.of(0, 0, 1));
        var result = solution.reconstructMatrix(upper, lower, colsum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int upper = 2;
        int lower = 3;
        int[] colsum = new int[]{2, 2, 1, 1};
        List<List<Integer>> expected = List.of();
        var result = solution.reconstructMatrix(upper, lower, colsum);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int upper = 5;
        int lower = 5;
        int[] colsum = new int[]{2, 1, 2, 0, 1, 0, 1, 2, 0, 1};
        List<List<Integer>> expected = List.of(List.of(1, 1, 1, 0, 1, 0, 0, 1, 0, 0),
                List.of(1, 0, 1, 0, 0, 0, 1, 1, 0, 1));
        var result = solution.reconstructMatrix(upper, lower, colsum);
        assertThat(result).isEqualTo(expected);
    }

}
