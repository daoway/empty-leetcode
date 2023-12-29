package com.blogspot.ostas.leetcode.all.medium.largest_plus_sign;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, mines = [[4,2]]
    Output: 2
    Explanation: In the above grid, the largest plus sign can only be of order 2. One of them is shown.
    Example 2:
    Input: n = 1, mines = [[0,0]]
    Output: 0
    Explanation: There is no plus sign, so return 0.
      Constraints:
    1 <= n <= 500
    1 <= mines.length <= 5000
    0 <= xi, yi < n
    All the pairs (xi, yi) are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] mines = new int[][]{{4, 2}};
        int expected = 2;
        var result = solution.orderOfLargestPlusSign(n, mines);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int[][] mines = new int[][]{{0, 0}};
        int expected = 0;
        var result = solution.orderOfLargestPlusSign(n, mines);
        assertThat(result).isEqualTo(expected);
    }

}
