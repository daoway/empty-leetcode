package com.blogspot.ostas.leetcode.all.easy.rings_and_rods;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: rings = "B0B6G0R6R0R6G9"
    Output: 1
    Explanation:
    - The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
    - The rod labeled 6 holds 3 rings, but it only has red and blue.
    - The rod labeled 9 holds only a green ring.
    Thus, the number of rods with all three colors is 1.
    Example 2:
    Input: rings = "B0R0G0R9R0B0G0"
    Output: 1
    Explanation:
    - The rod labeled 0 holds 6 rings with all colors: red, green, and blue.
    - The rod labeled 9 holds only a red ring.
    Thus, the number of rods with all three colors is 1.
    Example 3:
    Input: rings = "G4"
    Output: 0
    Explanation:
    Only one ring is given. Thus, no rods have all three colors.
      Constraints:
    rings.length == 2 * n
    1 <= n <= 100
    rings[i] where i is even is either 'R', 'G', or 'B' (0-indexed).
    rings[i] where i is odd is a digit from '0' to '9' (0-indexed).
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String rings = "B0B6G0R6R0R6G9";
        int expected = 1;
        var result = solution.countPoints(rings);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String rings = "B0R0G0R9R0B0G0";
        int expected = 1;
        var result = solution.countPoints(rings);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String rings = "G4";
        int expected = 0;
        var result = solution.countPoints(rings);
        assertThat(result).isEqualTo(expected);
    }

}
