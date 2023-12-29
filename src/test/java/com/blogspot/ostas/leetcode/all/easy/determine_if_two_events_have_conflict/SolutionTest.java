package com.blogspot.ostas.leetcode.all.easy.determine_if_two_events_have_conflict;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]
    Output: true
    Explanation: The two events intersect at time 2:00.
    Example 2:
    Input: event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]
    Output: true
    Explanation: The two events intersect starting from 01:20 to 02:00.
    Example 3:
    Input: event1 = ["10:00","11:00"], event2 = ["14:00","15:00"]
    Output: false
    Explanation: The two events do not intersect.
      Constraints:
    evnet1.length == event2.length == 2.
    event1[i].length == event2[i].length == 5
    startTime1 <= endTime1
    startTime2 <= endTime2
    All the event times follow the HH:MM format.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] event1 = new String[]{"01:15", "02:00"};
        String[] event2 = new String[]{"02:00", "03:00"};
        boolean expected = true;
        var result = solution.haveConflict(event1, event2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] event1 = new String[]{"01:00", "02:00"};
        String[] event2 = new String[]{"01:20", "03:00"};
        boolean expected = true;
        var result = solution.haveConflict(event1, event2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] event1 = new String[]{"10:00", "11:00"};
        String[] event2 = new String[]{"14:00", "15:00"};
        boolean expected = false;
        var result = solution.haveConflict(event1, event2);
        assertThat(result).isEqualTo(expected);
    }

}
