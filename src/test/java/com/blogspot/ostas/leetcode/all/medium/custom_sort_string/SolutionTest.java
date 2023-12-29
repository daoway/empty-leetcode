package com.blogspot.ostas.leetcode.all.medium.custom_sort_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: order = "cba", s = "abcd"
    Output: "cbad"
    Explanation:
    "a", "b", "c" appear in order, so the order of "a", "b", "c" should be "c", "b", and "a".
    Since "d" does not appear in order, it can be at any position in the returned string. "dcba", "cdba", "cbda" are also valid outputs.
    Example 2:
    Input: order = "cbafg", s = "abcd"
    Output: "cbad"
      Constraints:
    1 <= order.length <= 26
    1 <= s.length <= 200
    order and s consist of lowercase English letters.
    All the characters of order are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String order = "cba";
        String s = "abcd";
        String expected = "cbad";
        var result = solution.customSortString(order, s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String order = "cbafg";
        String s = "abcd";
        String expected = "cbad";
        var result = solution.customSortString(order, s);
        assertThat(result).isEqualTo(expected);
    }

}
