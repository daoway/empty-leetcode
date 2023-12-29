package com.blogspot.ostas.leetcode.all.hard.set_intersection_size_at_least_two;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: intervals = [[1,3],[3,7],[8,9]]
    Output: 5
    Explanation: let nums = [2, 3, 4, 8, 9].
    It can be shown that there cannot be any containing array of size 4.
    Example 2:
    Input: intervals = [[1,3],[1,4],[2,5],[3,5]]
    Output: 3
    Explanation: let nums = [2, 3, 4].
    It can be shown that there cannot be any containing array of size 2.
    Example 3:
    Input: intervals = [[1,2],[2,3],[2,4],[4,5]]
    Output: 5
    Explanation: let nums = [1, 2, 3, 4, 5].
    It can be shown that there cannot be any containing array of size 4.
      Constraints:
    1 <= intervals.length <= 3000
    intervals[i].length == 2
    0 <= starti < endi <= 108
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 3}, {3, 7}, {8, 9}};
        int expected = 5;
        var result = solution.intersectionSizeTwo(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 3}, {1, 4}, {2, 5}, {3, 5}};
        int expected = 3;
        var result = solution.intersectionSizeTwo(intervals);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] intervals = new int[][]{{1, 2}, {2, 3}, {2, 4}, {4, 5}};
        int expected = 5;
        var result = solution.intersectionSizeTwo(intervals);
        assertThat(result).isEqualTo(expected);
    }

}
