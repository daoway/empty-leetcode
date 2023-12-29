package com.blogspot.ostas.leetcode.all.hard.special_binary_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "11011000"
    Output: "11100100"
    Explanation: The strings "10" [occuring at s[1]] and "1100" [at s[3]] are swapped.
    This is the lexicographically largest string possible after some number of swaps.
    Example 2:
    Input: s = "10"
    Output: "10"
      Constraints:
    1 <= s.length <= 50
    s[i] is either '0' or '1'.
    s is a special binary string.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "11011000";
        String expected = "11100100";
        var result = solution.makeLargestSpecial(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "10";
        String expected = "10";
        var result = solution.makeLargestSpecial(s);
        assertThat(result).isEqualTo(expected);
    }

}
