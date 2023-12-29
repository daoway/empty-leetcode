package com.blogspot.ostas.leetcode.all.medium.asteroid_collision;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: asteroids = [5,10,-5]
    Output: [5,10]
    Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
    Example 2:
    Input: asteroids = [8,-8]
    Output: []
    Explanation: The 8 and -8 collide exploding each other.
    Example 3:
    Input: asteroids = [10,2,-5]
    Output: [10]
    Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.
      Constraints:
    2 <= asteroids.length <= 104
    -1000 <= asteroids[i] <= 1000
    asteroids[i] != 0
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int[] asteroids = new int[]{5, 10, -5};
        int[] expected = new int[]{5, 10};
        var result = solution.asteroidCollision(asteroids);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int[] asteroids = new int[]{8, -8};
        int[] expected = new int[]{};
        var result = solution.asteroidCollision(asteroids);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int[] asteroids = new int[]{10, 2, -5};
        int[] expected = new int[]{10};
        var result = solution.asteroidCollision(asteroids);
        assertThat(result).isEqualTo(expected);
    }

}
