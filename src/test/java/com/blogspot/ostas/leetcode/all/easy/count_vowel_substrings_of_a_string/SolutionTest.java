package com.blogspot.ostas.leetcode.all.easy.count_vowel_substrings_of_a_string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "aeiouu"
    Output: 2
    Explanation: The vowel substrings of word are as follows (underlined):
    - "aeiouu"
    - "aeiouu"
    Example 2:
    Input: word = "unicornarihan"
    Output: 0
    Explanation: Not all 5 vowels are present, so there are no vowel substrings.
    Example 3:
    Input: word = "cuaieuouac"
    Output: 7
    Explanation: The vowel substrings of word are as follows (underlined):
    - "cuaieuouac"
    - "cuaieuouac"
    - "cuaieuouac"
    - "cuaieuouac"
    - "cuaieuouac"
    - "cuaieuouac"
    - "cuaieuouac"
      Constraints:
    1 <= word.length <= 100
    word consists of lowercase English letters only.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "aeiouu";
        int expected = 2;
        var result = solution.countVowelSubstrings(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "unicornarihan";
        int expected = 0;
        var result = solution.countVowelSubstrings(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "cuaieuouac";
        int expected = 7;
        var result = solution.countVowelSubstrings(word);
        assertThat(result).isEqualTo(expected);
    }

}
