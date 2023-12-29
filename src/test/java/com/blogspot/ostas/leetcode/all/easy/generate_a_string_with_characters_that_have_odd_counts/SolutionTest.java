package com.blogspot.ostas.leetcode.all.easy.generate_a_string_with_characters_that_have_odd_counts;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: n = 4
    Output: "pppz"
    Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
    Example 2:
    Input: n = 2
    Output: "xy"
    Explanation: "xy" is a valid string since the characters 'x' and 'y' occur once. Note that there are many other valid strings such as "ag" and "ur".
    Example 3:
    Input: n = 7
    Output: "holasss"
      Constraints:
    1 <= n <= 500
    */
    @Test
    void example_0() {
        var solution = new Solution();
        int n = 4;
        String[] expected = {"pppz", "ohhh", "love", "aaab"};
        var result = solution.generateTheString(n);
        assertThat(result).isIn(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        int n = 2;
        String[] expected = {"xy", "ab"};
        var result = solution.generateTheString(n);
        assertThat(result).isIn(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        int n = 7;
        String[] expected = {"holasss", "aaaaaaa"};
        var result = solution.generateTheString(n);
        assertThat(result).isIn(expected);
    }

}
