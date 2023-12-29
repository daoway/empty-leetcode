package com.blogspot.ostas.leetcode.all.hard.minimum_possible_integer_after_at_most_k_adjacent_swaps_on_digits;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: num = "4321", k = 4
    Output: "1342"
    Explanation: The steps to obtain the minimum integer from 4321 with 4 adjacent swaps are shown.
    Example 2:
    Input: num = "100", k = 1
    Output: "010"
    Explanation: It's ok for the output to have leading zeros, but the input is guaranteed not to have any leading zeros.
    Example 3:
    Input: num = "36789", k = 1000
    Output: "36789"
    Explanation: We can keep the number without any swaps.
      Constraints:
    1 <= num.length <= 3 * 104
    num consists of only digits and does not contain leading zeros.
    1 <= k <= 109
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String num = "4321";
        int k = 4;
        String expected = "1342";
        var result = solution.minInteger(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String num = "100";
        int k = 1;
        String expected = "010";
        var result = solution.minInteger(num, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String num = "36789";
        int k = 1000;
        String expected = "36789";
        var result = solution.minInteger(num, k);
        assertThat(result).isEqualTo(expected);
    }

}
