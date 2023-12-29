package com.blogspot.ostas.leetcode.all.hard.minimum_number_of_taps_to_open_to_water_a_garden;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, ranges = [3,4,1,1,0,0]
    Output: 1
    Explanation: The tap at point 0 can cover the interval [-3,3]
    The tap at point 1 can cover the interval [-3,5]
    The tap at point 2 can cover the interval [1,3]
    The tap at point 3 can cover the interval [2,4]
    The tap at point 4 can cover the interval [4,4]
    The tap at point 5 can cover the interval [5,5]
    Opening Only the second tap will water the whole garden [0,5]
    Example 2:
    Input: n = 3, ranges = [0,0,0,0]
    Output: -1
    Explanation: Even if you activate all the four taps you cannot water the whole garden.
      Constraints:
    1 <= n <= 104
    ranges.length == n + 1
    0 <= ranges[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int[] ranges = new int[]{3, 4, 1, 1, 0, 0};
        int expected = 1;
        var result = solution.minTaps(n, ranges);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 3;
        int[] ranges = new int[]{0, 0, 0, 0};
        int expected = -1;
        var result = solution.minTaps(n, ranges);
        assertThat(result).isEqualTo(expected);
    }

}
