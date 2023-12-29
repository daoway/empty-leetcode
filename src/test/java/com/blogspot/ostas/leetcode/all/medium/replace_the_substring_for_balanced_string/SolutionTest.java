package com.blogspot.ostas.leetcode.all.medium.replace_the_substring_for_balanced_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "QWER"
    Output: 0
    Explanation: s is already balanced.
    Example 2:
    Input: s = "QQWE"
    Output: 1
    Explanation: We need to replace a 'Q' to 'R', so that "RQWE" (or "QRWE") is balanced.
    Example 3:
    Input: s = "QQQW"
    Output: 2
    Explanation: We can replace the first "QQ" to "ER".
      Constraints:
    n == s.length
    4 <= n <= 105
    n is a multiple of 4.
    s contains only 'Q', 'W', 'E', and 'R'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "QWER";
        int expected = 0;
        var result = solution.balancedString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "QQWE";
        int expected = 1;
        var result = solution.balancedString(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "QQQW";
        int expected = 2;
        var result = solution.balancedString(s);
        assertThat(result).isEqualTo(expected);
    }

}
