package com.blogspot.ostas.leetcode.all.medium.non_overlapping_intervals;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
    Output: 1
    Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
    Example 2:
    Input: intervals = [[1,2],[1,2],[1,2]]
    Output: 2
    Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
    Example 3:
    Input: intervals = [[1,2],[2,3]]
    Output: 0
    Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
      Constraints:
    1 <= intervals.length <= 105
    intervals[i].length == 2
    -5 * 104 <= starti < endi <= 5 * 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int expected = 1;
        var result = solution.eraseOverlapIntervals(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 2}, {1, 2}, {1, 2}};
        int expected = 2;
        var result = solution.eraseOverlapIntervals(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 2}, {2, 3}};
        int expected = 0;
        var result = solution.eraseOverlapIntervals(intervals);
        assertThat(result).isEqualTo(expected);
    }

}
