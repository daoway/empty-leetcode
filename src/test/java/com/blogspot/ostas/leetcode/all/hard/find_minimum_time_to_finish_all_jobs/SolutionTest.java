package com.blogspot.ostas.leetcode.all.hard.find_minimum_time_to_finish_all_jobs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: jobs = [3,2,3], k = 3
    Output: 3
    Explanation: By assigning each person one job, the maximum time is 3.
    Example 2:
    Input: jobs = [1,2,4,7,8], k = 2
    Output: 11
    Explanation: Assign the jobs the following way:
    Worker 1: 1, 2, 8 (working time = 1 + 2 + 8 = 11)
    Worker 2: 4, 7 (working time = 4 + 7 = 11)
    The maximum working time is 11.
      Constraints:
    1 <= k <= jobs.length <= 12
    1 <= jobs[i] <= 107
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] jobs = new int[]{3, 2, 3};
        int k = 3;
        int expected = 3;
        var result = solution.minimumTimeRequired(jobs, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] jobs = new int[]{1, 2, 4, 7, 8};
        int k = 2;
        int expected = 11;
        var result = solution.minimumTimeRequired(jobs, k);
        assertThat(result).isEqualTo(expected);
    }

}
