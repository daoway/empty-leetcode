package com.blogspot.ostas.leetcode.all.hard.minimum_one_bit_operations_to_make_integers_zero;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3
    Output: 2
    Explanation: The binary representation of 3 is "11".
    "11" -> "01" with the 2nd operation since the 0th bit is 1.
    "01" -> "00" with the 1st operation.
    Example 2:
    Input: n = 6
    Output: 4
    Explanation: The binary representation of 6 is "110".
    "110" -> "010" with the 2nd operation since the 1st bit is 1 and 0th through 0th bits are 0.
    "010" -> "011" with the 1st operation.
    "011" -> "001" with the 2nd operation since the 0th bit is 1.
    "001" -> "000" with the 1st operation.
      Constraints:
    0 <= n <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int expected = 2;
        var result = solution.minimumOneBitOperations(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 6;
        int expected = 4;
        var result = solution.minimumOneBitOperations(n);
        assertThat(result).isEqualTo(expected);
    }

}
