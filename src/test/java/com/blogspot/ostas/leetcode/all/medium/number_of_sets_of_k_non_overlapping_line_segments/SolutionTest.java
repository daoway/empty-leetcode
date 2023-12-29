package com.blogspot.ostas.leetcode.all.medium.number_of_sets_of_k_non_overlapping_line_segments;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4, k = 2
    Output: 5
    Explanation: The two line segments are shown in red and blue.
    The image above shows the 5 different ways {(0,2),(2,3)}, {(0,1),(1,3)}, {(0,1),(2,3)}, {(1,2),(2,3)}, {(0,1),(1,2)}.
    Example 2:
    Input: n = 3, k = 1
    Output: 3
    Explanation: The 3 ways are {(0,1)}, {(0,2)}, {(1,2)}.
    Example 3:
    Input: n = 30, k = 7
    Output: 796297179
    Explanation: The total number of possible ways to draw 7 line segments is 3796297200. Taking this number modulo 109 + 7 gives us 796297179.
      Constraints:
    2 <= n <= 1000
    1 <= k <= n-1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        int k = 2;
        int expected = 5;
        var result = solution.numberOfSets(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int k = 1;
        int expected = 3;
        var result = solution.numberOfSets(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 30;
        int k = 7;
        int expected = 796297179;
        var result = solution.numberOfSets(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
