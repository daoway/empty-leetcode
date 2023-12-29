package com.blogspot.ostas.leetcode.all.hard.minimum_time_to_complete_all_tasks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: tasks = [[2,3,1],[4,5,1],[1,5,2]]
    Output: 2
    Explanation:
    - The first task can be run in the inclusive time range [2, 2].
    - The second task can be run in the inclusive time range [5, 5].
    - The third task can be run in the two inclusive time ranges [2, 2] and [5, 5].
    The computer will be on for a total of 2 seconds.
    Example 2:
    Input: tasks = [[1,3,2],[2,5,3],[5,6,2]]
    Output: 4
    Explanation:
    - The first task can be run in the inclusive time range [2, 3].
    - The second task can be run in the inclusive time ranges [2, 3] and [5, 5].
    - The third task can be run in the two inclusive time range [5, 6].
    The computer will be on for a total of 4 seconds.
      Constraints:
    1 <= tasks.length <= 2000
    tasks[i].length == 3
    1 <= starti, endi <= 2000
    1 <= durationi <= endi - starti + 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[][] tasks = new int[][]{{2, 3, 1}, {4, 5, 1}, {1, 5, 2}};
        int expected = 2;
        var result = solution.findMinimumTime(tasks);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[][] tasks = new int[][]{{1, 3, 2}, {2, 5, 3}, {5, 6, 2}};
        int expected = 4;
        var result = solution.findMinimumTime(tasks);
        assertThat(result).isEqualTo(expected);
    }

}
