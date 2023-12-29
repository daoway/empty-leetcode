package com.blogspot.ostas.leetcode.all.medium.network_delay_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
    Output: 2
    Example 2:
    Input: times = [[1,2,1]], n = 2, k = 1
    Output: 1
    Example 3:
    Input: times = [[1,2,1]], n = 2, k = 2
    Output: -1
      Constraints:
    1 <= k <= n <= 100
    1 <= times.length <= 6000
    times[i].length == 3
    1 <= ui, vi <= n
    ui != vi
    0 <= wi <= 100
    All the pairs (ui, vi) are unique. (i.e., no multiple edges.)
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] times = new int[][]{{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4;
        int k = 2;
        int expected = 2;
        var result = solution.networkDelayTime(times, n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] times = new int[][]{{1, 2, 1}};
        int n = 2;
        int k = 1;
        int expected = 1;
        var result = solution.networkDelayTime(times, n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] times = new int[][]{{1, 2, 1}};
        int n = 2;
        int k = 2;
        int expected = -1;
        var result = solution.networkDelayTime(times, n, k);
        assertThat(result).isEqualTo(expected);
    }

}
