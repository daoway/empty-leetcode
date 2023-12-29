package com.blogspot.ostas.leetcode.all.medium.minimum_number_of_flips_to_make_the_binary_string_alternating;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "111000"
    Output: 2
    Explanation: Use the first operation two times to make s = "100011".
    Then, use the second operation on the third and sixth elements to make s = "101010".
    Example 2:
    Input: s = "010"
    Output: 0
    Explanation: The string is already alternating.
    Example 3:
    Input: s = "1110"
    Output: 1
    Explanation: Use the second operation on the second element to make s = "1010".
      Constraints:
    1 <= s.length <= 105
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "111000";
        int expected = 2;
        var result = solution.minFlips(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "010";
        int expected = 0;
        var result = solution.minFlips(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1110";
        int expected = 1;
        var result = solution.minFlips(s);
        assertThat(result).isEqualTo(expected);
    }

}
