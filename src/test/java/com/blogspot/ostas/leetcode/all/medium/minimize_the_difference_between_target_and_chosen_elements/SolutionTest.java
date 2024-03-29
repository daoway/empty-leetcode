package com.blogspot.ostas.leetcode.all.medium.minimize_the_difference_between_target_and_chosen_elements;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: mat = [[1,2,3],[4,5,6],[7,8,9]], target = 13
    Output: 0
    Explanation: One possible choice is to:
    - Choose 1 from the first row.
    - Choose 5 from the second row.
    - Choose 7 from the third row.
    The sum of the chosen elements is 13, which equals the target, so the absolute difference is 0.
    Example 2:
    Input: mat = [[1],[2],[3]], target = 100
    Output: 94
    Explanation: The best possible choice is to:
    - Choose 1 from the first row.
    - Choose 2 from the second row.
    - Choose 3 from the third row.
    The sum of the chosen elements is 6, and the absolute difference is 94.
    Example 3:
    Input: mat = [[1,2,9,8,7]], target = 6
    Output: 1
    Explanation: The best choice is to choose 7 from the first row.
    The absolute difference is 1.
      Constraints:
    m == mat.length
    n == mat[i].length
    1 <= m, n <= 70
    1 <= mat[i][j] <= 70
    1 <= target <= 800
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int target = 13;
        int expected = 0;
        var result = solution.minimizeTheDifference(mat, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1}, {2}, {3}};
        int target = 100;
        int expected = 94;
        var result = solution.minimizeTheDifference(mat, target);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] mat = new int[][]{{1, 2, 9, 8, 7}};
        int target = 6;
        int expected = 1;
        var result = solution.minimizeTheDifference(mat, target);
        assertThat(result).isEqualTo(expected);
    }

}
