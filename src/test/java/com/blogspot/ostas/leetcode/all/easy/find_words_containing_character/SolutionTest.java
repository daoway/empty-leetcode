package com.blogspot.ostas.leetcode.all.easy.find_words_containing_character;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    /*
      Example 1:
    Input: words = ["leet","code"], x = "e"
    Output: [0,1]
    Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
    Example 2:
    Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
    Output: [0,2]
    Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
    Example 3:
    Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
    Output: []
    Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
      Constraints:
    1 <= words.length <= 50
    1 <= words[i].length <= 50
    x is a lowercase English letter.
    words[i] consists only of lowercase English letters.
    */
    @Test
    void example_0() {
        var solution = new Solution();
        String[] words = new String[]{"leet", "code"};
        char x = 'e';
        List<Integer> expected = List.of(0, 1);
        var result = solution.findWordsContaining(words, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_1() {
        var solution = new Solution();
        String[] words = new String[]{"abc", "bcd", "aaaa", "cbc"};
        char x = 'a';
        List<Integer> expected = List.of(0, 2);
        var result = solution.findWordsContaining(words, x);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void example_2() {
        var solution = new Solution();
        String[] words = new String[]{"abc", "bcd", "aaaa", "cbc"};
        char x = 'z';
        List<Integer> expected = List.of();
        var result = solution.findWordsContaining(words, x);
        assertThat(result).isEqualTo(expected);
    }

}
