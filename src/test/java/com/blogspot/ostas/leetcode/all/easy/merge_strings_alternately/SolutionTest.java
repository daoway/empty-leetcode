package com.blogspot.ostas.leetcode.all.easy.merge_strings_alternately;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word1 = "abc", word2 = "pqr"
    Output: "apbqcr"
    Explanation: The merged string will be merged as so:
    word1:  a   b   c
    word2:    p   q   r
    merged: a p b q c r
    Example 2:
    Input: word1 = "ab", word2 = "pqrs"
    Output: "apbqrs"
    Explanation: Notice that as word2 is longer, "rs" is appended to the end.
    word1:  a   b
    word2:    p   q   r   s
    merged: a p b q   r   s
    Example 3:
    Input: word1 = "abcd", word2 = "pq"
    Output: "apbqcd"
    Explanation: Notice that as word1 is longer, "cd" is appended to the end.
    word1:  a   b   c   d
    word2:    p   q
    merged: a p b q c   d
      Constraints:
    1 <= word1.length, word2.length <= 100
    word1 and word2 consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        var result = solution.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";
        var result = solution.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        var result = solution.mergeAlternately(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

}
