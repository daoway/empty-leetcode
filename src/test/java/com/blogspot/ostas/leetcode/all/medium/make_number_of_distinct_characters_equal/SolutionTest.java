package com.blogspot.ostas.leetcode.all.medium.make_number_of_distinct_characters_equal;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word1 = "ac", word2 = "b"
    Output: false
    Explanation: Any pair of swaps would yield two distinct characters in the first string, and one in the second string.
    Example 2:
    Input: word1 = "abcc", word2 = "aab"
    Output: true
    Explanation: We swap index 2 of the first string with index 0 of the second string. The resulting strings are word1 = "abac" and word2 = "cab", which both have 3 distinct characters.
    Example 3:
    Input: word1 = "abcde", word2 = "fghij"
    Output: true
    Explanation: Both resulting strings will have 5 distinct characters, regardless of which indices we swap.
      Constraints:
    1 <= word1.length, word2.length <= 105
    word1 and word2 consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word1 = "ac";
        String word2 = "b";
        boolean expected = false;
        var result = solution.isItPossible(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word1 = "abcc";
        String word2 = "aab";
        boolean expected = true;
        var result = solution.isItPossible(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word1 = "abcde";
        String word2 = "fghij";
        boolean expected = true;
        var result = solution.isItPossible(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

}
