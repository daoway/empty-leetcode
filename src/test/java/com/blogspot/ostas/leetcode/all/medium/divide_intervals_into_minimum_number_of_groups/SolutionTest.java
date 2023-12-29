package com.blogspot.ostas.leetcode.all.medium.divide_intervals_into_minimum_number_of_groups;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: intervals = [[5,10],[6,8],[1,5],[2,3],[1,10]]
    Output: 3
    Explanation: We can divide the intervals into the following groups:
    - Group 1: [1, 5], [6, 8].
    - Group 2: [2, 3], [5, 10].
    - Group 3: [1, 10].
    It can be proven that it is not possible to divide the intervals into fewer than 3 groups.
    Example 2:
    Input: intervals = [[1,3],[5,6],[8,10],[11,13]]
    Output: 1
    Explanation: None of the intervals overlap, so we can put all of them in one group.
      Constraints:
    1 <= intervals.length <= 105
    intervals[i].length == 2
    1 <= lefti <= righti <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}};
        int expected = 3;
        var result = solution.minGroups(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 3}, {5, 6}, {8, 10}, {11, 13}};
        int expected = 1;
        var result = solution.minGroups(intervals);
        assertThat(result).isEqualTo(expected);
    }

}
