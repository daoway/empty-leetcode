package com.blogspot.ostas.leetcode.all.medium.remove_covered_intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: intervals = [[1,4],[3,6],[2,8]]
    Output: 2
    Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
    Example 2:
    Input: intervals = [[1,4],[2,3]]
    Output: 1
      Constraints:
    1 <= intervals.length <= 1000
    intervals[i].length == 2
    0 <= li < ri <= 105
    All the given intervals are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 4}, {3, 6}, {2, 8}};
        int expected = 2;
        var result = solution.removeCoveredIntervals(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 4}, {2, 3}};
        int expected = 1;
        var result = solution.removeCoveredIntervals(intervals);
        assertThat(result).isEqualTo(expected);
    }

}
