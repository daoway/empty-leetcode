package com.blogspot.ostas.leetcode.all.medium.task_scheduler_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tasks = [1,2,1,2,3,1], space = 3
    Output: 9
    Explanation:
    One way to complete all tasks in 9 days is as follows:
    Day 1: Complete the 0th task.
    Day 2: Complete the 1st task.
    Day 3: Take a break.
    Day 4: Take a break.
    Day 5: Complete the 2nd task.
    Day 6: Complete the 3rd task.
    Day 7: Take a break.
    Day 8: Complete the 4th task.
    Day 9: Complete the 5th task.
    It can be shown that the tasks cannot be completed in less than 9 days.
    Example 2:
    Input: tasks = [5,8,8,5], space = 2
    Output: 6
    Explanation:
    One way to complete all tasks in 6 days is as follows:
    Day 1: Complete the 0th task.
    Day 2: Complete the 1st task.
    Day 3: Take a break.
    Day 4: Take a break.
    Day 5: Complete the 2nd task.
    Day 6: Complete the 3rd task.
    It can be shown that the tasks cannot be completed in less than 6 days.
      Constraints:
    1 <= tasks.length <= 105
    1 <= tasks[i] <= 109
    1 <= space <= tasks.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] tasks = new int[]{1, 2, 1, 2, 3, 1};
        int space = 3;
        long expected = 9;
        var result = solution.taskSchedulerII(tasks, space);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] tasks = new int[]{5, 8, 8, 5};
        int space = 2;
        long expected = 6;
        var result = solution.taskSchedulerII(tasks, space);
        assertThat(result).isEqualTo(expected);
    }

}
