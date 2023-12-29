package com.blogspot.ostas.leetcode.all.hard.smallest_k_length_subsequence_with_occurrences_of_a_letter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leet", k = 3, letter = "e", repetition = 1
    Output: "eet"
    Explanation: There are four subsequences of length 3 that have the letter 'e' appear at least 1 time:
    - "lee" (from "leet")
    - "let" (from "leet")
    - "let" (from "leet")
    - "eet" (from "leet")
    The lexicographically smallest subsequence among them is "eet".
    Example 2:
    Input: s = "leetcode", k = 4, letter = "e", repetition = 2
    Output: "ecde"
    Explanation: "ecde" is the lexicographically smallest subsequence of length 4 that has the letter "e" appear at least 2 times.
    Example 3:
    Input: s = "bb", k = 2, letter = "b", repetition = 2
    Output: "bb"
    Explanation: "bb" is the only subsequence of length 2 that has the letter "b" appear at least 2 times.
      Constraints:
    1 <= repetition <= k <= s.length <= 5 * 104
    s consists of lowercase English letters.
    letter is a lowercase English letter, and appears in s at least repetition times.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leet";
        int k = 3;
        char letter = 'e';
        int repetition = 1;
        String expected = "eet";
        var result = solution.smallestSubsequence(s, k, letter, repetition);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "leetcode";
        int k = 4;
        char letter = 'e';
        int repetition = 2;
        String expected = "ecde";
        var result = solution.smallestSubsequence(s, k, letter, repetition);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "bb";
        int k = 2;
        char letter = 'b';
        int repetition = 2;
        String expected = "bb";
        var result = solution.smallestSubsequence(s, k, letter, repetition);
        assertThat(result).isEqualTo(expected);
    }

}
