package com.blogspot.ostas.leetcode.all.easy.to_lower_case;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "Hello"
    Output: "hello"
    Example 2:
    Input: s = "here"
    Output: "here"
    Example 3:
    Input: s = "LOVELY"
    Output: "lovely"
      Constraints:
    1 <= s.length <= 100
    s consists of printable ASCII characters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "Hello";
        String expected = "hello";
        var result = solution.toLowerCase(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "here";
        String expected = "here";
        var result = solution.toLowerCase(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "LOVELY";
        String expected = "lovely";
        var result = solution.toLowerCase(s);
        assertThat(result).isEqualTo(expected);
    }

}
