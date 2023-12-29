package com.blogspot.ostas.leetcode.all.medium.find_kth_bit_in_nth_binary_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 3, k = 1
    Output: "0"
    Explanation: S3 is "0111001".
    The 1st bit is "0".
    Example 2:
    Input: n = 4, k = 11
    Output: "1"
    Explanation: S4 is "011100110110001".
    The 11th bit is "1".
      Constraints:
    1 <= n <= 20
    1 <= k <= 2n - 1
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 3;
        int k = 1;
        char expected = '0';
        var result = solution.findKthBit(n, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int k = 11;
        char expected = '1';
        var result = solution.findKthBit(n, k);
        assertThat(result).isEqualTo(expected);
    }

}
