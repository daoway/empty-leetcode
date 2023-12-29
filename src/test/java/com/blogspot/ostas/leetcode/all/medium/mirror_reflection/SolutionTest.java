package com.blogspot.ostas.leetcode.all.medium.mirror_reflection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: p = 2, q = 1
    Output: 2
    Explanation: The ray meets receptor 2 the first time it gets reflected back to the left wall.
    Example 2:
    Input: p = 3, q = 1
    Output: 1
      Constraints:
    1 <= q <= p <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int p = 2;
        int q = 1;
        int expected = 2;
        var result = solution.mirrorReflection(p, q);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int p = 3;
        int q = 1;
        int expected = 1;
        var result = solution.mirrorReflection(p, q);
        assertThat(result).isEqualTo(expected);
    }

}
