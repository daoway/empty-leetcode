package com.blogspot.ostas.leetcode.all.easy.check_if_one_string_swap_can_make_strings_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "bank", s2 = "kanb"
    Output: true
    Explanation: For example, swap the first character with the last character of s2 to make "bank".
    Example 2:
    Input: s1 = "attack", s2 = "defend"
    Output: false
    Explanation: It is impossible to make them equal with one string swap.
    Example 3:
    Input: s1 = "kelb", s2 = "kelb"
    Output: true
    Explanation: The two strings are already equal, so no string swap operation is required.
      Constraints:
    1 <= s1.length, s2.length <= 100
    s1.length == s2.length
    s1 and s2 consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "bank";
        String s2 = "kanb";
        boolean expected = true;
        var result = solution.areAlmostEqual(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "attack";
        String s2 = "defend";
        boolean expected = false;
        var result = solution.areAlmostEqual(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s1 = "kelb";
        String s2 = "kelb";
        boolean expected = true;
        var result = solution.areAlmostEqual(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
