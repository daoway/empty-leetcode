package com.blogspot.ostas.leetcode.all.medium.maximum_xor_product;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: a = 12, b = 5, n = 4
    Output: 98
    Explanation: For x = 2, (a XOR x) = 14 and (b XOR x) = 7. Hence, (a XOR x) * (b XOR x) = 98.
    It can be shown that 98 is the maximum value of (a XOR x) * (b XOR x) for all 0 <= x < 2n.
    Example 2:
    Input: a = 6, b = 7 , n = 5
    Output: 930
    Explanation: For x = 25, (a XOR x) = 31 and (b XOR x) = 30. Hence, (a XOR x) * (b XOR x) = 930.
    It can be shown that 930 is the maximum value of (a XOR x) * (b XOR x) for all 0 <= x < 2n.
    Example 3:
    Input: a = 1, b = 6, n = 3
    Output: 12
    Explanation: For x = 5, (a XOR x) = 4 and (b XOR x) = 3. Hence, (a XOR x) * (b XOR x) = 12.
    It can be shown that 12 is the maximum value of (a XOR x) * (b XOR x) for all 0 <= x < 2n.
      Constraints:
    0 <= a, b < 250
    0 <= n <= 50
    */
    @Test
    void example_0() {
        var solution = new Solution();
        long a = 12;
        long b = 5;
        int n = 4;
        int expected = 98;
        var result = solution.maximumXorProduct(a, b, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        long a = 6;
        long b = 7;
        int n = 5;
        int expected = 930;
        var result = solution.maximumXorProduct(a, b, n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        long a = 1;
        long b = 6;
        int n = 3;
        int expected = 12;
        var result = solution.maximumXorProduct(a, b, n);
        assertThat(result).isEqualTo(expected);
    }

}
