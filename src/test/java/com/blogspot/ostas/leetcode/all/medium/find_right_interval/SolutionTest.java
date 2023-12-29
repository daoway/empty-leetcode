package com.blogspot.ostas.leetcode.all.medium.find_right_interval;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: intervals = [[1,2]]
    Output: [-1]
    Explanation: There is only one interval in the collection, so it outputs -1.
    Example 2:
    Input: intervals = [[3,4],[2,3],[1,2]]
    Output: [-1,0,1]
    Explanation: There is no right interval for [3,4].
    The right interval for [2,3] is [3,4] since start0 = 3 is the smallest start that is >= end1 = 3.
    The right interval for [1,2] is [2,3] since start1 = 2 is the smallest start that is >= end2 = 2.
    Example 3:
    Input: intervals = [[1,4],[2,3],[3,4]]
    Output: [-1,2,-1]
    Explanation: There is no right interval for [1,4] and [3,4].
    The right interval for [2,3] is [3,4] since start2 = 3 is the smallest start that is >= end1 = 3.
      Constraints:
    1 <= intervals.length <= 2 * 104
    intervals[i].length == 2
    -106 <= starti <= endi <= 106
    The start point of each interval is unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 2}};
        int[] expected = new int[]{-1};
        var result = solution.findRightInterval(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{3, 4}, {2, 3}, {1, 2}};
        int[] expected = new int[]{-1, 0, 1};
        var result = solution.findRightInterval(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 4}, {2, 3}, {3, 4}};
        int[] expected = new int[]{-1, 2, -1};
        var result = solution.findRightInterval(intervals);
        assertThat(result).isEqualTo(expected);
    }

}
