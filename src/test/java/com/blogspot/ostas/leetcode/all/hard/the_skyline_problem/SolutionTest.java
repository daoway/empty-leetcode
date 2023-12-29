package com.blogspot.ostas.leetcode.all.hard.the_skyline_problem;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
    Output: [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
    Explanation:
    Figure A shows the buildings of the input.
    Figure B shows the skyline formed by those buildings. The red points in figure B represent the key points in the output list.
    Example 2:
    Input: buildings = [[0,2,3],[2,5,3]]
    Output: [[0,3],[5,0]]
      Constraints:
    1 <= buildings.length <= 104
    0 <= lefti < righti <= 231 - 1
    1 <= heighti <= 231 - 1
    buildings is sorted by lefti in non-decreasing order.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] buildings =
                new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<List<Integer>> expected =
                List.of(List.of(2, 10), List.of(3, 15), List.of(7, 12), List.of(12, 0),
                        List.of(15, 10), List.of(20, 8), List.of(24, 0));
        var result = solution.getSkyline(buildings);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] buildings = new int[][]{{0, 2, 3}, {2, 5, 3}};
        List<List<Integer>> expected = List.of(List.of(0, 3), List.of(5, 0));
        var result = solution.getSkyline(buildings);
        assertThat(result).isEqualTo(expected);
    }

}
