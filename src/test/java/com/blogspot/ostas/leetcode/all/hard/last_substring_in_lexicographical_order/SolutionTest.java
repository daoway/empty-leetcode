package com.blogspot.ostas.leetcode.all.hard.last_substring_in_lexicographical_order;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abab"
    Output: "bab"
    Explanation: The substrings are ["a", "ab", "aba", "abab", "b", "ba", "bab"]. The lexicographically maximum substring is "bab".
    Example 2:
    Input: s = "leetcode"
    Output: "tcode"
      Constraints:
    1 <= s.length <= 4 * 105
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abab";
        String expected = "bab";
        var result = solution.lastSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcode";
        String expected = "tcode";
        var result = solution.lastSubstring(s);
        assertThat(result).isEqualTo(expected);
    }

}
