package com.blogspot.ostas.leetcode.all.hard.minimum_difficulty_of_a_job_schedule;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: jobDifficulty = [6,5,4,3,2,1], d = 2
    Output: 7
    Explanation: First day you can finish the first 5 jobs, total difficulty = 6.
    Second day you can finish the last job, total difficulty = 1.
    The difficulty of the schedule = 6 + 1 = 7
    Example 2:
    Input: jobDifficulty = [9,9,9], d = 4
    Output: -1
    Explanation: If you finish a job per day you will still have a free day. you cannot find a schedule for the given jobs.
    Example 3:
    Input: jobDifficulty = [1,1,1], d = 3
    Output: 3
    Explanation: The schedule is one job per day. total difficulty will be 3.
      Constraints:
    1 <= jobDifficulty.length <= 300
    0 <= jobDifficulty[i] <= 1000
    1 <= d <= 10
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] jobDifficulty = new int[]{6, 5, 4, 3, 2, 1};
        int d = 2;
        int expected = 7;
        var result = solution.minDifficulty(jobDifficulty, d);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] jobDifficulty = new int[]{9, 9, 9};
        int d = 4;
        int expected = -1;
        var result = solution.minDifficulty(jobDifficulty, d);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] jobDifficulty = new int[]{1, 1, 1};
        int d = 3;
        int expected = 3;
        var result = solution.minDifficulty(jobDifficulty, d);
        assertThat(result).isEqualTo(expected);
    }

}
