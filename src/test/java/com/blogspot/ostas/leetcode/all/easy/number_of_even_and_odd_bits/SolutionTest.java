package com.blogspot.ostas.leetcode.all.easy.number_of_even_and_odd_bits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 17
    Output: [2,0]
    Explanation: The binary representation of 17 is 10001.
    It contains 1 on the 0th and 4th indices.
    There are 2 even and 0 odd indices.
    Example 2:
    Input: n = 2
    Output: [0,1]
    Explanation: The binary representation of 2 is 10.
    It contains 1 on the 1st index.
    There are 0 even and 1 odd indices.
      Constraints:
    1 <= n <= 1000
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 17;
        int[] expected = new int[]{2, 0};
        var result = solution.evenOddBit(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        int[] expected = new int[]{0, 1};
        var result = solution.evenOddBit(n);
        assertThat(result).isEqualTo(expected);
    }

}
