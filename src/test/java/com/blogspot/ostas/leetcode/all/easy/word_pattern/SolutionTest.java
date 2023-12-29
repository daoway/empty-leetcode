package com.blogspot.ostas.leetcode.all.easy.word_pattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: pattern = "abba", s = "dog cat cat dog"
    Output: true
    Example 2:
    Input: pattern = "abba", s = "dog cat cat fish"
    Output: false
    Example 3:
    Input: pattern = "aaaa", s = "dog cat cat dog"
    Output: false
      Constraints:
    1 <= pattern.length <= 300
    pattern contains only lower-case English letters.
    1 <= s.length <= 3000
    s contains only lowercase English letters and spaces ' '.
    s does not contain any leading or trailing spaces.
    All the words in s are separated by a single space.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean expected = true;
        var result = solution.wordPattern(pattern, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean expected = false;
        var result = solution.wordPattern(pattern, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        boolean expected = false;
        var result = solution.wordPattern(pattern, s);
        assertThat(result).isEqualTo(expected);
    }

}
