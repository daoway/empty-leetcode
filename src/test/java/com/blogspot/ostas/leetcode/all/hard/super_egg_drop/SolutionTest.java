package com.blogspot.ostas.leetcode.all.hard.super_egg_drop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 1, n = 2
    Output: 2
    Explanation:
    Drop the egg from floor 1. If it breaks, we know that f = 0.
    Otherwise, drop the egg from floor 2. If it breaks, we know that f = 1.
    If it does not break, then we know f = 2.
    Hence, we need at minimum 2 moves to determine with certainty what the value of f is.
    Example 2:
    Input: k = 2, n = 6
    Output: 3
    Example 3:
    Input: k = 3, n = 14
    Output: 4
      Constraints:
    1 <= k <= 100
    1 <= n <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 1;
        int n = 2;
        int expected = 2;
        var result = solution.superEggDrop(k, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 2;
        int n = 6;
        int expected = 3;
        var result = solution.superEggDrop(k, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int k = 3;
        int n = 14;
        int expected = 4;
        var result = solution.superEggDrop(k, n);
        assertThat(result).isEqualTo(expected);
    }

}
