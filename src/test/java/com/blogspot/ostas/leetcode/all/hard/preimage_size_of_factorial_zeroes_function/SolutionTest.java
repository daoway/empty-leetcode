package com.blogspot.ostas.leetcode.all.hard.preimage_size_of_factorial_zeroes_function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: k = 0
    Output: 5
    Explanation: 0!, 1!, 2!, 3!, and 4! end with k = 0 zeroes.
    Example 2:
    Input: k = 5
    Output: 0
    Explanation: There is no x such that x! ends in k = 5 zeroes.
    Example 3:
    Input: k = 3
    Output: 5
      Constraints:
    0 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int k = 0;
        int expected = 5;
        var result = solution.preimageSizeFZF(k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int k = 5;
        int expected = 0;
        var result = solution.preimageSizeFZF(k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int k = 3;
        int expected = 5;
        var result = solution.preimageSizeFZF(k);
        assertThat(result).isEqualTo(expected);
    }

}
