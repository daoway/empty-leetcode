package com.blogspot.ostas.leetcode.all.medium.daily_temperatures;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: temperatures = [73,74,75,71,69,72,76,73]
    Output: [1,1,4,2,1,1,0,0]
    Example 2:
    Input: temperatures = [30,40,50,60]
    Output: [1,1,1,0]
    Example 3:
    Input: temperatures = [30,60,90]
    Output: [1,1,0]
      Constraints:
    1 <= temperatures.length <= 105
    30 <= temperatures[i] <= 100
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] temperatures = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = new int[]{1, 1, 4, 2, 1, 1, 0, 0};
        var result = solution.dailyTemperatures(temperatures);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] temperatures = new int[]{30, 40, 50, 60};
        int[] expected = new int[]{1, 1, 1, 0};
        var result = solution.dailyTemperatures(temperatures);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] temperatures = new int[]{30, 60, 90};
        int[] expected = new int[]{1, 1, 0};
        var result = solution.dailyTemperatures(temperatures);
        assertThat(result).isEqualTo(expected);
    }

}
