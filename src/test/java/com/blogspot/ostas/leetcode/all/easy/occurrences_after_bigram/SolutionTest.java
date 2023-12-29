package com.blogspot.ostas.leetcode.all.easy.occurrences_after_bigram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
    Output: ["girl","student"]
    Example 2:
    Input: text = "we will we will rock you", first = "we", second = "will"
    Output: ["we","rock"]
      Constraints:
    1 <= text.length <= 1000
    text consists of lowercase English letters and spaces.
    All the words in text a separated by a single space.
    1 <= first.length, second.length <= 10
    first and second consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "alice is a good girl she is a good student";
        String first = "a";
        String second = "good";
        String[] expected = new String[]{"girl", "student"};
        var result = solution.findOcurrences(text, first, second);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";
        String[] expected = new String[]{"we", "rock"};
        var result = solution.findOcurrences(text, first, second);
        assertThat(result).isEqualTo(expected);
    }

}
