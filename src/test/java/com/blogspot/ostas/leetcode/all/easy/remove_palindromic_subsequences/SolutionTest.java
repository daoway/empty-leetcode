package com.blogspot.ostas.leetcode.all.easy.remove_palindromic_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ababa"
    Output: 1
    Explanation: s is already a palindrome, so its entirety can be removed in a single step.
    Example 2:
    Input: s = "abb"
    Output: 2
    Explanation: "abb" -> "bb" -> "".
    Remove palindromic subsequence "a" then "bb".
    Example 3:
    Input: s = "baabb"
    Output: 2
    Explanation: "baabb" -> "b" -> "".
    Remove palindromic subsequence "baab" then "b".
      Constraints:
    1 <= s.length <= 1000
    s[i] is either 'a' or 'b'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ababa";
        int expected = 1;
        var result = solution.removePalindromeSub(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abb";
        int expected = 2;
        var result = solution.removePalindromeSub(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "baabb";
        int expected = 2;
        var result = solution.removePalindromeSub(s);
        assertThat(result).isEqualTo(expected);
    }

}
