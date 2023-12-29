package com.blogspot.ostas.leetcode.all.easy.unique_morse_code_words;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["gin","zen","gig","msg"]
    Output: 2
    Explanation: The transformation of each word is:
    "gin" -> "--...-."
    "zen" -> "--...-."
    "gig" -> "--...--."
    "msg" -> "--...--."
    There are 2 different transformations: "--...-." and "--...--.".
    Example 2:
    Input: words = ["a"]
    Output: 1
      Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 12
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        int expected = 2;
        var result = solution.uniqueMorseRepresentations(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"a"};
        int expected = 1;
        var result = solution.uniqueMorseRepresentations(words);
        assertThat(result).isEqualTo(expected);
    }

}
