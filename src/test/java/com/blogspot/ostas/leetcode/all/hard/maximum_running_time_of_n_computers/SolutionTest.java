package com.blogspot.ostas.leetcode.all.hard.maximum_running_time_of_n_computers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 2, batteries = [3,3,3]
    Output: 4
    Explanation:
    Initially, insert battery 0 into the first computer and battery 1 into the second computer.
    After two minutes, remove battery 1 from the second computer and insert battery 2 instead. Note that battery 1 can still run for one minute.
    At the end of the third minute, battery 0 is drained, and you need to remove it from the first computer and insert battery 1 instead.
    By the end of the fourth minute, battery 1 is also drained, and the first computer is no longer running.
    We can run the two computers simultaneously for at most 4 minutes, so we return 4.
    Example 2:
    Input: n = 2, batteries = [1,1,1,1]
    Output: 2
    Explanation:
    Initially, insert battery 0 into the first computer and battery 2 into the second computer.
    After one minute, battery 0 and battery 2 are drained so you need to remove them and insert battery 1 into the first computer and battery 3 into the second computer.
    After another minute, battery 1 and battery 3 are also drained so the first and second computers are no longer running.
    We can run the two computers simultaneously for at most 2 minutes, so we return 2.
      Constraints:
    1 <= n <= batteries.length <= 105
    1 <= batteries[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 2;
        int[] batteries = new int[]{3, 3, 3};
        long expected = 4;
        var result = solution.maxRunTime(n, batteries);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[] batteries = new int[]{1, 1, 1, 1};
        long expected = 2;
        var result = solution.maxRunTime(n, batteries);
        assertThat(result).isEqualTo(expected);
    }

}
