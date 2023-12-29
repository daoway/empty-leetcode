package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_swaps_to_make_the_binary_string_alternating;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "111000"
    Output: 1
    Explanation: Swap positions 1 and 4: "111000" -> "101010"
    The string is now alternating.
    Example 2:
    Input: s = "010"
    Output: 0
    Explanation: The string is already alternating, no swaps are needed.
    Example 3:
    Input: s = "1110"
    Output: -1
      Constraints:
    1 <= s.length <= 1000
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "111000";
        int expected = 1;
        var result = solution.minSwaps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "010";
        int expected = 0;
        var result = solution.minSwaps(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1110";
        int expected = -1;
        var result = solution.minSwaps(s);
        assertThat(result).isEqualTo(expected);
    }

}
