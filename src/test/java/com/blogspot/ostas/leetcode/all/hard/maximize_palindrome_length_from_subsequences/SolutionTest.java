package com.blogspot.ostas.leetcode.all.hard.maximize_palindrome_length_from_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word1 = "cacb", word2 = "cbba"
    Output: 5
    Explanation: Choose "ab" from word1 and "cba" from word2 to make "abcba", which is a palindrome.
    Example 2:
    Input: word1 = "ab", word2 = "ab"
    Output: 3
    Explanation: Choose "ab" from word1 and "a" from word2 to make "aba", which is a palindrome.
    Example 3:
    Input: word1 = "aa", word2 = "bb"
    Output: 0
    Explanation: You cannot construct a palindrome from the described method, so return 0.
      Constraints:
    1 <= word1.length, word2.length <= 1000
    word1 and word2 consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word1 = "cacb";
        String word2 = "cbba";
        int expected = 5;
        var result = solution.longestPalindrome(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word1 = "ab";
        String word2 = "ab";
        int expected = 3;
        var result = solution.longestPalindrome(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word1 = "aa";
        String word2 = "bb";
        int expected = 0;
        var result = solution.longestPalindrome(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

}
