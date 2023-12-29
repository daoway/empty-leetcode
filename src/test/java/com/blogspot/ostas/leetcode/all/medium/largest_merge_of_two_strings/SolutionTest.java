package com.blogspot.ostas.leetcode.all.medium.largest_merge_of_two_strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: word1 = "cabaa", word2 = "bcaaa"
    Output: "cbcabaaaaa"
    Explanation: One way to get the lexicographically largest merge is:
    - Take from word1: merge = "c", word1 = "abaa", word2 = "bcaaa"
    - Take from word2: merge = "cb", word1 = "abaa", word2 = "caaa"
    - Take from word2: merge = "cbc", word1 = "abaa", word2 = "aaa"
    - Take from word1: merge = "cbca", word1 = "baa", word2 = "aaa"
    - Take from word1: merge = "cbcab", word1 = "aa", word2 = "aaa"
    - Append the remaining 5 a's from word1 and word2 at the end of merge.
    Example 2:
    Input: word1 = "abcabc", word2 = "abdcaba"
    Output: "abdcabcabcaba"
      Constraints:
    1 <= word1.length, word2.length <= 3000
    word1 and word2 consist only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String word1 = "cabaa";
        String word2 = "bcaaa";
        String expected = "cbcabaaaaa";
        var result = solution.largestMerge(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String word1 = "abcabc";
        String word2 = "abdcaba";
        String expected = "abdcabcabcaba";
        var result = solution.largestMerge(word1, word2);
        assertThat(result).isEqualTo(expected);
    }

}
