package com.blogspot.ostas.leetcode.all.medium.capacity_to_ship_packages_within_d_days;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
    Output: 15
    Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
    1st day: 1, 2, 3, 4, 5
    2nd day: 6, 7
    3rd day: 8
    4th day: 9
    5th day: 10

    Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
    Example 2:
    Input: weights = [3,2,2,4,1,4], days = 3
    Output: 6
    Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
    1st day: 3, 2
    2nd day: 2, 4
    3rd day: 1, 4
    Example 3:
    Input: weights = [1,2,3,1,1], days = 4
    Output: 3
    Explanation:
    1st day: 1
    2nd day: 2
    3rd day: 3
    4th day: 1, 1
      Constraints:
    1 <= days <= weights.length <= 5 * 104
    1 <= weights[i] <= 500
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] weights = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        int expected = 15;
        var result = solution.shipWithinDays(weights, days);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] weights = new int[]{3, 2, 2, 4, 1, 4};
        int days = 3;
        int expected = 6;
        var result = solution.shipWithinDays(weights, days);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] weights = new int[]{1, 2, 3, 1, 1};
        int days = 4;
        int expected = 3;
        var result = solution.shipWithinDays(weights, days);
        assertThat(result).isEqualTo(expected);
    }

}
