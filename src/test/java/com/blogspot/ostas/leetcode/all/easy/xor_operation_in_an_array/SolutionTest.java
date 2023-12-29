package com.blogspot.ostas.leetcode.all.easy.xor_operation_in_an_array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 5, start = 0
    Output: 8
    Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
    Where "^" corresponds to bitwise XOR operator.
    Example 2:
    Input: n = 4, start = 3
    Output: 8
    Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
      Constraints:
    1 <= n <= 1000
    0 <= start <= 1000
    n == nums.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 5;
        int start = 0;
        int expected = 8;
        var result = solution.xorOperation(n, start);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 4;
        int start = 3;
        int expected = 8;
        var result = solution.xorOperation(n, start);
        assertThat(result).isEqualTo(expected);
    }

}
