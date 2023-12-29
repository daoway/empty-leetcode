package com.blogspot.ostas.leetcode.all.medium.heaters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: houses = [1,2,3], heaters = [2]
    Output: 1
    Explanation: The only heater was placed in the position 2, and if we use the radius 1 standard, then all the houses can be warmed.
    Example 2:
    Input: houses = [1,2,3,4], heaters = [1,4]
    Output: 1
    Explanation: The two heaters were placed at positions 1 and 4. We need to use a radius 1 standard, then all the houses can be warmed.
    Example 3:
    Input: houses = [1,5], heaters = [2]
    Output: 3
      Constraints:
    1 <= houses.length, heaters.length <= 3 * 104
    1 <= houses[i], heaters[i] <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] houses = new int[]{1, 2, 3};
        int[] heaters = new int[]{2};
        int expected = 1;
        var result = solution.findRadius(houses, heaters);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] houses = new int[]{1, 2, 3, 4};
        int[] heaters = new int[]{1, 4};
        int expected = 1;
        var result = solution.findRadius(houses, heaters);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] houses = new int[]{1, 5};
        int[] heaters = new int[]{2};
        int expected = 3;
        var result = solution.findRadius(houses, heaters);
        assertThat(result).isEqualTo(expected);
    }

}
