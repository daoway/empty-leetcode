package com.blogspot.ostas.leetcode.all.medium.delete_operation_for_two_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word1 = "sea", word2 = "eat"
    Output: 2
    Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
    Example 2:
    Input: word1 = "leetcode", word2 = "etco"
    Output: 4
      Constraints:
    1 <= word1.length, word2.length <= 500
    word1 and word2 consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word1 = "sea";
        String word2 = "eat";
        int expected = 2;
        var result = solution.minDistance(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word1 = "leetcode";
        String word2 = "etco";
        int expected = 4;
        var result = solution.minDistance(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

}
