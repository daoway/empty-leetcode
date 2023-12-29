package com.blogspot.ostas.leetcode.all.hard.word_break_ii;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
    Output: ["cats and dog","cat sand dog"]
    Example 2:
    Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
    Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
    Explanation: Note that you are allowed to reuse a dictionary word.
    Example 3:
    Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    Output: []
      Constraints:
    1 <= s.length <= 20
    1 <= wordDict.length <= 1000
    1 <= wordDict[i].length <= 10
    s and wordDict[i] consist of only lowercase English letters.
    All the strings of wordDict are unique.
    Input is generated in a way that the length of the answer doesn't exceed 105.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "catsanddog";
        List<String> wordDict = List.of("cat", "cats", "and", "sand", "dog");
        List<String> expected = List.of("cats and dog", "cat sand dog");
        var result = solution.wordBreak(s, wordDict);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "pineapplepenapple";
        List<String> wordDict = List.of("apple", "pen", "applepen", "pine", "pineapple");
        List<String> expected =
                List.of("pine apple pen apple", "pineapple pen apple", "pine applepen apple");
        var result = solution.wordBreak(s, wordDict);
        assertThat(result).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
        List<String> expected = List.of();
        var result = solution.wordBreak(s, wordDict);
        assertThat(result).isEqualTo(expected);
    }

}
