package com.blogspot.ostas.leetcode.all.easy.isomorphic_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "egg", t = "add"
    Output: true
    Example 2:
    Input: s = "foo", t = "bar"
    Output: false
    Example 3:
    Input: s = "paper", t = "title"
    Output: true
      Constraints:
    1 <= s.length <= 5 * 104
    t.length == s.length
    s and t consist of any valid ascii character.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "egg";
        String t = "add";
        boolean expected = true;
        var result = solution.isIsomorphic(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "foo";
        String t = "bar";
        boolean expected = false;
        var result = solution.isIsomorphic(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "paper";
        String t = "title";
        boolean expected = true;
        var result = solution.isIsomorphic(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
