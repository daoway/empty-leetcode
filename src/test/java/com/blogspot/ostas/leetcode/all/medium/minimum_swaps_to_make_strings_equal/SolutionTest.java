package com.blogspot.ostas.leetcode.all.medium.minimum_swaps_to_make_strings_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s1 = "xx", s2 = "yy"
    Output: 1
    Explanation: Swap s1[0] and s2[1], s1 = "yx", s2 = "yx".
    Example 2:
    Input: s1 = "xy", s2 = "yx"
    Output: 2
    Explanation: Swap s1[0] and s2[0], s1 = "yy", s2 = "xx".
    Swap s1[0] and s2[1], s1 = "xy", s2 = "xy".
    Note that you cannot swap s1[0] and s1[1] to make s1 equal to "yx", cause we can only swap chars in different strings.
    Example 3:
    Input: s1 = "xx", s2 = "xy"
    Output: -1
      Constraints:
    1 <= s1.length, s2.length <= 1000
    s1.length == s2.length
    s1, s2 only contain 'x' or 'y'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s1 = "xx";
        String s2 = "yy";
        int expected = 1;
        var result = solution.minimumSwap(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s1 = "xy";
        String s2 = "yx";
        int expected = 2;
        var result = solution.minimumSwap(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s1 = "xx";
        String s2 = "xy";
        int expected = -1;
        var result = solution.minimumSwap(s1, s2);
        assertThat(result).isEqualTo(expected);
    }

}
