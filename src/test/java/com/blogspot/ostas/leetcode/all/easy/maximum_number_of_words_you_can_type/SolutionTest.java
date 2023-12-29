package com.blogspot.ostas.leetcode.all.easy.maximum_number_of_words_you_can_type;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: text = "hello world", brokenLetters = "ad"
    Output: 1
    Explanation: We cannot type "world" because the 'd' key is broken.
    Example 2:
    Input: text = "leet code", brokenLetters = "lt"
    Output: 1
    Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
    Example 3:
    Input: text = "leet code", brokenLetters = "e"
    Output: 0
    Explanation: We cannot type either word because the 'e' key is broken.
      Constraints:
    1 <= text.length <= 104
    0 <= brokenLetters.length <= 26
    text consists of words separated by a single space without any leading or trailing spaces.
    Each word only consists of lowercase English letters.
    brokenLetters consists of distinct lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String text = "hello world";
        String brokenLetters = "ad";
        int expected = 1;
        var result = solution.canBeTypedWords(text, brokenLetters);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String text = "leet code";
        String brokenLetters = "lt";
        int expected = 1;
        var result = solution.canBeTypedWords(text, brokenLetters);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String text = "leet code";
        String brokenLetters = "e";
        int expected = 0;
        var result = solution.canBeTypedWords(text, brokenLetters);
        assertThat(result).isEqualTo(expected);
    }

}
