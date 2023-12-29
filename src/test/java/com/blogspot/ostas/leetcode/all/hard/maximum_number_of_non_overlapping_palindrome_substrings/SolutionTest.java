package com.blogspot.ostas.leetcode.all.hard.maximum_number_of_non_overlapping_palindrome_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abaccdbbd", k = 3
    Output: 2
    Explanation: We can select the substrings underlined in s = "abaccdbbd". Both "aba" and "dbbd" are palindromes and have a length of at least k = 3.
    It can be shown that we cannot find a selection with more than two valid substrings.
    Example 2:
    Input: s = "adbcda", k = 2
    Output: 0
    Explanation: There is no palindrome substring of length at least 2 in the string.
      Constraints:
    1 <= k <= s.length <= 2000
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abaccdbbd";
        int k = 3;
        int expected = 2;
        var result = solution.maxPalindromes(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "adbcda";
        int k = 2;
        int expected = 0;
        var result = solution.maxPalindromes(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
