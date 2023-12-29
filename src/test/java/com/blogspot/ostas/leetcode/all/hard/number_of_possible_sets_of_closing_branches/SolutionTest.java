package com.blogspot.ostas.leetcode.all.hard.number_of_possible_sets_of_closing_branches;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, maxDistance = 5, roads = [[0,1,2],[1,2,10],[0,2,10]]
    Output: 5
    Explanation: The possible sets of closing branches are:
    - The set [2], after closing, active branches are [0,1] and they are reachable to each other within distance 2.
    - The set [0,1], after closing, the active branch is [2].
    - The set [1,2], after closing, the active branch is [0].
    - The set [0,2], after closing, the active branch is [1].
    - The set [0,1,2], after closing, there are no active branches.
    It can be proven, that there are only 5 possible sets of closing branches.
    Example 2:
    Input: n = 3, maxDistance = 5, roads = [[0,1,20],[0,1,10],[1,2,2],[0,2,2]]
    Output: 7
    Explanation: The possible sets of closing branches are:
    - The set [], after closing, active branches are [0,1,2] and they are reachable to each other within distance 4.
    - The set [0], after closing, active branches are [1,2] and they are reachable to each other within distance 2.
    - The set [1], after closing, active branches are [0,2] and they are reachable to each other within distance 2.
    - The set [0,1], after closing, the active branch is [2].
    - The set [1,2], after closing, the active branch is [0].
    - The set [0,2], after closing, the active branch is [1].
    - The set [0,1,2], after closing, there are no active branches.
    It can be proven, that there are only 7 possible sets of closing branches.
    Example 3:
    Input: n = 1, maxDistance = 10, roads = []
    Output: 2
    Explanation: The possible sets of closing branches are:
    - The set [], after closing, the active branch is [0].
    - The set [0], after closing, there are no active branches.
    It can be proven, that there are only 2 possible sets of closing branches.
      Constraints:
    1 <= n <= 10
    1 <= maxDistance <= 105
    0 <= roads.length <= 1000
    roads[i].length == 3
    0 <= ui, vi <= n - 1
    ui != vi
    1 <= wi <= 1000
    All branches are reachable from each other by traveling some roads.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int maxDistance = 5;
        int[][] roads = new int[][]{{0, 1, 2}, {1, 2, 10}, {0, 2, 10}};
        int expected = 5;
        var result = solution.numberOfSets(n, maxDistance, roads);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int maxDistance = 5;
        int[][] roads = new int[][]{{0, 1, 20}, {0, 1, 10}, {1, 2, 2}, {0, 2, 2}};
        int expected = 7;
        var result = solution.numberOfSets(n, maxDistance, roads);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 1;
        int maxDistance = 10;
        int[][] roads = new int[][]{};
        int expected = 2;
        var result = solution.numberOfSets(n, maxDistance, roads);
        assertThat(result).isEqualTo(expected);
    }

}
