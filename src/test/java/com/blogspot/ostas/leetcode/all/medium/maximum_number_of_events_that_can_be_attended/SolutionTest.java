package com.blogspot.ostas.leetcode.all.medium.maximum_number_of_events_that_can_be_attended;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: events = [[1,2],[2,3],[3,4]]
    Output: 3
    Explanation: You can attend all the three events.
    One way to attend them all is as shown.
    Attend the first event on day 1.
    Attend the second event on day 2.
    Attend the third event on day 3.
    Example 2:
    Input: events= [[1,2],[2,3],[3,4],[1,2]]
    Output: 4
      Constraints:
    1 <= events.length <= 105
    events[i].length == 2
    1 <= startDayi <= endDayi <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 2}, {2, 3}, {3, 4}};
        int expected = 3;
        var result = solution.maxEvents(events);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] events = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 2}};
        int expected = 4;
        var result = solution.maxEvents(events);
        assertThat(result).isEqualTo(expected);
    }

}
