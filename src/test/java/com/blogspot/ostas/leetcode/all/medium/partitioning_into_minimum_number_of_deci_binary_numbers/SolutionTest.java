package com.blogspot.ostas.leetcode.all.medium.partitioning_into_minimum_number_of_deci_binary_numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = "32"
    Output: 3
    Explanation: 10 + 11 + 11 = 32
    Example 2:
    Input: n = "82734"
    Output: 8
    Example 3:
    Input: n = "27346209830709182346"
    Output: 9
      Constraints:
    1 <= n.length <= 105
    n consists of only digits.
    n does not contain any leading zeros and represents a positive integer.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String n = "32";
        int expected = 3;
        var result = solution.minPartitions(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String n = "82734";
        int expected = 8;
        var result = solution.minPartitions(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String n = "27346209830709182346";
        int expected = 9;
        var result = solution.minPartitions(n);
        assertThat(result).isEqualTo(expected);
    }

}
