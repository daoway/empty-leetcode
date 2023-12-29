package com.blogspot.ostas.leetcode.all.easy.make_the_string_great;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leEeetcode"
    Output: "leetcode"
    Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
    Example 2:
    Input: s = "abBAcC"
    Output: ""
    Explanation: We have many possible scenarios, and all lead to the same answer. For example:
    "abBAcC" --> "aAcC" --> "cC" --> ""
    "abBAcC" --> "abBA" --> "aA" --> ""
    Example 3:
    Input: s = "s"
    Output: "s"
      Constraints:
    1 <= s.length <= 100
    s contains only lower and upper case English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leEeetcode";
        String expected = "leetcode";
        var result = solution.makeGood(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abBAcC";
        String expected = "";
        var result = solution.makeGood(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "s";
        String expected = "s";
        var result = solution.makeGood(s);
        assertThat(result).isEqualTo(expected);
    }

}
