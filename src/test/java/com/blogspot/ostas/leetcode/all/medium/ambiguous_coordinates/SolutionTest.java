package com.blogspot.ostas.leetcode.all.medium.ambiguous_coordinates;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "(123)"
    Output: ["(1, 2.3)","(1, 23)","(1.2, 3)","(12, 3)"]
    Example 2:
    Input: s = "(0123)"
    Output: ["(0, 1.23)","(0, 12.3)","(0, 123)","(0.1, 2.3)","(0.1, 23)","(0.12, 3)"]
    Explanation: 0.0, 00, 0001 or 00.01 are not allowed.
    Example 3:
    Input: s = "(00011)"
    Output: ["(0, 0.011)","(0.001, 1)"]
      Constraints:
    4 <= s.length <= 12
    s[0] == '(' and s[s.length - 1] == ')'.
    The rest of s are digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "(123)";
        List<String> expected = List.of("(1, 2.3)", "(1, 23)", "(1.2, 3)", "(12, 3)");
        var result = solution.ambiguousCoordinates(s);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(0123)";
        List<String> expected =
                List.of("(0, 1.23)", "(0, 12.3)", "(0, 123)", "(0.1, 2.3)", "(0.1, 23)", "(0.12, 3)");
        var result = solution.ambiguousCoordinates(s);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "(00011)";
        List<String> expected = List.of("(0, 0.011)", "(0.001, 1)");
        var result = solution.ambiguousCoordinates(s);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

}
