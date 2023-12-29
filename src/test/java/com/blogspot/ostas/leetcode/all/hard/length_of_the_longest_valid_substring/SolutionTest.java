package com.blogspot.ostas.leetcode.all.hard.length_of_the_longest_valid_substring;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "cbaaaabc", forbidden = ["aaa","cb"]
    Output: 4
    Explanation: There are 11 valid substrings in word: "c", "b", "a", "ba", "aa", "bc", "baa", "aab", "ab", "abc" and "aabc". The length of the longest valid substring is 4.
    It can be shown that all other substrings contain either "aaa" or "cb" as a substring.
    Example 2:
    Input: word = "leetcode", forbidden = ["de","le","e"]
    Output: 4
    Explanation: There are 11 valid substrings in word: "l", "t", "c", "o", "d", "tc", "co", "od", "tco", "cod", and "tcod". The length of the longest valid substring is 4.
    It can be shown that all other substrings contain either "de", "le", or "e" as a substring.
      Constraints:
    1 <= word.length <= 105
    word consists only of lowercase English letters.
    1 <= forbidden.length <= 105
    1 <= forbidden[i].length <= 10
    forbidden[i] consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "cbaaaabc";
        List<String> forbidden = List.of("aaa", "cb");
        int expected = 4;
        var result = solution.longestValidSubstring(word, forbidden);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "leetcode";
        List<String> forbidden = List.of("de", "le", "e");
        int expected = 4;
        var result = solution.longestValidSubstring(word, forbidden);
        assertThat(result).isEqualTo(expected);
    }

}
