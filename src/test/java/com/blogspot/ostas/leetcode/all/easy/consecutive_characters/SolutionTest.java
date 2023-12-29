package com.blogspot.ostas.leetcode.all.easy.consecutive_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leetcode"
    Output: 2
    Explanation: The substring "ee" is of length 2 with the character 'e' only.
    Example 2:
    Input: s = "abbcccddddeeeeedcba"
    Output: 5
    Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
      Constraints:
    1 <= s.length <= 500
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leetcode";
        int expected = 2;
        var result = solution.maxPower(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abbcccddddeeeeedcba";
        int expected = 5;
        var result = solution.maxPower(s);
        assertThat(result).isEqualTo(expected);
    }

}
