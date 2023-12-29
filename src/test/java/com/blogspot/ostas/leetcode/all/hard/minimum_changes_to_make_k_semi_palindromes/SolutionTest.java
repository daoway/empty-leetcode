package com.blogspot.ostas.leetcode.all.hard.minimum_changes_to_make_k_semi_palindromes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcac", k = 2
    Output: 1
    Explanation: We can divide s into substrings "ab" and "cac". The string "cac" is already a semi-palindrome. If we change "ab" to "aa", it becomes a semi-palindrome with d = 1.
    It can be shown that there is no way to divide the string "abcac" into two semi-palindrome substrings. Therefore, the answer would be at least 1.
    Example 2:
    Input: s = "abcdef", k = 2
    Output: 2
    Explanation: We can divide it into substrings "abc" and "def". Each of the substrings "abc" and "def" requires one change to become a semi-palindrome, so we need 2 changes in total to make all substrings semi-palindrome.
    It can be shown that we cannot divide the given string into two substrings in a way that it would require less than 2 changes.
    Example 3:
    Input: s = "aabbaa", k = 3
    Output: 0
    Explanation: We can divide it into substrings "aa", "bb" and "aa".
    The strings "aa" and "bb" are already semi-palindromes. Thus, the answer is zero.
      Constraints:
    2 <= s.length <= 200
    1 <= k <= s.length / 2
    s consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcac";
        int k = 2;
        int expected = 1;
        var result = solution.minimumChanges(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcdef";
        int k = 2;
        int expected = 2;
        var result = solution.minimumChanges(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aabbaa";
        int k = 3;
        int expected = 0;
        var result = solution.minimumChanges(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
