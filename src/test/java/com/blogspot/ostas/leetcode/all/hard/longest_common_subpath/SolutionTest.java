package com.blogspot.ostas.leetcode.all.hard.longest_common_subpath;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, paths = [[0,1,2,3,4],
                       [2,3,4],
                       [4,0,1,2,3]]
    Output: 2
    Explanation: The longest common subpath is [2,3].
    Example 2:
    Input: n = 3, paths = [[0],[1],[2]]
    Output: 0
    Explanation: There is no common subpath shared by the three paths.
    Example 3:
    Input: n = 5, paths = [[0,1,2,3,4],
                       [4,3,2,1,0]]
    Output: 1
    Explanation: The possible longest common subpaths are [0], [1], [2], [3], and [4]. All have a length of 1.
      Constraints:
    1 <= n <= 105
    m == paths.length
    2 <= m <= 105
    sum(paths[i].length) <= 105
    0 <= paths[i][j] < n
    The same city is not listed multiple times consecutively in paths[i].
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] paths = new int[][]{{0, 1, 2, 3, 4}, {2, 3, 4}, {4, 0, 1, 2, 3}};
        int expected = 2;
        var result = solution.longestCommonSubpath(n, paths);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[][] paths = new int[][]{{0}, {1}, {2}};
        int expected = 0;
        var result = solution.longestCommonSubpath(n, paths);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 5;
        int[][] paths = new int[][]{{0, 1, 2, 3, 4}, {4, 3, 2, 1, 0}};
        int expected = 1;
        var result = solution.longestCommonSubpath(n, paths);
        assertThat(result).isEqualTo(expected);
    }

}
