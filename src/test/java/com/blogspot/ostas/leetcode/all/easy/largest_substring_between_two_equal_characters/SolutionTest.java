package com.blogspot.ostas.leetcode.all.easy.largest_substring_between_two_equal_characters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "aa"
    Output: 0
    Explanation: The optimal substring here is an empty substring between the two 'a's.
    Example 2:
    Input: s = "abca"
    Output: 2
    Explanation: The optimal substring here is "bc".
    Example 3:
    Input: s = "cbzxy"
    Output: -1
    Explanation: There are no characters that appear twice in s.
      Constraints:
    1 <= s.length <= 300
    s contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "aa";
        int expected = 0;
        var result = solution.maxLengthBetweenEqualCharacters(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "abca";
        int expected = 2;
        var result = solution.maxLengthBetweenEqualCharacters(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "cbzxy";
        int expected = -1;
        var result = solution.maxLengthBetweenEqualCharacters(s);
        assertThat(result).isEqualTo(expected);
    }

}
