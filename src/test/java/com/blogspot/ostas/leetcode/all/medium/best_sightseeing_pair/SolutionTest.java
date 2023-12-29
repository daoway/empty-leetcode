package com.blogspot.ostas.leetcode.all.medium.best_sightseeing_pair;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: values = [8,1,5,2,6]
    Output: 11
    Explanation: i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11
    Example 2:
    Input: values = [1,2]
    Output: 2
      Constraints:
    2 <= values.length <= 5 * 104
    1 <= values[i] <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] values = new int[]{8, 1, 5, 2, 6};
        int expected = 11;
        var result = solution.maxScoreSightseeingPair(values);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] values = new int[]{1, 2};
        int expected = 2;
        var result = solution.maxScoreSightseeingPair(values);
        assertThat(result).isEqualTo(expected);
    }

}
