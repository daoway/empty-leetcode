package com.blogspot.ostas.leetcode.all.hard.strange_printer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aaabbb"
    Output: 2
    Explanation: Print "aaa" first and then print "bbb".
    Example 2:
    Input: s = "aba"
    Output: 2
    Explanation: Print "aaa" first and then print "b" from the second place of the string, which will cover the existing character 'a'.
      Constraints:
    1 <= s.length <= 100
    s consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aaabbb";
        int expected = 2;
        var result = solution.strangePrinter(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "aba";
        int expected = 2;
        var result = solution.strangePrinter(s);
        assertThat(result).isEqualTo(expected);
    }

}
