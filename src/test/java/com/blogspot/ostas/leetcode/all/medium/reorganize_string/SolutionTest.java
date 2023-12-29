package com.blogspot.ostas.leetcode.all.medium.reorganize_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aab"
    Output: "aba"
    Example 2:
    Input: s = "aaab"
    Output: ""
      Constraints:
    1 <= s.length <= 500
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aab";
        String expected = "aba";
        var result = solution.reorganizeString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaab";
        String expected = "";
        var result = solution.reorganizeString(s);
        assertThat(result).isEqualTo(expected);
    }

}
