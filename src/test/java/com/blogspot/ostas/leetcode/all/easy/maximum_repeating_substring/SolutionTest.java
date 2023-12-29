package com.blogspot.ostas.leetcode.all.easy.maximum_repeating_substring;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: sequence = "ababc", word = "ab"
    Output: 2
    Explanation: "abab" is a substring in "ababc".
    Example 2:
    Input: sequence = "ababc", word = "ba"
    Output: 1
    Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".
    Example 3:
    Input: sequence = "ababc", word = "ac"
    Output: 0
    Explanation: "ac" is not a substring in "ababc".
      Constraints:
    1 <= sequence.length <= 100
    1 <= word.length <= 100
    sequence and word contains only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String sequence = "ababc";
        String word = "ab";
        int expected = 2;
        var result = solution.maxRepeating(sequence, word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String sequence = "ababc";
        String word = "ba";
        int expected = 1;
        var result = solution.maxRepeating(sequence, word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String sequence = "ababc";
        String word = "ac";
        int expected = 0;
        var result = solution.maxRepeating(sequence, word);
        assertThat(result).isEqualTo(expected);
    }

}
