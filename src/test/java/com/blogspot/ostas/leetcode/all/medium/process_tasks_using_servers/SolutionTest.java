package com.blogspot.ostas.leetcode.all.medium.process_tasks_using_servers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: servers = [3,3,2], tasks = [1,2,3,2,1,2]
    Output: [2,2,0,2,1,2]
    Explanation: Events in chronological order go as follows:
    - At second 0, task 0 is added and processed using server 2 until second 1.
    - At second 1, server 2 becomes free. Task 1 is added and processed using server 2 until second 3.
    - At second 2, task 2 is added and processed using server 0 until second 5.
    - At second 3, server 2 becomes free. Task 3 is added and processed using server 2 until second 5.
    - At second 4, task 4 is added and processed using server 1 until second 5.
    - At second 5, all servers become free. Task 5 is added and processed using server 2 until second 7.
    Example 2:
    Input: servers = [5,1,4,3,2], tasks = [2,1,2,4,5,2,1]
    Output: [1,4,1,4,1,3,2]
    Explanation: Events in chronological order go as follows:
    - At second 0, task 0 is added and processed using server 1 until second 2.
    - At second 1, task 1 is added and processed using server 4 until second 2.
    - At second 2, servers 1 and 4 become free. Task 2 is added and processed using server 1 until second 4.
    - At second 3, task 3 is added and processed using server 4 until second 7.
    - At second 4, server 1 becomes free. Task 4 is added and processed using server 1 until second 9.
    - At second 5, task 5 is added and processed using server 3 until second 7.
    - At second 6, task 6 is added and processed using server 2 until second 7.
      Constraints:
    servers.length == n
    tasks.length == m
    1 <= n, m <= 2 * 105
    1 <= servers[i], tasks[j] <= 2 * 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] servers = new int[]{3, 3, 2};
        int[] tasks = new int[]{1, 2, 3, 2, 1, 2};
        int[] expected = new int[]{2, 2, 0, 2, 1, 2};
        var result = solution.assignTasks(servers, tasks);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] servers = new int[]{5, 1, 4, 3, 2};
        int[] tasks = new int[]{2, 1, 2, 4, 5, 2, 1};
        int[] expected = new int[]{1, 4, 1, 4, 1, 3, 2};
        var result = solution.assignTasks(servers, tasks);
        assertThat(result).isEqualTo(expected);
    }

}
