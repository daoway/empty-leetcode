package com.blogspot.ostas.leetcode.all.easy.reverse_words_in_a_string_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"
    Example 2:
    Input: s = "Mr Ding"
    Output: "rM gniD"
      Constraints:
    1 <= s.length <= 5 * 104
    s contains printable ASCII characters.
    s does not contain any leading or trailing spaces.
    There is at least one word in s.
    All the words in s are separated by a single space.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";
        var result = solution.reverseWords(s);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "Mr Ding";
        String expected = "rM gniD";
        var result = solution.reverseWords(s);
        assertThat(result).isEqualTo(expected);
    }

}
