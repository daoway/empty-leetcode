package com.blogspot.ostas.leetcode.all.medium.word_break;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: s = "leetcode", wordDict = ["leet","code"]
    Output: true
    Explanation: Return true because "leetcode" can be segmented as "leet code".
    Example 2:
    Input: s = "applepenapple", wordDict = ["apple","pen"]
    Output: true
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
    Note that you are allowed to reuse a dictionary word.
    Example 3:
    Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    Output: false
      Constraints:
    1 <= s.length <= 300
    1 <= wordDict.length <= 1000
    1 <= wordDict[i].length <= 20
    s and wordDict[i] consist of only lowercase English letters.
    All the strings of wordDict are unique.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        boolean expected = true;
        var result = solution.wordBreak(s, wordDict);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");
        boolean expected = true;
        var result = solution.wordBreak(s, wordDict);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
        boolean expected = false;
        var result = solution.wordBreak(s, wordDict);
        assertThat(result).isEqualTo(expected);
    }

}
