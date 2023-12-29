package com.blogspot.ostas.leetcode.all.medium.minimum_speed_to_arrive_on_time;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: dist = [1,3,2], hour = 6
    Output: 1
    Explanation: At speed 1:
    - The first train ride takes 1/1 = 1 hour.
    - Since we are already at an integer hour, we depart immediately at the 1 hour mark. The second train takes 3/1 = 3 hours.
    - Since we are already at an integer hour, we depart immediately at the 4 hour mark. The third train takes 2/1 = 2 hours.
    - You will arrive at exactly the 6 hour mark.
    Example 2:
    Input: dist = [1,3,2], hour = 2.7
    Output: 3
    Explanation: At speed 3:
    - The first train ride takes 1/3 = 0.33333 hours.
    - Since we are not at an integer hour, we wait until the 1 hour mark to depart. The second train ride takes 3/3 = 1 hour.
    - Since we are already at an integer hour, we depart immediately at the 2 hour mark. The third train takes 2/3 = 0.66667 hours.
    - You will arrive at the 2.66667 hour mark.
    Example 3:
    Input: dist = [1,3,2], hour = 1.9
    Output: -1
    Explanation: It is impossible because the earliest the third train can depart is at the 2 hour mark.
      Constraints:
    n == dist.length
    1 <= n <= 105
    1 <= dist[i] <= 105
    1 <= hour <= 109
    There will be at most two digits after the decimal point in hour.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] dist = new int[]{1, 3, 2};
        double hour = 6;
        int expected = 1;
        var result = solution.minSpeedOnTime(dist, hour);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] dist = new int[]{1, 3, 2};
        double hour = 2.7;
        int expected = 3;
        var result = solution.minSpeedOnTime(dist, hour);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] dist = new int[]{1, 3, 2};
        double hour = 1.9;
        int expected = -1;
        var result = solution.minSpeedOnTime(dist, hour);
        assertThat(result).isEqualTo(expected);
    }

}
