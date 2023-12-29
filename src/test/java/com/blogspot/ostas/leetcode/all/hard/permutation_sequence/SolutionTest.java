package com.blogspot.ostas.leetcode.all.hard.permutation_sequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 3
    Output: "213"
    Example 2:
    Input: n = 4, k = 9
    Output: "2314"
    Example 3:
    Input: n = 3, k = 1
    Output: "123"
      Constraints:
    1 <= n <= 9
    1 <= k <= n!
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 3;
        String expected = "213";
        var result = solution.getPermutation(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int k = 9;
        String expected = "2314";
        var result = solution.getPermutation(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 3;
        int k = 1;
        String expected = "123";
        var result = solution.getPermutation(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
