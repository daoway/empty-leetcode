package com.blogspot.ostas.leetcode.all.medium.longest_well_performing_interval;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: hours = [9,9,6,0,6,6,9]
    Output: 3
    Explanation: The longest well-performing interval is [9,9,6].
    Example 2:
    Input: hours = [6,6,6]
    Output: 0
      Constraints:
    1 <= hours.length <= 104
    0 <= hours[i] <= 16
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] hours = new int[]{9, 9, 6, 0, 6, 6, 9};
        int expected = 3;
        var result = solution.longestWPI(hours);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] hours = new int[]{6, 6, 6};
        int expected = 0;
        var result = solution.longestWPI(hours);
        assertThat(result).isEqualTo(expected);
    }

}
