package com.blogspot.ostas.leetcode.all.easy.count_prefixes_of_a_given_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
    Output: 3
    Explanation:
    The strings in words which are a prefix of s = "abc" are:
    "a", "ab", and "abc".
    Thus the number of strings in words which are a prefix of s is 3.
    Example 2:
    Input: words = ["a","a"], s = "aa"
    Output: 2
    Explanation:
    Both of the strings are a prefix of s.
    Note that the same string can occur multiple times in words, and it should be counted each time.
      Constraints:
    1 <= words.length <= 1000
    1 <= words[i].length, s.length <= 10
    words[i] and s consist of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
        int expected = 3;
        var result = solution.countPrefixes(words, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"a", "a"};
        String s = "aa";
        int expected = 2;
        var result = solution.countPrefixes(words, s);
        assertThat(result).isEqualTo(expected);
    }

}
