package com.blogspot.ostas.leetcode.all.easy.number_of_strings_that_appear_as_substrings_in_word;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: patterns = ["a","abc","bc","d"], word = "abc"
    Output: 3
    Explanation:
    - "a" appears as a substring in "abc".
    - "abc" appears as a substring in "abc".
    - "bc" appears as a substring in "abc".
    - "d" does not appear as a substring in "abc".
    3 of the strings in patterns appear as a substring in word.
    Example 2:
    Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
    Output: 2
    Explanation:
    - "a" appears as a substring in "aaaaabbbbb".
    - "b" appears as a substring in "aaaaabbbbb".
    - "c" does not appear as a substring in "aaaaabbbbb".
    2 of the strings in patterns appear as a substring in word.
    Example 3:
    Input: patterns = ["a","a","a"], word = "ab"
    Output: 3
    Explanation: Each of the patterns appears as a substring in word "ab".
      Constraints:
    1 <= patterns.length <= 100
    1 <= patterns[i].length <= 100
    1 <= word.length <= 100
    patterns[i] and word consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] patterns = new String[]{"a", "abc", "bc", "d"};
        String word = "abc";
        int expected = 3;
        var result = solution.numOfStrings(patterns, word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] patterns = new String[]{"a", "b", "c"};
        String word = "aaaaabbbbb";
        int expected = 2;
        var result = solution.numOfStrings(patterns, word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] patterns = new String[]{"a", "a", "a"};
        String word = "ab";
        int expected = 3;
        var result = solution.numOfStrings(patterns, word);
        assertThat(result).isEqualTo(expected);
    }

}
