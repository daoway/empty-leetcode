package com.blogspot.ostas.leetcode.all.medium.construct_k_palindrome_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "annabelle", k = 2
    Output: true
    Explanation: You can construct two palindromes using all characters in s.
    Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"
    Example 2:
    Input: s = "leetcode", k = 3
    Output: false
    Explanation: It is impossible to construct 3 palindromes using all the characters of s.
    Example 3:
    Input: s = "true", k = 4
    Output: true
    Explanation: The only possible solution is to put each character in a separate string.
      Constraints:
    1 <= s.length <= 105
    s consists of lowercase English letters.
    1 <= k <= 105
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "annabelle";
        int k = 2;
        boolean expected = true;
        var result = solution.canConstruct(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcode";
        int k = 3;
        boolean expected = false;
        var result = solution.canConstruct(s, k);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "true";
        int k = 4;
        boolean expected = true;
        var result = solution.canConstruct(s, k);
        assertThat(result).isEqualTo(expected);
    }

}
