package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_work_sessions_to_finish_the_tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tasks = [1,2,3], sessionTime = 3
    Output: 2
    Explanation: You can finish the tasks in two work sessions.
    - First work session: finish the first and the second tasks in 1 + 2 = 3 hours.
    - Second work session: finish the third task in 3 hours.
    Example 2:
    Input: tasks = [3,1,3,1,1], sessionTime = 8
    Output: 2
    Explanation: You can finish the tasks in two work sessions.
    - First work session: finish all the tasks except the last one in 3 + 1 + 3 + 1 = 8 hours.
    - Second work session: finish the last task in 1 hour.
    Example 3:
    Input: tasks = [1,2,3,4,5], sessionTime = 15
    Output: 1
    Explanation: You can finish all the tasks in one work session.
      Constraints:
    n == tasks.length
    1 <= n <= 14
    1 <= tasks[i] <= 10
    max(tasks[i]) <= sessionTime <= 15
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] tasks = new int[]{1, 2, 3};
        int sessionTime = 3;
        int expected = 2;
        var result = solution.minSessions(tasks, sessionTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] tasks = new int[]{3, 1, 3, 1, 1};
        int sessionTime = 8;
        int expected = 2;
        var result = solution.minSessions(tasks, sessionTime);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] tasks = new int[]{1, 2, 3, 4, 5};
        int sessionTime = 15;
        int expected = 1;
        var result = solution.minSessions(tasks, sessionTime);
        assertThat(result).isEqualTo(expected);
    }

}
