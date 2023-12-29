package com.blogspot.ostas.leetcode.all.hard.check_if_an_original_string_exists_given_two_encoded_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "internationalization", s2 = "i18n"
    Output: true
    Explanation: It is possible that "internationalization" was the original string.
    - "internationalization"
      -> Split:       ["internationalization"]
      -> Do not replace any element
      -> Concatenate:  "internationalization", which is s1.
    - "internationalization"
      -> Split:       ["i", "nternationalizatio", "n"]
      -> Replace:     ["i", "18",                 "n"]
      -> Concatenate:  "i18n", which is s2
    Example 2:
    Input: s1 = "l123e", s2 = "44"
    Output: true
    Explanation: It is possible that "leetcode" was the original string.
    - "leetcode"
      -> Split:      ["l", "e", "et", "cod", "e"]
      -> Replace:    ["l", "1", "2",  "3",   "e"]
      -> Concatenate: "l123e", which is s1.
    - "leetcode"
      -> Split:      ["leet", "code"]
      -> Replace:    ["4",    "4"]
      -> Concatenate: "44", which is s2.
    Example 3:
    Input: s1 = "a5b", s2 = "c5b"
    Output: false
    Explanation: It is impossible.
    - The original string encoded as s1 must start with the letter 'a'.
    - The original string encoded as s2 must start with the letter 'c'.
      Constraints:
    1 <= s1.length, s2.length <= 40
    s1 and s2 consist of digits 1-9 (inclusive), and lowercase English letters only.
    The number of consecutive digits in s1 and s2 does not exceed 3.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "internationalization";
        String s2 = "i18n";
        boolean expected = true;
        var result = solution.possiblyEquals(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "l123e";
        String s2 = "44";
        boolean expected = true;
        var result = solution.possiblyEquals(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s1 = "a5b";
        String s2 = "c5b";
        boolean expected = false;
        var result = solution.possiblyEquals(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
