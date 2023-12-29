package com.blogspot.ostas.leetcode.all.medium.domino_and_tromino_tiling;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 5
    Explanation: The five different ways are show above.
    Example 2:
    Input: n = 1
    Output: 1
      Constraints:
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 5;
        var result = solution.numTilings(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 1;
        int expected = 1;
        var result = solution.numTilings(n);
        assertThat(result).isEqualTo(expected);
    }

}
