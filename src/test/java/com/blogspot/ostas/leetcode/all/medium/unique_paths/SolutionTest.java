package com.blogspot.ostas.leetcode.all.medium.unique_paths;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: m = 3, n = 7
    Output: 28
    Example 2:
    Input: m = 3, n = 2
    Output: 3
    Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
    1. Right -> Down -> Down
    2. Down -> Down -> Right
    3. Down -> Right -> Down
      Constraints:
    1 <= m, n <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int m = 3;
        int n = 7;
        int expected = 28;
        var result = solution.uniquePaths(m, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int m = 3;
        int n = 2;
        int expected = 3;
        var result = solution.uniquePaths(m, n);
        assertThat(result).isEqualTo(expected);
    }

}
