package com.blogspot.ostas.leetcode.all.hard.maximum_product_of_the_length_of_two_palindromic_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ababbb"
    Output: 9
    Explanation: Substrings "aba" and "bbb" are palindromes with odd length. product = 3 * 3 = 9.
    Example 2:
    Input: s = "zaaaxbbby"
    Output: 9
    Explanation: Substrings "aaa" and "bbb" are palindromes with odd length. product = 3 * 3 = 9.
      Constraints:
    2 <= s.length <= 105
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ababbb";
        long expected = 9;
        var result = solution.maxProduct(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "zaaaxbbby";
        long expected = 9;
        var result = solution.maxProduct(s);
        assertThat(result).isEqualTo(expected);
    }

}
