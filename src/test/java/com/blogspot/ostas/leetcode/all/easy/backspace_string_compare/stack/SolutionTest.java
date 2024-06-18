package com.blogspot.ostas.leetcode.all.easy.backspace_string_compare.stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ab#c", t = "ad#c"
    Output: true
    Explanation: Both s and t become "ac".
    Example 2:
    Input: s = "ab##", t = "c#d#"
    Output: true
    Explanation: Both s and t become "".
    Example 3:
    Input: s = "a#c", t = "b"
    Output: false
    Explanation: s becomes "c" while t becomes "b".
      Constraints:
    1 <= s.length, t.length <= 200
    s and t only contain lowercase letters and '#' characters.
      Follow up: Can you solve it in O(n) time and O(1) space?
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ab#c";
        String t = "ad#c";
        boolean expected = true;
        var result = solution.backspaceCompare(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ab##";
        String t = "c#d#";
        boolean expected = true;
        var result = solution.backspaceCompare(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "a#c";
        String t = "b";
        boolean expected = false;
        var result = solution.backspaceCompare(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
