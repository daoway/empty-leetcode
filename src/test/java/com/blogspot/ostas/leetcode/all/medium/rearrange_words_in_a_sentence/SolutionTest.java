package com.blogspot.ostas.leetcode.all.medium.rearrange_words_in_a_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "Leetcode is cool"
    Output: "Is cool leetcode"
    Explanation: There are 3 words, "Leetcode" of length 8, "is" of length 2 and "cool" of length 4.
    Output is ordered by length and the new first word starts with capital letter.
    Example 2:
    Input: text = "Keep calm and code on"
    Output: "On and keep calm code"
    Explanation: Output is ordered as follows:
    "On" 2 letters.
    "and" 3 letters.
    "keep" 4 letters in case of tie order by position in original text.
    "calm" 4 letters.
    "code" 4 letters.
    Example 3:
    Input: text = "To be or not to be"
    Output: "To be or to be not"
      Constraints:
    text begins with a capital letter and then contains lowercase letters and single space between words.
    1 <= text.length <= 10^5
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "Leetcode is cool";
        String expected = "Is cool leetcode";
        var result = solution.arrangeWords(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "Keep calm and code on";
        String expected = "On and keep calm code";
        var result = solution.arrangeWords(text);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String text = "To be or not to be";
        String expected = "To be or to be not";
        var result = solution.arrangeWords(text);
        assertThat(result).isEqualTo(expected);
    }

}
