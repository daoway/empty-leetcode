package com.blogspot.ostas.leetcode.all.hard.maximize_the_minimum_powered_city;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: stations = [1,2,4,5,0], r = 1, k = 2
    Output: 5
    Explanation:
    One of the optimal ways is to install both the power stations at city 1.
    So stations will become [1,4,4,5,0].
    - City 0 is provided by 1 + 4 = 5 power stations.
    - City 1 is provided by 1 + 4 + 4 = 9 power stations.
    - City 2 is provided by 4 + 4 + 5 = 13 power stations.
    - City 3 is provided by 5 + 4 = 9 power stations.
    - City 4 is provided by 5 + 0 = 5 power stations.
    So the minimum power of a city is 5.
    Since it is not possible to obtain a larger power, we return 5.
    Example 2:
    Input: stations = [4,4,4,4], r = 0, k = 3
    Output: 4
    Explanation:
    It can be proved that we cannot make the minimum power of a city greater than 4.
      Constraints:
    n == stations.length
    1 <= n <= 105
    0 <= stations[i] <= 105
    0 <= r <= n - 1
    0 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] stations = new int[]{1, 2, 4, 5, 0};
        int r = 1;
        int k = 2;
        long expected = 5;
        var result = solution.maxPower(stations, r, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] stations = new int[]{4, 4, 4, 4};
        int r = 0;
        int k = 3;
        long expected = 4;
        var result = solution.maxPower(stations, r, k);
        assertThat(result).isEqualTo(expected);
    }

}
