package com.blogspot.ostas.leetcode.all.easy.buddy_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "ab", goal = "ba"
    Output: true
    Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
    Example 2:
    Input: s = "ab", goal = "ab"
    Output: false
    Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
    Example 3:
    Input: s = "aa", goal = "aa"
    Output: true
    Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
      Constraints:
    1 <= s.length, goal.length <= 2 * 104
    s and goal consist of lowercase letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "ab";
        String goal = "ba";
        boolean expected = true;
        var result = solution.buddyStrings(s, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "ab";
        String goal = "ab";
        boolean expected = false;
        var result = solution.buddyStrings(s, goal);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "aa";
        String goal = "aa";
        boolean expected = true;
        var result = solution.buddyStrings(s, goal);
        assertThat(result).isEqualTo(expected);
    }

}
