package com.blogspot.ostas.leetcode.all.medium.minimum_garden_perimeter_to_collect_enough_apples;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: neededApples = 1
    Output: 8
    Explanation: A square plot of side length 1 does not contain any apples.
    However, a square plot of side length 2 has 12 apples inside (as depicted in the image above).
    The perimeter is 2 * 4 = 8.
    Example 2:
    Input: neededApples = 13
    Output: 16
    Example 3:
    Input: neededApples = 1000000000
    Output: 5040
      Constraints:
    1 <= neededApples <= 1015
    */
    @Test
    void example_0() {
        var solution = new Solution();
        long neededApples = 1;
        long expected = 8;
        var result = solution.minimumPerimeter(neededApples);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        long neededApples = 13;
        long expected = 16;
        var result = solution.minimumPerimeter(neededApples);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        long neededApples = 1000000000;
        long expected = 5040;
        var result = solution.minimumPerimeter(neededApples);
        assertThat(result).isEqualTo(expected);
    }

}
