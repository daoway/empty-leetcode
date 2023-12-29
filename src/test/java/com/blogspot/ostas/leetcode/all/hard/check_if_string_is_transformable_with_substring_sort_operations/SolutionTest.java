package com.blogspot.ostas.leetcode.all.hard.check_if_string_is_transformable_with_substring_sort_operations;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "84532", t = "34852"
    Output: true
    Explanation: You can transform s into t using the following sort operations:
    "84532" (from index 2 to 3) -> "84352"
    "84352" (from index 0 to 2) -> "34852"
    Example 2:
    Input: s = "34521", t = "23415"
    Output: true
    Explanation: You can transform s into t using the following sort operations:
    "34521" -> "23451"
    "23451" -> "23415"
    Example 3:
    Input: s = "12345", t = "12435"
    Output: false
      Constraints:
    s.length == t.length
    1 <= s.length <= 105
    s and t consist of only digits.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "84532";
        String t = "34852";
        boolean expected = true;
        var result = solution.isTransformable(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "34521";
        String t = "23415";
        boolean expected = true;
        var result = solution.isTransformable(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "12345";
        String t = "12435";
        boolean expected = false;
        var result = solution.isTransformable(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
