package com.blogspot.ostas.leetcode.all.hard.maximum_profit_in_job_scheduling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
    Output: 120
    Explanation: The subset chosen is the first and fourth job.
    Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
    Example 2:
    Input: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
    Output: 150
    Explanation: The subset chosen is the first, fourth and fifth job.
    Profit obtained 150 = 20 + 70 + 60.
    Example 3:
    Input: startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
    Output: 6
      Constraints:
    1 <= startTime.length == endTime.length == profit.length <= 5 * 104
    1 <= startTime[i] < endTime[i] <= 109
    1 <= profit[i] <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] startTime = new int[]{1, 2, 3, 3};
        int[] endTime = new int[]{3, 4, 5, 6};
        int[] profit = new int[]{50, 10, 40, 70};
        int expected = 120;
        var result = solution.jobScheduling(startTime, endTime, profit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] startTime = new int[]{1, 2, 3, 4, 6};
        int[] endTime = new int[]{3, 5, 10, 6, 9};
        int[] profit = new int[]{20, 20, 100, 70, 60};
        int expected = 150;
        var result = solution.jobScheduling(startTime, endTime, profit);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] startTime = new int[]{1, 1, 1};
        int[] endTime = new int[]{2, 3, 4};
        int[] profit = new int[]{5, 6, 4};
        int expected = 6;
        var result = solution.jobScheduling(startTime, endTime, profit);
        assertThat(result).isEqualTo(expected);
    }

}
