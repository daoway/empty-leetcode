package com.blogspot.ostas.leetcode.all.medium.longest_repeating_character_replacement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ABAB", k = 2
    Output: 4
    Explanation: Replace the two 'A's with two 'B's or vice versa.
    Example 2:
    Input: s = "AABABBA", k = 1
    Output: 4
    Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
    The substring "BBBB" has the longest repeating letters, which is 4.
    There may exists other ways to achieve this answer too.
      Constraints:
    1 <= s.length <= 105
    s consists of only uppercase English letters.
    0 <= k <= s.length
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ABAB";
        int k = 2;
        int expected = 4;
        var result = solution.characterReplacement(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "AABABBA";
        int k = 1;
        int expected = 4;
        var result = solution.characterReplacement(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
