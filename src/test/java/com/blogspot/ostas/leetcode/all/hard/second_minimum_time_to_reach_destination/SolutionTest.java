package com.blogspot.ostas.leetcode.all.hard.second_minimum_time_to_reach_destination;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, edges = [[1,2],[1,3],[1,4],[3,4],[4,5]], time = 3, change = 5
    Output: 13
    Explanation:
    The figure on the left shows the given graph.
    The blue path in the figure on the right is the minimum time path.
    The time taken is:
    - Start at 1, time elapsed=0
    - 1 -> 4: 3 minutes, time elapsed=3
    - 4 -> 5: 3 minutes, time elapsed=6
    Hence the minimum time needed is 6 minutes.

    The red path shows the path to get the second minimum time.
    - Start at 1, time elapsed=0
    - 1 -> 3: 3 minutes, time elapsed=3
    - 3 -> 4: 3 minutes, time elapsed=6
    - Wait at 4 for 4 minutes, time elapsed=10
    - 4 -> 5: 3 minutes, time elapsed=13
    Hence the second minimum time is 13 minutes.
    Example 2:
    Input: n = 2, edges = [[1,2]], time = 3, change = 2
    Output: 11
    Explanation:
    The minimum time path is 1 -> 2 with time = 3 minutes.
    The second minimum time path is 1 -> 2 -> 1 -> 2 with time = 11 minutes.
      Constraints:
    2 <= n <= 104
    n - 1 <= edges.length <= min(2 * 104, n * (n - 1) / 2)
    edges[i].length == 2
    1 <= ui, vi <= n
    ui != vi
    There are no duplicate edges.
    Each vertex can be reached directly or indirectly from every other vertex.
    1 <= time, change <= 103
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {1, 4}, {3, 4}, {4, 5}};
        int time = 3;
        int change = 5;
        int expected = 13;
        var result = solution.secondMinimum(n, edges, time, change);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[][] edges = new int[][]{{1, 2}};
        int time = 3;
        int change = 2;
        int expected = 11;
        var result = solution.secondMinimum(n, edges, time, change);
        assertThat(result).isEqualTo(expected);
    }

}
