package com.blogspot.ostas.leetcode.all.medium.minimum_deletions_to_make_string_balanced;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aababbab"
    Output: 2
    Explanation: You can either:
    Delete the characters at 0-indexed positions 2 and 6 ("aababbab" -> "aaabbb"), or
    Delete the characters at 0-indexed positions 3 and 6 ("aababbab" -> "aabbbb").
    Example 2:
    Input: s = "bbaaaaabb"
    Output: 2
    Explanation: The only solution is to delete the first two characters.
      Constraints:
    1 <= s.length <= 105
    s[i] is 'a' or 'b'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aababbab";
        int expected = 2;
        var result = solution.minimumDeletions(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "bbaaaaabb";
        int expected = 2;
        var result = solution.minimumDeletions(s);
        assertThat(result).isEqualTo(expected);
    }

}
