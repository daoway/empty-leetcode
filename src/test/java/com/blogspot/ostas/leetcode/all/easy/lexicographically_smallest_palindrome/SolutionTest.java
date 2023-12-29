package com.blogspot.ostas.leetcode.all.easy.lexicographically_smallest_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "egcfe"
    Output: "efcfe"
    Explanation: The minimum number of operations to make "egcfe" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "efcfe", by changing 'g'.
    Example 2:
    Input: s = "abcd"
    Output: "abba"
    Explanation: The minimum number of operations to make "abcd" a palindrome is 2, and the lexicographically smallest palindrome string we can get by modifying two characters is "abba".
    Example 3:
    Input: s = "seven"
    Output: "neven"
    Explanation: The minimum number of operations to make "seven" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "neven".
      Constraints:
    1 <= s.length <= 1000
    s consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "egcfe";
        String expected = "efcfe";
        var result = solution.makeSmallestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abcd";
        String expected = "abba";
        var result = solution.makeSmallestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "seven";
        String expected = "neven";
        var result = solution.makeSmallestPalindrome(s);
        assertThat(result).isEqualTo(expected);
    }

}
