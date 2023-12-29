package com.blogspot.ostas.leetcode.all.easy.count_the_number_of_consistent_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
    Output: 2
    Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
    Example 2:
    Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
    Output: 7
    Explanation: All strings are consistent.
    Example 3:
    Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
    Output: 4
    Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
      Constraints:
    1 <= words.length <= 104
    1 <= allowed.length <= 26
    1 <= words[i].length <= 10
    The characters in allowed are distinct.
    words[i] and allowed contain only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String allowed = "ab";
        String[] words = new String[]{"ad", "bd", "aaab", "baa", "badab"};
        int expected = 2;
        var result = solution.countConsistentStrings(allowed, words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String allowed = "abc";
        String[] words = new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"};
        int expected = 7;
        var result = solution.countConsistentStrings(allowed, words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String allowed = "cad";
        String[] words = new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        int expected = 4;
        var result = solution.countConsistentStrings(allowed, words);
        assertThat(result).isEqualTo(expected);
    }

}
