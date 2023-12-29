package com.blogspot.ostas.leetcode.all.medium.determine_if_two_strings_are_close;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word1 = "abc", word2 = "bca"
    Output: true
    Explanation: You can attain word2 from word1 in 2 operations.
    Apply Operation 1: "abc" -> "acb"
    Apply Operation 1: "acb" -> "bca"
    Example 2:
    Input: word1 = "a", word2 = "aa"
    Output: false
    Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
    Example 3:
    Input: word1 = "cabbba", word2 = "abbccc"
    Output: true
    Explanation: You can attain word2 from word1 in 3 operations.
    Apply Operation 1: "cabbba" -> "caabbb"
    Apply Operation 2: "caabbb" -> "baaccc"
    Apply Operation 2: "baaccc" -> "abbccc"
      Constraints:
    1 <= word1.length, word2.length <= 105
    word1 and word2 contain only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word1 = "abc";
        String word2 = "bca";
        boolean expected = true;
        var result = solution.closeStrings(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word1 = "a";
        String word2 = "aa";
        boolean expected = false;
        var result = solution.closeStrings(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String word1 = "cabbba";
        String word2 = "abbccc";
        boolean expected = true;
        var result = solution.closeStrings(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

}
