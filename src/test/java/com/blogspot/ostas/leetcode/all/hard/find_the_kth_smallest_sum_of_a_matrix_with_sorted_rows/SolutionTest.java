package com.blogspot.ostas.leetcode.all.hard.find_the_kth_smallest_sum_of_a_matrix_with_sorted_rows;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,3,11],[2,4,6]], k = 5
    Output: 7
    Explanation: Choosing one element from each row, the first k smallest sum are:
    [1,2], [1,4], [3,2], [3,4], [1,6]. Where the 5th sum is 7.
    Example 2:
    Input: mat = [[1,3,11],[2,4,6]], k = 9
    Output: 17
    Example 3:
    Input: mat = [[1,10,10],[1,4,5],[2,3,6]], k = 7
    Output: 9
    Explanation: Choosing one element from each row, the first k smallest sum are:
    [1,1,2], [1,1,3], [1,4,2], [1,4,3], [1,1,6], [1,5,2], [1,5,3]. Where the 7th sum is 9.
      Constraints:
    m == mat.length
    n == mat.length[i]
    1 <= m, n <= 40
    1 <= mat[i][j] <= 5000
    1 <= k <= min(200, nm)
    mat[i] is a non-decreasing array.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 3, 11}, {2, 4, 6}};
        int k = 5;
        int expected = 7;
        var result = solution.kthSmallest(mat, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 3, 11}, {2, 4, 6}};
        int k = 9;
        int expected = 17;
        var result = solution.kthSmallest(mat, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 10, 10}, {1, 4, 5}, {2, 3, 6}};
        int k = 7;
        int expected = 9;
        var result = solution.kthSmallest(mat, k);
        assertThat(result).isEqualTo(expected);
    }

}
