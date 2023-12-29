package com.blogspot.ostas.leetcode.all.easy.check_if_the_sentence_is_pangram;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
    Output: true
    Explanation: sentence contains at least one of every letter of the English alphabet.
    Example 2:
    Input: sentence = "leetcode"
    Output: false
      Constraints:
    1 <= sentence.length <= 1000
    sentence consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean expected = true;
        var result = solution.checkIfPangram(sentence);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sentence = "leetcode";
        boolean expected = false;
        var result = solution.checkIfPangram(sentence);
        assertThat(result).isEqualTo(expected);
    }

}
