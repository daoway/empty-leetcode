package com.blogspot.ostas.leetcode.all.medium.number_of_matching_subsequences;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "abcde", words = ["a","bb","acd","ace"]
    Output: 3
    Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
    Example 2:
    Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
    Output: 2
      Constraints:
    1 <= s.length <= 5 * 104
    1 <= words.length <= 5000
    1 <= words[i].length <= 50
    s and words[i] consist of only lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "abcde";
        String[] words = new String[]{"a", "bb", "acd", "ace"};
        int expected = 3;
        var result = solution.numMatchingSubseq(s, words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "dsahjpjauf";
        String[] words = new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"};
        int expected = 2;
        var result = solution.numMatchingSubseq(s, words);
        assertThat(result).isEqualTo(expected);
    }

}
