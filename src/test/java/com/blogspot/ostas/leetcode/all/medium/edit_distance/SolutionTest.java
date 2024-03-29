package com.blogspot.ostas.leetcode.all.medium.edit_distance;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word1 = "horse", word2 = "ros"
    Output: 3
    Explanation:
    horse -> rorse (replace 'h' with 'r')
    rorse -> rose (remove 'r')
    rose -> ros (remove 'e')
    Example 2:
    Input: word1 = "intention", word2 = "execution"
    Output: 5
    Explanation:
    intention -> inention (remove 't')
    inention -> enention (replace 'i' with 'e')
    enention -> exention (replace 'n' with 'x')
    exention -> exection (replace 'n' with 'c')
    exection -> execution (insert 'u')
      Constraints:
    0 <= word1.length, word2.length <= 500
    word1 and word2 consist of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word1 = "horse";
        String word2 = "ros";
        int expected = 3;
        var result = solution.minDistance(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word1 = "intention";
        String word2 = "execution";
        int expected = 5;
        var result = solution.minDistance(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

}
