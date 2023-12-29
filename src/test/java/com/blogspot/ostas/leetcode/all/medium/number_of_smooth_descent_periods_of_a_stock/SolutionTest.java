package com.blogspot.ostas.leetcode.all.medium.number_of_smooth_descent_periods_of_a_stock;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: prices = [3,2,1,4]
    Output: 7
    Explanation: There are 7 smooth descent periods:
    [3], [2], [1], [4], [3,2], [2,1], and [3,2,1]
    Note that a period with one day is a smooth descent period by the definition.
    Example 2:
    Input: prices = [8,6,7,7]
    Output: 4
    Explanation: There are 4 smooth descent periods: [8], [6], [7], and [7]
    Note that [8,6] is not a smooth descent period as 8 - 6 ≠ 1.
    Example 3:
    Input: prices = [1]
    Output: 1
    Explanation: There is 1 smooth descent period: [1]
      Constraints:
    1 <= prices.length <= 105
    1 <= prices[i] <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] prices = new int[]{3, 2, 1, 4};
        long expected = 7;
        var result = solution.getDescentPeriods(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] prices = new int[]{8, 6, 7, 7};
        long expected = 4;
        var result = solution.getDescentPeriods(prices);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] prices = new int[]{1};
        long expected = 1;
        var result = solution.getDescentPeriods(prices);
        assertThat(result).isEqualTo(expected);
    }

}
