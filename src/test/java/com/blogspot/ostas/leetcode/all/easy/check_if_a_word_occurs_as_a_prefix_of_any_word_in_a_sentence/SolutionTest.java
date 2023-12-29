package com.blogspot.ostas.leetcode.all.easy.check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sentence = "i love eating burger", searchWord = "burg"
    Output: 4
    Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
    Example 2:
    Input: sentence = "this problem is an easy problem", searchWord = "pro"
    Output: 2
    Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
    Example 3:
    Input: sentence = "i am tired", searchWord = "you"
    Output: -1
    Explanation: "you" is not a prefix of any word in the sentence.
      Constraints:
    1 <= sentence.length <= 100
    1 <= searchWord.length <= 10
    sentence consists of lowercase English letters and spaces.
    searchWord consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sentence = "i love eating burger";
        String searchWord = "burg";
        int expected = 4;
        var result = solution.isPrefixOfWord(sentence, searchWord);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";
        int expected = 2;
        var result = solution.isPrefixOfWord(sentence, searchWord);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String sentence = "i am tired";
        String searchWord = "you";
        int expected = -1;
        var result = solution.isPrefixOfWord(sentence, searchWord);
        assertThat(result).isEqualTo(expected);
    }

}
