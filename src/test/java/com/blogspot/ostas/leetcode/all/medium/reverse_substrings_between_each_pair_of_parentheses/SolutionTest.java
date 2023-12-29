package com.blogspot.ostas.leetcode.all.medium.reverse_substrings_between_each_pair_of_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "(abcd)"
    Output: "dcba"
    Example 2:
    Input: s = "(u(love)i)"
    Output: "iloveu"
    Explanation: The substring "love" is reversed first, then the whole string is reversed.
    Example 3:
    Input: s = "(ed(et(oc))el)"
    Output: "leetcode"
    Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.
      Constraints:
    1 <= s.length <= 2000
    s only contains lower case English characters and parentheses.
    It is guaranteed that all parentheses are balanced.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "(abcd)";
        String expected = "dcba";
        var result = solution.reverseParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(u(love)i)";
        String expected = "iloveu";
        var result = solution.reverseParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "(ed(et(oc))el)";
        String expected = "leetcode";
        var result = solution.reverseParentheses(s);
        assertThat(result).isEqualTo(expected);
    }

}
