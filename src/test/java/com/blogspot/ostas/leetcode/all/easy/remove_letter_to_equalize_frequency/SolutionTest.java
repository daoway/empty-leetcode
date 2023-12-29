package com.blogspot.ostas.leetcode.all.easy.remove_letter_to_equalize_frequency;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "abcc"
    Output: true
    Explanation: Select index 3 and delete it: word becomes "abc" and each character has a frequency of 1.
    Example 2:
    Input: word = "aazz"
    Output: false
    Explanation: We must delete a character, so either the frequency of "a" is 1 and the frequency of "z" is 2, or vice versa. It is impossible to make all present letters have equal frequency.
      Constraints:
    2 <= word.length <= 100
    word consists of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "abcc";
        boolean expected = true;
        var result = solution.equalFrequency(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "aazz";
        boolean expected = false;
        var result = solution.equalFrequency(word);
        assertThat(result).isEqualTo(expected);
    }

}
