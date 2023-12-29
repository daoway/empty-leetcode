package com.blogspot.ostas.leetcode.all.easy.length_of_last_word;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "Hello World"
    Output: 5
    Explanation: The last word is "World" with length 5.
    Example 2:
    Input: s = "   fly me   to   the moon  "
    Output: 4
    Explanation: The last word is "moon" with length 4.
    Example 3:
    Input: s = "luffy is still joyboy"
    Output: 6
    Explanation: The last word is "joyboy" with length 6.
      Constraints:
    1 <= s.length <= 104
    s consists of only English letters and spaces ' '.
    There will be at least one word in s.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "Hello World";
        int expected = 5;
        var result = solution.lengthOfLastWord(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "   fly me   to   the moon  ";
        int expected = 4;
        var result = solution.lengthOfLastWord(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "luffy is still joyboy";
        int expected = 6;
        var result = solution.lengthOfLastWord(s);
        assertThat(result).isEqualTo(expected);
    }

}
