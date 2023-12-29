package com.blogspot.ostas.leetcode.all.medium.interval_list_intersections;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: firstList = [[0,2],[5,10],[13,23],[24,25]], secondList = [[1,5],[8,12],[15,24],[25,26]]
    Output: [[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
    Example 2:
    Input: firstList = [[1,3],[5,9]], secondList = []
    Output: []
      Constraints:
    0 <= firstList.length, secondList.length <= 1000
    firstList.length + secondList.length >= 1
    0 <= starti < endi <= 109
    endi < starti+1
    0 <= startj < endj <= 109
    endj < startj+1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] firstList = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        int[][] expected = new int[][]{{1, 2}, {5, 5}, {8, 10}, {15, 23}, {24, 24}, {25, 25}};
        var result = solution.intervalIntersection(firstList, secondList);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] firstList = new int[][]{{1, 3}, {5, 9}};
        int[][] secondList = new int[][]{};
        int[][] expected = new int[][]{};
        var result = solution.intervalIntersection(firstList, secondList);
        assertThat(result).isEqualTo(expected);
    }

}
