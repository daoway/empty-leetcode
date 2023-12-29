package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_robots_within_budget;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: chargeTimes = [3,6,1,3,4], runningCosts = [2,1,3,4,5], budget = 25
    Output: 3
    Explanation:
    It is possible to run all individual and consecutive pairs of robots within budget.
    To obtain answer 3, consider the first 3 robots. The total cost will be max(3,6,1) + 3 * sum(2,1,3) = 6 + 3 * 6 = 24 which is less than 25.
    It can be shown that it is not possible to run more than 3 consecutive robots within budget, so we return 3.
    Example 2:
    Input: chargeTimes = [11,12,19], runningCosts = [10,8,7], budget = 19
    Output: 0
    Explanation: No robot can be run that does not exceed the budget, so we return 0.
      Constraints:
    chargeTimes.length == runningCosts.length == n
    1 <= n <= 5 * 104
    1 <= chargeTimes[i], runningCosts[i] <= 105
    1 <= budget <= 1015
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] chargeTimes = new int[]{3, 6, 1, 3, 4};
        int[] runningCosts = new int[]{2, 1, 3, 4, 5};
        long budget = 25;
        int expected = 3;
        var result = solution.maximumRobots(chargeTimes, runningCosts, budget);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] chargeTimes = new int[]{11, 12, 19};
        int[] runningCosts = new int[]{10, 8, 7};
        long budget = 19;
        int expected = 0;
        var result = solution.maximumRobots(chargeTimes, runningCosts, budget);
        assertThat(result).isEqualTo(expected);
    }

}
