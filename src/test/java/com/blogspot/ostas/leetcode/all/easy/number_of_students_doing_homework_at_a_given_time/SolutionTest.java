package com.blogspot.ostas.leetcode.all.easy.number_of_students_doing_homework_at_a_given_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
    Output: 1
    Explanation: We have 3 students where:
    The first student started doing homework at time 1 and finished at time 3 and wasn't doing anything at time 4.
    The second student started doing homework at time 2 and finished at time 2 and also wasn't doing anything at time 4.
    The third student started doing homework at time 3 and finished at time 7 and was the only student doing homework at time 4.
    Example 2:
    Input: startTime = [4], endTime = [4], queryTime = 4
    Output: 1
    Explanation: The only student was doing their homework at the queryTime.
      Constraints:
    startTime.length == endTime.length
    1 <= startTime.length <= 100
    1 <= startTime[i] <= endTime[i] <= 1000
    1 <= queryTime <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] startTime = new int[]{1, 2, 3};
        int[] endTime = new int[]{3, 2, 7};
        int queryTime = 4;
        int expected = 1;
        var result = solution.busyStudent(startTime, endTime, queryTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] startTime = new int[]{4};
        int[] endTime = new int[]{4};
        int queryTime = 4;
        int expected = 1;
        var result = solution.busyStudent(startTime, endTime, queryTime);
        assertThat(result).isEqualTo(expected);
    }

}
