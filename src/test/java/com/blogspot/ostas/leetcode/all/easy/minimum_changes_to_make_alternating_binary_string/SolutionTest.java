package com.blogspot.ostas.leetcode.all.easy.minimum_changes_to_make_alternating_binary_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "0100"
    Output: 1
    Explanation: If you change the last character to '1', s will be "0101", which is alternating.
    Example 2:
    Input: s = "10"
    Output: 0
    Explanation: s is already alternating.
    Example 3:
    Input: s = "1111"
    Output: 2
    Explanation: You need two operations to reach "0101" or "1010".
      Constraints:
    1 <= s.length <= 104
    s[i] is either '0' or '1'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "0100";
        int expected = 1;
        var result = solution.minOperations(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "10";
        int expected = 0;
        var result = solution.minOperations(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "1111";
        int expected = 2;
        var result = solution.minOperations(s);
        assertThat(result).isEqualTo(expected);
    }

}
