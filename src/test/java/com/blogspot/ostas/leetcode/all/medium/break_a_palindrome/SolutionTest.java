package com.blogspot.ostas.leetcode.all.medium.break_a_palindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: palindrome = "abccba"
    Output: "aaccba"
    Explanation: There are many ways to make "abccba" not a palindrome, such as "zbccba", "aaccba", and "abacba".
    Of all the ways, "aaccba" is the lexicographically smallest.
    Example 2:
    Input: palindrome = "a"
    Output: ""
    Explanation: There is no way to replace a single character to make "a" not a palindrome, so return an empty string.
      Constraints:
    1 <= palindrome.length <= 1000
    palindrome consists of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String palindrome = "abccba";
        String expected = "aaccba";
        var result = solution.breakPalindrome(palindrome);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String palindrome = "a";
        String expected = "";
        var result = solution.breakPalindrome(palindrome);
        assertThat(result).isEqualTo(expected);
    }

}
