package com.blogspot.ostas.leetcode.all.easy.delete_characters_to_make_fancy_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leeetcode"
    Output: "leetcode"
    Explanation:
    Remove an 'e' from the first group of 'e's to create "leetcode".
    No three consecutive characters are equal, so return "leetcode".
    Example 2:
    Input: s = "aaabaaaa"
    Output: "aabaa"
    Explanation:
    Remove an 'a' from the first group of 'a's to create "aabaaaa".
    Remove two 'a's from the second group of 'a's to create "aabaa".
    No three consecutive characters are equal, so return "aabaa".
    Example 3:
    Input: s = "aab"
    Output: "aab"
    Explanation: No three consecutive characters are equal, so return "aab".
      Constraints:
    1 <= s.length <= 105
    s consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leeetcode";
        String expected = "leetcode";
        var result = solution.makeFancyString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aaabaaaa";
        String expected = "aabaa";
        var result = solution.makeFancyString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aab";
        String expected = "aab";
        var result = solution.makeFancyString(s);
        assertThat(result).isEqualTo(expected);
    }

}
