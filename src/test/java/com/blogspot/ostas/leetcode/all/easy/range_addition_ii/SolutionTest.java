package com.blogspot.ostas.leetcode.all.easy.range_addition_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 3, n = 3, ops = [[2,2],[3,3]]
    Output: 4
    Explanation: The maximum integer in M is 2, and there are four of it in M. So return 4.
    Example 2:
    Input: m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
    Output: 4
    Example 3:
    Input: m = 3, n = 3, ops = []
    Output: 9
      Constraints:
    1 <= m, n <= 4 * 104
    0 <= ops.length <= 104
    ops[i].length == 2
    1 <= ai <= m
    1 <= bi <= n
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 3;
        int n = 3;
        int[][] ops = new int[][]{{2, 2}, {3, 3}};
        int expected = 4;
        var result = solution.maxCount(m, n, ops);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 3;
        int n = 3;
        int[][] ops = new int[][]{{2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3},
                {2, 2}, {3, 3}, {3, 3}, {3, 3}};
        int expected = 4;
        var result = solution.maxCount(m, n, ops);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int m = 3;
        int n = 3;
        int[][] ops = new int[][]{};
        int expected = 9;
        var result = solution.maxCount(m, n, ops);
        assertThat(result).isEqualTo(expected);
    }

}
