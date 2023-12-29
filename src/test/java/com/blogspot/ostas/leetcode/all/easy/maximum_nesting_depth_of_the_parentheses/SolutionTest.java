package com.blogspot.ostas.leetcode.all.easy.maximum_nesting_depth_of_the_parentheses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "(1+(2*3)+((8)/4))+1"
    Output: 3
    Explanation: Digit 8 is inside of 3 nested parentheses in the string.
    Example 2:
    Input: s = "(1)+((2))+(((3)))"
    Output: 3
      Constraints:
    1 <= s.length <= 100
    s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
    It is guaranteed that parentheses expression s is a VPS.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "(1+(2*3)+((8)/4))+1";
        int expected = 3;
        var result = solution.maxDepth(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "(1)+((2))+(((3)))";
        int expected = 3;
        var result = solution.maxDepth(s);
        assertThat(result).isEqualTo(expected);
    }

}
