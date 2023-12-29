package com.blogspot.ostas.leetcode.all.easy.find_the_difference;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcd", t = "abcde"
    Output: "e"
    Explanation: 'e' is the letter that was added.
    Example 2:
    Input: s = "", t = "y"
    Output: "y"
      Constraints:
    0 <= s.length <= 1000
    t.length == s.length + 1
    s and t consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcd";
        String t = "abcde";
        char expected = 'e';
        var result = solution.findTheDifference(s, t);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "";
        String t = "y";
        char expected = 'y';
        var result = solution.findTheDifference(s, t);
        assertThat(result).isEqualTo(expected);
    }

}
