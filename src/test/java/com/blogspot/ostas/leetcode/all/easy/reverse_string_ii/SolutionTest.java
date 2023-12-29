package com.blogspot.ostas.leetcode.all.easy.reverse_string_ii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcdefg", k = 2
    Output: "bacdfeg"
    Example 2:
    Input: s = "abcd", k = 2
    Output: "bacd"
      Constraints:
    1 <= s.length <= 104
    s consists of only lowercase English letters.
    1 <= k <= 104
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcdefg";
        int k = 2;
        String expected = "bacdfeg";
        var result = solution.reverseStr(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        int k = 2;
        String expected = "bacd";
        var result = solution.reverseStr(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
