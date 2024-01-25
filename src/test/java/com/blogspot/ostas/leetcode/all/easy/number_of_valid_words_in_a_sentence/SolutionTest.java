package com.blogspot.ostas.leetcode.all.easy.number_of_valid_words_in_a_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sentence = "cat and  dog"
    Output: 3
    Explanation: The valid words in the sentence are "cat", "and", and "dog".
    Example 2:
    Input: sentence = "!this  1-s b8d!"
    Output: 0
    Explanation: There are no valid words in the sentence.
    "!this" is invalid because it starts with a punctuation mark.
    "1-s" and "b8d" are invalid because they contain digits.
    Example 3:
    Input: sentence = "alice and  bob are playing stone-game10"
    Output: 5
    Explanation: The valid words in the sentence are "alice", "and", "bob", "are", and "playing".
    "stone-game10" is invalid because it contains digits.
      Constraints:
    1 <= sentence.length <= 1000
    sentence only contains lowercase English letters, digits, ' ', '-', '!', '.', and ','.
    There will be at least 1 token.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sentence = "cat and  dog";
        int expected = 3;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sentence = "!this  1-s b8d!";
        int expected = 0;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String sentence = "alice and  bob are playing stone-game10";
        int expected = 5;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_3() {
        var solution = new Solution();
        String sentence = " o6 t";
        int expected = 1;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_4() {
        var solution = new Solution();
        String sentence = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
        int expected = 6;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }
    @Test
    void example_5() {
        var solution = new Solution();
        String sentence = "-";
        int expected = 0;
        var result = solution.countValidWords(sentence);
        assertThat(result).isEqualTo(expected);
    }
}
