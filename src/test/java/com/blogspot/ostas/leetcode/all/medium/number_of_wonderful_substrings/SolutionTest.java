package com.blogspot.ostas.leetcode.all.medium.number_of_wonderful_substrings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word = "aba"
    Output: 4
    Explanation: The four wonderful substrings are underlined below:
    - "aba" -> "a"
    - "aba" -> "b"
    - "aba" -> "a"
    - "aba" -> "aba"
    Example 2:
    Input: word = "aabb"
    Output: 9
    Explanation: The nine wonderful substrings are underlined below:
    - "aabb" -> "a"
    - "aabb" -> "aa"
    - "aabb" -> "aab"
    - "aabb" -> "aabb"
    - "aabb" -> "a"
    - "aabb" -> "abb"
    - "aabb" -> "b"
    - "aabb" -> "bb"
    - "aabb" -> "b"
    Example 3:
    Input: word = "he"
    Output: 2
    Explanation: The two wonderful substrings are underlined below:
    - "he" -> "h"
    - "he" -> "e"
      Constraints:
    1 <= word.length <= 105
    word consists of lowercase English letters from 'a' to 'j'.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word = "aba";
        long expected = 4;
        var result = solution.wonderfulSubstrings(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word = "aabb";
        long expected = 9;
        var result = solution.wonderfulSubstrings(word);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word = "he";
        long expected = 2;
        var result = solution.wonderfulSubstrings(word);
        assertThat(result).isEqualTo(expected);
    }

}
