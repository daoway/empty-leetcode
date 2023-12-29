package com.blogspot.ostas.leetcode.all.medium.two_best_non_overlapping_events;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: events = [[1,3,2],[4,5,2],[2,4,3]]
    Output: 4
    Explanation: Choose the green events, 0 and 1 for a sum of 2 + 2 = 4.
    Example 2:
    Input: events = [[1,3,2],[4,5,2],[1,5,5]]
    Output: 5
    Explanation: Choose event 2 for a sum of 5.
    Example 3:
    Input: events = [[1,5,3],[1,5,1],[6,6,5]]
    Output: 8
    Explanation: Choose events 0 and 2 for a sum of 3 + 5 = 8.
      Constraints:
    2 <= events.length <= 105
    events[i].length == 3
    1 <= startTimei <= endTimei <= 109
    1 <= valuei <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 3, 2}, {4, 5, 2}, {2, 4, 3}};
        int expected = 4;
        var result = solution.maxTwoEvents(events);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 3, 2}, {4, 5, 2}, {1, 5, 5}};
        int expected = 5;
        var result = solution.maxTwoEvents(events);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 5, 3}, {1, 5, 1}, {6, 6, 5}};
        int expected = 8;
        var result = solution.maxTwoEvents(events);
        assertThat(result).isEqualTo(expected);
    }

}
