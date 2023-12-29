package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_events_that_can_be_attended_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: events = [[1,2,4],[3,4,3],[2,3,1]], k = 2
    Output: 7
    Explanation: Choose the green events, 0 and 1 (0-indexed) for a total value of 4 + 3 = 7.
    Example 2:
    Input: events = [[1,2,4],[3,4,3],[2,3,10]], k = 2
    Output: 10
    Explanation: Choose event 2 for a total value of 10.
    Notice that you cannot attend any other event as they overlap, and that you do not have to attend k events.
    Example 3:
    Input: events = [[1,1,1],[2,2,2],[3,3,3],[4,4,4]], k = 3
    Output: 9
    Explanation: Although the events do not overlap, you can only attend 3 events. Pick the highest valued three.
      Constraints:
    1 <= k <= events.length
    1 <= k * events.length <= 106
    1 <= startDayi <= endDayi <= 109
    1 <= valuei <= 106
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 2, 4}, {3, 4, 3}, {2, 3, 1}};
        int k = 2;
        int expected = 7;
        var result = solution.maxValue(events, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 2, 4}, {3, 4, 3}, {2, 3, 10}};
        int k = 2;
        int expected = 10;
        var result = solution.maxValue(events, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        int k = 3;
        int expected = 9;
        var result = solution.maxValue(events, k);
        assertThat(result).isEqualTo(expected);
    }

}
