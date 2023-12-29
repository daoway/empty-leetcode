package com.blogspot.ostas.leetcode.all.easy.long_pressed_name;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: name = "alex", typed = "aaleex"
    Output: true
    Explanation: 'a' and 'e' in 'alex' were long pressed.
    Example 2:
    Input: name = "saeed", typed = "ssaaedd"
    Output: false
    Explanation: 'e' must have been pressed twice, but it was not in the typed output.
      Constraints:
    1 <= name.length, typed.length <= 1000
    name and typed consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String name = "alex";
        String typed = "aaleex";
        boolean expected = true;
        var result = solution.isLongPressedName(name, typed);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String name = "saeed";
        String typed = "ssaaedd";
        boolean expected = false;
        var result = solution.isLongPressedName(name, typed);
        assertThat(result).isEqualTo(expected);
    }

}
