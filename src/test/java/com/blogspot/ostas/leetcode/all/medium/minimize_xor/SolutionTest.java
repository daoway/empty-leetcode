package com.blogspot.ostas.leetcode.all.medium.minimize_xor;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num1 = 3, num2 = 5
    Output: 3
    Explanation:
    The binary representations of num1 and num2 are 0011 and 0101, respectively.
    The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal.
    Example 2:
    Input: num1 = 1, num2 = 12
    Output: 3
    Explanation:
    The binary representations of num1 and num2 are 0001 and 1100, respectively.
    The integer 3 has the same number of set bits as num2, and the value 3 XOR 1 = 2 is minimal.
      Constraints:
    1 <= num1, num2 <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int num1 = 3;
        int num2 = 5;
        int expected = 3;
        var result = solution.minimizeXor(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int num1 = 1;
        int num2 = 12;
        int expected = 3;
        var result = solution.minimizeXor(num1, num2);
        assertThat(result).isEqualTo(expected);
    }

}
