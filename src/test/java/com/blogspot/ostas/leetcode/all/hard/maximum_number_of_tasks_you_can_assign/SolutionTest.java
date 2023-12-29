package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_tasks_you_can_assign;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tasks = [3,2,1], workers = [0,3,3], pills = 1, strength = 1
    Output: 3
    Explanation:
    We can assign the magical pill and tasks as follows:
    - Give the magical pill to worker 0.
    - Assign worker 0 to task 2 (0 + 1 >= 1)
    - Assign worker 1 to task 1 (3 >= 2)
    - Assign worker 2 to task 0 (3 >= 3)
    Example 2:
    Input: tasks = [5,4], workers = [0,0,0], pills = 1, strength = 5
    Output: 1
    Explanation:
    We can assign the magical pill and tasks as follows:
    - Give the magical pill to worker 0.
    - Assign worker 0 to task 0 (0 + 5 >= 5)
    Example 3:
    Input: tasks = [10,15,30], workers = [0,10,10,10,10], pills = 3, strength = 10
    Output: 2
    Explanation:
    We can assign the magical pills and tasks as follows:
    - Give the magical pill to worker 0 and worker 1.
    - Assign worker 0 to task 0 (0 + 10 >= 10)
    - Assign worker 1 to task 1 (10 + 10 >= 15)
    The last pill is not given because it will not make any worker strong enough for the last task.
      Constraints:
    n == tasks.length
    m == workers.length
    1 <= n, m <= 5 * 104
    0 <= pills <= m
    0 <= tasks[i], workers[j], strength <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] tasks = new int[]{3, 2, 1};
        int[] workers = new int[]{0, 3, 3};
        int pills = 1;
        int strength = 1;
        int expected = 3;
        var result = solution.maxTaskAssign(tasks, workers, pills, strength);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] tasks = new int[]{5, 4};
        int[] workers = new int[]{0, 0, 0};
        int pills = 1;
        int strength = 5;
        int expected = 1;
        var result = solution.maxTaskAssign(tasks, workers, pills, strength);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] tasks = new int[]{10, 15, 30};
        int[] workers = new int[]{0, 10, 10, 10, 10};
        int pills = 3;
        int strength = 10;
        int expected = 2;
        var result = solution.maxTaskAssign(tasks, workers, pills, strength);
        assertThat(result).isEqualTo(expected);
    }

}
