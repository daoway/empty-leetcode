package com.blogspot.ostas.leetcode.all.medium.sentence_similarity_iii;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sentence1 = "My name is Haley", sentence2 = "My Haley"
    Output: true
    Explanation: sentence2 can be turned to sentence1 by inserting "name is" between "My" and "Haley".
    Example 2:
    Input: sentence1 = "of", sentence2 = "A lot of words"
    Output: false
    Explanation: No single sentence can be inserted inside one of the sentences to make it equal to the other.
    Example 3:
    Input: sentence1 = "Eating right now", sentence2 = "Eating"
    Output: true
    Explanation: sentence2 can be turned to sentence1 by inserting "right now" at the end of the sentence.
      Constraints:
    1 <= sentence1.length, sentence2.length <= 100
    sentence1 and sentence2 consist of lowercase and uppercase English letters and spaces.
    The words in sentence1 and sentence2 are separated by a single space.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";
        boolean expected = true;
        var result = solution.areSentencesSimilar(sentence1, sentence2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sentence1 = "of";
        String sentence2 = "A lot of words";
        boolean expected = false;
        var result = solution.areSentencesSimilar(sentence1, sentence2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String sentence1 = "Eating right now";
        String sentence2 = "Eating";
        boolean expected = true;
        var result = solution.areSentencesSimilar(sentence1, sentence2);
        assertThat(result).isEqualTo(expected);
    }

}
