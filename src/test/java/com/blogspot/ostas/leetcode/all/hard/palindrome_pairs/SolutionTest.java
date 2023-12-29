package com.blogspot.ostas.leetcode.all.hard.palindrome_pairs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["abcd","dcba","lls","s","sssll"]
    Output: [[0,1],[1,0],[3,2],[2,4]]
    Explanation: The palindromes are ["abcddcba","dcbaabcd","slls","llssssll"]
    Example 2:
    Input: words = ["bat","tab","cat"]
    Output: [[0,1],[1,0]]
    Explanation: The palindromes are ["battab","tabbat"]
    Example 3:
    Input: words = ["a",""]
    Output: [[0,1],[1,0]]
    Explanation: The palindromes are ["a","a"]
      Constraints:
    1 <= words.length <= 5000
    0 <= words[i].length <= 300
    words[i] consists of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"abcd", "dcba", "lls", "s", "sssll"};
        List<List<Integer>> expected =
                List.of(List.of(0, 1), List.of(1, 0), List.of(3, 2), List.of(2, 4));
        var result = solution.palindromePairs(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"bat", "tab", "cat"};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0));
        var result = solution.palindromePairs(words);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"a", ""};
        List<List<Integer>> expected = List.of(List.of(0, 1), List.of(1, 0));
        var result = solution.palindromePairs(words);
        assertThat(result).isEqualTo(expected);
    }

}
