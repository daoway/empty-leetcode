package com.blogspot.ostas.leetcode.all.easy.reverse_prefix_of_word;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "abcdefd", ch = "d"
    Output: "dcbaefd"
    Explanation: The first occurrence of "d" is at index 3.
    Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
    Example 2:
    Input: word = "xyxzxe", ch = "z"
    Output: "zxyxxe"
    Explanation: The first and only occurrence of "z" is at index 3.
    Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
    Example 3:
    Input: word = "abcd", ch = "z"
    Output: "abcd"
    Explanation: "z" does not exist in word.
    You should not do any reverse operation, the resulting string is "abcd".
      Constraints:
    1 <= word.length <= 250
    word consists of lowercase English letters.
    ch is a lowercase English letter.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "abcdefd";
        char ch = 'd';
        String expected = "dcbaefd";
        var result = solution.reversePrefix(word, ch);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "xyxzxe";
        char ch = 'z';
        String expected = "zxyxxe";
        var result = solution.reversePrefix(word, ch);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "abcd";
        char ch = 'z';
        String expected = "abcd";
        var result = solution.reversePrefix(word, ch);
        assertThat(result).isEqualTo(expected);
    }

}
