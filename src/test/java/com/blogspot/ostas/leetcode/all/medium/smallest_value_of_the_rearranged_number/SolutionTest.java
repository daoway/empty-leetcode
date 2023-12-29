package com.blogspot.ostas.leetcode.all.medium.smallest_value_of_the_rearranged_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = 310
    Output: 103
    Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 310.
    The arrangement with the smallest value that does not contain any leading zeros is 103.
    Example 2:
    Input: num = -7605
    Output: -7650
    Explanation: Some possible arrangements for the digits of -7605 are -7650, -6705, -5076, -0567.
    The arrangement with the smallest value that does not contain any leading zeros is -7650.
      Constraints:
    -1015 <= num <= 1015
    */
    @Test
    void example_0() {
        var solution = new Solution();
        long num = 310;
        long expected = 103;
        var result = solution.smallestNumber(num);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        long num = -7605;
        long expected = -7650;
        var result = solution.smallestNumber(num);
        assertThat(result).isEqualTo(expected);
    }

}
